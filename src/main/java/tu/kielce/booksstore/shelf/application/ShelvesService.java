package tu.kielce.booksstore.shelf.application;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Component;
import tu.kielce.booksstore.shelf.domain.Shelf;
import tu.kielce.booksstore.shelf.domain.ShelfRepository;
import tu.kielce.booksstore.shelf.presentation.model.CreateShelfRequest;
import tu.kielce.booksstore.shelf.presentation.model.ShelfDto;
import tu.kielce.booksstore.user.services.SecurityUserService;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ShelvesService {

    private final ShelfRepository shelfRepository;
    private final SecurityUserService securityUserService;
    private final ShelvesMapper shelvesMapper;

    public ShelfDto createShelf(CreateShelfRequest createShelfRequest) {
        val currentLoggedUser = securityUserService.getCurrentLoggedUser();

        return shelvesMapper.mapToDto(shelfRepository.save(Shelf.builder()
                .name(createShelfRequest.getName())
                .books(new HashSet<>())
                .userId(currentLoggedUser.getId())
                .build()));
    }

    public Collection<ShelfDto> currentUserShelves() {
        val currentLoggedUser = securityUserService.getCurrentLoggedUser();

        return shelfRepository.findAllByUserIdOrderByNameAsc(currentLoggedUser.getId())
                .stream()
                .map(shelvesMapper::mapToDto)
                .collect(Collectors.toSet());
    }

    public void deleteShelf(UUID shelfId) {
        val currentLoggedUser = securityUserService.getCurrentLoggedUser();

        shelfRepository.delete(shelfRepository.findByIdAndUserId(shelfId, currentLoggedUser.getId())
                .orElseThrow(ShelfDoesNotExistException::new));
    }
}

package tu.kielce.booksstore.users.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.users.domain.User;
import tu.kielce.booksstore.users.domain.UserRepository;
import tu.kielce.booksstore.users.exceptions.UserExistsException;
import tu.kielce.booksstore.users.mappers.UserToUserModelMapper;
import tu.kielce.booksstore.users.services.UsersService;
import tu.kielce.booksstore.users.web.model.UserCreateModel;
import tu.kielce.booksstore.users.web.model.UserModel;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;
    private final UserToUserModelMapper userToUserModelMapper;
    private final UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Page<UserModel>> list(Pageable pageable) {
        return ResponseEntity
                .status(200)
                .body(userRepository.findAll(pageable).map(userToUserModelMapper::map));
    }

    @PostMapping("")
    public ResponseEntity<UserModel> create(@RequestBody @Valid UserCreateModel userCreateModel) throws UserExistsException {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userToUserModelMapper.map(usersService.create(userCreateModel)));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> destroy(@PathVariable UUID id) {
        usersService.delete(id);

        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(null);
    }
}

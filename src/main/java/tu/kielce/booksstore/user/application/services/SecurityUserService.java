package tu.kielce.booksstore.user.application.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.user.application.mappers.UserMapper;
import tu.kielce.booksstore.user.domain.SecurityUserDetails;
import tu.kielce.booksstore.user.domain.dto.CurrentLoggedUser;
import tu.kielce.booksstore.user.application.mappers.UserToUserDetailsMapper;
import tu.kielce.booksstore.user.domain.UserRepository;

@Service
@RequiredArgsConstructor
public class SecurityUserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final UserToUserDetailsMapper mapper;
    private final UserMapper userMapper;

    public CurrentLoggedUser getCurrentLoggedUser() {
        val user = (SecurityUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return userRepository.findById(user.getId())
                .map(userMapper::mapToCurrentLoggedUser)
                .orElse(null);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository
                .findByUsername(username)
                .map(mapper::map)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}

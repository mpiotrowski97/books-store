package tu.kielce.booksstore.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.users.mappers.UserToUserDetailsMapper;
import tu.kielce.booksstore.users.domain.UserRepository;

@Service
@RequiredArgsConstructor
public class SecurityUserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final UserToUserDetailsMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository
                .findByUsername(username)
                .map(mapper::map)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}

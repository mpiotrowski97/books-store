package tu.kielce.booksstore.security.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.security.mappers.UserToUserDetailsMapper;
import tu.kielce.booksstore.users.UsersFacade;

@Service
@RequiredArgsConstructor
public class SecurityUserService implements UserDetailsService {
    private final UsersFacade usersFacade;
    private final UserToUserDetailsMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return usersFacade
                .getUser(username)
                .map(mapper::map)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}

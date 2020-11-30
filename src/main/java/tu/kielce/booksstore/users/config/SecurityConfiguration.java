package tu.kielce.booksstore.users.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import tu.kielce.booksstore.users.domain.Role;
import tu.kielce.booksstore.users.services.SecurityUserService;

@Configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER)
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    private final SecurityUserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .cors()
                .and()
                .logout()
                .and()
                .authorizeRequests()
                .antMatchers("/context/init").permitAll()
                .antMatchers("/auth/login").permitAll()
                .antMatchers("/books").permitAll()
                .antMatchers("/auth/**").anonymous()
                .antMatchers("/users/**").hasRole(Role.ADMINISTRATOR.toString())
                .anyRequest().authenticated()
                .and()
                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }
}

package tu.kielce.booksstore.user.config;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import tu.kielce.booksstore.user.domain.Role;
import tu.kielce.booksstore.user.services.SecurityUserService;

@Configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER)
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    private final SecurityUserService userService;

    @Value("${server.servlet.session.cookie.domain}")
    private String cookieDomain;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        val cookieCsrfTokenRepository = CookieCsrfTokenRepository.withHttpOnlyFalse();
        cookieCsrfTokenRepository.setCookieDomain(cookieDomain);

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
                .antMatchers("/books/**").permitAll()
                .antMatchers("/reviews/*").permitAll()
                .antMatchers("/auth/**").anonymous()
                .antMatchers("/users/**").hasRole(Role.ADMINISTRATOR.toString())
                .anyRequest().authenticated()
                .and()
                .csrf().csrfTokenRepository(cookieCsrfTokenRepository);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }
}

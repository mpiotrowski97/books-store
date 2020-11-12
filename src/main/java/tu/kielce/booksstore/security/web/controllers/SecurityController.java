package tu.kielce.booksstore.security.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
class SecurityController {
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}

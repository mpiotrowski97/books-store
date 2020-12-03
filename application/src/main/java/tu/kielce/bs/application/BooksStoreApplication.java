package tu.kielce.bs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tu.kielce.bs.users.config.SecurityConfiguration;

@SpringBootApplication
@ComponentScan(basePackages = {
        "tu.kielce.bs.book",
        "tu.kielce.bs.cart",
        "tu.kielce.bs.users",
        "tu.kielce.bs.context",
})
@Import({SecurityConfiguration.class})
public class BooksStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksStoreApplication.class, args);
    }

}

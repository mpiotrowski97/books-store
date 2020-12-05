package tu.kielce.bs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "tu.kielce.bs.book",
        "tu.kielce.bs.user"
})
public class BooksStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksStoreApplication.class, args);
    }

}

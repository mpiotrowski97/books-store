package tu.kielce.booksstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class BooksStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksStoreApplication.class, args);
    }

}

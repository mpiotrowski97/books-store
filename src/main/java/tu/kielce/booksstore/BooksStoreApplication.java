package tu.kielce.booksstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class BooksStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksStoreApplication.class, args);
    }

}

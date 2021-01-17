package tu.kielce.booksstore.book.application.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import tu.kielce.booksstore.book.domain.Book;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class BookSpecifications {
    public static Specification<Book> bookTitle(String title) {
        return (Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> cb.equal(root.get("title"), title);
    }

    public static Specification<Book> category(String categoryName) {
        return (Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder cb)
                -> StringUtils.isEmpty(categoryName) ? null : cb.equal(root.join("category").get("name"), categoryName);
    }

    public static Specification<Book> searchCriteria(String search) {
        return (Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder cb)
                -> StringUtils.isEmpty(search) ? null : cb.like(root.get("title"), "%" + search + "%");
    }
}

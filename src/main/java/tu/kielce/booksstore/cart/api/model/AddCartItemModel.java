package tu.kielce.booksstore.cart.api.model;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class AddCartItemModel {
    @NotNull
    private String bookIsbn;
}

package tu.kielce.bs.cart.web.model;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class AddCartItemModel {
    @NotNull
    private String bookIsbn;
}

package tu.kielce.booksstore.cart.api.model;

import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
public class ChangeQuantityModel {
    @NotNull
    @Min(1)
    @Max(100)
    private int quantity;
}

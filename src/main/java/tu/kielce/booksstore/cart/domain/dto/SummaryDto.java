package tu.kielce.booksstore.cart.domain.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Collection;

@Getter
public class SummaryDto {
    private final Collection<CartItemDto> items;
    private final BigDecimal value;

    public SummaryDto(Collection<CartItemDto> items) {
        this.items = items;
        this.value = items
                .stream()
                .map(item -> item.getBookPrice().multiply(new BigDecimal(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

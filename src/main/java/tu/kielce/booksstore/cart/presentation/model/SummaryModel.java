package tu.kielce.booksstore.cart.presentation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.cart.domain.dto.CartItemDto;

import java.math.BigDecimal;
import java.util.Collection;

@Builder
@Getter
@AllArgsConstructor
public class SummaryModel {
    private final Collection<CartItemDto> items;
    private final BigDecimal value;
}

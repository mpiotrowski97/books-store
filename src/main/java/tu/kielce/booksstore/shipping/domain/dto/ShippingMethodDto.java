package tu.kielce.booksstore.shipping.domain.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
public class ShippingMethodDto {
    private final UUID id;
    private final String name;
    private final BigDecimal price;
}

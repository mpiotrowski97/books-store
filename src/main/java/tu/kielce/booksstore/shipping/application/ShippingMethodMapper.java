package tu.kielce.booksstore.shipping.application;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.shipping.domain.ShippingMethod;
import tu.kielce.booksstore.shipping.domain.dto.ShippingMethodDto;

@Component
public class ShippingMethodMapper {
    public ShippingMethodDto mapToDto(ShippingMethod shippingMethod) {
        return ShippingMethodDto
                .builder()
                .id(shippingMethod.getId())
                .name(shippingMethod.getName())
                .price(shippingMethod.getPrice())
                .build();
    }
}

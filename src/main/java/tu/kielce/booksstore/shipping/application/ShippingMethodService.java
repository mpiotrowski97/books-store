package tu.kielce.booksstore.shipping.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.shipping.domain.ShippingMethodRepository;
import tu.kielce.booksstore.shipping.domain.dto.ShippingMethodDto;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShippingMethodService {
    private final ShippingMethodRepository shippingMethodRepository;
    private final ShippingMethodMapper shippingMethodMapper;

    public Collection<ShippingMethodDto> getAllShippingMethods() {
        return shippingMethodRepository
                .findAll()
                .stream()
                .map(shippingMethodMapper::mapToDto)
                .collect(Collectors.toList());
    }
}

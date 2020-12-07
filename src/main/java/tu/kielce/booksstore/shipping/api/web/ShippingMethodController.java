package tu.kielce.booksstore.shipping.api.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.shipping.application.ShippingMethodService;
import tu.kielce.booksstore.shipping.domain.dto.ShippingMethodDto;

import java.util.Collection;

@RestController
@RequestMapping("/shipping-methods")
@RequiredArgsConstructor
class ShippingMethodController {
    private final ShippingMethodService shippingMethodService;

    @GetMapping("")
    private ResponseEntity<Collection<ShippingMethodDto>> getAll() {
        return ResponseEntity.ok(shippingMethodService.getAllShippingMethods());
    }
}

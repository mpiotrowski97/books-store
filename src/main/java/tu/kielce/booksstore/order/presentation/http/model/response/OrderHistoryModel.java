package tu.kielce.booksstore.order.presentation.http.model.response;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Getter
public class OrderHistoryModel {
    private final UUID orderId;
    private final int items;
    private final BigDecimal value;
}

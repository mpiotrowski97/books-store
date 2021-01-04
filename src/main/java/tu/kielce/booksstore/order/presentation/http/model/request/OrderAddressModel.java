package tu.kielce.booksstore.order.presentation.http.model.request;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class OrderAddressModel {
    @NotNull
    private String city;
    @NotNull
    private String country;
    @NotNull
    private String houseNumber;
    @NotNull
    private String postcode;
    @NotNull
    private String province;
    @NotNull
    private String street;
}

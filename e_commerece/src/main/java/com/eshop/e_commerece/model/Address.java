package com.eshop.e_commerece.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    public static final String FLD_Address_Line = "address_line";
    public static final String FLD_city = "city";
    public static final String FLD_State = "state";
    public static final String FLD_PostCode = "postcode";
    public static final String FLD_Country = "country";

    @Column(name = FLD_Address_Line , nullable = false)
    @NotNull(message = "Address can not be Empty")
    @Size(min = 10 ,max = 250, message = "Address must be between the given length")
    private String addressLine;

    @Column(name = FLD_city , nullable = false)
    @NotNull(message = "city can not be Empty")
    @Size(min = 1,max = 50, message = "City Name must be between the given length")
    private String city;

    @Column(name = FLD_State , nullable = true)
    @NotNull(message = "state can not be Empty")
    @Size(min = 1,max = 100, message = "state Name must be between the given length")
    private String state;

    @Column(name = FLD_PostCode , nullable = false)
    @NotNull(message = "Postcode can not be Empty")
    @Size(min = 2,max = 15, message = "Postcode Name must be between the given length")
    private String postCode;

    @Column(name = FLD_Country , nullable = false)
    @NotNull(message = "Country name can not be Empty")
    @Size(min = 2,max = 15, message = "Country Name must be between the given length")
    private String country;

}

package com.eshop.e_commerece.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = Cart.TBL_NAME)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Cart extends AbstractEntity<Long> {

    public  static final String TBL_NAME = "Cart";
    public static final String FLD_CART_LINE = "cart_line";
    public static final String FLD_SUB_Price = "sub_total";



    @Column(name = FLD_CART_LINE , nullable = false)
    @NotNull(message = " Cart Line can not be Empty")
    private int cartLines;


    @OneToOne
    private Users users;

    @Column(name = FLD_SUB_Price , nullable = false , precision = 10 , scale = 2)
    @NotNull(message = "Product name can not be Empty")
    private double subTotal;

    public Cart(Long id, int cartLines, Users users, double subTotal) {
        super(id);
        this.cartLines = cartLines;
        this.users = users;
        this.subTotal = subTotal;
    }
}

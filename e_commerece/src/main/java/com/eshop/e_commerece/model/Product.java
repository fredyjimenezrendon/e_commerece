package com.eshop.e_commerece.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = Product.TBL_NAME)
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends AbstractEntity<Long> {

    public  static final String TBL_NAME = "Product";
    public static final String FLD_Product_Image = "product_Image";
    public static final String FLD_Product_NAME = "product_name";
    public static final String FLD_Product_Brand = "product_brand";
    public static final String FLD_Product_Specification = "product_specification";
    public static final String FLD_Product_Price = "product_price";
    public static final String FLD_Product_Quantity = "Product_quantity";
    public static final String FLD_Product_Status = "product_status";
    public static final String FLD_Category = "category_Id";

    @Lob
    @Column(name = FLD_Product_Image , nullable = false, length = Integer.MAX_VALUE)
    @NotNull(message = "Product image can not be Empty")
    private byte[] image;

    @Column(name = FLD_Product_NAME , nullable = false)
    @NotNull(message = "Product Name can not be Empty")
    @Size(min = 1,max = 50, message = "Product Name must be between the given length")
    private String productName;

    @Column(name = FLD_Product_Brand , nullable = false)
    @NotNull(message = "Product brand can not be Empty")
    @Size(min = 1,max = 50, message = "Product brand must be between the given length")
    private String brand;

    @Column(name = FLD_Product_Specification , nullable = false)
    @Size(min = 5,max = 100, message = "Product specs must be between the given length")
    private String productSpecs;

    @Column(name = FLD_Product_Price , nullable = false , precision = 10 , scale = 2)
    @NotNull(message = "Product price can not be Empty")
    private double productPrice;

    @Column(name = FLD_Product_Quantity , nullable = false)
    @NotNull(message = "Product quantity can not be Empty")
    private int productQuantity;

    @Column(name = FLD_Product_Status , nullable = false)
    @NotNull(message = "Product status can not be Empty")
    private boolean status;


    @ManyToOne(fetch = FetchType.EAGER,cascade =CascadeType.PERSIST)
    @JoinColumns({
           @JoinColumn(name = FLD_Category , referencedColumnName = Category.FLD_ID)} )
    private Category categories;


    public Product(Long id, byte[] image, String productName, String brand, String productSpecs,double productPrice,int productQuantity, boolean status, Category categories) {
        super(id);
        this.image = image;
        this.productName = productName;
        this.brand = brand;
        this.productSpecs = productSpecs;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.status = status;
        this.categories = categories;
    }
}

package com.eshop.e_commerece.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = Category.TBL_NAME)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Category extends AbstractEntity<Long> {

    public  static final String TBL_NAME = "Category";
    public static final String FLD_Category_Name = "category_name";
    public static final String FLD_Category_Description = "category_desc";
    public static final String FLD_Category_Image = "category_Image";
    public static final String FLD_Category_Status = "category_status_status";


    @Column(name = FLD_Category_Name , nullable = false)
    @NotNull(message = "Category Name can not be Empty")
    @Size(min = 1,max = 50, message = "Category Name must be between the given length")
    private String name;

    @Column(name = FLD_Category_Description , nullable = false)
    @NotNull(message = "description Name can not be Empty")
    @Size(min = 1,max = 50, message = "description Name must be between the given length")
    private String descriptions;

    @Lob
    @Column(name = FLD_Category_Image , nullable = false, length = Integer.MAX_VALUE)
    @NotNull(message = "Category image can not be Empty")
    private byte[] image;

    @Column(name = FLD_Category_Status , nullable = false)
    @NotNull(message = "Category status can not be Empty")
    private boolean active = true;

    @Transient
    @OneToMany(mappedBy = Product.FLD_Category, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Product> products;

    public Category(Long id, String name, String descriptions,byte[] image, boolean active, List<Product> products) {
        super(id);
        this.name = name;
        this.descriptions = descriptions;
        this.image = image;
        this.active = active;
        this.products = products;
    }
}

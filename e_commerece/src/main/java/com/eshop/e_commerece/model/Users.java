package com.eshop.e_commerece.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import com.eshop.e_commerece.model.Role;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;



@Entity
@Table(name = Users.TBL_NAME)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Users extends AbstractEntity<Long>{

    public  static final String TBL_NAME = "Users";
    public static final String FLD_first_NAME = "first_Name";
    public static final String FLD_last_NAME = "last_Name";
    public static final String FLD_phone = "cellNo";
    public static final String FLD_address = "address";
    public static final String FLD_emailAddress = "email";
    public static final String FLD_PASSWORD = "password";

    @Column(name = FLD_first_NAME , nullable = false)
    @NotNull(message = "Name can not be Empty")
    @Size(min = 3,max = 20, message = "First Name must be between the given length")
    private String firstName;

    @Column(name = FLD_last_NAME , nullable = false)
    @NotNull(message = "Name can not be Empty")
    @Size(min = 3,max = 20, message = "First Name must be between the given length")
    private String lastName;

    @Column(name = FLD_phone , nullable = false)
    @NotNull(message = "Name can not be Empty")
    @Size(min = 3,max = 20, message = "First Name must be between the given length")
    private String cellNo;

    @Column(name = FLD_emailAddress , nullable = false)
    @NotNull(message = "Name can not be Empty")
    @Size(min = 3,max = 20, message = "First Name must be between the given length")
    private String email;

    @Column(name = FLD_PASSWORD , nullable = false)
    @NotNull(message = "Name can not be Empty")
    @Size(min = 3,max = 20, message = "First Name must be between the given length")
    private String password;

    @Column(name = FLD_address ,unique = true , nullable = false)
    @NotNull(message = "Email can not be Empty")
    @Embedded
    private Address address;

    @OneToOne(mappedBy = "users")
    private Cart cart;


    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = Users.FLD_ID),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = Role.FLD_ID))
    private Collection<Role> roles;

}



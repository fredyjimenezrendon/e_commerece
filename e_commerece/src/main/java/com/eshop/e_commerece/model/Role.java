package com.eshop.e_commerece.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = Role.TBL_NAME)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Role extends AbstractEntity<Long> {

    public static final String TBL_NAME = "Role";
    public static final String FLD_ROLE_NAME = "role_Name";

    @Column(name = FLD_ROLE_NAME, nullable = false)
    @NotNull(message = "Name can not be Empty")
    @Size(min = 3, max = 20, message = "First Name must be between the given length")
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<Users> users;

}
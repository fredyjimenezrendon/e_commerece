package com.eshop.e_commerece.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;



@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public abstract class AbstractEntity<ID>  {
    public static final String FLD_ID = "id";

    @Id
    @Column(name = FLD_ID , unique = true, updatable = false , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;

//    @Version
//    private  Integer version;
//
//    @CreationTimestamp
//    private LocalDateTime created;
//
//    @UpdateTimestamp
//    private LocalDateTime updated;

    public AbstractEntity(ID id){

        this.id=id;
    }


}


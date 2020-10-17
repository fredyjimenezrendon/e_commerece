package com.eshop.e_commerece.repository;

import com.eshop.e_commerece.model.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
@Component("abstractRepository")
public interface AbstractRepository<T extends AbstractEntity<ID>,ID extends Serializable> extends JpaRepository<T, ID> {


    @Override
    List<T> findAll();
}

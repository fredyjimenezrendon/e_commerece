package com.eshop.e_commerece.repository;

import com.eshop.e_commerece.model.Users;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UsersRepository extends AbstractRepository<Users,Long> {

    public Users findByEmail(String email);
    public Optional<Users> findByFirstName(String name);
}

package com.eshop.e_commerece.service;

import com.eshop.e_commerece.model.AbstractEntity;
import com.eshop.e_commerece.repository.AbstractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Component
public class AbstractService<T extends AbstractEntity<Long>> {

    @Autowired
    @Qualifier("abstractRepository")
    private AbstractRepository<T,Long> abstractRepository;


    public T saveUsers(T t){
        return abstractRepository.save(t);
    }
    public List<T> getAll(T t){

        return abstractRepository.findAll();
    }

    public T getById(Long id){

        return abstractRepository.findById(id).get();
    }

    public T getById(String id){

        return abstractRepository.findById(Long.parseLong(id)).get();
    }

    public void delete(Long id){

         abstractRepository.deleteById(id);
    }

    public void update(Long id,T t) throws Exception{
        abstractRepository.save(t);
    }

}

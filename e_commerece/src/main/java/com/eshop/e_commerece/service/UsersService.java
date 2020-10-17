package com.eshop.e_commerece.service;


import com.eshop.e_commerece.model.Users;
import com.eshop.e_commerece.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
@Service
public class UsersService extends AbstractService<Users>  {

    @Autowired
    private UsersRepository usersRepository;

    public Users getByUsersEmail(String email){

        return usersRepository.findByEmail(email);
    }

//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        Optional<Users> optionalUsers = usersRepository.findByFirstName(userName);
//
//        optionalUsers
//                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
//        return optionalUsers
//                .map(CustomUserDetails::new).get();
//    }
}

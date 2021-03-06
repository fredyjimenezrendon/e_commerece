//package com.eshop.e_commerece.model;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.stream.Collectors;
//
//public class CustomUserDetails extends Users implements UserDetails {
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//
//        return getRole()
//                .stream()
//                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRoleName()))
//                .collect(Collectors.toList());
//
//    }
//
//    @Override
//    public String getPassword() {
//        return super.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return super.getFirstName();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    public CustomUserDetails(Users users) {
//        super(users);
//    }
//}

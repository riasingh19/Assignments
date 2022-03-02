package com.spring.security.service;

import com.spring.security.model.CustomUserDetail;
import com.spring.security.model.User;
import com.spring.security.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.userRepo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("INVALID USERNAME!!");
        }

        return new CustomUserDetail(user);
    }

}
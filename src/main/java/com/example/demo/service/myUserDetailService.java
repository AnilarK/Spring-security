package com.example.demo.service;

import com.example.demo.model.Users;
import com.example.demo.model.UserPrinciple;
import com.example.demo.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class myUserDetailService implements UserDetailsService {

    @Autowired
    private userRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        if(user==null){
            System.out.println("No user found with username: "+username);
            throw new UsernameNotFoundException("No user found with username: "+username);
        }
        return new UserPrinciple(user);
    }
}

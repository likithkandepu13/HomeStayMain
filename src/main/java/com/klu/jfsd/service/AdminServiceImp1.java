package com.klu.jfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.jfsd.model.Admin;
import com.klu.jfsd.repository.AdminRepository;

@Service
public class AdminServiceImp1 implements AdminService {

    @Autowired
    private AdminRepository adminrepository;
    
    @Override
    public Admin checkAdminLogin(String username, String password) {
        return adminrepository.checkAdminLogin(username, password);
    }
}

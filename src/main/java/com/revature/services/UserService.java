package com.revature.services;

import com.revature.repositories.ArtistRepository;
import com.revature.repositories.CustomerRepository;
import com.revature.repositories.UserRepository;
import com.revature.repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepo;
    private ArtistRepository artistRepo;
    private CustomerRepository customerRepo;
    private VendorRepository vendorRepo;

    @Autowired
    public UserService(UserRepository ur, ArtistRepository ar, CustomerRepository cr, VendorRepository vr) {
        super();
        this.userRepo = ur;
        this.artistRepo = ar;
        this.customerRepo = cr;
        this.vendorRepo = vr;
    }



}

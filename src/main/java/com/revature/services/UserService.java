package com.revature.services;

import com.revature.exceptions.AuthenticationException;
import com.revature.exceptions.BadRequestException;
import com.revature.models.Artist;
import com.revature.models.Customer;
import com.revature.models.User;
import com.revature.models.Vendor;
import com.revature.repositories.ArtistRepository;
import com.revature.repositories.CustomerRepository;
import com.revature.repositories.UserRepository;
import com.revature.repositories.VendorRepository;
import com.revature.web.dtos.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public User registerUser(User newUser) {

        // TODO: VALIDATION


        return userRepo.save(newUser);
    }

    @Transactional
    public Artist registerArtist(Artist newArtist) {

        // TODO: VALIDATION


        return artistRepo.save(newArtist);
    }

    @Transactional
    public Customer registerCustomer(Customer newCustomer) {

        // TODO: VALIDATION

        return customerRepo.save(newCustomer);
    }

    @Transactional
    public Vendor registerVendor(Vendor newVendor) {

        // TODO: VALIDATION

        return vendorRepo.save(newVendor);
    }

    public boolean updateArtist(Artist updatedArtist) {

        // TODO: VALIDATION, STUFF? move to ManagerService

        return artistRepo.update(updatedArtist);
    }

    public boolean updatedVendor(Vendor updatedVendor) {

        // TODO: VALIDATION, STUFF? move to ManagerService

        return vendorRepo.update(updatedVendor);
    }

    @Transactional(readOnly=true)
    public User authenticate(Credentials creds) {

        if (creds == null || creds.getUsername() == null || creds.getPassword() == null
        || creds.getUsername().equals("") || creds.getPassword().equals(""))
        {
            throw new BadRequestException("Invalid credentials object provided!");
        }

        User retrievedUser = userRepo.findUserByCredentials(creds);

        if (retrievedUser == null) {
            throw new AuthenticationException();
        }

        return  retrievedUser;

    }

}

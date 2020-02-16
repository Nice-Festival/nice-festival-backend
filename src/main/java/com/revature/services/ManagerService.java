package com.revature.services;

import com.revature.exceptions.BadRequestException;
import com.revature.models.*;
import com.revature.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ManagerService {

    private CustomerFavoriteRepository custFavRepo;
    private SetTimeRepository setTimeRepo;
    private StageRepository stageRepo;
    private TentRepository tentRepo;
    private ArtistRepository artistRepo;
    private VendorRepository vendorRepo;

    @Autowired
    public ManagerService(CustomerFavoriteRepository cfr, SetTimeRepository str, StageRepository sr, TentRepository tr,
                          ArtistRepository ar, VendorRepository vr) {
        super();
        this.custFavRepo = cfr;
        this.setTimeRepo = str;
        this.stageRepo = sr;
        this.tentRepo = tr;
        this.artistRepo = ar;
        this.vendorRepo= vr;
    }

    @Transactional(readOnly=true)
    public List<Vendor> getAllVendors() {
        return vendorRepo.findAll();
    }

    @Transactional
    public Artist updateArtist(Artist updatedArtist) {

        if (updatedArtist == null){
            throw new BadRequestException("Invalid Request made!");
        }

        return artistRepo.update(updatedArtist);
    }

    @Transactional
    public Vendor updateVendor(Vendor updatedVendor) {

        if (updatedVendor == null) {
            throw new BadRequestException("Invalid Request made!");
        }

        return vendorRepo.update(updatedVendor);
    }


}

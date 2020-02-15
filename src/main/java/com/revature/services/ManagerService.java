package com.revature.services;

import com.revature.exceptions.BadRequestException;
import com.revature.models.*;
import com.revature.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Artist updateArtist(Artist updatedArtist, SetTime setTime, Stage stage, Status status) {

        if (updatedArtist == null || setTime == null || stage == null || status == null){
            throw new BadRequestException("Invalid Request made!");
        }

        return artistRepo.update(updatedArtist);
    }

    public Vendor updatedVendor(Vendor updatedVendor, Tent tent, Status status) {

        if (updatedVendor == null || tent == null || status == null) {
            throw new BadRequestException("Invalid Request made!");
        }

        return vendorRepo.update(updatedVendor);
    }


}

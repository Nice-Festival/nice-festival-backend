package com.revature.web.controllers;

import com.revature.models.ApplicationStatus;
import com.revature.models.Artist;
import com.revature.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistApplyController {

    private ManagerService managerService;

    @Autowired
    public ArtistApplyController(ManagerService service) {
        super();
        this.managerService = service;
    }

    @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Artist> getAll() { return  managerService.getAllArtists();}

    @PostMapping(value="/approve", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public Artist approveArtist(@RequestBody Artist assnArtist) {
        assnArtist.setStatus(ApplicationStatus.APPROVED);
        return managerService.updateArtist(assnArtist);
    }

    @PostMapping(value="/deny", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public Artist denyArtist(@RequestBody Artist assnArtist) {
        assnArtist.setStatus(ApplicationStatus.DENIED);
        return managerService.updateArtist(assnArtist);
    }


}

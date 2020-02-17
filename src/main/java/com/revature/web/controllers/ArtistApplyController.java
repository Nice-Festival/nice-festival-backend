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






}

package com.revature.web.controllers;

import com.revature.models.*;
import com.revature.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorApplyController {

    private ManagerService managerService;

    @Autowired
    public VendorApplyController(ManagerService service) {
        super();
        this.managerService = service;
    }

    @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Vendor> getAll() {
        return managerService.getAllVendors();
    }

}

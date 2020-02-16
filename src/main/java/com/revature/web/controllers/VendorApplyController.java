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

    @PostMapping(value="/approve", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public Vendor approveVendor(@RequestBody Vendor assnVendor, Tent tent) {
        assnVendor.setStatus(ApplicationStatus.APPROVED);
        assnVendor.setTent(tent);
        return managerService.updateVendor(assnVendor);
    }

    @PostMapping(value="/deny", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public Vendor denyVendor(@RequestBody Vendor assnVendor) {
        assnVendor.setStatus(ApplicationStatus.DENIED);
        return managerService.updateVendor(assnVendor);
    }

}

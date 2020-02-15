package com.revature.repositories;

import com.revature.models.Vendor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendorRepository implements CrudRepository<Vendor> {

    private SessionFactory sessionFactory;

    @Override
    public List<Vendor> findAll() {
        return null;
    }

    @Override
    public Vendor findById(int id) {
        return null;
    }

    @Override
    public Vendor save(Vendor newOjb) {
        return null;
    }

    @Override
    public boolean update(Vendor updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}

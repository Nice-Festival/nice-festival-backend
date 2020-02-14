package com.revature.repositories;

import com.revature.models.Artist;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtistRepository implements CrudRepository<Artist> {

    private SessionFactory sessionFactory;

    @Override
    public List<Artist> findAll() {
        return null;
    }

    @Override
    public Artist findById(int id) {
        return null;
    }

    @Override
    public Artist save(Artist newOjb) {
        return null;
    }

    @Override
    public boolean update(Artist updatedObj) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}

package com.revature.repositories;

import com.revature.models.Artist;

import java.util.List;

public class ArtistRepository implements CrudRepository<Artist> {
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

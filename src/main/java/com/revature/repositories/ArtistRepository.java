package com.revature.repositories;

import com.revature.models.Artist;
import com.revature.models.Role;
import com.revature.models.SetTime;
import com.revature.models.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtistRepository implements CrudRepository<Artist> {

    private SessionFactory sessionFactory;

    public Artist assignStage(Artist arr, Stage stage) {
        Session session = sessionFactory.getCurrentSession();
        Artist retrievedArtist = session.load(Artist.class,arr.getId());
        retrievedArtist.setStage(stage);
        return retrievedArtist;
    }
    public Artist assignTime(Artist arr, SetTime time) {
        Session session = sessionFactory.getCurrentSession();
        Artist retrievedArtist = session.load(Artist.class,arr.getId());
        retrievedArtist.setSetTime(time);
        return retrievedArtist;
    }

    @Override
    public List<Artist> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Artist", Artist.class).getResultList();
    }

    @Override
    public Artist findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Artist.class, id);
    }

    @Override
    public Artist save(Artist newOjb) {
        Session session = sessionFactory.getCurrentSession();
        session.save(newOjb);
        return newOjb;
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

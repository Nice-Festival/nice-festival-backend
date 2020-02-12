package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.reflections.Reflections;

import javax.persistence.Entity;
import java.util.Set;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static  SessionFactory buildSessionFactory() {
        try{
            Configuration config = new Configuration();
            config.configure();
            assignAnnotatedClasses(config);
            return config.buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            throw  new ExceptionInInitializerError(e);
        }
        }

    public static SessionFactory getSessionFactory(){
        return (sessionFactory == null) ? sessionFactory = buildSessionFactory() : sessionFactory;
    }

    private static void assignAnnotatedClasses(Configuration config){
        Reflections reflections = new Reflections("com.revature.models");
        Set<Class<? extends Object>> entities = reflections.getTypesAnnotatedWith(Entity.class);
        entities.forEach(config::addAnnotatedClass);
    }
}

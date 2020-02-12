package com.revature;

import com.revature.util.HibernateUtil;
import org.hibernate.Session;

public class DatabaseDriver {

    public static void main(String[] args) {
      try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()){
          session.beginTransaction();
      } catch (Exception e) {
          System.out.println(e);
      }
    }

}

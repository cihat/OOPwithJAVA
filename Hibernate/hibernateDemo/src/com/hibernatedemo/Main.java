package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(City.class)
        .buildSessionFactory();
    
    Session session = factory.getCurrentSession();
    try {
      session.beginTransaction();
      
      
      session.getTransaction().commit();
      
    }finally {
      factory.close();
    }

  }

}

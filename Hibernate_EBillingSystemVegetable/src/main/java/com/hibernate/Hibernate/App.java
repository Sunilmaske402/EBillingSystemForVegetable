package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        
        Vegetable v=new Vegetable();
        v.setVegId(3);
        v.setVegName("Chili");
        v.setVegPrice(22);
        v.setVegImageName("chili.png");
        
        User u=new User();
        u.setuId(2);
        u.setUserName("Sunil");
        u.setEmail("sunil@gmail.com");
        u.setAddress("Bhandara");
        u.setRoleId(1);
        
        session.save(v);
        session.save(u);
        transaction.commit();
        session.close();
    }
}

package Mavenwork.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Creatimng hibernate project");
        
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Supermart.class);
        
        SessionFactory so = cfg.buildSessionFactory();
        
        Session session = so.openSession();
        
        /*Supermart s  = new Supermart();
        Supermart s1 = new Supermart();
        Supermart s2 = new Supermart();
        Supermart s3 = new Supermart();
        
        s.setid(100);
        s.setnames("Bread");
        s.setprice(50.50f);
        
        s1.setid(101);
        s1.setnames("jam");
        s1.setprice(40);
        
        s2.setid(102);
        s2.setnames("peant butter");
        s2.setprice(100.50f);
        
        s3.setid(103);
        s3.setnames("knife");
        s3.setprice(10.23f);

        
        session.save(s);
        session.save(s1);
        session.save(s2);
 		session.save(s3);*/
  

 		Supermart ss = session.get(Supermart.class, 100);
 		ss.setprice(45.34f);
 		session.update(ss);
 		System.out.println(ss);
        session.beginTransaction();
 
        session.getTransaction().commit();
        
        session.close(); 
        System.out.println("mission done");
    }
}

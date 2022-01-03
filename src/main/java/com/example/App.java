package com.example;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.person.Company;
import com.person.Person;
import com.person.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	new App().insertMemberRecords();
    	
//        System.out.println( "Hello World!" );
//        
//        Employee emp = new Employee();
//       
//        emp.setName("Vignesh");
//        emp.setDob(new Date());
//        
//        Employee emp1 = new Employee();
//        
//        emp1.setName("Vijay");
//        emp1.setDob(new Date());
//        
//        Project pro1 = new Project();
//        pro1.setPname("Delottie");pro1.setCountry("USA");pro1.setPmanager("Ramz");
//        Project pro2 = new Project();
//        pro2.setPname("Horizon");pro2.setCountry("USA");pro2.setPmanager("Jose");
//        List<Project> project = new ArrayList<Project>(); project.add(pro1); project.add(pro2);
//        emp1.setProject(project);
//        
//        
//        Configuration con = new Configuration().configure();
//        SessionFactory sf = con.buildSessionFactory();
//        Session session = sf.openSession();
//       Transaction tx = session.beginTransaction();
//        session.save(emp);
//        session.save(emp1);
//        tx.commit();
//        session.close();
//       
//        emp =null;
//        session = sf.openSession();
//        session.beginTransaction();
//        emp=(Employee) session.get(Employee.class,1);
//        System.out.println(emp);
        
    }

	private void insertMemberRecords() {
		
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		Company company1 = new Company();
		company1.setName("Infosys");
		
		Company company2 = new Company();
		company2.setName("Accenture");
		
		
		
		Person person = new Person();
		person.setName("Vignesh");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setName("KIA-SETLOS");
		person.setVehicle(vehicle);
		person.getCompany().add(company1);person.getCompany().add(company2);
		
		
		session.save(company1);
		session.save(company2);
		session.save(vehicle);
		session.save(person);
		tx.commit();
		session.close();
		
	}
}

package com.study.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.study.hibernate.moduls.Address;
import com.study.hibernate.moduls.Students;
import com.study.hibernate.utils.HibernateUtil;

public class Main {
	
	public static void main(String[] args){
	
	Address address_01 = new Address("Moldova", "Chisinau", "Socoleni");
	//Address address_02 = new Address("Moldova", "Chisinau", "V. Micle");
	
	Students student_01 = new Students("Marin", "Melnic", 8, address_01);
	
	
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session = sf.openSession();
	session.beginTransaction();
	session.save(address_01);
	session.save(student_01);
	session.getTransaction().commit();
	session.close();
	
	}
	
}

package com.example.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class dragonDAO {

	public static void addDragon (int id, String name, String classes) {
		dragon drg = new dragon();
		drg.setD_id(id);
		drg.setD_name(name);
		drg.setD_class(classes);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(dragon.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		
		session.save(drg);
		
		ts.commit();
		session.close();
		sf.close();
	}
	
	public static List getAllDragon() {
		Configuration config = new Configuration().configure().addAnnotatedClass(dragon.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		
		Query q = session.createQuery("from dragon");
		List<dragon> drgList = q.list();
		
		return drgList;
	}
}

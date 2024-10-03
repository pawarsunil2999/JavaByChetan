package com.phonix.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(12, "Mahendra Singh Dhoni", 7, "Wicket-Keeper Batsman");
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session conn = factory.openSession();
		
		Transaction tr = conn.beginTransaction();
		conn.persist(player);
		tr.commit();
		
		
		Player exist = conn.getReference(Player.class, 12);
		System.out.println("Retriving Player From MySql DB ::\n " + exist);
		
		conn.close();
	}

}

package com.mccoy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutill {
private static Configuration configuration;
private static SessionFactory sessionFactory;
static {
configuration =new Configuration();
configuration.configure();
sessionFactory =configuration.buildSessionFactory();
}
public static Session getSession() {
	Session session=null;
	if(sessionFactory!=null) {
		session=sessionFactory.openSession();
	}
	return session;
	
}
}

package org.eclipse.cours.dao;

import org.eclipse.cours.model.Personne;
import org.hibernate.Session;
public class PersonneDao extends GenericDao<Personne, Integer> {
	public PersonneDao(Session session) {
		super(Personne.class, session);
	}
}
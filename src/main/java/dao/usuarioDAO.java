package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import connection.HibernateConnection;
import model.Usuario;

public class usuarioDAO {

	private static usuarioDAO instance;
	protected EntityManager entityManager;
	
	public static usuarioDAO getInstance() {
		if (instance == null) {
			instance = new usuarioDAO();
		}
		return instance;
	}
	
	private usuarioDAO() {
		entityManager = HibernateConnection.getInstance().getConnection();
	}
	
	public boolean add(Usuario u){
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(u);
			entityManager.getTransaction().commit();
			return true;
		}catch(Exception e) {
			entityManager.getTransaction().rollback();
			return false;
		}
	}
	
	
}

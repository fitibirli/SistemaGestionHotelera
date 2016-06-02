package com.unla.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.unla.dao.HibernateUtil;

import com.unla.datos.Cliente;

public class LoginDao {

	private static Session session;
	private Transaction tx;
	
	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}
	
	
	public Cliente existeCliente(String usuario, String contrasenia) throws HibernateException {
		Cliente objeto = null;
		try {
			iniciaOperacion();
			objeto = (Cliente) session.get(Cliente.class, usuario);
			if(!objeto.getLogin().getClave().equals(contrasenia)){
				objeto = null;
			}
		} finally {
			session.close();
		}
		return objeto;
	}
}

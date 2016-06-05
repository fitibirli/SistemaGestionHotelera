package com.unla.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.unla.datos.Empleado;

public class EmpleadoDao {

	
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
	
	@SuppressWarnings("unchecked")
	public List<Empleado> traerEmpleados() throws HibernateException {
		List<Empleado> lista=null;
		try {
			iniciaOperacion();
			lista=session.createQuery("from Empleado c order by c.apellido asc c.nombreasc").list();
		} finally {
			session.close();
		}
		return lista;
	}
}

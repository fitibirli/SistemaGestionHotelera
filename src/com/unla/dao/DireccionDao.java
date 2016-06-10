package com.unla.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.unla.datos.Direccion;

public class DireccionDao {
	
	private static Session session;
	private static SessionFactory factory; 
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
		}
		
		private void manejaExcepcion(HibernateException he) throws HibernateException {
			
			tx.rollback();
			throw new HibernateException("ERROR en la capa de acceso a datos", he);
			}
		
		
		public int agregar(Direccion objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
			} 
		catch (HibernateException he) 
		{
			manejaExcepcion(he);
			throw he;
			} 
		finally {
			session.close();
			}
			return id;
			}
		
		public Direccion traerDireccion(long idDireccion) throws HibernateException {
			Direccion objeto = null;
			try {
				iniciaOperacion();
				objeto = (Direccion) session.get(Direccion.class, idDireccion);
				} finally {
					session.close();
					}
			return objeto;
			}

}

package com.unla.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.unla.datos.Contacto;

public class ContactoDao {
	
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
		
		
		public int agregar(Contacto objeto) {
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
		
		public Contacto traerContacto(long idContacto) throws HibernateException {
			Contacto objeto = null;
			try {
				iniciaOperacion();
				objeto = (Contacto) session.get(Contacto.class, idContacto);
				} finally {
					session.close();
					}
			return objeto;
			}

}

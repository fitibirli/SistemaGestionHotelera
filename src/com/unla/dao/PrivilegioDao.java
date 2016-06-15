package com.unla.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.unla.datos.Privilegio;

public class PrivilegioDao {
	
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
		
		
		public int agregar(Privilegio objeto) {
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
		
		@SuppressWarnings("unchecked")
		
		public List<Privilegio> traerPrivilegio() throws HibernateException {
			List<Privilegio> lista=null;
			try {
				iniciaOperacion();
				lista= session.createQuery( "from Privilegio p order by p.descripcion asc " ).list( );
			} finally {
				session.close();
			}
			return lista;
		}
		
		public Privilegio traerPrivilegio(int idPrivilegio)
		{
			Privilegio objeto = null;
			try{
				iniciaOperacion();
				objeto = (Privilegio) session.get(Privilegio.class, idPrivilegio);
			} finally {
				session.close();
			}
			return objeto;
		}

}

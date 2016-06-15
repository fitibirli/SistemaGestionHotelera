package com.unla.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.unla.datos.TipoTicket;

public class TipoTicketDao {
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

	public List<TipoTicket> traerTiposDeTicket() throws HibernateException {
			List lista=null;
			try {
				iniciaOperacion();
				lista=session.createQuery("from TipoTicket").list();
			}catch(Exception e){
				e.printStackTrace();
			} finally {
				session.close();
			}
			return (List<TipoTicket>) lista;
	}

	public TipoTicket traerTipoTicketSegunDesc(String tipoTicketStr) {
		// TODO Auto-generated method stub
		TipoTicket objeto = null;
		try{
			iniciaOperacion();
			objeto = (TipoTicket) session.createQuery("from TipoTicket e where e.descripcion="+tipoTicketStr).uniqueResult();
		}finally{
			session.close();
		}
		return objeto;
	}
	
	
	
}

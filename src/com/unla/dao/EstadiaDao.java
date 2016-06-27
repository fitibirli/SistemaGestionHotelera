package com.unla.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.unla.datos.Estadia;

public class EstadiaDao {
	
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
	
	public int agregar(Estadia objeto) {
		
		int id = 0;
		
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}
	
	public Estadia traerEstadia(int idEstadia) throws HibernateException
	{
		Estadia objeto = null;
		try{
			iniciaOperacion();
			objeto = (Estadia) session.get(Estadia.class, idEstadia);
		}finally{
			session.close();
		}
		return objeto;
		}
	
	public Estadia traerEstadiaPorCliente(long dni) throws HibernateException
	{
		Estadia objeto = null;
		try{
			iniciaOperacion();
			objeto = (Estadia) session.createQuery("from Estadia e where e.cliente.dni="+dni).uniqueResult();
		}finally{
			session.close();
		}
		return objeto;
		}
	
	@SuppressWarnings("unchecked")
	
	public List<Estadia> traerEstadia() throws Exception 
	{
		List<Estadia> lista = null;
		try {
			iniciaOperacion();
			lista= session.createQuery( "from Estadia e order by e.idEstadia asc" ).list();
		} finally {
			session.close();
		}
		return lista;
		
	}

	
	public void actualizar(Estadia objeto) throws HibernateException {
		
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			
			session.close();
		}
	}

	
	
	
	
	
	
	
}

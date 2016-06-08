package com.unla.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.unla.datos.Estadia;
import com.unla.datos.Hotel;

public class HotelDao {

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

	public Hotel traerHotel(int idHotel) throws HibernateException {
		Hotel objeto = null;
		try {
			iniciaOperacion();
			objeto = (Hotel) session.get(Hotel.class, idHotel);
		} finally {
			session.close();
		}
		return objeto;
	}

}

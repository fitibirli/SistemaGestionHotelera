package com.unla.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.unla.datos.Cliente;
import com.unla.datos.Login;
import com.unla.datos.Empleado;

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
	
	public int agregar(Login objeto) {
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
	
	public Empleado existeEmpleado(String usuario, String contrasenia) throws HibernateException {
		Empleado objeto = null;
		try {
			iniciaOperacion();
			objeto = (Empleado) session.get(Empleado.class, usuario);
			if(!objeto.getLogin().getClave().equals(contrasenia)){
				objeto = null;
			}
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public Login traerLogin(long idLogin) throws HibernateException {
		Login objeto = null;
		try {
			iniciaOperacion();
			objeto = (Login) session.get(Login.class, idLogin);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	
}

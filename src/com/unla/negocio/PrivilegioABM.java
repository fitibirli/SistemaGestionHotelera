package com.unla.negocio;

import com.unla.dao.PrivilegioDao;
import com.unla.datos.Privilegio;

public class PrivilegioABM {
	
	private PrivilegioDao privilegioDao = new PrivilegioDao();

	public int agregar(Privilegio p) {
		return privilegioDao.agregar(p);

	}
	
	public Privilegio traerPrivilegio(int idPrivilegio)
	{
		
		Privilegio p = privilegioDao.traerPrivilegio(idPrivilegio);
		
		return p;
	}
	
}

package com.unla.negocio;

import java.util.List;

import com.unla.dao.TipoTicketDao;
import com.unla.datos.TipoTicket;

public class TipoTicketABM {
	
	private TipoTicketDao dao = new TipoTicketDao();
	
	
	public List<TipoTicket> traerTiposDeTicket(){
		
		return dao.traerTiposDeTicket();
		
	}


	public TipoTicket traerTipoTicketSegunDesc(String tipoTicketStr) {
		// TODO Auto-generated method stub
		return dao.traerTipoTicketSegunDesc(tipoTicketStr);
	}

}

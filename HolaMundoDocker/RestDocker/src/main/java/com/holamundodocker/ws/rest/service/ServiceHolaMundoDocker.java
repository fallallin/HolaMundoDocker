package com.holamundodocker.ws.rest.service;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.holamundodocker.ws.rest.vo.VOInputHolaMundo;

@Path("/ServiceHolaMundoDocker")
public class ServiceHolaMundoDocker {

	@POST
	@Path("/consumirHolaMundo")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public VOInputHolaMundo consumirHolaMundo(VOInputHolaMundo entrada){
		
		Date ahora = new Date();
		
		if(entrada.getEntrada().equals("Hola Mundo")){
			entrada.setSalida("El servicio se ha consumido el " + ahora.toString());
		} else {
			entrada.setSalida("La entrada + '" + entrada.getEntrada() + "' no es permitida para este servicio");
		}
		
		return entrada;
	}
	
}

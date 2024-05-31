package com.agenda.modelo.servicio;

import java.util.List;

import com.agenda.modelo.entidad.Contacto;

public interface IContactoServicio {
//crear los metodos para los servicios crud
	public List<Contacto> listaTodos();
	public void guardar(Contacto contacto);
	public Contacto buscarPorId(Integer id);
	public void eleminar(Integer id);
	
}

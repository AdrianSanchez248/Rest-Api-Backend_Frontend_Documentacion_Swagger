package com.agenda.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.modelo.entidad.Contacto;
import com.agenda.modelo.repositorio.ContactoRepositorio;

@Service
public class ContactoServicio implements IContactoServicio {
    //paea inyectar las dependencias 
	@Autowired
	private ContactoRepositorio contactoRepositorio;
	
	@Override
	public List<Contacto> listaTodos() {
		return (List<Contacto>)contactoRepositorio.findAll();
	}

	@Override
	public void guardar(Contacto contacto) {
		contactoRepositorio.save(contacto);
	}

	@Override
	public Contacto buscarPorId(Integer id) {
		
		return contactoRepositorio.findById(id).orElse(null);
	}

	@Override
	public void eleminar(Integer id) {
	contactoRepositorio.deleteById(id);

	}

}

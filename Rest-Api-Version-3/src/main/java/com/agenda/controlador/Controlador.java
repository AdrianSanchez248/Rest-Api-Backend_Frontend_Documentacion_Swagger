package com.agenda.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agenda.modelo.entidad.Contacto;
import com.agenda.modelo.servicio.IContactoServicio;

@Controller
@RequestMapping("/vistas/contactos")
public class Controlador {
	@Autowired
	private IContactoServicio contactoServicio;
	//ruta para listar los contactos en una tabla
	@GetMapping("/")
	public String listarContactos(Model modelo) {
		//crear una lista de los datos a mostrar
		List<Contacto> listadoContactos=contactoServicio.listaTodos();
		modelo.addAttribute("contactos",listadoContactos);
		return "/vistas/contactos/listar";
	}
	
	//ruta para crear 
	@GetMapping("/create")
	public String crear(Model modelo) {
		//crear el objeto de tipo contacto
		Contacto contacto=new Contacto();
		modelo.addAttribute("Titulo","Formulario: Nuevo Contacto ");
		modelo.addAttribute("contacto",contacto);
		return"/vistas/contactos/registrocontacto";
	}
	
	//Ruta para guardar
	@PostMapping("/save")
	public String guardar(@ModelAttribute Contacto contacto,Model modelo) {
		modelo.addAttribute("Titulo","Formulario: Nuevo Contacto ");
		modelo.addAttribute("contacto",contacto);
		//Utilizar el servico para almacenar en la BD
		contactoServicio.guardar(contacto);
		return "redirect:/vistas/contactos/";
	}
	//ruta para editar
	@GetMapping("/edit/{id}")
	public String edtar(@PathVariable("id") int idContacto,Model modelo) {
		Contacto contacto=new Contacto();
		//validar si el id existe
		if(idContacto>0) {
			contacto=contactoServicio.buscarPorId(idContacto);
			if(contacto==null) {
				return "redirect:/vistas/contatos/";
			}
			}
		else {return "redirect:/vistas/contatos/";
		
	}
		modelo.addAttribute("Titulo","Formulario: Editar Contacto ");
		modelo.addAttribute("contacto",contacto);
		return"/vistas/contactos/registrocontacto";
	}
	//ruta para eliminar
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable ("id") Integer idContacto) {
		Contacto contacto=new Contacto();
		//validar si el id existe
		if(idContacto>0) {
			contacto=contactoServicio.buscarPorId(idContacto);
			if(contacto==null) {
				return "redirect:/vistas/contatos/";
			}
			}
		else {return "redirect:/vistas/contatos/";
		
	}
		//invocar el servicio el eliminar
		contactoServicio.eleminar(idContacto);
		return "redirect:/vistas/contatos/";
	}
}

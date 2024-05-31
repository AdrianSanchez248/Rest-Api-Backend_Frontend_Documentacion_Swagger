package com.agenda.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Crear por cada tabla una entidad
@Entity
@Table(name="contacto")
public class Contacto {

	//Atributos que representan los campos en la BD
	@Id
	private int idContacto;
	private String nomContacto;
	private String apeContacto;
	private String telefono;
	private String email;
	
	//Constructor
	public Contacto() {
		super();
	}

	//Metodos setter y getter
	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNomContacto() {
		return nomContacto;
	}

	public void setNomContacto(String nomContacto) {
		this.nomContacto = nomContacto;
	}

	public String getApeContacto() {
		return apeContacto;
	}

	public void setApeContacto(String apeContacto) {
		this.apeContacto = apeContacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", nomContacto=" + nomContacto + ", apeContacto=" + apeContacto
				+ ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	
	
}

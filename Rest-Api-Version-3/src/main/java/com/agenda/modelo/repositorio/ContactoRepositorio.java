package com.agenda.modelo.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agenda.modelo.entidad.Contacto;
@Repository
public interface ContactoRepositorio extends CrudRepository<Contacto, Integer> {

}

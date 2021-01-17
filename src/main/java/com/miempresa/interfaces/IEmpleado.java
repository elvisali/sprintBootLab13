package com.miempresa.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miempresa.modelo.*;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer> {
	 //List<Empleado> findByEmailAddressAndLastname(String emailAddress, String lastname);
	List<Empleado> findByNombreStartsWith(String nombre);
	 
}

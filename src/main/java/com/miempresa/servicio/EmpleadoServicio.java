package com.miempresa.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miempresa.interfaceServicio.IEmpleadoServicio;
import com.miempresa.interfaces.IEmpleado;
import com.miempresa.modelo.Empleado;
 

@Service
public class EmpleadoServicio implements IEmpleadoServicio{


	@Autowired
	private IEmpleado repo;
	
	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return (List<Empleado>)repo.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public int guardar(Empleado p) {
		// TODO Auto-generated method stub
		Empleado em = repo.save(p);
		if(!em.equals(null)) {
			return 1;
		}
		return 0;
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

 
	@Override
	public List<Empleado> findEmpleado(String nombre) {
		// TODO Auto-generated method stub
		return (List<Empleado>)repo.findByNombreStartsWith(nombre);
	}
	

}

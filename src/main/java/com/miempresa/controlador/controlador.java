package com.miempresa.controlador;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.miempresa.interfaceServicio.IEmpleadoServicio;
import com.miempresa.interfaceServicio.ITareaServicio;
import com.miempresa.modelo.Empleado;
import com.miempresa.modelo.Tarea;

@Controller
@RequestMapping
public class controlador {
	
	@Autowired
	private IEmpleadoServicio servicio;
	
	@Autowired
	private ITareaServicio servicioTarea;
	
	@GetMapping("/listarEmpleados")
	public String listarEmpleados(Model model) {
		List<Empleado> empleados = servicio.listar();
		model.addAttribute("empleados",empleados);
		return "empleados";
	} 
	
	@GetMapping("/listarTareas")
	public String listarTareas(Model model) {
		List<Tarea> empleados = servicioTarea.listar();
		model.addAttribute("tareas",empleados);
		return "tareas";
	} 
	
	
	@GetMapping("/buscarEmpleados")
	public String searchEmpleados(@ModelAttribute("formData") Empleado formEmpleado,   Model model) {
		
		
		String nameText = formEmpleado.getNombre();
		List<Empleado> empleados = servicio.findEmpleado(nameText);
		model.addAttribute("empleados",empleados);
		return "buscarEmpleado";
	} 

}

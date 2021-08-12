package App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import App.dto.Trabajador;
import App.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServiceImpl.listarTrabajadores();
	}
	
	//listar Trabajadores por campo nombre
	@GetMapping("/trabajadores/nombre/{nombre}")
	public List<Trabajador> listarTrabajadorNombre(@PathVariable(name="nombre") String nombre) {
	    return trabajadorServiceImpl.listarTrabajadorNomnbre(nombre);
	}
	
	
	@PostMapping("/trabajadores")
	public Trabajador salvarCliente(@RequestBody Trabajador trabajador) {
		
		return trabajadorServiceImpl.guardarTrabajador(trabajador);
	}
	
	
	@GetMapping("/trabajadores/{id}")
	public Trabajador trabajadorID(@PathVariable(name="id") Long id) {
		
		Trabajador trabajadorID= new Trabajador();
		
		trabajadorID=trabajadorServiceImpl.trabajadorID(id);
		
		System.out.println("Trabajador ID: "+trabajadorID);
		
		return trabajadorID;
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Long id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= new Trabajador();
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado= trabajadorServiceImpl.trabajadorID(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setTrabajo(trabajador.getTrabajo());
		trabajador_seleccionado.setFecha(trabajador.getFecha());
		
		trabajador_actualizado = trabajadorServiceImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eleiminarTrabajador(@PathVariable(name="id")Long id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
	}	
}

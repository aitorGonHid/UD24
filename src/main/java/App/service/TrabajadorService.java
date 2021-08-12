package App.service;

import App.dto.Trabajador;

import java.util.List;

public interface TrabajadorService {
	
	//Metodos del CRUD
	public List<Trabajador> listarTrabajadores(); //Listar All 
	
	public Trabajador guardarTrabajador(Trabajador trabajador);	//Guarda un trabajador CREATE
	
	public Trabajador trabajadorID(Long id); //Leer datos de un trabajador READ
	
	public List<Trabajador> listarTrabajadorNomnbre(String nombre);//Listar Trabajadores por campo nombre
	
	public Trabajador actualizarTrabajador(Trabajador trabajador); //Actualiza datos del cliente UPDATE
	
	public void eliminarTrabajador(Long id);// Elimina el trabajador DELETE
}

package App.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import App.dto.Trabajador;


public interface TrabajadorDAO extends JpaRepository<Trabajador, Long>{
	
	//Listar clientes or campo nombre
	public List<Trabajador> findByNombre(String nombre);
	
}

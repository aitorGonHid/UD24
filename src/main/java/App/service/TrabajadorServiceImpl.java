package App.service;

import App.dto.Trabajador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.dao.TrabajadorDAO;

@Service
public class TrabajadorServiceImpl implements TrabajadorService {
	
	@Autowired
	TrabajadorDAO trabajadorDAO;

	@Override
	public List<Trabajador> listarTrabajadores() {
		
		return trabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		
		return trabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorID(Long id) {
		
		return trabajadorDAO.findById(id).get();
	}

	@Override
	public List<Trabajador> listarTrabajadorNomnbre(String nombre) {
		
		return trabajadorDAO.findByNombre(nombre);
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		
		return trabajadorDAO.save(trabajador);
	}

	@Override
	public void eliminarTrabajador(Long id) {
		
		trabajadorDAO.deleteById(id);
		
	}
}

package App.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="trabajadores")
public class Trabajador {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	private Trabajos trabajo;
	@Column (name = "salario")
	private double salario;
	@Column (name = "fecha")
	private Date fecha;
	
	//Constructores
	public Trabajador() {
		
	}
	/**
	 * @param id: identificador del trabajador (asignado automaticamente)
	 * @param nombre: nombre del trabajador
	 * @param trabajo: puesto del trabajador
	 * @param salario: salario del trabajador (depende del puesto)
	 * @param fecha creacion de la entidad
	 */
	public Trabajador(Long id, String nombre, Trabajos trabajo, Date fecha) {

		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		setSalario(this.getTrabajo());
		this.fecha = fecha;
	}
	
	//Getters & Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Trabajos getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(Trabajos trabajo) {
		this.trabajo = trabajo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(Trabajos trabajo) {
		switch (trabajo) {
		case ENCARGADO:
			this.salario = 20000;
		break;
		case COORDINADOR:
			this.salario = 30000;
		break;
		case PEON:
			this.salario = 17000;
		break;
		case DIRECTOR:
			this.salario = 37000;
		break;
		default:
			this.salario = 0;
			break;
		}
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario
				+ ", fecha=" + fecha + "]";
	}
	
}


package paquete.principal.modelo;

import java.sql.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name = "alumno")

public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String rut;
    private String nombre;
    private String carrera;
    private Date nacimiento;
    
    public Alumno() {
    	
    }

	public Alumno(String id, String rut, String nombre, String carrera, Date nacimiento) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.carrera = carrera;
		this.nacimiento = nacimiento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
    

	
    



}

package paquete.principal.interfaces;
import org.springframework.data.repository.CrudRepository;
import paquete.principal.modelo.Alumno;

public interface IAlumno extends CrudRepository<Alumno, Integer> {

}

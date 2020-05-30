package paquete.principal.interfaceService;
import java.util.List;
import java.util.Optional;
import paquete.principal.modelo.Alumno;

public interface IAlumnoService {
	public List<Alumno>listar();
	public Optional<Alumno>listarId(int id);
	public int save(Alumno a);
	public void delete(int id);

}

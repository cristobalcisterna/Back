package paquete.principal.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import paquete.principal.interfaceService.IAlumnoService;
import paquete.principal.interfaces.IAlumno;
import paquete.principal.modelo.Alumno;

public class AlumnoService implements IAlumnoService{
    @Autowired
	private IAlumno data;
	@Override
	public List<Alumno> listar() {
		return (List<Alumno>)data.findAll();
	}

	@Override
	public Optional<Alumno> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Alumno a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}

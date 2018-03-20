

public class Perro {
	private String nombre;
	private String raza;
	private Localidad localidad;
	private String identidad;
	private String nombreDuehno;
	private String telefonoContacto;
	private DiaSemana diaAsistencia;
	
	public Perro() {
	}

	public Perro(String nombre, String raza, Localidad localidad, String identidad, String nombreDuehno,
			String telefonoContacto, DiaSemana diaAsistencia) {
		this.nombre = nombre;
		this.raza = raza;
		this.localidad = localidad;
		this.identidad = identidad;
		this.nombreDuehno = nombreDuehno;
		this.telefonoContacto = telefonoContacto;
		this.diaAsistencia = diaAsistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public String getNombreDuehno() {
		return nombreDuehno;
	}

	public void setNombreDuehno(String nombreDuehno) {
		this.nombreDuehno = nombreDuehno;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public DiaSemana getDiaAsistencia() {
		return diaAsistencia;
	}

	public void setDiaAsistencia(DiaSemana diaAsistencia) {
		this.diaAsistencia = diaAsistencia;
	}
	
	public String toString() {
		return String.format("Nombre: %s - Raza: %s - Localidad: %s - Identidad: %s - Dueño: %s - Teléfono contacto: %s - Día asistencia colegio: %s", 
				nombre, raza, localidad.getLocalidad(), identidad, nombreDuehno, telefonoContacto, diaAsistencia.getDia());
	}
}

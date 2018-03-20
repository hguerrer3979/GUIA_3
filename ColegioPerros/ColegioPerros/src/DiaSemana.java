

public enum DiaSemana {
	LUNES ("Lunes"),
	MARTES ("Martes"),
	MIERCOLES ("Miércoles"),
	JUEVES ("Jueves"),
	VIERNES ("Viernes"),
	SABADO ("Sabado"),
	DOMINGO ("Domingo");
	
	private final String dia;
	
	private DiaSemana(String dia) {
		this.dia = dia;
	}
	
	public String getDia() {
		return dia;
	}
}



public enum Localidad {
	ENGATIVA ("Engativ�"),
	FONTIBON ("Fontib�n"),
	KENNEDY ("Kennedy"),
	SUMAPAZ ("Sumapaz"),
	BOSA ("Bosa");
	
	private final String localidad;
	
	private Localidad(String localidad) {
		this.localidad = localidad;
	}
	
	String getLocalidad() {
		return localidad;
	}
}



public enum Localidad {
	ENGATIVA ("Engativá"),
	FONTIBON ("Fontibón"),
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



import java.util.ArrayList;

public class PruebaPerro {
	public static void main(String[] args) {
		
		ArrayList<Perro> perrosLocalidadEngativa = new ArrayList<>();
		ArrayList<Perro> perrosLocalidadFontibon = new ArrayList<>();
		ArrayList<Perro> perrosLocalidadKennedy = new ArrayList<>();
		ArrayList<Perro> perrosLocalidadSumapaz = new ArrayList<>();
		ArrayList<Perro> perrosLocalidadBosa = new ArrayList<>();
		
		for(int i = 0; i < obtenerPerros().length; ++i) {
			switch (obtenerPerros()[i].getLocalidad()) {
				case ENGATIVA:	
					perrosLocalidadEngativa.add(obtenerPerros()[i]);
					break;
				case FONTIBON:
					perrosLocalidadFontibon.add(obtenerPerros()[i]);
					break;
				case KENNEDY:
					perrosLocalidadKennedy.add(obtenerPerros()[i]);
					break;
				case SUMAPAZ:
					perrosLocalidadSumapaz.add(obtenerPerros()[i]);
					break;
				case BOSA:
					perrosLocalidadBosa.add(obtenerPerros()[i]);
					
			}
		}
		
		if(perrosLocalidadEngativa.size() > 0) {
			System.out.println("Perros localidad Engativá:\n");
			
			for (Perro perro : perrosLocalidadEngativa) {
				System.out.println(perro.toString());
			}
		}
		
		if(perrosLocalidadFontibon.size() > 0) {
			System.out.println("\nPerros localidad Fontibón:\n");
			
			for (Perro perro : perrosLocalidadFontibon) {
				System.out.println(perro.toString());
			}
		}
		
		if(perrosLocalidadKennedy.size() > 0) {
			System.out.println("\nPerros localidad Kennedy:\n");
			
			for (Perro perro : perrosLocalidadKennedy) {
				System.out.println(perro.toString());
			}
		}
		
		if(perrosLocalidadSumapaz.size() > 0) {
			System.out.println("\nPerros localidad Sumapaz:\n");
			
			for (Perro perro : perrosLocalidadSumapaz) {
				System.out.println(perro.toString());
			}
		}
		
		if(perrosLocalidadBosa.size() > 0) {
			System.out.println("\nPerros localidad Bosa:\n");
			
			for (Perro perro : perrosLocalidadBosa) {
				System.out.println(perro.toString());
			}
		}
	}
	
	public static Perro[] obtenerPerros() {
		
		return buildArrayPerros();
	}
	
	private static Perro[] buildArrayPerros() {
Perro[] perros = new Perro[10];
		
		perros[0] = new Perro("Can", "Golden", Localidad.BOSA, "6666", "Cesar", "3343114444", DiaSemana.LUNES);
		perros[1] = new Perro("Trosky", "Bull Terrier", Localidad.BOSA, "5676767", "Manuel", "3222225555", DiaSemana.MIERCOLES);
		perros[2] = new Perro("Betoven", "Berna", Localidad.KENNEDY, "67678989", "Thomás", "3222224444", DiaSemana.DOMINGO);
		perros[3] = new Perro("Lazy", "Bull terrier", Localidad.FONTIBON, "745455", "Gilberto", "3011114664", DiaSemana.LUNES);
		perros[4] = new Perro("Pecas", "Bóxer", Localidad.SUMAPAZ, "233434", "Andrés", "3223434545", DiaSemana.LUNES);
		perros[5] = new Perro("Pelusa", "Pincher", Localidad.FONTIBON, "435656", "Martín", "3136547895", DiaSemana.MARTES);
		perros[6] = new Perro("Dog", "Pastor alemán", Localidad.SUMAPAZ, "15454054", "Federico", "3213435677", DiaSemana.MIERCOLES);
		perros[7] = new Perro("Ariel", "Pastor belga", Localidad.ENGATIVA, "9909090", "Antonio", "31234565656", DiaSemana.VIERNES);
		perros[8] = new Perro("Lucas", "San Bernardo", Localidad.ENGATIVA, "45342312", "Mónica", "3803434334", DiaSemana.MIERCOLES);
		perros[9] = new Perro("Matias", "French poodle", Localidad.SUMAPAZ, "9876767", "Gladys", "31656565656", DiaSemana.JUEVES);
		
		return perros;
	}
}

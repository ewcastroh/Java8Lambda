package lambda;

public interface PorDefecto {
	
	void mostrarNombre();
	
	default String nombrePorDefecto(String nombre) {
		return nombre + " Default";
	}

}

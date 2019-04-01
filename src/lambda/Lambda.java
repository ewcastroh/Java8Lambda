package lambda;

public class Lambda implements PorDefecto {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.runtime.version"));
		
		MiNombre miNombreAnonima = new MiNombre() {
			@Override
			public String miNombre() {
				return "Eimer Anonimo";
			}
		};
		System.out.println(miNombreAnonima.miNombre());
		
		MiNombre miNombreLambda = () -> "Eimer Lambda";
		System.out.println(miNombreLambda.miNombre());
		
		Suma suma = new Suma() {
			@Override
			public int sumar(int a, int b) {
				return a + b;
			}
		};		
		System.out.println(suma.sumar(2, 3));
		
		Suma sumaLambda = (a, b) -> a + b;
		System.out.println(sumaLambda.sumar(2, 3));
		
		Suma sumaLambda2 = (a, b) -> {
			a = b * b;
			a = a + b;
			System.out.println("Mensaje dentro de Lambda.");
			return a;
		};
		System.out.println(sumaLambda2.sumar(2, 3));
		
		Lambda lambda = new Lambda();
		System.out.println(lambda.nombrePorDefecto("Eimer"));
	}

	@Override
	public void mostrarNombre() {
		// TODO Auto-generated method stub
		
	}

}

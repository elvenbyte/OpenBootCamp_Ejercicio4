public class Main {
    public static void main(String[] args) {
	Cliente cliente = new Cliente();
	cliente.credito = 1000.0;
	cliente.edad = 20;
	cliente.nombre = "Juan";
	cliente.telefono = "111111111";
	System.out.println(cliente.credito);
	System.out.println(cliente.edad);
	System.out.println(cliente.nombre);
	System.out.println(cliente.telefono);

	Trabajador trabajador = new Trabajador();
	trabajador.salario = 2000.0;
	trabajador.edad = 21;
	trabajador.nombre = "Manolo";
	trabajador.telefono = "22222222";
	System.out.println(trabajador.salario);
	System.out.println(trabajador.edad);
	System.out.println(trabajador.nombre);
	System.out.println(trabajador.telefono);
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}
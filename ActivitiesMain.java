import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.io.Console;
import java.util.Scanner;

public class ActivitiesMain {

	String login = "";
	List<Contacto> contactos = new ArrayList<Contacto>();

	public ActivitiesMain(String l) {
		this.login = l;
	}

	public static String ingreso() {
		Console console = System.console();
		System.out.println("");
		String nombre = console.readLine("usuario: ");
		return nombre;
	}

	public void verListaContactos() {
		System.out.println("\nLista de Contactos --");
		Iterator<Contacto> iterator = contactos.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("");
	}

	public void AgregarContacto() {
		System.out.println("\nAgregar Contacto --");
		Console console = System.console();
		System.out.println("");
		String n = console.readLine("Nombre: ");
		String t = console.readLine("Telefono: ");

		Contacto c = new Contacto(n, t);
		contactos.add(c);
	}

	public static void salir(String login) {
		final Date fecha = new Date();
		System.out.println("Cerrar Sesión: " + login + " - " + fecha.toString());
	}

	public static void muestraMenuActivities(String login) {

		System.out.println("\n-- Activities --");
		System.out.println("1- Lista de Contactos");
		System.out.println("2- Agregar el Contacto");
		System.out.println("3- Salir");
		System.out.println("");
		System.out.print("Escoja una opcion:");
	}

	public void menuActivities() {
		int opcion;
		final Scanner teclado = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			muestraMenuActivities(this.login);
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				verListaContactos();
				break;
			case 2:
				AgregarContacto();
				break;
			case 3:
				salir(login);
				continuar = false;
				break;
			default:
				System.out.println("Opción incorrecta\n");
			}
		}
	}

	public static void muestraMenuPrincipal() {
		System.out.println(" -- Menú Principal --");
		System.out.println("1- Ingresar");
		System.out.println("0- Cerrar Aplicación");
		System.out.println("");
		System.out.print("Escoja una opción:");
	}

	public static void main(final String[] args) {

		final Scanner teclado = new Scanner(System.in);

		boolean continuar = true;
		int opcion;

		while (continuar) {
			muestraMenuPrincipal();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				String login = ingreso();
				ActivitiesMain activities = new ActivitiesMain(login);
				activities.menuActivities();
				break;
			case 0:
				continuar = false;
				break;
			default:
				System.out.println("Opción incorrecta\n");
			}
		}
		teclado.close();

		System.out.println("");
	}
}

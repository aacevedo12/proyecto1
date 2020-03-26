public class Contacto {
	
    String nombre;
    String telefono;

    public Contacto() {
        nombre = "";
        telefono = "";
    }

    public Contacto(String n, String t) {
        nombre = n;
        telefono = t;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
        return "Contacto - Nombre: " + nombre + " - Telefono: " + telefono;
    }
}
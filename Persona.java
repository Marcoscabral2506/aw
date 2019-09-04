import java.util.LinkedList;

public class Persona {
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private LinkedList<Telefono> telefonos = new LinkedList<Telefono>();
	
	public Persona(String nombre, String apellido,String calle, Integer numero, String cp) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=new Direccion(calle, numero, cp);
	}
	
	public void AgregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public LinkedList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(LinkedList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefonos="
				+ telefonos + "]";
	}




}

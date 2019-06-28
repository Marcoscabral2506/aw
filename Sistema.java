
public class Sistema {

	private Usuarios[] usuario;
	private String nombre;
	private int cantidadRegistrados;
	private int tam;

	public Sistema(String nombre, int tam) {
		this.nombre = nombre;
		this.usuario = new Usuarios[tam];
		this.cantidadRegistrados = 0;
	}

	private int calcularCantidad() {
		int cantidad = 0;
		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getMail() != null) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public void registrarUsuario(Usuarios usuario) { // usuario creado
		this.usuario[cantidadRegistrados] = usuario;
		this.cantidadRegistrados++;
	}

	public void registarUsuario(String nombre, String contrasenia, String mail) {
	//  creo un usuario
		Usuarios user = new Usuarios("Omar", "1324", "omar@gmail.com"); // crear usuario antes de instanciarlo
		this.usuario[cantidadRegistrados] = user;
		this.cantidadRegistrados++;
	}

	public boolean iniciarSesion(String mail, String contrasenia) {
		for (int i = 0; i < cantidadRegistrados; i++) { // o usuario.length
			if (usuario[i].getMail().equals(mail) && usuario[i].getContrasenia().equals(contrasenia)) {
				return true;
			}
			// en caso de dar true entra al sistema o habilita el sistema en pantalla
		}
		return false; // en caso de dar false error en pantalla
	}
	
	
}

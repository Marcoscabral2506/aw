
public class Main_Loguearse {

	public static void main(String[] args) {
		Sistema sys1 = new Sistema("xxx", 20);
		Usuarios usuario1 = new Usuarios("mmm", "abcd", "mm@gmail.com");
		Usuarios usuario2 = new Usuarios("333", "333", "juan@mail");
	//	sys1.registrarUsuario(usuario1);
	//	sys1.registrarUsuario(usuario2);
		sys1.registarUsuario("Omar", "1324", "omar@gmail.com");
				if (sys1.iniciarSesion("omar@gmail.com", "1324")) { // ¿QUE COMPARA ACA?
			System.out.println("Bienvenido");
		} else {
			System.out.println("Error usuario y contrasenia");
		}
	}



	}



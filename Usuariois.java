
public class Usuarios {
	private String usuario;
	private String contrasenia;
	private String mail;
	
	public Usuarios(String usuario, String contrasenia, String mail) {
		this.usuario=usuario;
		this.contrasenia=contrasenia;
		this.mail=mail;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}	
}


public class Telefono {
	private Integer codigoArea;
	private Integer numero;
	
	public Telefono(Integer codigoArea, Integer numero) {
		this.codigoArea = codigoArea;
		this.numero = numero;
	}

	public Integer getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(Integer codigoArea) {
		this.codigoArea = codigoArea;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
}

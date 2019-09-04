import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class TestPersona {
	@Test
	public void DireccionIgual() {
		
		Persona per2=new Persona("hola", "pedro","pedro", 14, "4135");
		
		Persona per1=new Persona("hola", "pedro","pedro", 14, "4135");
		
		Direccion esperado=per2.getDireccion();
		Direccion obtenido=per1.getDireccion();
		
		Assert.assertTrue(esperado.equals(obtenido));

	}
	@Test
	public void AgregarDireccionAUnaColeccion() {

		ArrayList<Direccion>lista= new ArrayList<Direccion>();
		//agregar borrar mucho linkedlist, consultar mucho arraylist
		Direccion d1=new Direccion("papo",1,"5432");
		lista.add(d1);
		Direccion d2=new Direccion("papo",2,"5432");
		Direccion d3=new Direccion("papo",3,"5432");
		
		lista.add(d2);
		Assert.assertEquals(2, lista.size());
		lista.add(1, d3);
		
		//FOR EACH => no puedo modificar, borrar. solo consulta
		for(Direccion direccionAux : lista) {
			System.out.println(direccionAux);
		}
		System.out.println("");
		LinkedList <Direccion> listaEnlazada= new LinkedList<Direccion>() ;
		listaEnlazada.add(d2);
		listaEnlazada.add(d1);
		
		for(Direccion direccionAux : listaEnlazada) {
			System.out.println(direccionAux);
		}
		lista.addAll(listaEnlazada);
		System.out.println("");
		for(Direccion d : lista) {
			System.out.println(d);
		}
		//listaEnlazada.clear(); borra el contenido, se puede seguir usando
		Assert.assertTrue(listaEnlazada.contains(d2));// devuelve true si el elemento esta en la lista
		
		
	}
	
	@Test
	public void TelefonoAgregado() {
		Persona per2=new Persona("hola", "pedro","pedro", 14, "4135");
		Telefono tel=new Telefono(5432,4321);
		per2.AgregarTelefono(tel);
		System.out.println(per2.getTelefonos());
	}
}

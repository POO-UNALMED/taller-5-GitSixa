package gestion;

import java.util.*;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public int cantidadTotalAnimales() {
		int a = 0;
		for (Zona zona : zonas) {
			a += zona.cantidadAnimales();
		}
		return a;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List <Zona> getZona() {
		return zonas;
	}

	public void setZonas(List <Zona> zonas) {
		this.zonas = zonas;
	}
}

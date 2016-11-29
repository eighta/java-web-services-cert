package a8.utils;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;

public class DataTransformUtil {

	public static void main(String[] args) {
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		XMLEncoder encoder = new XMLEncoder(out);
		
		// serialize to XML
		encoder.writeObject(new Casa() );
		encoder.close();
		
		System.out.println(out.toString());
		
		System.out.println("end!!!");
	}
}

class Casa{
	private int puertas=3;
	private int ventanas=5;
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVentanas() {
		return ventanas;
	}
	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}
}

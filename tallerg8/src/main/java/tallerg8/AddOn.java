package tallerg8;

import java.util.ArrayList;

public class AddOn {
	private String nombre;
	private int precio;
	
	private static ArrayList<AddOn> addOns=new ArrayList<>();
	
	public AddOn(String name, int price) {
		super();
		this.nombre = name;
		this.precio = price;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre = name;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int price) {
		this.precio = price;
	}
	public static ArrayList<AddOn> getAddOns() {
		return addOns;
	}
	public static void setAddOns(ArrayList<AddOn> addOns) {
		AddOn.addOns = addOns;
	}
	
	
	
	
	
}

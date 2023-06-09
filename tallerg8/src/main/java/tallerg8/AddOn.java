package tallerg8;

import java.util.ArrayList;
import java.util.List;

public class AddOn {
	private String nombre;
	private int precio;
	
	private static List<AddOn> addOns=new ArrayList<>();
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
	public static List<AddOn> getAddOns() {
		return addOns;
	}
	public static void setAddOns(List<AddOn> addOns) {
		AddOn.addOns = addOns;
	}
	
	
	
	
	
}

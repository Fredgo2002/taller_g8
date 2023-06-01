package taller_g8;

import java.util.ArrayList;


public class PaqueteVacaciones {
	
	String destination;
	int numTravelers;
	int durationVac;
	public int baseCost =1000;
	double penalty=0;
	double descuento=0;
	
	public static ArrayList <Destino> popularLoc=new ArrayList<Destino>();

	public PaqueteVacaciones(String destination, int numTraveleres, int durationVac) {
		super();
		this.destination = destination;
		this.numTravelers = numTraveleres;
		this.durationVac = durationVac;
	}
	
	public void setDiscount() {
		if(this.numTravelers>4 && this.numTravelers<10 ) {
			this.descuento=0.1;
		}
		if(this.numTravelers>10) {
			this.descuento=0.2;
		}
	}
	
	public void setPenalties() {
		if(this.durationVac<7) {
			this.penalty+=200;
		}
		if(this.durationVac>30 || this.numTravelers==2) {
			this.penalty-=200;
		}
		
	}
	
	public boolean isValidPackage() {
		if(this.numTravelers>80) {
			return false;
		}
		return true;
	}
	
	public double calculateCost() {
		double cost=(this.baseCost+this.penalty)*(1-this.descuento);
		return cost;
	}
	
	public boolean isPopular() {
		for(Destino destino:popularLoc) {
			if(this.destination.equals(destino.getNombre())) {
				this.baseCost+=destino.getPrecio();
				return true;
			}
		}
		return false;
	}

}

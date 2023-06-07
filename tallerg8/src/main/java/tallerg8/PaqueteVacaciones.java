package tallerg8;

import java.util.ArrayList;

public class PaqueteVacaciones {
  /**
   * .
   * precio inicial del paquete
   */
  private static final int INITIALPRICE = 1000;

  /**
   * .
   * Primer limite para el numero de viajeros
   */
  private static final int LIMITENUMTRAVELERS1 = 4;
  /**
   * .
   * Segundo limite para el numero de viajeros
   */
  private static final int LIMITENUMTRAVELERS2 = 10;

  /**
   * .
   * Primer descuento
   */
  private static final float DESCUENTO1 = 0.1f;
  /**
   * .
   * Segundo descuento
   */
  private static final float DESCUENTO2 = 0.2f;

  /**
   * .
   * Duracion 1 del viaje que recibe penalidad
   */
  private static final int DURACIONPENALIDAD1 = 7;
  /**
   * .
   * Duracion 2 del viaje que recibe penalidad
   */
  private static final int DURACIONPENALIDAD2 = 30;
  /**
   * .
   * Penalidad que se otorga a los viajes
   */
  private static final int PENALIDAD1 = 200;

  /**
   * .
   * Minimo numero de viajeros para que el viaje sea valido
   */
  private static final int MINVALIDTRAVELERS = 200;

  /**
   * nombre del destino.
   */
  private String destination;
  /**
   * n de pasajeros.
   */
  private int numTravelers;
  /**
   * duracion viaje.
   */
  private int durationVac;
  /**
   * costo base.
   */
  private int baseCost = INITIALPRICE;
  /**
   * penalidades.
   */
  private double penalty = 0;
  /**
   * nombre del destino.
   */
  private double descuento = 0;
  /**
   * Lista de destinos populares.
   */
  private static ArrayList<Destino> popularLoc = new ArrayList<Destino>();
  
  private ArrayList<AddOn> AddOns=new ArrayList<>();
  
  /**
   * constructor.
   *
   * @param destiny
   * @param numTraveleres
   * @param duracion
   */
  public PaqueteVacaciones(final String destiny,
      final int numTraveleres, final int duracion) {
    super();
    this.destination = destiny;
    this.numTravelers = numTraveleres;
    this.durationVac = duracion;
  }

  /**
   * setea el descuento.
   */
  public void setDiscount() {
    if (this.numTravelers > LIMITENUMTRAVELERS1
        && this.numTravelers < LIMITENUMTRAVELERS2) {
      this.descuento = DESCUENTO1;
    }
    if (this.numTravelers > LIMITENUMTRAVELERS2) {
      this.descuento = DESCUENTO2;
    }
  }

  /**
   * setea las penalidades.
   */
  public void setPenalties() {
    if (this.durationVac < DURACIONPENALIDAD1) {
      this.penalty += PENALIDAD1;
    }
    if (this.durationVac > DURACIONPENALIDAD2 || this.numTravelers == 2) {
      this.penalty = PENALIDAD1;
    }
  }

  /**
   * valida el paquete de viajes.
   *
   * @return
   *         retorna un booleano
   */
  public boolean isValidPackage() {
    if (this.numTravelers > MINVALIDTRAVELERS) {
      return false;
    }
    return true;
  }

  /**
   * calcula el costo total.
   *
   * @return
   *         retorna el valor.
   */
  public double calculateCost() {
    double cost = (this.baseCost + this.penalty)
        * (1 - this.descuento);
    for (AddOn a: this.AddOns) {
         cost += a.getPrecio();
    }
    return cost;
  }

  /**
   * Compara si el destino esta entre los populares.
   *
   * @return
   *         retorna un booleano
   */
  public boolean isPopular() {
    for (Destino destino : popularLoc) {
      if (this.destination.equals(destino.getNombre())) {
        this.baseCost += destino.getPrecio();
        return true;
      }
    }
    return false;
  }

  /**
   * getter destino.
   *
   * @return
   *         string
   */
  public String getDestination() {
    return destination;
  }

  /**
   * setter destino.
   *
   * @param destino
   */
  public void setDestination(final String destino) {
    this.destination = destino;
  }

  /**
   * getter num travelers.
   *
   * @return
   *         integer
   */
  public int getNumTravelers() {
    return numTravelers;
  }

  /**
   * setter num travelers.
   *
   * @param numeroViajeros
   */
  public void setNumTravelers(final int numeroViajeros) {
    this.numTravelers = numeroViajeros;
  }

  /**
   * getter duracion viaje.
   *
   * @return
   *         integer
   */
  public int getDurationVac() {
    return durationVac;
  }

  /**
   * setter duracion.
   *
   * @param duracionVac
   */
  public void setDurationVac(final int duracionVac) {
    this.durationVac = duracionVac;
  }

  /**
   * getter costos base.
   *
   * @return
   *         integer
   */
  public int getBaseCost() {
    return baseCost;
  }

  /**
   * setter costo base.
   *
   * @param costoBase
   */
  public void setBaseCost(final int costoBase) {
    this.baseCost = costoBase;
  }

  /**
   * getter penalidades.
   *
   * @return
   *         double
   */
  public double getPenalty() {
    return penalty;
  }

  /**
   * setter penalidades.
   *
   * @param penalidad
   */
  public void setPenalty(final double penalidad) {
    this.penalty = penalidad;
  }

  /**
   * getter descuento.
   *
   * @return
   *         double
   */
  public double getDescuento() {
    return descuento;
  }

  /**
   * setter descuento.
   *
   * @param discount
   */
  public void setDescuento(final double discount) {
    this.descuento = discount;
  }

  /**
   * getter destinos populares.
   *
   * @return
   *         arraylist
   */
  public static ArrayList<Destino> getPopularLoc() {
    return popularLoc;
  }

  /**
   * setter lista destinos populares.
   *
   * @param destinosPopulares
   */
  public static void setPopularLoc(final ArrayList<Destino> destinosPopulares) {
    PaqueteVacaciones.popularLoc = destinosPopulares;
  }

public ArrayList<AddOn> getAddOns() {
	return AddOns;
}

public void setAddOns(ArrayList<AddOn> addOns) {
	AddOns = addOns;
}

}

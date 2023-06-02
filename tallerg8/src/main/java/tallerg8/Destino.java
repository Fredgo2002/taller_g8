package tallerg8;

/**
 * @author ggabo
 */
public class Destino {
  /**
   * Nombre del destino.
   */
  private String nombre;
  /**
   * Precio del destino.
   */
  private int precio;

  /**
   * Constructor.
   *
   * @param name
   * @param price
   */
  public Destino(final String name, final int price) {
    super();
    this.nombre = name;
    this.precio = price;
  }

  /**
   * getter nombre.
   *
   * @return
   *         retorna un string.
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * setter nombre.
   *
   * @param name
   */
  public void setNombre(final String name) {
    this.nombre = name;
  }

  /**
   * getter precio.
   *
   * @return
   *         retorna un entero
   */
  public int getPrecio() {
    return precio;
  }

  /**
   * setter precio.
   *
   * @param price
   */
  public void setPrecio(final int price) {
    this.precio = price;
  }
}

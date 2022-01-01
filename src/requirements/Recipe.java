package requirements;

/**
 * IReceta
 */
public interface Recipe {

  // Método para listar los ingredientes
  public String all_Ingredients();

  public double preparation_Time(double tiempo_Preparacion);

  public String information_Recipe();

  public String get_Name();
}

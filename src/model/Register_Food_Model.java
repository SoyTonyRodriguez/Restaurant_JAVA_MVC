package model;

import classes.Generic;
import requirements.Drink;
import requirements.Food;
import requirements.Dessert;

/**
 * Registrar_Platillo_Modelo
 */
public class Register_Food_Model {

  public void register_Drink(String nombre, double precio, String ingredientes[], double tiempo) {
    Drink bebida = new Drink(nombre, precio, ingredientes);
    bebida.preparation_Time(tiempo);
    bebida.setPrice(precio);
    Generic.getRecipes().add(bebida);
  }

  public void register_Food(String nombre, double precio, String ingredientes[], double tiempo) {
    Food comida = new Food(nombre, precio, ingredientes);
    comida.preparation_Time(tiempo);
    comida.setPrice(precio);
    Generic.getRecipes().add(comida);
  }

  public void register_Dessert(String nombre, double precio, String ingredientes[], double tiempo) {
    Dessert postre = new Dessert(nombre, precio, ingredientes);
    postre.preparation_Time(tiempo);
    postre.setPrice(precio);
    Generic.getRecipes().add(postre);
  }

}

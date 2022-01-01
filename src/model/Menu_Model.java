package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import classes.Generic;
import requirements.Drink;
import requirements.Food;
import requirements.Recipe;
import requirements.Dessert;

/**
 * Menu_Modelo
 */
public class Menu_Model {

  public void information_Food(int position) {
    ArrayList<Food> food = new ArrayList<>();
    for (Recipe recipe : Generic.getRecipes()) {
      if (recipe instanceof Food) {
        food.add((Food) recipe);
      }
    }

    JOptionPane.showMessageDialog(null, food.get(position).information_Recipe());
  }

  public void information_Drinks(int posiscion) {
    ArrayList<Drink> drinks = new ArrayList<>();
    for (Recipe recipe : Generic.getRecipes()) {
      if (recipe instanceof Drink) {
        drinks.add((Drink) recipe);
      }
    }

    JOptionPane.showMessageDialog(null, drinks.get(posiscion).information_Recipe());
  }

  public void information_Dessert(int posiscion) {
    ArrayList<Dessert> desserts = new ArrayList<>();
    for (Recipe recipe : Generic.getRecipes()) {
      if (recipe instanceof Dessert) {
        desserts.add((Dessert) recipe);
      }
    }

    JOptionPane.showMessageDialog(null, desserts.get(posiscion).information_Recipe());
  }
}

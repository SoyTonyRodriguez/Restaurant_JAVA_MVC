package requirements;

import java.util.Arrays;

/**
 * Comida
 */
public class Food implements Recipe {

	public String name;
	private double preparation_Time;
	private double price;
	private String[] ingredients;

	public Food(String name, double price, String[] ingredients) {
		this.name = name;
		this.setPrice(price);
		this.ingredients = ingredients;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double precio) {
		this.price = precio;
	}

	@Override
	public String all_Ingredients() {
		return Arrays.toString(ingredients);
	}

	@Override
	public double preparation_Time(double tiempo_Preparacion) {
		this.preparation_Time = tiempo_Preparacion;
		return tiempo_Preparacion;
	}

	@Override
	public String information_Recipe() {
		return "The food " + name + " will take a time of " + preparation_Time + " to be ready \n"
			+ "It includes the next ingredients: " + all_Ingredients();
	}

	@Override
	public String get_Name() {
		return name;
	}
}

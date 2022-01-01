package requirements;

import java.util.Arrays;

/**
 * Bebida
 */
public class Drink implements Recipe {

	public String name;
	private double preparation_Time;
	private double price;
	private String[] ingredients;

	public Drink(String name, double price, String[] ingredients) {
		this.name = name;
		this.setPrice(price);
		this.ingredients = ingredients;
	}

	public double getPrecio() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
		return "The drink " + name + " will take a time of " + preparation_Time + " to be ready\n" +
			"It includes the next ingredients: " + all_Ingredients();
	}

	@Override
	public String get_Name() {
		return name;
	}
}

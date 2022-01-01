package requirements;

/**
 * Pedido
 */
public class Order {
	private int order_Number;

	private Client client;
	private Dealer dealer;

	private String dealer_Name, dealer_Surname, conveyance;
	private int age;
	private long phone;

	public Order(int order_Number, Client client) {
		this.order_Number = order_Number;
		this.client = client;
		this.dealer = new Dealer(dealer_Name, dealer_Surname, phone, age, conveyance);
	}

	public String confirm_Order() {
		return "The client " + client.name + " has made your order succesfully\n" + "Order number: " + order_Number
				+ " \nYour dealer will be: " + dealer.getName() + "\nThe order will be delivered to : " + client.getAddress();
	}

	// Getter y setter
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getOrder_Number() {
		return order_Number;
	}

	public void setOrder_Number(int order_Number) {
		this.order_Number = order_Number;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

}

package model;

import java.util.Random;

import javax.swing.JOptionPane;

import classes.Generic;
import requirements.Client;
import requirements.Order;

/**
 * Realizar_Pedido_Modelo
 */
public class Make_Order_Model {
  public void instance(String name, String surnames, long phone, int age, String pay,
      String address) {

    Client client = new Client(name, surnames, phone, age, pay, address);

    if (!client.old_Enough()) {
      JOptionPane.showMessageDialog(null, "The client isn't old enough.");
    } else {
      Random rand = new Random();
      int order_Number = rand.nextInt(100 + 1);
      int dealer_Number = rand.nextInt(Generic.getDealers().size() + 0);
      Order order = new Order(order_Number, client);
      order.setDealer(Generic.getDealers().get(dealer_Number));

      JOptionPane.showMessageDialog(null, "Successful register\n" + order.confirm_Order());
    }
  }

}

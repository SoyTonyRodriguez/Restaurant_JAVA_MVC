package model;

import javax.swing.JOptionPane;

import classes.Generic;
import requirements.Dealer;

/**
 * Registrar_Repartidor_Modelo
 */
public class Register_Dealer_Model {

  public void register(String name, String surname, long phone, int age, String transporte) {

    Dealer dealer = new Dealer(name, surname, phone, age, transporte);

    if (!dealer.old_Enough()) {
      JOptionPane.showMessageDialog(null, "The dealer isn't old enough.");
    } else {
      Generic.getDealers().add(dealer);
      JOptionPane.showMessageDialog(null, "Successful register.");
    }
  }
}

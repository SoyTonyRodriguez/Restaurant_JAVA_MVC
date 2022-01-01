package views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import classes.Generic;

/**
 * Registrar_Repartidor_Vista
 */
public class Register_Dealer_View extends Generic {

  private JLabel lbl_Name, lbl_Surname, lbl_Age, lbl_Phone, lbl_Conveyance;
  private JComboBox<String> cmb_Conveyance;
  private JTextField txt_Name, txt_Surname, txt_Age, txt_Phone;
  private JButton btn_Register, btn_Return;

  public Register_Dealer_View() {
    Generic.style();
    init_Components();
  }

  @Override
  protected void init_Components() {
    lbl_Name = new JLabel("Name:");
    generic_Config(lbl_Name, 10, 13);
    add(lbl_Name);

    txt_Name = new JTextField(7);
    txt_Name.setName("Name");
    generic_Config(txt_Name, 140, 7);
    add(txt_Name);

    lbl_Surname = new JLabel("Surname:");
    generic_Config(lbl_Surname, 10, 43);
    add(lbl_Surname);

    txt_Surname = new JTextField(7);
    txt_Surname.setName("Surname");
    generic_Config(txt_Surname, 140, 37);
    add(txt_Surname);

    lbl_Phone = new JLabel("Number Phone:");
    generic_Config(lbl_Phone, 10, 73);
    add(lbl_Phone);

    txt_Phone = new JTextField(7);
    txt_Phone.setName("Number Phone");
    generic_Config(txt_Phone, 140, 67);
    add(txt_Phone);

    lbl_Age = new JLabel("Age:");
    generic_Config(lbl_Age, 10, 103);
    add(lbl_Age);

    txt_Age = new JTextField(7);
    txt_Age.setName("Age");
    generic_Config(txt_Age, 140, 97);
    add(txt_Age);

    lbl_Conveyance = new JLabel("Conveyance:");
    generic_Config(lbl_Conveyance, 10, 133);
    add(lbl_Conveyance);
    String transportes[] = { "None", "Car", "Bicycle", "Motorcycle" };
    cmb_Conveyance = new JComboBox<String>(transportes);
    generic_Config(cmb_Conveyance, 140, 127);
    add(cmb_Conveyance);

    btn_Return = new JButton("Register");
    generic_Config(btn_Return, 10, 160);
    add(btn_Return);

    btn_Register = new JButton("Return");
    generic_Config(btn_Register, 140, 160);
    add(btn_Register);
  }

  public JComboBox<String> getCmb_Conveyance() {
    return cmb_Conveyance;
  }

  public void setCmb_Conveyance(JComboBox<String> cmb_Transport) {
    this.cmb_Conveyance = cmb_Transport;
  }

  public JTextField getTxt_Name() {
    return txt_Name;
  }

  public void setTxt_Name(JTextField txt_Name) {
    this.txt_Name = txt_Name;
  }

  public JTextField getTxt_Surname() {
    return txt_Surname;
  }

  public void setTxt_Surname(JTextField txt_Surname) {
    this.txt_Surname = txt_Surname;
  }

  public JTextField getTxt_Age() {
    return txt_Age;
  }

  public void setTxt_Age(JTextField txt_Age) {
    this.txt_Age = txt_Age;
  }

  public JTextField getTxt_Phone() {
    return txt_Phone;
  }

  public void setTxt_Phone(JTextField txt_Phone) {
    this.txt_Phone = txt_Phone;
  }

  public JButton getBtn_Register() {
    return btn_Register;
  }

  public void setBtn_Register(JButton btn_Register) {
    this.btn_Register = btn_Register;
  }

  public JButton getBtn_Return() {
    return btn_Return;
  }

  public void setBtn_Return(JButton btn_Return) {
    this.btn_Return = btn_Return;
  }
}

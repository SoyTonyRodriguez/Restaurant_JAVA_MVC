package views;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Generic;

/**
 * Registrar_Platillo_Vista
 */
public class Register_Food_View extends Generic {

  private JLabel lbl_Kind_Food, lbl_Name, lbl_Time, lbl_Price, lbl_Ingredients;
  private JRadioButton rdb_Food, rdb_Drink, rdb_Dessert;
  private ButtonGroup rdbg_Foods;
  private JTextField txt_Name, txt_Time, txt_Price;
  private JTextArea txta_Ingredients;
  private JButton btn_Register, btn_Return;
  private JScrollPane spnl_Ingredients;

  public Register_Food_View() {
    style();
    init_Components();
  }

  @Override
  protected void init_Components() {
    lbl_Kind_Food = new JLabel("Kind of food");
    generic_Config(lbl_Kind_Food, 6, 10);
    add(lbl_Kind_Food);

    rdb_Food = new JRadioButton("Food");
    generic_Config(rdb_Food, 14, 31);
    add(rdb_Food);

    rdb_Drink = new JRadioButton("Drink");
    generic_Config(rdb_Drink, 88, 31);
    add(rdb_Drink);

    rdb_Dessert = new JRadioButton("Dessert");
    generic_Config(rdb_Dessert, 159, 31);
    add(rdb_Dessert);

    rdbg_Foods = new ButtonGroup();
    rdbg_Foods.add(rdb_Food);
    rdbg_Foods.add(rdb_Drink);
    rdbg_Foods.add(rdb_Dessert);

    lbl_Name = new JLabel("Name:");
    generic_Config(lbl_Name, 6, 61);
    add(lbl_Name);

    txt_Name = new JTextField(8);
    txt_Name.setName("Name");
    generic_Config(txt_Name, 143, 55);
    add(txt_Name);

    lbl_Time = new JLabel("Preparation time:");
    generic_Config(lbl_Time, 6, 94);
    add(lbl_Time);

    txt_Time = new JTextField(8);
    txt_Time.setName("Time");
    generic_Config(txt_Time, 143, 88);
    add(txt_Time);

    lbl_Price = new JLabel("Price:");
    generic_Config(lbl_Price, 6, 127);
    add(lbl_Price);

    txt_Price = new JTextField(8);
    txt_Price.setName("Price");
    generic_Config(txt_Price, 143, 121);
    add(txt_Price);

    lbl_Ingredients = new JLabel("Ingredients:");
    generic_Config(lbl_Ingredients, 6, 187);
    add(lbl_Ingredients);

    txta_Ingredients = new JTextArea(5, 20);

    spnl_Ingredients = new JScrollPane(txta_Ingredients);
    generic_Config(spnl_Ingredients, 6, 204);
    add(spnl_Ingredients);

    btn_Register = new JButton("Register");
    generic_Config(btn_Register, 6, 305);
    add(btn_Register);

    btn_Return = new JButton("Return");
    generic_Config(btn_Return, 158, 305);
    add(btn_Return);
  }

  public JRadioButton getRdb_Food() {
    return rdb_Food;
  }

  public void setRdb_Food(JRadioButton rdb_Food) {
    this.rdb_Food = rdb_Food;
  }

  public JRadioButton getRdb_Drink() {
    return rdb_Drink;
  }

  public void setRdb_Drink(JRadioButton rdb_Drink) {
    this.rdb_Drink = rdb_Drink;
  }

  public JRadioButton getRdb_Dessert() {
    return rdb_Dessert;
  }

  public void setRdb_Dessert(JRadioButton rdb_Dessert) {
    this.rdb_Dessert = rdb_Dessert;
  }

  public ButtonGroup getRdbg_Foods() {
    return rdbg_Foods;
  }

  public void setRdbg_Foods(ButtonGroup rdbg_Foods) {
    this.rdbg_Foods = rdbg_Foods;
  }

  public JTextField getTxt_Name() {
    return txt_Name;
  }

  public void setTxt_Name(JTextField txt_Name) {
    this.txt_Name = txt_Name;
  }

  public JTextField getTxt_Time() {
    return txt_Time;
  }

  public void setTxt_Time(JTextField txt_Time) {
    this.txt_Time = txt_Time;
  }

  public JTextField getTxt_Price() {
    return txt_Price;
  }

  public void setTxt_Price(JTextField txt_Price) {
    this.txt_Price = txt_Price;
  }

  public JTextArea getTxta_Ingredients() {
    return txta_Ingredients;
  }

  public void setTxta_Ingredients(JTextArea txta_Ingredients) {
    this.txta_Ingredients = txta_Ingredients;
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

  public JScrollPane getSpnl_Ingredients() {
    return spnl_Ingredients;
  }

  public void setSpnl_Ingredients(JScrollPane spnl_Ingredients) {
    this.spnl_Ingredients = spnl_Ingredients;
  }
}

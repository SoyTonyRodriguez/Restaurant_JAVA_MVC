package views;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import classes.Generic;

/**
 * Menu_Vista
 */
public class Menu_View extends Generic {

  private JLabel lbl_Food, lbl_Drink, lbl_Dessert;
  private JScrollPane spnl_Food, spnl_Drink, spnl_Dessert;
  private JList<String> lst_Food, lst_Drink, lst_Dessert;
  private JButton btn_Return;
  private DefaultListModel<String> model_Food, model_Drink, model_Dessert;

  public Menu_View() {
    style();
    init_Components();
  }

  @Override
  protected void init_Components() {
    setLayout(null);
    lbl_Food = new JLabel("Foods:");
    generic_Config(lbl_Food, 6, 6);
    add(lbl_Food);

    model_Food = new DefaultListModel<>();
    lst_Food = new JList<>(model_Food);
    spnl_Food = new JScrollPane(lst_Food);
    spnl_Food.setBounds(6, 29, 100, 193);
    add(spnl_Food);

    lbl_Drink = new JLabel("Drinks:");
    generic_Config(lbl_Drink, 124, 6);
    add(lbl_Drink);

    model_Drink = new DefaultListModel<>();
    lst_Drink = new JList<>(model_Drink);
    spnl_Drink = new JScrollPane(lst_Drink);
    spnl_Drink.setBounds(124, 29, 100, 193);
    add(spnl_Drink);

    lbl_Dessert = new JLabel("Desserts:");
    generic_Config(lbl_Dessert, 242, 6);
    add(lbl_Dessert);

    model_Dessert = new DefaultListModel<>();
    lst_Dessert = new JList<>(model_Dessert);
    spnl_Dessert = new JScrollPane(lst_Dessert);
    spnl_Dessert.setBounds(242, 29, 100, 193);
    add(spnl_Dessert);

    btn_Return = new JButton("Return");
    generic_Config(btn_Return, 255, 230);
    add(btn_Return);
  }

  public JScrollPane getSpnl_Food() {
    return spnl_Food;
  }

  public void setSpnl_Food(JScrollPane spnl_Food) {
    this.spnl_Food = spnl_Food;
  }

  public JScrollPane getSpnl_Drink() {
    return spnl_Drink;
  }

  public void setSpnl_Drink(JScrollPane spnl_Drink) {
    this.spnl_Drink = spnl_Drink;
  }

  public JScrollPane getSpnl_Dessert() {
    return spnl_Dessert;
  }

  public void setSpnl_Dessert(JScrollPane spnl_Dessert) {
    this.spnl_Dessert = spnl_Dessert;
  }

  public JList<String> getLst_Food() {
    return lst_Food;
  }

  public void setLst_Food(JList<String> lst_Food) {
    this.lst_Food = lst_Food;
  }

  public JList<String> getLst_Drink() {
    return lst_Drink;
  }

  public void setLst_Drink(JList<String> lst_Drink) {
    this.lst_Drink = lst_Drink;
  }

  public JList<String> getLst_Dessert() {
    return lst_Dessert;
  }

  public void setLst_Dessert(JList<String> lst_Dessert) {
    this.lst_Dessert = lst_Dessert;
  }

  public JButton getBtn_Return() {
    return btn_Return;
  }

  public void setBtn_Return(JButton btn_Return) {
    this.btn_Return = btn_Return;
  }

  public DefaultListModel<String> getModel_Food() {
    return model_Food;
  }

  public void setModel_Food(DefaultListModel<String> model_Food) {
    this.model_Food = model_Food;
  }

  public DefaultListModel<String> getModel_Drink() {
    return model_Drink;
  }

  public void setModel_Drink(DefaultListModel<String> model_Drink) {
    this.model_Drink = model_Drink;
  }

  public DefaultListModel<String> getModel_Dessert() {
    return model_Dessert;
  }

  public void setModel_Dessert(DefaultListModel<String> model_Dessert) {
    this.model_Dessert = model_Dessert;
  }

}

package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import classes.Generic;
import model.Make_Order_Model;
import requirements.Recipe;
import views.Home_View;
import views.Make_Order_View;

/**
 * Realizar_Pedido_Controlador
 */
public class Make_Order_Controller implements ActionListener {
  private ArrayList<JTextField> fields = new ArrayList<>();
  private ArrayList<JTextField> errors = new ArrayList<>();

  private Make_Order_View view;
  private Make_Order_Model model;

  public Make_Order_Controller(Make_Order_View view, Make_Order_Model model) {
    this.view = view;
    this.model = model;

    add_Food();
  }

  public void add_Food() {
    for (Recipe receta : Generic.getRecipes()) {
      view.getCmb_Food().addItem(receta.get_Name());
    }
  }

  public void config_Window() {
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    view.setBounds(0, 0, 224, 275);
    view.setLayout(null);
    view.setLayout(null);
    view.setLocationRelativeTo(null);
    view.setResizable(false);

    this.view.getBtn_Register().addActionListener(this);
    this.view.getBtn_Return().addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case "Register":
        add_Fields(fields);
        if (Generic.validate(fields)) {
          String name = view.getTxt_Name().getText();
          String surname = view.getTxt_Surnames().getText();

          String pay = seleccionar_MetodoPago();
          String food = view.getCmb_Food().getSelectedItem().toString();
          String address = view.getTxt_Address().getText();

          if (food == "None") {
            JOptionPane.showMessageDialog(null, "You don't seleccted any food option.");
          }
          if (Generic.getDealers().toArray().length == 0) {
            JOptionPane.showMessageDialog(null, "There isn't registered dealer yet.");
          } 
          else {
            try {
              errors.add(view.getTxt_Age());
              errors.add(view.getTxt_Phone());
              int age = Integer.parseInt(view.getTxt_Age().getText());
              long phone = Long.parseLong(view.getTxt_Phone().getText());

              model.instance(name, surname, phone, age, pay, address);
            } catch (Exception exp) {
              Generic.check_Number(errors, Generic.last_Word(exp));
            }
          }
        }

        break;
      case "Return":
        Home_View home_View = new Home_View();
        Home_Controller home_Controller = new Home_Controller(home_View);
        home_Controller.config_Window();
        home_View.setVisible(true);
        view.dispose();
        break;
      default:
        JOptionPane.showMessageDialog(null, "Unknow action " + e.getActionCommand());
        break;
    }
  }

  private String seleccionar_MetodoPago() {
    return (view.getCmb_Pay().getSelectedIndex() == 0) ? view.getCmb_Pay().getSelectedItem().toString()
        : view.getCmb_Pay().getSelectedItem().toString();
  }

  private void add_Fields(ArrayList<JTextField> fields) {
    fields.add(view.getTxt_Name());
    fields.add(view.getTxt_Surnames());
    fields.add(view.getTxt_Age());
    fields.add(view.getTxt_Phone());
    fields.add(view.getTxt_Address());
  }

}

package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import classes.Generic;
import model.Register_Food_Model;

import views.Home_View;
import views.Register_Food_View;

/**
 * Registrar_Platillo_Controlador
 */
public class Register_Food_Controller implements ActionListener {

  private ArrayList<JTextField> fields = new ArrayList<>();
  ArrayList<JTextField> errors = new ArrayList<>();

  private Register_Food_View view;
  private Register_Food_Model model;

  public Register_Food_Controller(Register_Food_View view, Register_Food_Model model) {
    this.view = view;
    this.model = model;
  }

  public void config_Window() {
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    view.setBounds(0, 0, 247, 342);
    view.setLayout(null);
    view.setLayout(null);
    view.setLocationRelativeTo(null);
    view.setResizable(false);

    view.getBtn_Return().addActionListener(this);
    view.getBtn_Register().addActionListener(this);

    view.getRdb_Food().setSelected(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case "Register":
        view.getTxta_Ingredients().setBackground(Color.white);
        add_Fields(fields);
        String ingredients[];

        if (Generic.validate(fields) && validate_TextArea()) {
          String name = view.getTxt_Name().getText();

          try {
            errors.add(view.getTxt_Time());
            errors.add(view.getTxt_Price());

            double preparation_Time = Double.parseDouble(view.getTxt_Time().getText());
            double price = Double.parseDouble(view.getTxt_Price().getText());

            ingredients = view.getTxta_Ingredients().getText().split("\n");
            options_RadioButton(name, price, ingredients, preparation_Time);

            JOptionPane.showMessageDialog(null, "Successful register.");
          } catch (Exception exp) {
            Generic.check_Number(errors, Generic.last_Word(exp));
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
    }
  }

  private void options_RadioButton(String name, double price, String ingredients[], double time) {
    if (view.getRdb_Drink().isSelected()) {
      model.register_Drink(name, price, ingredients, time);
    } else if (view.getRdb_Food().isSelected()) {
      model.register_Food(name, price, ingredients, time);
    } else if (view.getRdb_Dessert().isSelected()) {
      model.register_Dessert(name, price, ingredients, time);
    }
  }

  private boolean validate_TextArea() {
    if (view.getTxta_Ingredients().getText().isBlank()) {
      view.getTxta_Ingredients().setBackground(Color.red);
      JOptionPane.showMessageDialog(null, "You can't leave the ingredients empty.", "Ingredients empty",
          JOptionPane.WARNING_MESSAGE);
      return false;
    }

    return true;
  }

  private void add_Fields(ArrayList<JTextField> fields) {
    fields.add(view.getTxt_Name());
    fields.add(view.getTxt_Time());
    fields.add(view.getTxt_Price());
  }
}

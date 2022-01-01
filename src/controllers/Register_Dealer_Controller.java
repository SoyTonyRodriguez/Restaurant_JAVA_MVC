package controllers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import classes.Generic;
import model.Register_Dealer_Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import views.Home_View;
import views.Register_Dealer_View;

/**
 * Registrar_Repartidor_Controlador
 */
public class Register_Dealer_Controller implements ActionListener {
  private ArrayList<JTextField> fields = new ArrayList<>();
  private ArrayList<JTextField> errors = new ArrayList<>();

  Register_Dealer_View view;
  Register_Dealer_Model model;

  public Register_Dealer_Controller(Register_Dealer_View view, Register_Dealer_Model model) {
    this.view = view;
    this.model = model;
  }

  public void config_Window() {
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    view.setBounds(0, 0, 242, 191);
    view.setLayout(null);
    view.setLocationRelativeTo(null);
    view.setResizable(false);

    this.view.getBtn_Return().addActionListener(this);
    this.view.getBtn_Register().addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case "Register":
        add_Fields(fields);

        if (Generic.validate(fields)) {
          int age = 0;
          long phone = 0;

          String transporte = "None";
          transport_Options(transporte);

          String name = view.getTxt_Name().getText();
          String surname = view.getTxt_Surname().getText();

          try {
            errors.add(view.getTxt_Phone());
            errors.add(view.getTxt_Age());

            phone = Long.parseLong(view.getTxt_Phone().getText());
            age = Integer.parseInt(view.getTxt_Age().getText());

            model.register(name, surname, phone, age, transporte);

          } catch (Exception exp) {
            Generic.check_Number(errors, Generic.last_Word(exp));
          }
        }
        break;
      case "Return":
        Home_View home_View = new Home_View();
        Home_Controller home_Controler = new Home_Controller(home_View);
        home_Controler.config_Window();
        home_View.setVisible(true);
        view.dispose();
        break;
      default:
        JOptionPane.showMessageDialog(null, "Unknow Action " + e.getActionCommand());
        break;
    }
  }

  private void transport_Options(String transporte) {
    switch (view.getCmb_Conveyance().getSelectedIndex()) {
      case 1:
        transporte = "Car";
        break;
      case 2:
        transporte = "Bicycle";
        break;
      case 3:
        transporte = "Motorcycle";
        break;
      default:
        transporte = "None";
        break;
    }
  }

  private void add_Fields(ArrayList<JTextField> fields) {
    fields.add(view.getTxt_Name());
    fields.add(view.getTxt_Surname());
    fields.add(view.getTxt_Age());
    fields.add(view.getTxt_Phone());
  }

}

package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Menu_Model;
import model.Make_Order_Model;
import model.Register_Food_Model;
import model.Register_Dealer_Model;
import views.Home_View;
import views.Menu_View;
import views.Make_Order_View;
import views.Register_Food_View;
import views.Register_Dealer_View;

/**
 * Inicio_Controlador
 */
public class Home_Controller implements ActionListener {
  private Home_View view;

  public Home_Controller(Home_View view) {
    this.view = view;

    this.view.getBtn_Exit().addActionListener(this);
    this.view.getBtn_Show_Menu().addActionListener(this);
    this.view.getBtn_Make_Order().addActionListener(this);
    this.view.getBtn_Register_Food().addActionListener(this);
    this.view.getBtn_Register_Dealer().addActionListener(this);
  }

  public void config_Window() {
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    view.setBounds(0, 0, 459, 254);
    view.setLayout(null);
    view.setLayout(null);
    view.setLocationRelativeTo(null);
    view.setResizable(false);
  }

  @Override
  public void actionPerformed(ActionEvent arg0) {
    switch (arg0.getActionCommand()) {
      case "Exit":
        System.exit(0);
        break;
      case "Show Menu":
        Menu_View menu_View = new Menu_View();
        Menu_Model menu_Model = new Menu_Model();
        Menu_Controller menu_Controller = new Menu_Controller(menu_View, menu_Model);

        menu_Controller.config_Window();
        menu_View.setVisible(true);
        view.dispose();
        break;
      case "Register Dealer":
        Register_Dealer_View delaer_View = new Register_Dealer_View();
        Register_Dealer_Model dealer_Model = new Register_Dealer_Model();
        Register_Dealer_Controller dealer_Controller = new Register_Dealer_Controller(delaer_View,
            dealer_Model);

        dealer_Controller.config_Window();
        delaer_View.setVisible(true);
        view.dispose();
        break;
      case "Make Order":
        Make_Order_View oder_View = new Make_Order_View();
        Make_Order_Model order_Model = new Make_Order_Model();
        Make_Order_Controller order_Controller = new Make_Order_Controller(oder_View,
            order_Model);

        order_Controller.config_Window();
        oder_View.setVisible(true);
        view.dispose();
        break;
      case "Register Food":
        Register_Food_View food_View = new Register_Food_View();
        Register_Food_Model food_Model = new Register_Food_Model();
        Register_Food_Controller food_Controller = new Register_Food_Controller(food_View,
            food_Model);

        food_Controller.config_Window();
        food_View.setVisible(true);
        view.dispose();
        break;
      default:
        JOptionPane.showMessageDialog(null, "Unknow action: " + arg0.getActionCommand());
        break;
    }
  }
}

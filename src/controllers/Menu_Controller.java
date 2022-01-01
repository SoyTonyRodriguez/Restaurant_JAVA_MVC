package controllers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import classes.Generic;
import model.Menu_Model;
import requirements.Drink;
import requirements.Food;
import requirements.Recipe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import views.Home_View;
import views.Menu_View;

/**
 * Menu_Controlador
 */
public class Menu_Controller implements ActionListener {
  private Menu_View view;
  private Menu_Model model;

  public Menu_Controller(Menu_View view, Menu_Model model) {
    this.view = view;
    this.model = model;
    add_Food_JList();

    food_Event();
    drink_Event();
    dessert_Event();
  }

  public void config_Window() {
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    view.setBounds(0, 0, 350, 259);
    view.setLayout(null);
    view.setLayout(null);
    view.setLocationRelativeTo(null);
    view.setResizable(false);

    view.getBtn_Return().addActionListener(this);

  }

  private void food_Event() {
    view.getLst_Food().addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent me) {
        if (me.getClickCount() == 1) {
          if (!view.getLst_Food().isSelectionEmpty()) {
            int index = view.getLst_Food().getSelectedIndex();
            model.information_Food(index);
          }
        }
      }
    });
  }

  private void drink_Event() {
    view.getLst_Drink().addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent me) {
        if (me.getClickCount() == 1) {
          if (!view.getLst_Food().isSelectionEmpty()) {
            int i = view.getLst_Drink().getSelectedIndex();
            model.information_Drinks(i);
          }
        }
      }
    });
  }

  private void dessert_Event() {
    view.getLst_Dessert().addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent me) {
        if (me.getClickCount() == 1) {
          if (!view.getLst_Dessert().isSelectionEmpty()) {
            int i = view.getLst_Dessert().getSelectedIndex();
            model.information_Dessert(i);
          }
        }
      }
    });
  }

  private void add_Food_JList() {
    for (Recipe receta : Generic.getRecipes()) {
      if (receta instanceof Food) {
        view.getModel_Food().addElement(receta.get_Name());
      } else if (receta instanceof Drink) {
        view.getModel_Drink().addElement(receta.get_Name());
      } else {
        view.getModel_Dessert().addElement(receta.get_Name());
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
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

}

package classes;

import controllers.Home_Controller;
import views.Home_View;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Home_View view = new Home_View();
    Home_Controller controller = new Home_Controller(view);
    controller.config_Window();
    view.setVisible(true);

  }
}

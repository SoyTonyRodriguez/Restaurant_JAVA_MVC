package classes;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import requirements.Recipe;
import requirements.Dealer;

/**
 * Generic
 */
public abstract class Generic extends JFrame {

  private static ArrayList<Dealer> dealers = new ArrayList<Dealer>();

  private static ArrayList<Recipe> recipes = new ArrayList<>();

  // This method sets the generic config for all JComponents
  public static void generic_Config(JComponent jcomponent, int x, int y) {
    jcomponent.setBounds(x, y, jcomponent.getPreferredSize().width, jcomponent.getPreferredSize().height);
  }

  // This method sets my custom config for all components
  protected static void custom_Config(JComponent jcomponent, int size_Font, int x, int y, int width, int height) {
    jcomponent.setFont(new java.awt.Font("Script MT Bold", 0, size_Font));
    jcomponent.setBounds(x, y, width, height);
    if (jcomponent instanceof JLabel) {
      ((JLabel) jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
    }
  }

  // This method sets the style for the components like netbeans
  public static void style() {
    try {
      UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch (Exception e) {
      System.out.println("Look and Feel not set");
    }
  }

  // This method validate if the jtextfields from ArrayList aren't empty
  // Require that you add your JTextField to an ArrayList before
  public static boolean validate(ArrayList<JTextField> fields) {

    boolean flag = true;
    for (JTextField field : fields) {
      field.setBackground(Color.white);

      if (field.getText().isEmpty()) {
        field.setBackground(Color.red);
        flag = false;
      }
    }

    if (!flag) {
      JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "CAMPOS VACÍOS",
          JOptionPane.WARNING_MESSAGE);
    }

    return flag;
  }

  // This method validate if the values on the JTextFields from ArrayList are only
  // numbers
  public static void check_Number(ArrayList<JTextField> errors, String text) {
    for (JTextField field : errors) {
      if (field.getText().equals(text)) {
        field.setBackground(Color.red);
        JOptionPane.showMessageDialog(null, "ERORR!!\nInvalid Data: \"" + text + "\" in: " + field.getName());
        break;
      }
    }
  }

  // This method return the last word of an exeception
  public static String last_Word(Exception exception) {
    String last[] = exception.getMessage().split(" ");
    return last[last.length - 1].replaceAll("\"", "");
  }

  protected abstract void init_Components();

  public static ArrayList<Dealer> getDealers() {
    return dealers;
  }

  public static void setDealers(ArrayList<Dealer> dealers) {
    Generic.dealers = dealers;
  }

  public static ArrayList<Recipe> getRecipes() {
    return recipes;
  }

  public static void setRecipes(ArrayList<Recipe> recipes) {
    Generic.recipes = recipes;
  }

}

package views;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import classes.Generic;

/**
 * Inicio
 */
public class Home_View extends Generic {
  private JLabel lbl_Welcome, lbl_Background, lbl_Title;
  private JButton btn_Show_Menu, btn_Make_Order, btn_Register_Dealer, btn_Register_Food, btn_Exit;

  public Home_View() {
    style();
    init_Components();
  }

  // Start all components
  @Override
  protected void init_Components() {
    setLayout(null);

    lbl_Welcome = new JLabel("Welcome!!!");
    custom_Config(lbl_Welcome, 36, 81, 11, 312, 30);
    add(lbl_Welcome);

    lbl_Title = new JLabel("Main menu");
    custom_Config(lbl_Title, 18, 136, 57, 206, 20);
    add(lbl_Title);

    btn_Show_Menu = new JButton("Show Menu");
    custom_Config(btn_Show_Menu, 14, 10, 90, 180, 30);
    add(btn_Show_Menu);

    btn_Make_Order = new JButton("Make Order");
    custom_Config(btn_Make_Order, 14, 270, 90, 180, 30);
    add(btn_Make_Order);

    btn_Register_Dealer = new JButton("Register Dealer");
    custom_Config(btn_Register_Dealer, 12, 10, 138, 180, 30);
    add(btn_Register_Dealer);

    btn_Register_Food = new JButton("Register Food");
    custom_Config(btn_Register_Food, 14, 270, 138, 180, 30);
    add(btn_Register_Food);

    btn_Exit = new JButton("Exit");
    btn_Exit.setIcon(new ImageIcon(getClass().getResource("/images/exit.png")));
    custom_Config(btn_Exit, 1, 370, 180, 80, 60);
    add(btn_Exit);

    lbl_Background = new JLabel(new ImageIcon(getClass().getResource("/images/wallpaper.png")));
    custom_Config(lbl_Background, 0, 0, 0, 460, 260);
    add(lbl_Background);
  }

  public JLabel getLbl_Welcome() {
    return lbl_Welcome;
  }

  public void setLbl_Welcome(JLabel lbl_Bienvenidos) {
    this.lbl_Welcome = lbl_Bienvenidos;
  }

  public JLabel getLbl_Background() {
    return lbl_Background;
  }

  public void setLbl_Background(JLabel lbl_Background) {
    this.lbl_Background = lbl_Background;
  }

  public JLabel getLbl_Title() {
    return lbl_Title;
  }

  public void setLbl_Title(JLabel lbl_Titulo) {
    this.lbl_Title = lbl_Titulo;
  }

  public JButton getBtn_Show_Menu() {
    return btn_Show_Menu;
  }

  public void setBtn_Show_Menu(JButton btn_Mostrar_Menu) {
    this.btn_Show_Menu = btn_Mostrar_Menu;
  }

  public JButton getBtn_Make_Order() {
    return btn_Make_Order;
  }

  public void setBtn_Make_Order(JButton btn_Realizar_Pedido) {
    this.btn_Make_Order = btn_Realizar_Pedido;
  }

  public JButton getBtn_Register_Dealer() {
    return btn_Register_Dealer;
  }

  public void setBtn_Register_Dealer(JButton btn_Registrar_Repartidores) {
    this.btn_Register_Dealer = btn_Registrar_Repartidores;
  }

  public JButton getBtn_Register_Food() {
    return btn_Register_Food;
  }

  public void setBtn_Register_Food(JButton btn_Registrar_Platillo) {
    this.btn_Register_Food = btn_Registrar_Platillo;
  }

  public JButton getBtn_Exit() {
    return btn_Exit;
  }

  public void setBtn_Exit(JButton btn_Salir) {
    this.btn_Exit = btn_Salir;
  }
}

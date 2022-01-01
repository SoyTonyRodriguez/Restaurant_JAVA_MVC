package views;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import classes.Generic;

/**
 * Realizar_Pedido
 */
public class Make_Order_View extends Generic {
	private JLabel lbl_Name, lbl_Surnames, lbl_Age, lbl_Phone, lbl_Pay, lbl_Food, lbl_Address;
	private JTextField txt_Name, txt_Surnames, txt_Age, txt_Phone, txt_Address;
	private JComboBox<String> cmb_Pay, cmb_Food;
	private JButton btn_Register, btn_Return;

	public Make_Order_View() {
		style();
		init_Components();
	}

	@Override
	protected void init_Components() {
		lbl_Name = new JLabel("Name:");
		generic_Config(lbl_Name, 10, 16);
		add(lbl_Name);

		txt_Name = new JTextField(8);
		txt_Name.setName("Name");
		generic_Config(txt_Name, 120, 10);
		add(txt_Name);

		lbl_Surnames = new JLabel("Surnames:");
		generic_Config(lbl_Surnames, 10, 48);
		add(lbl_Surnames);

		txt_Surnames = new JTextField(8);
		txt_Surnames.setName("Surnames");
		generic_Config(txt_Surnames, 120, 43);
		add(txt_Surnames);

		lbl_Age = new JLabel("Age:");
		generic_Config(lbl_Age, 10, 79);
		add(lbl_Age);

		txt_Age = new JTextField(8);
		txt_Age.setName("Age");
		generic_Config(txt_Age, 120, 74);
		add(txt_Age);

		lbl_Phone = new JLabel("Number Phone:");
		generic_Config(lbl_Phone, 10, 111);
		add(lbl_Phone);

		txt_Phone = new JTextField(8);
		txt_Phone.setName("Number Phone");
		generic_Config(txt_Phone, 120, 105);
		add(txt_Phone);

		lbl_Pay = new JLabel("Pay:");
		generic_Config(lbl_Pay, 10, 144);
		add(lbl_Pay);

		String[] metodos_Pago = { "Cash", "Credit Card" };
		cmb_Pay = new JComboBox<String>(metodos_Pago);
		cmb_Pay.setPreferredSize(new Dimension(97 + 3, cmb_Pay.getPreferredSize().height));
		generic_Config(cmb_Pay, 120, 138);
		add(cmb_Pay);

		lbl_Food = new JLabel("Food:");
		generic_Config(lbl_Food, 10, 177);
		add(lbl_Food);

		String[] platillos = { "None" };
		cmb_Food = new JComboBox<String>(platillos);
		cmb_Food.setPreferredSize(new Dimension(97 + 3, cmb_Food.getPreferredSize().height));
		generic_Config(cmb_Food, 120, 171);
		add(cmb_Food);

		lbl_Address = new JLabel("Address:");
		generic_Config(lbl_Address, 10, 210);
		add(lbl_Address);

		txt_Address = new JTextField(8);
		txt_Address.setName("Address");
		generic_Config(txt_Address, 120, 204);
		add(txt_Address);

		btn_Register = new JButton("Register");
		generic_Config(btn_Register, 6, 237);
		add(btn_Register);

		btn_Return = new JButton("Return");
		generic_Config(btn_Return, 135, 237);
		add(btn_Return);
	}

	public JTextField getTxt_Name() {
		return txt_Name;
	}

	public void setTxt_Name(JTextField txt_Name) {
		this.txt_Name = txt_Name;
	}

	public JTextField getTxt_Surnames() {
		return txt_Surnames;
	}

	public void setTxt_Surnames(JTextField txt_Surname) {
		this.txt_Surnames = txt_Surname;
	}

	public JTextField getTxt_Age() {
		return txt_Age;
	}

	public void setTxt_Age(JTextField txt_Age) {
		this.txt_Age = txt_Age;
	}

	public JTextField getTxt_Phone() {
		return txt_Phone;
	}

	public void setTxt_Phone(JTextField txt_Phone) {
		this.txt_Phone = txt_Phone;
	}

	public JTextField getTxt_Address() {
		return txt_Address;
	}

	public void setTxt_Address(JTextField txt_Address) {
		this.txt_Address = txt_Address;
	}

	public JComboBox<String> getCmb_Pay() {
		return cmb_Pay;
	}

	public void setCmb_Pay(JComboBox<String> cmb_Pay) {
		this.cmb_Pay = cmb_Pay;
	}

	public JComboBox<String> getCmb_Food() {
		return cmb_Food;
	}

	public void setCmb_Food(JComboBox<String> cmb_Food) {
		this.cmb_Food = cmb_Food;
	}

	public JButton getBtn_Return() {
		return btn_Register;
	}

	public void setBtn_Return(JButton btn_Return) {
		this.btn_Register = btn_Return;
	}

	public JButton getBtn_Register() {
		return btn_Return;
	}

	public void setBtn_Register(JButton btn_Register) {
		this.btn_Return = btn_Register;
	}
}

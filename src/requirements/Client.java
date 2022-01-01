package requirements;

/**
 * Cliente
 */
public class Client extends Person {

  private String pay;
  private String address;

  public Client(String name, String surname, long phone, int age, String pay, String address) {
    super(name, surname, phone, age);
    this.setPay(pay);
    this.setAddress(address);
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPay() {
    return pay;
  }

  public void setPay(String pay) {
    this.pay = pay;
  }

  @Override
  public boolean old_Enough() {
    return (age < 15) ? false : true;
  }

}

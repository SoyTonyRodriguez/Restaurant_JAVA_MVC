package requirements;

/**
 * Repartidor
 */
public class Dealer extends Person {

  private String conveyance;

  public Dealer(String name, String surname, long phone, int age, String conveyance) {
    super(name, surname, phone, age);
    this.setConveyance(conveyance);
  }

  public String getConveyance() {
    return conveyance;
  }

  public void setConveyance(String conveyance) {
    this.conveyance = conveyance;
  }

  @Override
  public boolean old_Enough() {
    return (age <= 17) ? false : true;
  }
}

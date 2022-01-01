package requirements;

/**
 * Persona
 */
public abstract class Person {
  // Atributos
  protected String name;
  protected String surname;
  protected long phone;
  protected int age;

  public Person(String name, String surname, long phone, int age) {
    this.name = name;
    this.surname = surname;
    this.phone = phone;
    this.age = age;
  }

  public abstract boolean old_Enough();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public long getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

}

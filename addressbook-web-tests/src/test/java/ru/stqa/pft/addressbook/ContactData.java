package ru.stqa.pft.addressbook;

public class ContactData {
  private final String name;
  private final String lastname;
  private final String address;
  private final String telephone;
  private final String email;
  private final String year;

  public ContactData(String name, String lastname, String address, String telephone, String email, String year) {
    this.name = name;
    this.lastname = lastname;
    this.address = address;
    this.telephone = telephone;
    this.email = email;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getEmail() {
    return email;
  }

  public String getYear() {
    return year;
  }
}

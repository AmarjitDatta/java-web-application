package contents;

import javax.servlet.http.HttpServletRequest;

public class Person {
  private String email;
  private String lastName;
  private String firstName;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private int zip;
  private String phone;
  private String password;

  public Person(HttpServletRequest request) {
    this.email = request.getParameter("email");
    this.lastName = request.getParameter("lastName");
    this.firstName = request.getParameter("firstName");
    this.address1 = request.getParameter("address1");
    this.address2 = request.getParameter("address2");
    this.city = request.getParameter("city");
    this.state = request.getParameter("state");
    this.zip = Integer.parseInt(request.getParameter("zip"));
    this.phone = request.getParameter("phone");
    this.password = request.getParameter("password");
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getZip() {
    return zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

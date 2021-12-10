import java.time.LocalDate;
import java.time.Period;

class Client {

  private String name;
  private LocalDate birthDate;

  public Client(String name, LocalDate birthDate) throws Exception {
    LocalDate now = LocalDate.now();
    int age = Period.between(birthDate, now).getYears();
    if (age < 18) {
      throw new Exception("Exception: "+ name + " less than 18 years old => " + age);
    } else 
    this.birthDate = birthDate;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Client [birthDate=" + birthDate + ", name=" + name + "]";
  }
}

import java.time.LocalDate;
import java.time.Period;

public class ValidateFulName {

  public static int getLengthFullName(String fullName) throws Exception {
    if (fullName.isEmpty()) {
      throw new Exception("Exception: fullName  is null!");
    }
    return fullName.length();
  }

  public static int getAge(LocalDate birthDate) throws Exception {
    LocalDate now = LocalDate.now();
    int age = Period.between(birthDate, now).getYears();
    try {
      if (age < 18) {
        throw new Exception("Exception:  Age less than 18=> " + age);
      }
    } catch (Exception e) {
      System.err.println("Age less than 18=> " + age);
    }
    return age;
  }
}

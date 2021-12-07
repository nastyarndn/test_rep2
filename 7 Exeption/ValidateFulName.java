public class ValidateFulName {

  public static int getLengthFullName(String fullName) throws Exception {
    if (fullName.isEmpty()) {
      throw new Exception("Exception: fullName  is null!");
    }
    return fullName.length();
  }
}

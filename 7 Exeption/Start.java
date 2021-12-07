import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Start {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(System.in)
    );
    System.out.println("Please enter you full name:");
    String fullName = null;
    fullName = reader.readLine();
    int fullName2 = ValidateFulName.getLengthFullName(fullName);
    System.out.println("Length you full name:" + fullName2);


  //ArrayIndexOutOfBoundsException
    try {
        int a[] = new int[5];
        System.out.println("Access element three :" + a[5]);
     } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception thrown  :" + e);
     }
     System.out.println("Out of the block");
  
        

    // try-with-resource
    WorkFile.writeToFile();
  }
}

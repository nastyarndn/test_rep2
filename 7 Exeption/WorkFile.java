import java.io.BufferedReader;
import java.io.FileReader;

public class WorkFile {

  public static void writeToFile() throws Exception {
    try (
      FileReader f = new FileReader("a.txt");
      BufferedReader br = new BufferedReader(f)
    ) {
      System.out.println("Write to file");
    } catch (Exception e) {
      System.out.println("File not found");
    } finally {
      System.out.println("working on");
    }
    System.out.println("finish");
  }
}
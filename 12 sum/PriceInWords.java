import java.util.Scanner;

public class PriceInWords {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите сумму: ");
    long price = scanner.nextLong();
    String res=  new WorkData().getResult(price);
    System.out.printf("%s  %n", res);

  }
}

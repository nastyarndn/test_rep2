import java.util.*;
import java.util.Map.Entry;

public class Bank {

  public static void main(String[] args) {
    Account account1 = new Account(5, "A111");
    Account account2 = new Account(10, "A222");
    Account account3 = new Account(100, "B111");
    Account account4 = new Account(200, "C111");
    Account account5 = new Account(500, "C1115");

    List<Account> accForClient1 = new ArrayList<Account>();
    accForClient1.add(account1);
    accForClient1.add(account2);
    accForClient1.add(account3);

    List<Account> accForClient2 = new ArrayList<Account>();
    accForClient2.add(account4);

    List<Account> accForClient3 = new ArrayList<Account>();
    accForClient3.add(account5);

    Client client1 = new Client("Nastya", 29);
    Client client2 = new Client("Irina", 30);
    Client client3 = new Client("Valeriya", 20);

    Map<Client, List<Account>> bank = new HashMap<>();
    bank.put(client1, accForClient1);
    bank.put(client2, accForClient2);
    bank.put(client3, accForClient3);

    System.out.println("Search account for client: " + bank.get(client1)); // Находим значение по ключу client1

    Set<Entry<Client, List<Account>>> entrySet = bank.entrySet();
    for (Map.Entry<Client, List<Account>> pair : entrySet) {
      for (Account pair2 : pair.getValue()) {
        if (account4.equals(pair2)) {
          System.out.println("Search client for account: " + pair.getKey()); // Находим ключ по счету account1
        }
      }
    }
  }
}

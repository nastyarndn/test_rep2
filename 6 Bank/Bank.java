import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

public class Bank {

  public static void main(String[] args) throws Exception {
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

    LocalDate birthDateForClient1 = LocalDate.of(1998, 11, 28);
    LocalDate birthDateForClient2 = LocalDate.of(1972, 9, 28);
    LocalDate birthDateForClient3 = LocalDate.of(2002, 4, 22);

    Client client1 = new Client("Nastya", birthDateForClient1);
    Client client2 = new Client("Irina", birthDateForClient2);
    Client client3 = new Client("Valeriya", birthDateForClient3);

    Map<Client, List<Account>> bank = new HashMap<>();
    bank.put(client1, accForClient1);
    bank.put(client2, accForClient2);
    bank.put(client3, accForClient3);

    System.out.println( "Search account for client: " + getAccOnClient(client1, bank)); // Находим значение по ключу client1
    System.out.println( "Search client for account: " + getClientOnAcc(account3, bank));
   
  }

  private static List<Account> getAccOnClient(Client client, Map<Client, List<Account>> bank) {
    List<Account> acc = bank.get(client);
    return acc;
  }

  private static Client getClientOnAcc(Account account, Map<Client, List<Account>> bank) {
   
    Set<Entry<Client, List<Account>>> entrySet = bank.entrySet();
    for (Map.Entry<Client, List<Account>> pair : entrySet) {
      for (Account pair2 : pair.getValue()) {
        if (account.equals(pair2)) {
          return pair.getKey(); 
        }
      }
    }
    return null;

  }


}

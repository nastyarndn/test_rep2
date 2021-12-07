class Account {

  private int balance;
  private String accontNum;

  public Account(int balance, String accontNum) {
    this.balance = balance;
    this.accontNum = accontNum;
  }

  @Override
  public String toString() {
    return "Account [accontNum=" + accontNum + ", balance=" + balance + "]";
  }
}

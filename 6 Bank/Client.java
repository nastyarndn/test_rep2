class Client {

  private String name;
  private int age;

  public Client(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Client [age=" + age + ", name=" + name + "]";
  }
}

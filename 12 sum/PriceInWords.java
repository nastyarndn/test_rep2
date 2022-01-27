import java.util.Scanner;

public class PriceInWords {

  public static void main(String[] args) {

    String zero = "";

    Form form = new Form();
    String[][] arForForm = {
       
      { "рубль", "рубля", "рублей", "0" },
      { "тысяча", "тысячи", "тысяч", "1" },
      { "миллион", "миллиона", "миллионов", "0" },
      { "миллиард", "миллиарда", "миллиардов", "0" },
      { "триллион", "триллиона", "триллионов", "0" },
    };
    form.setForm(arForForm);


    Sort sort  = new Sort();
    String[][] txtOne = {
        {"","один","два","три","четыре","пять","шесть","семь","восемь","девять"},
        {"","одна","две","три","четыре","пять","шесть","семь","восемь","девять"}};
    String[] txtTen = {"","десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят", "семьдесят","восемьдесят","девяносто"};
    String[] txtTen1 = {"","десять","одиннадцать","двенадцать","тринадцать","четырнадцать", "пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать","двадцать"};
    String[] txtHundred= {"","сто","двести","триста","четыреста","пятьсот","шестьсот","семьсот", "восемьсот","девятьсот"};
    sort.setTxtOne(txtOne);
    sort.setTxtTen(txtTen);
    sort.setTxtTen1(txtTen1);
    sort.setTxtHundred(txtHundred);


    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите сумму: ");
    long price = scanner.nextLong();
    
    if (price == 0) {
        zero = "ноль " + Currency.getWord(price, form.getForm(0, 0), form.getForm(0, 1), form.getForm(0, 2));
        System.out.println("Результат: "+ zero);
    } 

    System.out.println("Результат: "+ Analyzer.getResult(price, form, sort));

  }
}

import java.util.ArrayList;
import java.util.Collections;

class Currency {

  public static String getWord (long price, String form1, String form2, String form3) {
    price = Math.abs(price) % 100;
    long price1 = price % 10;
    if (price > 10 && price < 20) return form3;
    if (price1 > 1 && price1 < 5) return form2;
    if (price1 == 1) return form1;
    return form3;
  }

  public static ArrayList getSegment (long price) { 
    ArrayList segments = new ArrayList();
    long tmpPrice=price;

    while (tmpPrice > 999) {
      long segment = tmpPrice/1000;
      segments.add(tmpPrice-(segment*1000));
      tmpPrice = segment;
      }
    segments.add(tmpPrice);
    Collections.reverse(segments);
    return segments;
  }

}

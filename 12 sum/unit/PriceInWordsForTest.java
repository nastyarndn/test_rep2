
public class PriceInWordsForTest {

  public void PriceInWordsTestRandom(Form form, Sort sort) {
    String scenario = "N1. Тест для рандомного числа:";
      long n = (long) (Math.random() * 100);
      System.out.printf("\"%s\" Successfully %n", scenario);
      System.out.println("Результат для " + n + " : " + Analyzer.getResult(n, form, sort));
    }

    public void PriceInWordsTestCompare(long testPrice, Form form, Sort sort) {
      String scenario = "N2. Тест для сравнения результатов анализатора числа: " + testPrice;
      try {
      String[][] actualData = {
        {"0","ноль рублей"},
        {"2","рубля "},
        {"27","двадцать семь рублей "},
        {"1000002","один миллион два рубля "},
      };
      String  expected = Analyzer.getResult(testPrice, form, sort);

        for (int i=0; i<actualData.length;i++){

          if (Long.valueOf(actualData[i][0])==testPrice){
              Assertions.assertEquals(expected.replaceAll("\\s+",""), actualData[i][1].replaceAll("\\s+",""));
              System.out.printf("\"%s\" Successfully %n", scenario);
            }
        }
      } catch (Throwable e) {
        System.err.printf("\"%s\" Not successful  \"%s\" %n",scenario,e.getMessage());
      }
    }
  }

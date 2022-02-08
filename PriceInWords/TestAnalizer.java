public class TestAnalizer {


    public void testAnalizerForZero() {
        String scenario = "N1. Тест числом 0";
        WorkData workData =new WorkData();
        try {   
          String actual = "ноль рублей";
          String  expected = workData.getResult(0);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForNegative() {
        String scenario = "N2. Тест с отрицательным числом";
        WorkData workData =new WorkData();
        try { 
          String actual = "отрицательное число";
          String  expected = workData.getResult(-5);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForSingleDigits() {
        String scenario = "N3. Тест с однозначным числом (7) ";
        WorkData workData =new WorkData();
        try { 
          String actual = "семь рублей ";
          String  expected = workData.getResult(7);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForTwoDigits() {
        String scenario = "N4. Тест с двухзначным числом (28) ";
        WorkData workData =new WorkData();
        try { 
          String actual = "двадцать восемь рублей ";
          String  expected = workData.getResult(28);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForThreeDigits() {
        String scenario = "N5. Тест с трехзначным числом (561) ";
        WorkData workData =new WorkData();
        try { 
          String actual = "пятьсот шестьдесят один рубль ";
          String  expected = workData.getResult(561);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForFourDigits() {
        String scenario = "N6. Тест с четырехзначным числом (1093) ";
        WorkData workData =new WorkData();
        try { 
          String actual = "одна тысяча девяносто три рубля ";
          String  expected = workData.getResult(1093);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForSixDigits() {
        String scenario = "N7. Тест с шестизначным числом (542 193) ";
        WorkData workData =new WorkData();
        try { 
          String actual = "пятьсот сорок две тысячи сто девяносто три рубля ";
          String  expected = workData.getResult(542193);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForEightDigits() {
        String scenario = "N8. Тест с восьмизначным числом (71 033 128) ";
        WorkData workData =new WorkData();
        try { 
          String actual = "семьдесят один миллион тридцать три тысячи сто двадцать восемь рублей ";
          String  expected = workData.getResult(71033128);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

  }
public class TestAnalizer {


    public void testAnalizerForZeroN1() {
        String scenario = "N1. Тест числом 0";
        AnalizerTest1 analizerTest = new AnalizerTest1();
        WorkData workData =new WorkData();
        try {   
          String actual = analizerTest.getWords();
          String  expected = workData.getResult(0);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForNegativeN2() {
        String scenario = "N2. Тест с отрицательным числом";
        AnalizerTest2 analizerTest = new AnalizerTest2();
        WorkData workData =new WorkData();
        try { 
          String actual = analizerTest.getWords();
          String  expected = workData.getResult(-5);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForSingleDigitsN3() {
        String scenario = "N3. Тест с однозначным числом (7) ";
        AnalizerTest3 analizerTest = new AnalizerTest3();
        WorkData workData =new WorkData();
        try { 
          String actual = analizerTest.getWords();
          String  expected = workData.getResult(7);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForTwoDigitsN4() {
        String scenario = "N4. Тест с двухзначным числом (28) ";
        AnalizerTest4 analizerTest = new AnalizerTest4();
        WorkData workData =new WorkData();
        try { 
          String actual = analizerTest.getWords();
          String  expected = workData.getResult(28);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForThreeDigitsN5() {
        String scenario = "N5. Тест с трехзначным числом (561) ";
        AnalizerTest5 analizerTest = new AnalizerTest5();
        WorkData workData =new WorkData();
        try { 
          String actual = analizerTest.getWords();
          String  expected = workData.getResult(561);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForFourDigitsN6() {
        String scenario = "N6. Тест с четырехзначным числом (1093) ";
        AnalizerTest6 analizerTest = new AnalizerTest6();
        WorkData workData =new WorkData();
        try { 
          String actual = analizerTest.getWords();
          String  expected = workData.getResult(1093);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForSixDigitsN7() {
        String scenario = "N7. Тест с шестизначным числом (542 193) ";
        AnalizerTest7 analizerTest = new AnalizerTest7();
        WorkData workData =new WorkData();
        try { 
          String actual = analizerTest.getWords();
          String  expected = workData.getResult(542193);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

      public void testAnalizerForEightDigitsN8() {
        String scenario = "N8. Тест с восьмизначным числом (71 033 128) ";
        AnalizerTest8 analizerTest = new AnalizerTest8();
        WorkData workData =new WorkData();
        try { 
          String actual = analizerTest.getWords();
          String  expected = workData.getResult(71033128);
          Assertions.assertEquals(actual,expected);
          System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
          System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
        }
      }

  }
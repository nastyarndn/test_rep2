public class DiceTest {

  public void testDiceResutForEqualsN1() {
    String scenario = "N1. Тест одинаковым результатом";
    Dice dice = new DiceImplTest1();
    try {
      int expected = 5;
      int actual = dice.roll();
      Assertions.assertDifference(expected, actual);
      System.out.printf("\"%s\" passed %n", scenario);
    } catch (Throwable e) {
      System.err.printf("\"%s\" fails with message \"%s\" %n", scenario,e.getMessage());
    }
  }

  public void testDiceResutForZeroN2() {
    String scenario = "N2. Тест c возвратом 0";
    Dice dice = new DiceImplTest2();
    try {
      int actual = dice.roll();
      Assertions.assertZero(actual);
      System.out.printf("\"%s\" passed %n", scenario);
    } catch (Throwable e) {
      System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
    }
  }

  public void testDiceResutForDiffN3() {
    String scenario = "N3. Разные числа";
    Dice dice = new DiceImplTest3();
    try {
      int expected = dice.roll();
      int actual = dice.roll();
      Assertions.assertDifference(expected, actual);
      System.out.printf("\"%s\" passed %n", scenario);
    } catch (Throwable e) {
      System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
    }
  }

  public void testDiceResutForCompareWinN4() {
    String scenario = "N4. Сравнение победителей";
    try {
    GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
    GameTest gameTest = new GameTest(winnerPrinter);
    gameTest.playGame(new Player("Вася"), new Player("Игорь"));

    GameTest gameTest1 = new GameTest(winnerPrinter);
    gameTest1.playGameTest(new Player("Вася"), new Player("Игорь"));

    GameTest expected = gameTest1;
    GameTest actual = gameTest;

    Assertions.assertEquals(expected,actual);

    System.out.printf("\"%s\" passed %n", scenario);
  } catch (Throwable e) {
    System.err.printf("\"%s\" fails with message \"%s\" %n",scenario,e.getMessage());
  }
}
    

   
  }





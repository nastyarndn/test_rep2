public class PriceInWordsAllTest {

    public static void main(String[] args) {
  
        TestAnalizer testAnalizer = new TestAnalizer();
        testAnalizer.testAnalizerForZero();
        testAnalizer.testAnalizerForNegative();
        testAnalizer.testAnalizerForSingleDigits();
        testAnalizer.testAnalizerForTwoDigits();
        testAnalizer.testAnalizerForThreeDigits();
        testAnalizer.testAnalizerForFourDigits();
        testAnalizer.testAnalizerForSixDigits();
        testAnalizer.testAnalizerForEightDigits();
  
    }
  }
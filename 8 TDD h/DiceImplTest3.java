import java.util.Random;

public class DiceImplTest3 implements Dice {
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html  
        return new Random().nextInt();

        
    }
}
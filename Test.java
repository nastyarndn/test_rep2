import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int res = 0;

    Question question1 = new Question();
    Question question2 = new Question();
    Question question3 = new Question();

    question1.setQuestionForTest("How many primitive data types are in java?");
    question2.setQuestionForTest("What is the range of an int?");
    question3.setQuestionForTest("Variable / constant names writing style");

    Question[] question = new Question[3];
    question[0] = question1;
    question[1] = question2;
    question[2] = question3;

    Answer answer1ForQuestion1 = new Answer();
    Answer answer2ForQuestion1 = new Answer();
    Answer answer3ForQuestion1 = new Answer();

    answer1ForQuestion1.setAnswerForTest("A)8");
    answer2ForQuestion1.setAnswerForTest("B)9");
    answer3ForQuestion1.setAnswerForTest("C)6");

    Answer[] answer1 = new Answer[3];
    answer1[0] = answer1ForQuestion1;
    answer1[1] = answer2ForQuestion1;
    answer1[2] = answer3ForQuestion1;

    question1.setAnswersForTest(answer1);

    Answer answer1ForQuestion2 = new Answer();
    Answer answer2ForQuestion2 = new Answer();
    Answer answer3ForQuestion2 = new Answer();

    answer1ForQuestion2.setAnswerForTest("A)32,768 - 32,767");
    answer2ForQuestion2.setAnswerForTest("B)true and false");
    answer3ForQuestion2.setAnswerForTest("C)-2,147,483,647 - 2,147,483,647");

    Answer[] answer2 = new Answer[3];
    answer2[0] = answer1ForQuestion2;
    answer2[1] = answer2ForQuestion2;
    answer2[2] = answer3ForQuestion2;

    question2.setAnswersForTest(answer2);

    Answer answer1ForQuestion3 = new Answer();
    Answer answer2ForQuestion3 = new Answer();
    Answer answer3ForQuestion3 = new Answer();

    answer1ForQuestion3.setAnswerForTest("A)camelCase");
    answer2ForQuestion3.setAnswerForTest("B)UPPER_SNAKE_CASE");
    answer3ForQuestion3.setAnswerForTest("C)lowerCamelCase");

    Answer[] answer3 = new Answer[3];
    answer3[0] = answer1ForQuestion3;
    answer3[1] = answer2ForQuestion3;
    answer3[2] = answer3ForQuestion3;

    question3.setAnswersForTest(answer3);

    Answer rightAnswerQuestion1 = new Answer();
    Answer rightAnswerQuestion2 = new Answer();
    Answer rightAnswerQuestion3 = new Answer();

    rightAnswerQuestion1.setAnswerForTest("A");
    rightAnswerQuestion2.setAnswerForTest("C");
    rightAnswerQuestion3.setAnswerForTest("B");

    question1.setRightAnswerForTest(rightAnswerQuestion1);
    question2.setRightAnswerForTest(rightAnswerQuestion2);
    question3.setRightAnswerForTest(rightAnswerQuestion3);

    for (int i = 0; i < question.length; i++) {
      System.out.println(question[i].getQuestionForTest());

      for (int j = 0; j < 3; j++) {
        System.out.println(question[i].getAnswersForTest(j));
      }

      String myAnswer = sc.next();
      if (myAnswer.equals(question[i].getRightAnswerForTest())) res++;
    }
    System.out.println("Right answers: " + res);
  }
}

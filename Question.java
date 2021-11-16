import java.util.Arrays;

class Question {

  private String questionForTest;
  private Answer rightAnswerForTest;
  private Answer[] answersForTest;

  public String getQuestionForTest() {
    return questionForTest;
  }

  public void setQuestionForTest(String questionForTest) {
    this.questionForTest = questionForTest;
  }

  public String getRightAnswerForTest() {
    return rightAnswerForTest.getAnswerForTest();
  }

  public void setRightAnswerForTest(Answer rightAnswerForTest) {
    this.rightAnswerForTest = rightAnswerForTest;
  }

  public String getAnswersForTest(int i) {
    return answersForTest[i].getAnswerForTest();
  }

  public void setAnswersForTest(Answer[] answersForTest) {
    this.answersForTest = answersForTest;
  }
}

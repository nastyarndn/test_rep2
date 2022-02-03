public class Sort {

  private String[][] txtOne;
  private String[] txtTen;
  private String[] txtTen1;
  private String[] txtHundred;

  public void setTxtOne(String[][] txtOne) {
    this.txtOne = txtOne;
  }

  public void setTxtTen(String[] txtTen) {
    this.txtTen = txtTen;
  }

  public void setTxtTen1(String[] txtTen1) {
    this.txtTen1 = txtTen1;
  }

  public void setTxtHundred(String[] txtHundred) {
    this.txtHundred = txtHundred;
  }

  public String getTxtTen(int i) {
    return txtTen[i];
  }

  public String getTxtTen1(int i) {
    return txtTen1[i];
  }

  public String getTxtHundred(int i) {
    return txtHundred[i];
  }

  public String getTxtOne(int i, int j) {
    return txtOne[i][j];
  }
}

class Form {

  private String[][] form;

  public void setForm(String[][] form) {
    this.form = form;
  }

  public String getForm(int i, int j) {
    return form[i][j];
  }
}

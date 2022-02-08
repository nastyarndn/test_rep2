public class WorkData  {

    public String getResult (long price) {
    Form form = new Form();
    form.setForm(Dictionary.DATA_FOR_FORM);

    Sort sort  = new Sort();
    sort.setTxtOne(Dictionary.TXT_ONE);
    sort.setTxtTen(Dictionary.TXT_TEN);
    sort.setTxtTen1(Dictionary.TXT_TEN_1);
    sort.setTxtHundred(Dictionary.TXT_HUNDRED);

   return new Analyzer().getResult(price, form, sort);
   
  }        
}
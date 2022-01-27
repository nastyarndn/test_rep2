class Analyzer {

    
    public static String getResult (long price, Form form, Sort sort) { 
        String res = "";
        int level = Currency.getSegment(price).size()-1;
        
        for (int i= 0; i<Currency.getSegment(price).size(); i++ ) {

            int setForm = (int)Integer.valueOf(form.getForm(level, 3));
            int currentSegm = (int)Integer.valueOf(Currency.getSegment(price).get(i).toString() );

            if (currentSegm== 0 && level>0) {
                level--;
                continue;
            }

            String currentSegmToStr= String.valueOf(currentSegm); 
            if (currentSegmToStr.length()==1) currentSegmToStr = "00"+ currentSegmToStr;
            if (currentSegmToStr.length()==2) currentSegmToStr = "0"+ currentSegmToStr; 

            int part1 = (int)Integer.valueOf(currentSegmToStr.substring(0,1)); 
            int part2 = (int)Integer.valueOf(currentSegmToStr.substring(1,2)); 
            int part3 = (int)Integer.valueOf(currentSegmToStr.substring(2,3)); 
            int part_2_3= (int)Integer.valueOf(currentSegmToStr.substring(1,3)); 
          
            if (currentSegm > 99) res += sort.getTxtHundred(part1) + " "; 

            if (part_2_3 > 20) {
                res += sort.getTxtTen(part2) + " ";
                res += sort.getTxtOne(setForm, part3) + " ";
            }
            else { 
                if (part_2_3 > 9) res += sort.getTxtTen1(part_2_3 - 9) + " "; 
                else res += sort.getTxtOne(setForm, part3) + " "; 
            }

            res += Currency.getWord(currentSegm, form.getForm(level, 0),form.getForm(level,1),form.getForm(level,2)) + " ";
            level--;
        }
        return res;
      }
  }
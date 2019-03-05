package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_1 {

    String code = "";
    String batchNum = "";
    String year = "";
    String month = "";
    String day = "00";
    
    ArrayList<Matcher> matches = new ArrayList();
    
    Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]"); 
    Pattern p10eol = Pattern.compile("^10(.){1,20}$");     
    Pattern p11 = Pattern.compile("^11[0-9]{6}");          
    Pattern p12 = Pattern.compile("^12[0-9]{6}");            
    Pattern p13 = Pattern.compile("^13[0-9]{6}");            
    Pattern p15 = Pattern.compile("^15[0-9]{6}");            
    Pattern p16 = Pattern.compile("^16[0-9]{6}");            
    Pattern p17 = Pattern.compile("^17[0-9]{6}");
    
    String Parse_Digit_1(String code) {
        
        this.code = code;
        
        if (code.charAt(1) == 0) {
            batchNum = code.substring(2);
            
        } else {
            year = code.substring(2, 3);
            month = code.substring(4, 5);
            day = code.substring(6, 7);
        }
        
        return code;
    }
}

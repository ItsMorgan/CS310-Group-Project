package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_0 extends Pattern_Parser {

    public Parse_Digit_0() {
        
        super();
        
        String ai = "";
        String extension = "";
        String prefix = "";
        String serial = "";
        String check = "";
        String reference = "";
        String SSCC = "";
        String GTIN = "";
               
        Pattern p00 = Pattern.compile("^00[0-9]{18}");         
        Pattern p01 = Pattern.compile("^01[0-9]{14}");          
        Pattern p02 = Pattern.compile("^02[0-9]{14}");
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        patterns.add(p00);
        patterns.add(p01);
        patterns.add(p02);
        
        String aiAndData = parsePattern(patterns).group();
        
        ai = aiAndData.substring(0, 2);
        
        if (ai.substring(1).equals("1")) {
            extension = aiAndData.substring(2, 3);
            prefix = aiAndData.substring(3, 9);
            serial = aiAndData.substring(9,18);
            check = aiAndData.substring(18,19);
            SSCC = extension + prefix + serial + check;
        } 
        else if (ai.equals("1")) {
            prefix = aiAndData.substring(2,9);
            reference = aiAndData.substring(9,14);
            check = aiAndData.substring(14,15);   
            GTIN = prefix + reference + check;
        } 
        
        else if (ai.equals("2")) {
            prefix = aiAndData.substring(2,9);
            reference = aiAndData.substring(9,14);
            check = aiAndData.substring(14,15);          
            GTIN = prefix + reference + check;
        }
    }
}

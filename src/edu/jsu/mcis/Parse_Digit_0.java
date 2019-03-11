package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_0 extends Pattern_Parser {

    public Parse_Digit_0() {
        
        super();
        
        String ai = "";
        String extension = "";
        String prefix = "";
               
        Pattern p00 = Pattern.compile("^00[0-9]{18}");         
        Pattern p01 = Pattern.compile("^01[0-9]{14}");          
        Pattern p02 = Pattern.compile("^02[0-9]{14}");
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        patterns.add(p00);
        patterns.add(p01);
        patterns.add(p02);
        
        String aiAndData = super.parsePattern(patterns).group();
        
        ai = aiAndData.substring(0, 2);
        
        if (ai.substring(1).equals("0")) {
            extension = aiAndData.substring(2, 3);
            prefix = aiAndData.substring(3, 9);
            
        } else if (ai.equals("1")) {
            
        } else {
            
        }
    }
}

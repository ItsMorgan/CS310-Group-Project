package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_1 extends Pattern_Parser {
    
    ArrayList<Matcher> matches = new ArrayList();
    
    Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]"); 
    Pattern p10eol = Pattern.compile("^10(.){1,20}$");     
    Pattern p11 = Pattern.compile("^11[0-9]{6}");          
    Pattern p12 = Pattern.compile("^12[0-9]{6}");            
    Pattern p13 = Pattern.compile("^13[0-9]{6}");            
    Pattern p15 = Pattern.compile("^15[0-9]{6}");            
    Pattern p16 = Pattern.compile("^16[0-9]{6}");            
    Pattern p17 = Pattern.compile("^17[0-9]{6}");        
}

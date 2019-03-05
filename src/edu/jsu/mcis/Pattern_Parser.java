package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Pattern_Parser {
    
    String code = "";
    Parse_Digit_0 parse0;
    Parse_Digit_1 parse1;
    Parse_Digit_2 parse2;
    Parse_Digit_3 parse3;
    Parse_Digit_4 parse4;
    Parse_Digit_7 parse7;
    Parse_Digit_8 parse8;
    Parse_Digit_9 parse9;
    ArrayList<LinkedHashMap> fields;
    
    public ArrayList<LinkedHashMap> parse(String code) {
                        
        while ( !code.isEmpty() ) {
            
            if (code.charAt(0) == 0) {
                Parse_Digit_1 parse1 = new Parse_Digit_1();
            }
        }
        
        return fields;
    }
}

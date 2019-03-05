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
                        
        this.code = code;
        while ( !this.code.isEmpty() ) {
            int firstDigitAi= code.charAt(0);
            
            switch (firstDigitAi) {
                case 0:
                    parse0 = new Parse_Digit_0();
                    break;
                case 1:
                    parse1 = new Parse_Digit_1();
                    break;
                case 2:
                    parse2 = new Parse_Digit_2();
                    break;
                case 3:
                    parse3 = new Parse_Digit_3();
                    break;
                case 4:
                    parse4 = new Parse_Digit_4();
                    break;
                case 7:
                    parse7 = new Parse_Digit_7();
                    break;
                case 8:
                    parse8 = new Parse_Digit_8();
                    break;
                case 9:
                    parse9 = new Parse_Digit_9();
                break;
            }

        }
        
        return fields;
    }
}

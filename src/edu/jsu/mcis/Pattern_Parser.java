package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;
import org.json.simple.JSONArray;

public class Pattern_Parser {
 
    static String code;
    Parse_Digit_0 parse0;
    Parse_Digit_1 parse1;
    Parse_Digit_2 parse2;
    Parse_Digit_3 parse3;
    Parse_Digit_4 parse4;
    Parse_Digit_7 parse7;
    Parse_Digit_8 parse8;
    Parse_Digit_9 parse9;
    static JSONArray fields = new JSONArray();
    ArrayList<Matcher> matches;
    LinkedHashMap<String, Object> data;
    ArrayList<Pattern> patterns;

    public JSONArray parse(String code) {
        fields = new JSONArray();
        this.code = code;
        while ( !this.code.isEmpty() ) {
            int firstDigitAi= Integer.parseInt(this.code.substring(0, 1));
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
    
    public Matcher parsePattern(ArrayList<Pattern> patterns) {

        for (Pattern p : patterns) {

            Matcher m = p.matcher(code);
            
            if (m.find()) {
                this.code = this.code.substring(m.end()).trim();
                return m;
            }
        }
        
        return null;
    }
}

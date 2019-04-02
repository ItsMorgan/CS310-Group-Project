package edu.jsu.mcis;

import java.math.BigDecimal;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;
import org.json.simple.JSONArray;

public class Pattern_Parser {
 
    static String code;
    static ArrayList<String> codes = new ArrayList<>();
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
        Pattern_Parser.code = code;
        while ( !Pattern_Parser.code.isEmpty() ) {
            int firstDigitAi= Integer.parseInt(Pattern_Parser.code.substring(0, 1));
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
        
        codes.forEach((i) -> {
            System.out.println(i);
        });
        
        return fields;
    }
    
    public Matcher parsePattern(ArrayList<Pattern> patterns) {

        for (Pattern p : patterns) {

            Matcher m = p.matcher(code);
            if (m.find()) {
                Pattern_Parser.code = Pattern_Parser.code.substring(m.end()).trim();
                codes.add(m.group().replace("%", ""));
                return m;
            }
        }
        
        return null;
    }
    
    public BigDecimal getDecimalDouble(String ai, String data) {
        int index = data.length() - Integer.parseInt(ai.substring(3, 4));
        if (index != data.length()) {
            String stringOne = data.substring(0, index);
            String stringTwo = data.substring(index);
            return new BigDecimal(stringOne + "." + stringTwo);
        } else {
            return new BigDecimal(data);
        }
    }
}

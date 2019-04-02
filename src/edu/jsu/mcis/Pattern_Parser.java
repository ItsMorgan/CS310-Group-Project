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

    public JSONArray parse(String code) throws Exception {
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
        
        if (!isValid()) {
            System.out.println("Invalid");
            //throw new Exception("Invalid Code!");
        }
        
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

    public boolean isValid() {
        int counter01 = 0;
        boolean valid010 = false;
        boolean exists010 = false;
        boolean valid019_1 = false;
        boolean valid019_2 = false;
        boolean exists019 = false;
        boolean valid02_1 = false;
        boolean valid02_2 = false;
        boolean exists02 = false;
        boolean valid029 = false;
        boolean exists029 = false;
        boolean valid10 = false;
        boolean exists10 = false;
        boolean valid11 = false;
        boolean exists11 = false;
        for (int i = 0; i < codes.size(); i++) {            
            String code1 = codes.get(i);            
            for (int j = 0; j < codes.size(); j++) {    
                String code2 = codes.get(j);                
                if (code1.startsWith("01") && code2.startsWith("01")) {
                    counter01++;
                }                
                if (code1.startsWith("01") && (code2.startsWith("02") || code2.startsWith("37") || code2.startsWith("255"))) {
                    return false;
                }
                if (code1.startsWith("420") && code2.startsWith("421")){
                    return false;
                }
                if ((code1.startsWith("422") || code1.startsWith("423") || code1.startsWith("424") || code1.startsWith("425")) && code2.startsWith("426")){
                    return false;
                }
                if (code1.startsWith("390") && (code2.startsWith("391") || code2.startsWith("394") || code2.startsWith("8111"))){
                    return false;
                }
                if (code1.startsWith("392") && code2.startsWith("393")){
                    return false;
                }
                if (code1.startsWith("394") && code2.startsWith("8111")){
                    return false;
                }
                if (code1.startsWith("8006") && (code2.startsWith("01") || code2.startsWith("37"))){
                    return false;
                }
                if (code1.startsWith("8018") && code2.startsWith("8017")){
                    return false;
                }
                if (code1.startsWith("8026") && (code2.startsWith("02") || code2.startsWith("8006"))){
                    return false;
                }
                
                /* Separator for exclusions (above) and associations (below) */
                
                if (code1.startsWith("010")) {
                    exists010 = true;
                    if (code2.startsWith("31") || code2.startsWith("32") || code2.startsWith("35") || code2.startsWith("36") || code2.startsWith("30")) {
                        valid010 = true;
                    }
                }
                
                if (code1.startsWith("019") || code1.startsWith("029")) {
                    if (code1.startsWith("019")) {
                        exists019 = true;
                        if (code2.startsWith("242")) {
                            valid019_1 = true;
                        }
                    } else {
                        exists029 = true;
                    }
                    if (code2.startsWith("31") || code2.startsWith("32") || code2.startsWith("35") || code2.startsWith("36") || code2.startsWith("30") || code2.startsWith("8001")) {
                        valid019_2 = true;
                        valid029 = true;
                    }
                }
                if (code1.startsWith("02")) {
                    exists02 = true;
                    if (code2.startsWith("00")) {
                        valid02_1 = true;
                    } else if (code2.startsWith("37")) {
                        valid02_2 = true;
                    }
                }
                
                if (code1.startsWith("10")) {
                    exists10 = true;
                    if (code2.startsWith("01") ^ code2.startsWith("02") ^ code2.startsWith("8006") ^ code2.startsWith("8026")) {
                        valid10 = true;
                    }
                    
                }
                
                if (code1.startsWith("11") || code1.startsWith("13") || code1.startsWith("15") || code1.startsWith("16") || code1.startsWith("17")) {
                    exists11 = true;
                    if (code2.startsWith("01") ^ code2.startsWith("02") ^ code2.startsWith("8006") ^ code2.startsWith("8026")) {
                        valid11 = true;
                    }
                }
            } // End of first for loop
            
            if (counter01 >= 3) {
                return false;
            }
            
            /* Separator for exclusions (above) and associations (below) */
            
            if (exists010 && !valid010) {
                return false;
            }
            
            if (exists019 && !(valid019_1 && valid019_2)) {
                return false;
            }
            if (exists029 && !valid029) {
                return false;
            }
            
            if (exists02 && !(valid02_1 && valid02_2)) {
                return false;
            }
            
            if (exists10 && !valid10) {
                return false;
            }
            
            if (exists11 && !valid11) {
                return false;
            }
            
        } //End of second for loop
        
        return true;
    }
}

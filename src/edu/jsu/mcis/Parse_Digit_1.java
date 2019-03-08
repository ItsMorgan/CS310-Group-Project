package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_1 extends Pattern_Parser {
    
    public Parse_Digit_1() {
        
        super();
        
        String batchNum = "";
        String year = "";
        String month = "";
        String day = "00";
        String ai = "";
        
        LinkedHashMap<String, String> data;

        Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]"); 
        Pattern p10eol = Pattern.compile("^10(.){1,20}$");     
        Pattern p11 = Pattern.compile("^11[0-9]{6}");          
        Pattern p12 = Pattern.compile("^12[0-9]{6}");            
        Pattern p13 = Pattern.compile("^13[0-9]{6}");            
        Pattern p15 = Pattern.compile("^15[0-9]{6}");            
        Pattern p16 = Pattern.compile("^16[0-9]{6}");            
        Pattern p17 = Pattern.compile("^17[0-9]{6}");
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        patterns.add(p10);
        patterns.add(p10eol);
        patterns.add(p11);
        patterns.add(p12);
        patterns.add(p13);
        patterns.add(p15);
        patterns.add(p16);
        patterns.add(p17);

        String aiAndData = super.parsePattern(patterns).group();
        
        if (aiAndData.substring(0, 1).equals("0")) {
            batchNum = aiAndData.substring(2);
            ai = aiAndData.substring(0, 2);
            data = new LinkedHashMap<>();
            data.put("number:", batchNum);
            data.put("ai:", ai);
            data.put("title:", "BATCH/LOT");
            data.put("element:", aiAndData);
        } else {
            ai = aiAndData.substring(0, 2);
            year = aiAndData.substring(2, 4);
            month = aiAndData.substring(4, 6);
            day = aiAndData.substring(6, 8);
            data = new LinkedHashMap<>();
            data.put("month:", month);
            data.put("year:", year);
            data.put("ai:", ai);
            
            int secondDigitAi = Integer.parseInt(aiAndData.substring(1, 2));
            
            switch (secondDigitAi) {
                case 1:
                    data.put("title:", "PROD DATE");
                    break;
                case 2:
                    data.put("title:", "DUE DATE");
                    break;
                case 3:
                    data.put("title:", "PACK DATE");
                    break;
                case 5:
                    data.put("title:", "BEST BEFORE or BEST BY");
                    break;
                case 6:
                    data.put("title:", "SELL BY");
                    break;
                case 7:
                    data.put("title:", "USE BY OR EXPIRY");
                    break;
            }
            
            data.put("day:", day);
            data.put("element:", aiAndData);
                        
            fields.add(data);
        }
    }
}

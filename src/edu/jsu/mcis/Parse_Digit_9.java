
package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_9 extends Pattern_Parser {
     
    public Parse_Digit_9(){
        
        super();
        
        String ai = "";
        String data_field = "";
    
        ArrayList<Matcher> matches = new ArrayList();

        Pattern p90 = Pattern.compile("^90(.){1,30}[%\\x1D]");
        Pattern p90eol = Pattern.compile("^90(.){1,30}$");  
        Pattern p91 = Pattern.compile("^91(.){1,90}[%//x1D]");
        Pattern p91eol = Pattern.compile("^91(.){1,90}$");
        Pattern p92 = Pattern.compile("^92(.){1,90}[%//x1D]");
        Pattern p92eol = Pattern.compile("^92(.){1,90}$");
        Pattern p93 = Pattern.compile("^93(.){1,90}[%//x1D]");
        Pattern p93eol = Pattern.compile("^93(.){1,90}$");
        Pattern p94 = Pattern.compile("^94(.){1,90}[%//x1D]");
        Pattern p94eol = Pattern.compile("^94(.){1,90}$");
        Pattern p95 = Pattern.compile("^95(.){1,90}[%//x1D]");
        Pattern p95eol = Pattern.compile("^95(.){1,90}$");
        Pattern p96 = Pattern.compile("^96(.){1,90}[%//x1D]");
        Pattern p96eol = Pattern.compile("^96(.){1,90}$");
        Pattern p97 = Pattern.compile("^97(.){1,90}[%//x1D]");
        Pattern p97eol = Pattern.compile("^97(.){1,90}$");
        Pattern p98 = Pattern.compile("^98(.){1,90}[%//x1D]");
        Pattern p98eol = Pattern.compile("^98(.){1,90}$");
        Pattern p99 = Pattern.compile("^99(.){1,90}[%//x1D]");
        Pattern p99eol = Pattern.compile("^99(.){1,90}$");
        /*Pattern p9N = Pattern.compile("^9[1-9]{1}(.){1,90}[%\\x1D]");
        Pattern p9Neol = Pattern.compile("^9[1-9]{1}(.){1,90}$");*/

        patterns = new ArrayList<>();
        patterns.add(p90);
        patterns.add(p90eol);
        patterns.add(p91);
        patterns.add(p91eol);
        patterns.add(p92);
        patterns.add(p92eol);
        patterns.add(p93);
        patterns.add(p93eol);
        patterns.add(p94);
        patterns.add(p94eol);
        patterns.add(p95);
        patterns.add(p95eol);
        patterns.add(p96);
        patterns.add(p96eol);
        patterns.add(p97);
        patterns.add(p97eol);
        patterns.add(p98);
        patterns.add(p98eol);
        patterns.add(p99);
        patterns.add(p99eol);
        
        String aiAndData = super.parsePattern(patterns).group().replace("%", "");
        
        ai = aiAndData.substring(0, 2);
        
        switch (ai.substring(1, 2)) {
            case "0":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("information_mutually_agreed_b/w_trading_partners", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "1":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "2":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "3":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "4":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "5":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "6":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "7":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "8":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            case "9":
                data_field = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("company_internal_info", data_field);
                data.put("ai", ai);
                data.put("title", "INTERNAL");
                data.put("element", aiAndData);
                break;
            default:
                break;
        }
        
        fields.add(data);
    
    }
    
}

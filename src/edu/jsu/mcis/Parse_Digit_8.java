package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_8 extends Pattern_Parser {
    
    public Parse_Digit_8() {
        
        super();
        
        String ai = "";
        String prefix = "";
        String element = "";
        String title = "";
        String roll_product = "";
        String serial_num = "";
        String GRAI = "";
        String asset_type = "";
        String serial_comp = "";
        String comp_prefix = "";
        String GIAI = "";
        String ind_asset_ref = "";
        String price_per_UOM = "";
        String GTIN = "";
        String piece_num = "";
        String total_count = "";
        String IBAN = "";
        String dt_production = "";
        String sensor = "";
        String cp_identifier = "";
        String cp_identifier_serial = "";
        String software_version = "";
        String GMN = "";
        String model_ref = "";
        String GSRN_provider = "";
        String GSRN_recipient = "";
        String service_ref = "";
        String SRIN = "";
        String payment_slip = "";
        String check_digit = "";
        String NACA_GS1 = "";
        String loyalty_points = "";
        String NACA = "";
        String brand_url = "";
        
    
        ArrayList<Matcher> matches = new ArrayList();

        Pattern p8001 = Pattern.compile("^8001[0-9](.){1,14}"); 
        Pattern p8001eol = Pattern.compile("^8001[0-9](.){1,14}$");  
        Pattern p8002 = Pattern.compile("^8002(.){1,20}[%\\x1D]");  
        Pattern p8002eol = Pattern.compile("^8002(.){1,20}$"); 
        Pattern p8003 = Pattern.compile("^8003[0-9]{14}(.){1,16}[%\\x1D]"); 
        Pattern p8003eol = Pattern.compile("^8003[0-9]{14}(.){1,16}$"); 
        Pattern p8004 = Pattern.compile("^8004(.){1,30}[%\\x1D]"); 
        Pattern p8004eol = Pattern.compile("^8004(.){1,30}$"); 
        Pattern p8005 = Pattern.compile("^8005[0-9](.){6}");  
        Pattern p8005eol = Pattern.compile("^8005[0-9](.){6}$");
        Pattern p8006 = Pattern.compile("^8006[0-9]{14}(.)[0-9]{2}(.)[0-9]{2}");
        Pattern p8006eol = Pattern.compile("^8006[0-9]{14}(.)[0-9]{2}(.)[0-9]{2}$"); 
        Pattern p8007 = Pattern.compile("^8007(.){1,34}[%\\x1D]"); 
        Pattern p8007eol = Pattern.compile("^8007(.){1,34}$"); 
        Pattern p8008 = Pattern.compile("^8008[0-9]{8}(.)[0-9]{1,4}"); 
        Pattern p8008eol = Pattern.compile("^8008[0-9]{8}(.)[0-9]{1,4}$"); 
        Pattern p8009 = Pattern.compile("^8009(.){1,50}[%\\x1D]"); 
        Pattern p8009eol = Pattern.compile("^8009(.){1,50}$");  
        Pattern p8010 = Pattern.compile("^8010(.){1,30}[%//x1D]");
        Pattern p8010eol = Pattern.compile("^8010(.){1,30}$"); 
        Pattern p8011 = Pattern.compile("^8011[0-9]{1,12}");  
        Pattern p8011eol = Pattern.compile("^8011[0-9]{1,12}$");   
        Pattern p8012 = Pattern.compile("^8012(.){1,20}[%//x1D]");
        Pattern p8012eol = Pattern.compile("^8012(.){1,20}$");
        Pattern p8013 = Pattern.compile("^8013(.){1,30}[%//x1D]");
        Pattern p8013eol = Pattern.compile("^8013(.){1,30}$");
        Pattern p8017 = Pattern.compile("^8017[0-9]{1,18}[%//x1D]");
        Pattern p8017eol = Pattern.compile("^8017[0-9]{1,18}$");
        Pattern p8018 = Pattern.compile("^8018[0-9]{1,18}[%//x1D]");
        Pattern p8018eol = Pattern.compile("^8018[0-9]{1,18}$");
        Pattern p8019 = Pattern.compile("^8019(.){1,10}[%//x1D]");
        Pattern p8019eol = Pattern.compile("^8019(.){1,10}$");
        Pattern p8020 = Pattern.compile("^8020(.){1,25}[%//x1D]");
        Pattern p8020eol = Pattern.compile("^8020(.){1,25}$");
        Pattern p8110 = Pattern.compile("^8110(.){1,70}[%\\x1D]");
        Pattern p8110eol = Pattern.compile("^8110(.){1,70}$");
        Pattern p8026 = Pattern.compile("^8026[0-9]{14}[0-9]{2}[0-9]{2}[%\\x1D]");
        Pattern p8026eol = Pattern.compile("^8026[0-9]{14}[0-9]{2}[0-9]{2}$");
        Pattern p8111 = Pattern.compile("^8111(.){1,70}[%\\x1D]");
        Pattern p8111eol = Pattern.compile("^8111(.){1,70}$"); 
        Pattern p8112 = Pattern.compile("^8112(.){1,70}[%\\x1D]");
        Pattern p8112eol = Pattern.compile("^8112(.){1,70}$"); 
        Pattern p8200 = Pattern.compile("^8200(.){1,70}[%\\x1D]");
        Pattern p8200eol = Pattern.compile("^8200(.){1,70}$");

        patterns = new ArrayList<>();
        patterns.add(p8001);
        patterns.add(p8001eol);
        patterns.add(p8002);
        patterns.add(p8002eol);
        patterns.add(p8003);
        patterns.add(p8003eol);
        patterns.add(p8004);
        patterns.add(p8004eol);
        patterns.add(p8005);
        patterns.add(p8005eol);
        patterns.add(p8006);
        patterns.add(p8006eol);
        patterns.add(p8007);
        patterns.add(p8007eol);
        patterns.add(p8008);
        patterns.add(p8008eol);
        patterns.add(p8009);
        patterns.add(p8009eol);
        patterns.add(p8010);
        patterns.add(p8010eol);
        patterns.add(p8011);
        patterns.add(p8011eol);
        patterns.add(p8012);
        patterns.add(p8012eol);
        patterns.add(p8013);
        patterns.add(p8013eol);
        patterns.add(p8017);
        patterns.add(p8017eol);
        patterns.add(p8018);
        patterns.add(p8018eol);
        patterns.add(p8019);
        patterns.add(p8019eol);
        patterns.add(p8020);
        patterns.add(p8020eol);
        patterns.add(p8110);
        patterns.add(p8110eol);
        patterns.add(p8026);
        patterns.add(p8026eol);
        patterns.add(p8111);
        patterns.add(p8111eol);
        patterns.add(p8112);
        patterns.add(p8112eol);
        patterns.add(p8200);
        patterns.add(p8200eol);
    
        String aiAndData = parsePattern(patterns).group();
         
        switch (ai.substring(1, 2)) {
            case "0":
                roll_product = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("Variable values of a roll product", roll_product);
                data.put("ai", ai);
                data.put("title", "DIMENSIONS");
                break;
            case "1":
                serial_num = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("serial number", serial_num);
                data.put("ai", ai);
                data.put("title", "CMT NO.");
                break;
            case "2":
                GRAI = aiAndData.substring(3);
                comp_prefix = aiAndData.substring(3);
                check_digit = aiAndData.substring(3);
                asset_type = aiAndData.substring(3);               
                data = new LinkedHashMap<>();
                data.put("asset_type", asset_type);
                data.put("company prefix", comp_prefix);
                data.put("check", check_digit);
                data.put("ai", ai);
                data.put("title", "GRAI");
                break;
            case "3":
                GIAI = aiAndData.substring(4);
                
                data = new LinkedHashMap<>();
                
                
                
       
    
        }
    
    }
}

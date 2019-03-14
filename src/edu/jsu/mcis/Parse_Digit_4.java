package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_4 extends Pattern_Parser {
    
    public Parse_Digit_4(){
        
    super();
    String order_num = "";
    String ai = "";
    String GS1_company_prefix = "";
    String GINC = "";
    String Shipper_ref= "";
    String GSIN = "";
    String check ="";
    String Route="";
    String Location_ref="";
    String Postal_code ="";
    String ISO_country_code ="";
    String ISO_subdivision_code="";
    
    ArrayList<Matcher> matches = new ArrayList();
    
    Pattern p400 = Pattern.compile("^400(.){1,30}[%\\x1D]");    
    Pattern p400eol = Pattern.compile("^400(.){1,30}$");        
    Pattern p401 = Pattern.compile("^401(.){1,30}[%\\x1D]");    
    Pattern p401eol = Pattern.compile("^401(.){1,30}$");        
    Pattern p402 = Pattern.compile("^402[0-9]{17}[%\\x1D]");    
    Pattern p402eol = Pattern.compile("^402[0-9]{17}$");        
    Pattern p403 = Pattern.compile("^403(.){1,30}[%\\x1D]");    
    Pattern p403eol = Pattern.compile("^403(.){1,30}$");        
    Pattern p410 = Pattern.compile("^410[0-9]{13}");             
    Pattern p411 = Pattern.compile("^411[0-9]{13}");             
    Pattern p412 = Pattern.compile("^412[0-9]{13}");             
    Pattern p413 = Pattern.compile("^413[0-9]{13}");             
    Pattern p414 = Pattern.compile("^414[0-9]{13}");             
    Pattern p415 = Pattern.compile("^415[0-9]{13}");              
    Pattern p416 = Pattern.compile("^416[0-9]{13}");              
    Pattern p420 = Pattern.compile("^420[0-9]{1,20}[%\\x1D]");    
    Pattern p420eol = Pattern.compile("^420(.){1,20}$");        
    Pattern p421 = Pattern.compile("^421[0-9]{3}(.){1,9}[%\\x1D]"); 
    Pattern p421eol = Pattern.compile("^421[0,9]{3}(.){1,9}$");
    Pattern p422 = Pattern.compile("^422[0-9]{3}[%\\x1D]");
    Pattern p422eol = Pattern.compile("^422[0-9]{3}$");
    Pattern p423 = Pattern.compile("^423[0-9]{3}[0-9]{1,12}[%\\x1D]");
    Pattern p423eol = Pattern.compile("^423[0-9]{3}[0-9]{1,12}$");
    Pattern p424 = Pattern.compile("^424[0-9]{3}[%\\x1D]");
    Pattern p424eol = Pattern.compile("^424[0-9]{3}$");
    Pattern p425 = Pattern.compile("^425[0-9]{3}[0-9]{1,12}[%\\x1D]");
    Pattern p425eol = Pattern.compile("^425[0-9]{3}[0-9]{1,12}$");
    Pattern p426 = Pattern.compile("^426[0-9]{3}[%\\x1D]");
    Pattern p426eol = Pattern.compile("^426[0-9]{3}$");
    Pattern p427 = Pattern.compile("^427(.){1,3}[%\\x1D]");
    Pattern p427eol = Pattern.compile("^427(.){1,3}$");
    
    ArrayList<Pattern> patterns = new ArrayList<>();
    patterns.add(p400);
    patterns.add(p400eol);
    patterns.add(p401);
    patterns.add(p401eol);
    patterns.add(p402);
    patterns.add(p402eol);
    patterns.add(p403);
    patterns.add(p403eol);
    patterns.add(p410);
    patterns.add(p411);
    patterns.add(p412);
    patterns.add(p413);
    patterns.add(p414);
    patterns.add(p415);
    patterns.add(p416);
    patterns.add(p420);
    patterns.add(p420eol);
    patterns.add(p421);
    patterns.add(p421eol);
    patterns.add(p422);
    patterns.add(p422eol);
    patterns.add(p423);
    patterns.add(p423eol);
    patterns.add(p424);
    patterns.add(p424eol);
    patterns.add(p425);
    patterns.add(p425eol);
    patterns.add(p426);
    patterns.add(p426eol);
    patterns.add(p427);
    patterns.add(p427eol);
    
    String aiAndData = super.parsePattern(patterns).group();
    
    ai = aiAndData.substring(0, 3);
    data = new LinkedHashMap();
    
    if (ai.substring(1,3).equals("00")) {
            order_num = aiAndData.substring(3);
            data.put("order_num", order_num);
            data.put("ai",ai);
            data.put("title", "ORDER NUMBER");
            data.put("element", aiAndData);

        } 
        else if (ai.substring(1,3).equals("01")) {
            GINC = aiAndData.substring(3);
            data.put("title", "GINC");
            data.put("ai", ai);
            data.put("ginc_code", GINC);
            data.put("element",aiAndData);
        } 
        
        else if (ai.substring(1,3).equals("02")) {
            GS1_company_prefix = aiAndData.substring(3,12);
            Shipper_ref = aiAndData.substring(12,19);
            check = aiAndData.substring(19);
            GSIN = GS1_company_prefix + Shipper_ref + check;         
            data.put("title", "GSIN");
            data.put("ai", ai);
            data.put("prefix", GS1_company_prefix);
            data.put("reference", Shipper_ref);
            data.put("check", check);
            data.put("gsin_code", GSIN);
            data.put("element", aiAndData);
        }
        else if (ai.substring(1,3).equals("03")){
            Route = aiAndData.substring(3);
            data.put("title", "ROUTE");
            data.put("ai",ai);
            data.put("route", Route);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("10")){
            GS1_company_prefix = aiAndData.substring(3,9); 
            Location_ref =aiAndData.substring(9,15); 
            check = aiAndData.substring(15); 
            data.put("title", "SHIP TO LOC");
            data.put("prefix", GS1_company_prefix);
            data.put("reference", Location_ref);
            data.put("check",check);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("11")){
            GS1_company_prefix = aiAndData.substring(3,9); 
            Location_ref =aiAndData.substring(9,15); 
            check = aiAndData.substring(15); 
            data.put("title", "BILL TO");
            data.put("prefix", GS1_company_prefix);
            data.put("reference", Location_ref);
            data.put("check",check);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("12")){
            GS1_company_prefix = aiAndData.substring(3,9); 
            Location_ref =aiAndData.substring(9,15); 
            check = aiAndData.substring(15); 
            data.put("title", "PURCHASE FROM");
            data.put("prefix", GS1_company_prefix);
            data.put("reference", Location_ref);
            data.put("check",check);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("13")){
            GS1_company_prefix = aiAndData.substring(3,9); 
            Location_ref =aiAndData.substring(9,15); 
            check = aiAndData.substring(15); 
            data.put("title", "SHIP FOR LOC");
            data.put("prefix", GS1_company_prefix);
            data.put("reference", Location_ref);
            data.put("check",check);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("14")){
            GS1_company_prefix = aiAndData.substring(3,9); 
            Location_ref =aiAndData.substring(9,15); 
            check = aiAndData.substring(15); 
            data.put("title", "LOC NO");
            data.put("prefix", GS1_company_prefix);
            data.put("reference", Location_ref);
            data.put("check",check);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("15")){
            GS1_company_prefix = aiAndData.substring(3,9); 
            Location_ref =aiAndData.substring(9,15); 
            check = aiAndData.substring(15); 
            data.put("title", "PAY TO");
            data.put("prefix", GS1_company_prefix);
            data.put("reference", Location_ref);
            data.put("check",check);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("16")){
            GS1_company_prefix = aiAndData.substring(3,9); 
            Location_ref =aiAndData.substring(9,15); 
            check = aiAndData.substring(15); 
            data.put("title", "PROD/SERV LOC");
            data.put("prefix", GS1_company_prefix);
            data.put("reference", Location_ref);
            data.put("check",check);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("20")){
            Postal_code = aiAndData.substring(3);
            data.put("title", "SHIP TO POST");
            data.put("postal code", Postal_code);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("21")){
            ISO_country_code = aiAndData.substring(3,6);    
            Postal_code = aiAndData.substring(6);
            data.put("title", "SHIP TO POST");
            data.put("iso_country_code",ISO_country_code);
            data.put("postal_code", Postal_code);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("22")){
            ISO_country_code = aiAndData.substring(3);    
            data.put("title", "ORIGIN");
            data.put("iso_country_code",ISO_country_code);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("23")){
            ISO_country_code = aiAndData.substring(3);    
            data.put("title", "COUNTRY-INITIAL PROCESS");
            data.put("iso_country_code",ISO_country_code);
            data.put("postal_code", Postal_code);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("24")){
            ISO_country_code = aiAndData.substring(3);    
            data.put("title", "COUNTRY - PROCESS");
            data.put("iso_country_code",ISO_country_code);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("25")){
            ISO_country_code = aiAndData.substring(3);    
            data.put("title", "COUNTRY- DISASSEMBLY");
            data.put("iso_country_code",ISO_country_code);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("26")){
            ISO_country_code = aiAndData.substring(3);    
            data.put("title", "COUNTRY - FULL PROCESS");
            data.put("iso_country_code",ISO_country_code);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
            else if (ai.substring(1,3).equals("27")){
            ISO_subdivision_code = aiAndData.substring(3);    
            data.put("title", "ORIGIN SUBDIVISION");
            data.put("iso_country_code",ISO_subdivision_code);
            data.put("ai",ai);
            data.put("element", aiAndData);
        }
    fields.add(data);
}
  
}
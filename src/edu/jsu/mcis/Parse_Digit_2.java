package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_2 extends Pattern_Parser {
    
    public Parse_Digit_2(){
    
        super();
        
        String ai = "";
        String prefix = "";
        String element = "";
        String title = "";
        String company_prefix = "";
        String coupon_ref = "";
        String check_digit = "";
        String serial_component = "";
        String doc_type = "";
        String ref_to_source = "";
        String second_serial_num = "";
        String pack_comp_num = "";
        String madeToOrder_var_num = "";
        String cust_part_num = "";
        String add_item_ident = "";
        String con_product_var = "";
        String serial_num = "";
        String internal_prod_var = "";

        ArrayList<Matcher> matches = new ArrayList();

        Pattern p20 = Pattern.compile("^20[0-9]{2}");            
        Pattern p21 = Pattern.compile("^21(.){1,20}[%\\x1D]");   
        Pattern p21eol = Pattern.compile("^21(.){1,20}$");       
        Pattern p22 = Pattern.compile("^22(.){1,20}[%\\x1D]");   
        Pattern p22eol = Pattern.compile("^22(.){1,20}$");       
        Pattern p240 = Pattern.compile("^240(.){1,30}[%\\x1D]"); 
        Pattern p240eol = Pattern.compile("^240(.){1,30}$");
        Pattern p241 = Pattern.compile("^241(.){1,30}[%\\x1D]");
        Pattern p241eol = Pattern.compile("^241(.){1,30}}$");
        Pattern p242 = Pattern.compile("^242[0-9]{1,6}");
        Pattern p242eol = Pattern.compile("^242[0-9]{1,6}}$");
        Pattern p243 = Pattern.compile("^243(.){1,20}[%\\x1D]"); 
        Pattern p243eol = Pattern.compile("^243(.){1,20}$");     
        Pattern p250 = Pattern.compile("^250(.){1,30}[%\\x1D]"); 
        Pattern p250eol = Pattern.compile("^250(.){1,30}$");     
        Pattern p251 = Pattern.compile("^251(.){1,30}[%\\x1D]"); 
        Pattern p251eol = Pattern.compile("^251(.){1,30}$");     
        Pattern p253 = Pattern.compile("^253[0-9]{13}(.){1,17}[%\\x1D]");
        Pattern p253eol = Pattern.compile("^253[0-9]{13}(.){1,17}$");
        Pattern p254 = Pattern.compile("^254(.){1,20}[%\\x1D]"); 
        Pattern p254eol = Pattern.compile("^254(.){1,20}[%\\x1D]"); 
        Pattern p255 = Pattern.compile("^255[0-9]{13}[0-9]{1,12}[%\\x1D]");
        Pattern p255eol = Pattern.compile("^255[0-9]{13}[0-9]{1,12}$"); 

        patterns = new ArrayList<>();
        patterns.add(p20);
        patterns.add(p21);
        patterns.add(p21eol);
        patterns.add(p22);
        patterns.add(p22eol);
        patterns.add(p240);
        patterns.add(p240eol);
        patterns.add(p241);
        patterns.add(p241eol);
        patterns.add(p242);
        patterns.add(p242eol);
        patterns.add(p243);
        patterns.add(p243eol);
        patterns.add(p250);
        patterns.add(p250eol);
        patterns.add(p251);
        patterns.add(p251eol);
        patterns.add(p253);
        patterns.add(p253eol);
        patterns.add(p254);
        patterns.add(p254eol);
        patterns.add(p255);
        patterns.add(p255eol);
        
        String aiAndData = super.parsePattern(patterns).group();
        
        int aiSecondPos = Integer.parseInt(aiAndData.substring(1, 2));
        
        if(aiSecondPos < 4){
            ai = aiAndData.substring(0, 2);
        } else if (aiSecondPos >= 4){
            ai = aiAndData.substring(0, 3);
        }
        
        if(ai.substring(1).equals("0")){
            internal_prod_var = aiAndData.substring(2);
            data = new LinkedHashMap<>();
            data.put("internal product variant", internal_prod_var);
            data.put("ai", ai);
            data.put("title", "VARIANT");
            data.put("element", aiAndData);
        } else if (ai.substring(1).equals("1")){
            serial_num = aiAndData.substring(2);
            data = new LinkedHashMap<>();
            data.put("serial number", serial_num);
            data.put("ai", ai);
            data.put("title", "SERIAL");
            data.put("element", aiAndData);
        } else if (ai.substring(1).equals("2")){
            con_product_var = aiAndData.substring(2);
            data = new LinkedHashMap<>();
            data.put("consumer product variant", con_product_var);
            data.put("ai", ai);
            data.put("title", "CPV");
            data.put("element", aiAndData);
        } else if (ai.substring(1).equals("4")){
            if(ai.substring(2).equals("0")){
                add_item_ident = aiAndData.substring(3);
                data = new LinkedHashMap<>();
                data.put("additional item indetification", add_item_ident);
                data.put("ai", ai);
                data.put("title", "ADDITIONAL ID");
                data.put("element", aiAndData);
            } else if (ai.substring(2).equals("1")){
                cust_part_num = aiAndData.substring(3);
                data = new LinkedHashMap<>();
                data.put("customer part number", cust_part_num);
                data.put("ai", ai);
                data.put("title", "CUST. PART NO.");
                data.put("element", aiAndData);
            } else if (ai.substring(2).equals("2")){
                madeToOrder_var_num = aiAndData.substring(3);
                data = new LinkedHashMap<>();
                data.put("made-to-order varation number", madeToOrder_var_num);
                data.put("ai", ai);
                data.put("title", "PCN");
                data.put("element", aiAndData);
            }
        }
        
    }
}
//p253

//company prefix = 1 - 6
//doc type = 7 - 12
//check digit = 13
//serial component  = x1 - x17
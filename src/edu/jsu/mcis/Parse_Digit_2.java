package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_2 extends Pattern_Parser {
    
    public Parse_Digit_2(){
    
        super();
        
        String ai = "";
        String company_prefix = "";
        String coupon_ref = "";
        String check_digit = "";
        String serial_comp = "";
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
        String gdti = "";
        String gln_ext_comp = "";
        String gcn = "";

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
        Pattern p242 = Pattern.compile("^242[0-9]{1,6}[%\\x1D]");
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
        Pattern p254eol = Pattern.compile("^254(.){1,20}$"); 
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
        
        String aiAndData = super.parsePattern(patterns).group().replace("%", "");
        
        int aiSecondPos = Integer.parseInt(aiAndData.substring(1, 2));
        
        if(aiSecondPos < 4){
            ai = aiAndData.substring(0, 2);
        } else if (aiSecondPos >= 4){
            ai = aiAndData.substring(0, 3);
        }
        
        switch (ai.substring(1, 2)) {
            case "0":
                internal_prod_var = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("internal_prod_var", internal_prod_var);
                data.put("ai", ai);
                data.put("title", "VARIANT");
                data.put("element", aiAndData);
                break;
            case "1":
                serial_num = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("serial_num", serial_num);
                data.put("ai", ai);
                data.put("title", "SERIAL");
                data.put("element", aiAndData);
                break;
            case "2":
                con_product_var = aiAndData.substring(2);
                data = new LinkedHashMap<>();
                data.put("consumer_prod_var", con_product_var);
                data.put("ai", ai);
                data.put("title", "CPV");
                data.put("element", aiAndData);
                break;
            case "4":
                switch (ai.substring(2, 3)) {
                    case "0":
                        add_item_ident = aiAndData.substring(3);
                        data = new LinkedHashMap<>();
                        data.put("additional_item_id", add_item_ident);
                        data.put("ai", ai);
                        data.put("title", "ADDITIONAL ID");
                        data.put("element", aiAndData);
                        break;
                    case "1":
                        cust_part_num = aiAndData.substring(3);
                        data = new LinkedHashMap<>();
                        data.put("customer_part_num", cust_part_num);
                        data.put("ai", ai);
                        data.put("title", "CUST. PART NO.");
                        data.put("element", aiAndData);
                        break;
                    case "2":
                        madeToOrder_var_num = aiAndData.substring(3);
                        data = new LinkedHashMap<>();
                        data.put("made-to-order_var_num", madeToOrder_var_num);
                        data.put("ai", ai);
                        data.put("title", "MTO VARIANT");
                        data.put("element", aiAndData);
                        break;
                    case "3":
                        pack_comp_num = aiAndData.substring(3);
                        data = new LinkedHashMap<>();
                        data.put("pack_comp_num", pack_comp_num);
                        data.put("ai", ai);
                        data.put("title", "PCN");
                        data.put("element", aiAndData);
                        break;
                    default:
                        break;
                }   break;
            case "5":
                switch (ai.substring(2, 3)) {
                    case "0":
                        second_serial_num = aiAndData.substring(3);
                        data = new LinkedHashMap<>();
                        data.put("secondary_serial_num", second_serial_num);
                        data.put("ai", ai);
                        data.put("title", "SECONDARY SERIAL");
                        data.put("element", aiAndData);
                        break;
                    case "1":
                        ref_to_source = aiAndData.substring(3);
                        data = new LinkedHashMap<>();
                        data.put("ref_to_source_entity", ref_to_source);
                        data.put("ai", ai);
                        data.put("title", "REF. TO SOURCE");
                        data.put("element", aiAndData);
                        break;
                    case "3":
                        gdti = aiAndData.substring(3);
                        company_prefix = aiAndData.substring(3, 9);
                        doc_type = aiAndData.substring(9, 15);
                        check_digit = aiAndData.substring(15, 16);
                        serial_comp = aiAndData.substring(16);
                        data = new LinkedHashMap<>();
                        data.put("global_doc_type_identifier", gdti);
                        data.put("company_prefix", company_prefix);
                        data.put("doc_type", doc_type);
                        data.put("serial_comp", serial_comp);
                        data.put("ai", ai);
                        data.put("title", "GDTI");
                        data.put("check_digit", check_digit);
                        data.put("element", aiAndData);
                        break;
                    case "4":
                        gln_ext_comp = aiAndData.substring(3);
                        data = new LinkedHashMap<>();
                        data.put("gln_ext_comp", gln_ext_comp);
                        data.put("ai", ai);
                        data.put("title", "GLN EXTENSION COMPONENT");
                        data.put("element", aiAndData);
                        break;
                    case "5":
                        gcn = aiAndData.substring(3);
                        company_prefix = aiAndData.substring(3, 9);
                        coupon_ref = aiAndData.substring(9, 15);
                        check_digit = aiAndData.substring(15, 16);
                        serial_comp = aiAndData.substring(16);
                        data = new LinkedHashMap<>();
                        data.put("global_coupon_num", gcn);
                        data.put("company_prefix", company_prefix);
                        data.put("coupon_ref", coupon_ref);
                        data.put("serial_comp", serial_comp);
                        data.put("title", "GCN");
                        data.put("check_digit", check_digit);
                        data.put("element", aiAndData);
                        data.put("ai", ai);
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        
        fields.add(data);
        
    }
}

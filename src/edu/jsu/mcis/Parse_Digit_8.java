package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_8 extends Pattern_Parser {
    
    public Parse_Digit_8() {
        
        super();
        
        String slit_width_mil = "";
        String actual_length_metres = "";
        String core_diameter_mil = "";
        String winding_dir = "";
        String num_splices = "";
        String serial_num = "";
        String comp_prefix = "";
        String asset_type = "";
        String check_digit = "";
        String price_per_unit = "";
        String gtin = "";
        String piece_num = "";
        String total_cnt = "";
        String int_bank_acc_num = "";
        String year = "";
        String month = "";
        String day = "";
        String hour = "";
        String min = "";
        String sec = "";
        String date_and_time_of_prod = "";
        String sensor_instrct_param = "";
        String part_id_serial_num = "";
        String software_ver = "";
        String service_ref = "";
        String service_rel_inst_num = "";
        String pymnt_slip_ref_num = "";
        String asag = "";
        String loyalty_points = "";
        String url = "";
        String giai = "";
        String part_id = "";
        String gmn = "";
        
    
        ArrayList<Matcher> matches = new ArrayList();

        Pattern p8001 = Pattern.compile("^8001[0-9]{14}[%\\x1D]"); 
        Pattern p8001eol = Pattern.compile("^8001[0-9]{14}$");  
        Pattern p8002 = Pattern.compile("^8002[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}[%\\x1D]");  
        Pattern p8002eol = Pattern.compile("^8002[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}$"); 
        Pattern p8003 = Pattern.compile("^8003[0-9]{14}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,16}[%\\x1D]"); 
        Pattern p8003eol = Pattern.compile("^8003[0-9]{14}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,16}$"); 
        Pattern p8004 = Pattern.compile("^8004[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]"); 
        Pattern p8004eol = Pattern.compile("^8004[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$"); 
        Pattern p8005 = Pattern.compile("^8005[0-9]{6}[%\\x1D]");  
        Pattern p8005eol = Pattern.compile("^8005[0-9]{6}$");
        Pattern p8006 = Pattern.compile("^8006[0-9]{14}[0-9]{2}[0-9]{2}[%\\x1D]");
        Pattern p8006eol = Pattern.compile("^8006[0-9]{14}[0-9]{2}[0-9]{2}$"); 
        Pattern p8007 = Pattern.compile("^8007[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,34}[%\\x1D]"); 
        Pattern p8007eol = Pattern.compile("^8007[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,34}$"); 
        Pattern p8008 = Pattern.compile("^8008[0-9]{8}[0-9]{1,4}[%\\x1D]"); 
        Pattern p8008eol = Pattern.compile("^8008[0-9]{8}[0-9]{1,4}$"); 
        Pattern p8009 = Pattern.compile("^8009[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,50}[%\\x1D]"); 
        Pattern p8009eol = Pattern.compile("^8009[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,50}$");  
        Pattern p8010 = Pattern.compile("^8010[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]");
        Pattern p8010eol = Pattern.compile("^8010[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$"); 
        Pattern p8011 = Pattern.compile("^8011[0-9]{1,12}[%\\x1D]");  
        Pattern p8011eol = Pattern.compile("^8011[0-9]{1,12}$");   
        Pattern p8012 = Pattern.compile("^8012[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}[%\\x1D]");
        Pattern p8012eol = Pattern.compile("^8012[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}$");
        Pattern p8013 = Pattern.compile("^8013[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]");
        Pattern p8013eol = Pattern.compile("^8013[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$");
        Pattern p8017 = Pattern.compile("^8017[0-9]{18}[%\\x1D]");
        Pattern p8017eol = Pattern.compile("^8017[0-9]{18}$");
        Pattern p8018 = Pattern.compile("^8018[0-9]{18}[%\\x1D]");
        Pattern p8018eol = Pattern.compile("^8018[0-9]{18}$");
        Pattern p8019 = Pattern.compile("^8019{1,10}[%\\x1D]");
        Pattern p8019eol = Pattern.compile("^8019{1,10}$");
        Pattern p8020 = Pattern.compile("^8020[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,25}[%\\x1D]");
        Pattern p8020eol = Pattern.compile("^8020[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,25}$");
        Pattern p8110 = Pattern.compile("^8110[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}[%\\x1D]");
        Pattern p8110eol = Pattern.compile("^8110[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}$");
        Pattern p8026 = Pattern.compile("^8026[0-9]{14}[0-9]{2}[0-9]{2}[%\\x1D]");
        Pattern p8026eol = Pattern.compile("^8026[0-9]{14}[0-9]{2}[0-9]{2}$");
        Pattern p8111 = Pattern.compile("^8111[0-9]{4}[%\\x1D]");
        Pattern p8111eol = Pattern.compile("^8111[0-9]{4}$"); 
        Pattern p8112 = Pattern.compile("^8112[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}[%\\x1D]");
        Pattern p8112eol = Pattern.compile("^8112[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}$"); 
        Pattern p8200 = Pattern.compile("^8200[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}[%\\x1D]");
        Pattern p8200eol = Pattern.compile("^8200[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}$");

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
    
        data = new LinkedHashMap<>();
        
        String aiAndData = parsePattern(patterns).group().replace("%", "");
        
        String ai = aiAndData.substring(0, 4);
        
        if(aiAndData.substring(1, 2).equals("0")){
            if(aiAndData.substring(2, 3).equals("0")){
                if(aiAndData.substring(3, 4).equals("1")){
                    slit_width_mil = aiAndData.substring(4, 8);
                    actual_length_metres = aiAndData.substring(8, 13);
                    core_diameter_mil = aiAndData.substring(13, 16);
                    winding_dir = aiAndData.substring(16, 17);
                    num_splices = aiAndData.substring(17);
                    data.put("slit_width_mil", slit_width_mil);
                    data.put("actual_length_metres", actual_length_metres);
                    data.put("core_diameter_mil", core_diameter_mil);
                    data.put("winding_dir", winding_dir);
                    data.put("num_splices", num_splices);
                    data.put("title", "DIMENSIONS");
                } else if (aiAndData.substring(3, 4).equals("2")){
                    serial_num = aiAndData.substring(4);
                    data.put("serial_num", serial_num);
                    data.put("title", "CMT No");
                } else if (aiAndData.substring(3, 4).equals("3")){
                    comp_prefix = "0" + aiAndData.substring(4, 10);
                    asset_type = aiAndData.substring(10, 16);
                    check_digit = aiAndData.substring(16, 17);
                    serial_num = aiAndData.substring(17);
                    data.put("comp_prefix", comp_prefix);
                    data.put("asset_type", asset_type);
                    data.put("check_digit", check_digit);
                    data.put("serial_comp", serial_num);
                    data.put("title", "GRAI");
                } else if (aiAndData.substring(3, 4).equals("4")){
                    giai = aiAndData.substring(4);
                    data.put("global_ind_asset_id", giai);
                    data.put("title", "GIAI");
                } else if (aiAndData.substring(3, 4).equals("5")){
                    price_per_unit = aiAndData.substring(4);
                    data.put("price_per_unit", price_per_unit);
                    data.put("title", "PRICE PER UNIT");
                } else if (aiAndData.substring(3, 4).equals("6")){
                    gtin = aiAndData.substring(4, 18);
                    piece_num = aiAndData.substring(18, 20);
                    total_cnt = aiAndData.substring(20);
                    data.put("gtin", gtin);
                    data.put("piece_num", piece_num);
                    data.put("total_cnt", total_cnt);
                    data.put("title", "ITIP or GCTIN");
                } else if (aiAndData.substring(3, 4).equals("7")){
                    int_bank_acc_num = aiAndData.substring(4);
                    data.put("int_bank_acc_num", int_bank_acc_num);
                    data.put("title", "IBAN");
                } else if (aiAndData.substring(3, 4).equals("8")){
                    year = aiAndData.substring(4, 6);
                    month = aiAndData.substring(6, 8);
                    day = aiAndData.substring(8, 10);
                    hour = aiAndData.substring(10, 12);
                    min = aiAndData.substring(12, 14);
                    sec = aiAndData.substring(14, 16);
                    date_and_time_of_prod = year + "-" + month + "-" + day
                        + " " + hour + ":" + min + ":" + sec + ":";
                    data.put("date_and_time_of_prod", date_and_time_of_prod);
                    data.put("year", year);
                    data.put("month", month);
                    data.put("day", day);
                    data.put("hour", hour);
                    data.put("min", min);
                    data.put("sec", sec);
                    data.put("title", "PROD TIME");
                } else if (aiAndData.substring(3, 4).equals("9")){
                    sensor_instrct_param = aiAndData.substring(4);
                    data.put("sensor_instrct_param", sensor_instrct_param);
                    data.put("title", "OPTSEN");
                }
            } else if (aiAndData.substring(2, 3).equals("1")){
                if(aiAndData.substring(3, 4).equals("0")){
                    part_id = aiAndData.substring(4);
                    data.put("part_id", part_id);
                    data.put("title", "CPID");
                } else if (aiAndData.substring(3, 4).equals("1")){
                    part_id_serial_num = aiAndData.substring(4);
                    data.put("part_id_serial_num", part_id_serial_num);
                    data.put("title", "CPID SERIAL");
                } else if (aiAndData.substring(3, 4).equals("2")){
                    software_ver = aiAndData.substring(4);
                    data.put("software_ver", software_ver);
                    data.put("title", "VERSION");
                } else if (aiAndData.substring(3, 4).equals("3")){
                    gmn = aiAndData.substring(4);
                    data.put("global_model_num", gmn);
                    data.put("title", "GMN or BUDI-DI");
                } else if (aiAndData.substring(3, 4).equals("7")){
                    comp_prefix = aiAndData.substring(4, 12);
                    service_ref = aiAndData.substring(12, 21);
                    check_digit = aiAndData.substring(21);
                    data.put("comp_prefix", comp_prefix);
                    data.put("service_ref", service_ref);
                    data.put("check_digit", check_digit);
                    data.put("title", "GSRN - PROVIDER");
                } else if (aiAndData.substring(3, 4).equals("8")){
                    comp_prefix = aiAndData.substring(4, 12);
                    service_ref = aiAndData.substring(12, 21);
                    check_digit = aiAndData.substring(21);
                    data.put("comp_prefix", comp_prefix);
                    data.put("service_ref", service_ref);
                    data.put("check_digit", check_digit);
                    data.put("title", "GSRN - RECIPIENT");
                } else if (aiAndData.substring(3, 4).equals("9")){
                    service_rel_inst_num = aiAndData.substring(4);
                    data.put("service_rel_inst_num", service_rel_inst_num);
                    data.put("title", "SRIN");
                }
            } else if (aiAndData.substring(2, 3).equals("2")){
                if(aiAndData.substring(3, 4).equals("0")){
                    pymnt_slip_ref_num = aiAndData.substring(4);
                    data.put("pymnt_slip_ref_num", pymnt_slip_ref_num);
                    data.put("title", "REF No");
                } else if (aiAndData.substring(3, 4).equals("6")){
                    /*keeps returning a null pointer error, I guess
                    my substring numbers are wrong*/
                    gtin = aiAndData.substring(4, 18);
                    piece_num = aiAndData.substring(18, 20);
                    total_cnt = aiAndData.substring(20);
                    data.put("gtin", gtin);
                    data.put("piece_num", piece_num);
                    data.put("total_cnt", total_cnt);
                    data.put("title", "ITIP CONTENT");
                }
            }
        } else if (aiAndData.substring(1, 2).equals("1")){
            if(aiAndData.substring(2, 3).equals("1")){
                if(aiAndData.substring(3, 4).equals("0")){
                    asag = aiAndData.substring(4);
                    data.put("format_according_to_NA_coupon_app_guidline_using_GS1", asag);
                    data.put("title", "-");
                } else if (aiAndData.substring(3, 4).equals("1")){
                    loyalty_points = aiAndData.substring(4);
                    data.put("loyalty_points", loyalty_points);
                    data.put("title", "POINTS");
                }
            }
        } else if (aiAndData.substring(1, 2).equals("2")){
            if(aiAndData.substring(2, 3).equals("0")){
                if(aiAndData.substring(3, 4).equals("0")){
                    url = aiAndData.substring(4);
                    data.put("brand_owner_authorised_url", url);
                    data.put("title", "PRODUCT URL");
                }
            }
        }
        data.put("datafield", aiAndData.substring(ai.length()));
        data.put("ai", ai);
        data.put("element", aiAndData);
        fields.add(data);
        
    }
}

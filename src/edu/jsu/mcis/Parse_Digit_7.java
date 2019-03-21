package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_7 extends Pattern_Parser {
    
    public Parse_Digit_7(){
        
        super();
        
        String ai = "";
        String thirdpos = "";
        String fourthpos = "";
        String NATO_supply_class = "";
        String Assign_country = "";
        String Sequential_number = "";
        String UN_ECE_product_classification = "";
        String year = "";
        String month = "";
        String day = "";
        String year_2 = "";
        String month_2 = "";
        String day_2 = "";
        String hour = "";
        String minute = "";
        String Expiration_d_a_t = "";
        String Active_potency = "";
        String Catch_area = "";
        String First_freeze_date = "";
        String Harvest_start_date = "";
        String Harvest_end_date = "";
        String Fishery_species = "";
        String Fishing_gear_type = "";
        String Production_method = "";
        String Refurb_lot = "";
        String Functional_status = "";
        String Revision_status = "";
        String Prefix = "";
        String Ind_asset_ref = "";
        String GIAI = "";
        String National_Healthcare_reimburse_num = "";
        String Organisation = "";
        
    
        Pattern p7001 = Pattern.compile("^7001[0-9]{13}[%\\x1D]");
        Pattern p7001eol = Pattern.compile("^7001[0-9]{13}[%\\x1D]");
        Pattern p7002 = Pattern.compile("^7002(.){1,30}[%\\x1D]");
        Pattern p7002eol = Pattern.compile("^7002(.){1,30}$");
        Pattern p7003 = Pattern.compile("^7003[0-9]{10}[%\\x1D]");
        Pattern p7003eol = Pattern.compile("^7003[0-9]{10}$");
        Pattern p723s = Pattern.compile("^723[0-9]{1}(.){2}(.){1,28}[%\\x1D]");
        Pattern p723seol = Pattern.compile("^723[0-9]{1}(.){2}(.){1,28}$");
        Pattern p7004 = Pattern.compile("^7004[0-9](.){1,4}");
        Pattern p7004eol = Pattern.compile("^7004[0-9](.){1,4}$");
        Pattern p7005 = Pattern.compile("^7005(.){1,12}[%\\x1D]"); 
        Pattern p7005eol = Pattern.compile("^7005(.){1,12}$"); 
        Pattern p7006 = Pattern.compile("^7006[0-9](.){1,6}");   
        Pattern p7006eol = Pattern.compile("^7006[0-9](.){1,6}$");  
        Pattern p7007 = Pattern.compile("^7007[0-9](.){6,12}");  
        Pattern p7007eol = Pattern.compile("^7007[0-9]{4}(.){6,12}$"); 
        Pattern p7008 = Pattern.compile("^7008(.){1,3}[%\\x1D]");  
        Pattern p7008eol = Pattern.compile("^7008(.){1,3}$"); 
        Pattern p7009 = Pattern.compile("^7009[0-9](.){1,10}[%\\x1D]"); 
        Pattern p7009eol = Pattern.compile("^7009[0-9](.){1,10}$");
        Pattern p7010 = Pattern.compile("^7010(.){1,2}[%\\x1D]");
        Pattern p7010eol = Pattern.compile("^7010(.){1,2}$"); 
        Pattern p7020 = Pattern.compile("^7020(.){1,20}[%\\x1D]");
        Pattern p7020eol = Pattern.compile("^7020(.){1,20}$"); 
        Pattern p7021 = Pattern.compile("^7021(.){1,20}[%\\x1D]"); 
        Pattern p7021eol = Pattern.compile("^7021(.){1,20}$"); 
        Pattern p7022 = Pattern.compile("^7022(.){1,20}[%\\x1D]"); 
        Pattern p7022eol = Pattern.compile("^7022(.){1,20}$"); 
        Pattern p7023 = Pattern.compile("^7023(.){1,30}[%\\x1D]"); 
        Pattern p7023eol = Pattern.compile("^7023(.){1,30}$"); 
        Pattern p703s = Pattern.compile("^703[0-9]{1}[0-9]{3}(.){1,27}[%\\x1D]");
        Pattern p703seol = Pattern.compile("^703[0-9]{1}[0-9]{3}(.){1,27}$");
        Pattern p710 = Pattern.compile("^710(.){1,20}[%\\x1D]");
        Pattern p710eol = Pattern.compile("^710(.){1,20}$"); 
        Pattern p711 = Pattern.compile("^711(.){1,20}[%\\x1D]");
        Pattern p711eol = Pattern.compile("^711(.){1,20}$");
        Pattern p712 = Pattern.compile("^712(.){1,20}[%\\x1D]"); 
        Pattern p712eol = Pattern.compile("^712(.){1,20}$"); 
        Pattern p713 = Pattern.compile("^713(.){1,20}[%\\x1D]"); 
        Pattern p713eol = Pattern.compile("^713(.){1,20}$");
        Pattern p714 = Pattern.compile("^714(.){1,20}[%\\x1D]"); 
        Pattern p714eol = Pattern.compile("^714(.){1,20}$");
        
        patterns.add(p7001);
        patterns.add(p7001eol);
        patterns.add(p7002);
        patterns.add(p7002eol);
        patterns.add(p7003);
        patterns.add(p7001eol);
        patterns.add(p7002);
        patterns.add(p7002eol);
        patterns.add(p7003);
        patterns.add(p7003eol);
        patterns.add(p723s);
        patterns.add(p723seol);
        patterns.add(p7004);
        patterns.add(p7004eol);
        patterns.add(p7005);
        patterns.add(p7005eol);
        patterns.add(p7006);
        patterns.add(p7006eol);
        patterns.add(p7007);
        patterns.add(p7007eol);
        patterns.add(p7008);
        patterns.add(p7008eol);
        patterns.add(p7009);
        patterns.add(p7009eol);
        patterns.add(p7010);
        patterns.add(p7010eol);
        patterns.add(p7020);
        patterns.add(p7020eol);
        patterns.add(p7021);
        patterns.add(p7021eol);
        patterns.add(p7022);
        patterns.add(p7022eol);
        patterns.add(p7023);
        patterns.add(p7023eol);
        patterns.add(p703s);
        patterns.add(p703seol);
        patterns.add(p710);
        patterns.add(p710eol);
        patterns.add(p711);
        patterns.add(p711eol);
        patterns.add(p712);
        patterns.add(p712eol);
        patterns.add(p713);
        patterns.add(p713eol);
        patterns.add(p714);
        patterns.add(p714eol);
        
        patterns = new ArrayList<>();
        data = new LinkedHashMap<>();
        
        
        String aiAndData = parsePattern(patterns).group().replace("%", "");
        ai = aiAndData.substring(1,2);
        thirdpos = aiAndData.substring(2,3);
        fourthpos = aiAndData.substring(3,4);
        switch (ai){
            case "0":
                if (thirdpos.equals("0")){
                    switch (fourthpos) {
                        case "1":
                            ai = aiAndData.substring(1,5);
                            NATO_supply_class = aiAndData.substring(5,9);
                            Assign_country = aiAndData.substring(9,11);
                            Sequential_number = aiAndData.substring(9,16);
                            data.put("ai", ai);
                            data.put("NATO Supply Class", NATO_supply_class);
                            data.put("title", "NATO Stock Number");
                            data.put("Assigning Country", Assign_country);
                            data.put("Sequential Number", Sequential_number);
                            break;
                        case "2":
                            ai = aiAndData.substring(1,5);
                            UN_ECE_product_classification = aiAndData.substring(5);
                            data.put("ai", ai);
                            data.put("title", "Meat Cut");
                            data.put("UN/ECE prod. class.", UN_ECE_product_classification);
                            break;
                        case "3":
                            ai = aiAndData.substring(1,5);
                            year = aiAndData.substring(5,7);
                            month = aiAndData.substring(7,9);
                            day = aiAndData.substring(9,11);
                            hour = aiAndData.substring(11,13);
                            minute = aiAndData.substring(13,15);
                            Expiration_d_a_t = year + ":" + month + ":" + day + ":" + hour + ":" + minute;
                            data.put("ai", ai);
                            data.put("year", year);
                            data.put("month", month);
                            data.put("day", day);
                            data.put("hour", hour);
                            data.put("minute", minute);
                            data.put("Exp date", Expiration_d_a_t);
                            data.put("title","Expiry Time");
                            break;
                        case "4":
                            ai = aiAndData.substring(1,5);
                            Active_potency = aiAndData.substring(5);
                            data.put("ai", ai);
                            data.put("Active potency", Active_potency);
                            data.put("title", "Active Potency") ;
                            break;
                        case "5":
                            ai = aiAndData.substring(1,5);
                            Catch_area = aiAndData.substring(5);
                            data.put("ai", ai);
                            data.put("catch area", Catch_area);
                            data.put("title", "Catch Area");
                            break;
                        case "6":
                            ai = aiAndData.substring(1,5);
                            year = aiAndData.substring(5,7);
                            month = aiAndData.substring(7,9);
                            day = aiAndData.substring(9,11);
                            First_freeze_date = year + ":" + month + ":" + day;
                            data.put("ai", ai);
                            data.put("year", year);
                            data.put("month", month);
                            data.put("day", day);
                            data.put("first freeze date", First_freeze_date);
                            data.put("title", "First Freeze Date");    
                            break;
                        case "7":
                            ai = aiAndData.substring(1,5);
                            year = aiAndData.substring(5,7);
                            month = aiAndData.substring(7,9);
                            day = aiAndData.substring(9,11);
                            year_2 = aiAndData.substring(11,13);
                            month_2 = aiAndData.substring(13,15);
                            day_2 = aiAndData.substring(15,17);
                            Harvest_start_date = year + ":" + month + ":" + day;
                            Harvest_end_date = year_2 + ":" + month_2 + ":" + day_2;
                            data.put("ai", ai);
                            data.put("year", year);
                            data.put("month", month);
                            data.put("day", day);
                            data.put("End year", year_2);
                            data.put("End month", month_2);
                            data.put("End day", day_2);
                            data.put("Harvest start date", Harvest_start_date);
                            data.put("Harvest end date", Harvest_end_date);
                            data.put("title", "harvest date");                   
                            break;
                        case "8":
                            ai = aiAndData.substring(1,5);
                            Fishery_species = aiAndData.substring(5);
                            data.put("ai", ai);
                            data.put("species for fishery purposes code", Fishery_species);
                            data.put("title", "aquatic species");
                            break;
                        case "9":
                            ai = aiAndData.substring(1,5);
                            Fishing_gear_type = aiAndData.substring(5);
                            data.put("ai", ai);
                            data.put("fishing gear type", Fishing_gear_type);
                            data.put("title", "fishing gear type");
                            break;
                        default:
                            break;
                    }
}
                else if (thirdpos.equals("1")){
                    if (fourthpos.equals("0")){
                        ai = aiAndData.substring(1,5);
                        Production_method = aiAndData.substring(5);
                        data.put("ai", ai);
                        data.put("Production method", Production_method);
                        data.put("title", "Prod Method");
                    }             
                }
                else if (thirdpos.equals("2")){
                    if(fourthpos.equals("0")){
                        ai = aiAndData.substring(1,5);
                        Refurb_lot = aiAndData.substring(5);
                        data.put("ai", ai);
                        data.put("Refurb lot Id", Refurb_lot);
                        data.put("title", "Refurb Lot");
                    }
                    else if(fourthpos.equals("1")){
                        ai = aiAndData.substring(1,5);
                        Functional_status = aiAndData.substring(5);
                        data.put("ai", ai);
                        data.put("Functional status", Functional_status);
                        data.put("title", "Func Stat");                        
                    }
                    else if(fourthpos.equals("2")){
                        ai = aiAndData.substring(1,5);
                        Revision_status = aiAndData.substring(5);
                        data.put("ai", ai);
                        data.put("Revision status", Revision_status);
                        data.put("title", "Rev Stat");                        
                    }
                    else if(fourthpos.equals("3")){
                        ai = aiAndData.substring(1,5);
                        Prefix = aiAndData.substring(5,9);
                        Ind_asset_ref = aiAndData.substring(9);
                        GIAI = Prefix + Ind_asset_ref;
                        data.put("ai", ai);
                        data.put("Company Prefix", Prefix);
                        data.put("Individual asset reference", Ind_asset_ref);
                        data.put("GIAI", GIAI);
                        data.put("title", "GIAI-Assembly");                        
                    }     
            }
                else if (thirdpos.equals("3")){
                    //do 703s here
                }
            case"1":
                if(ai.equals("1")&&thirdpos.equals("0")){
                    ai = aiAndData.substring(1,4);
                    National_Healthcare_reimburse_num = aiAndData.substring(4);
                    Organisation = "Gernmany IFA";
                    data.put("ai", ai);
                    data.put("National Healthcare Reiumbursement Number", National_Healthcare_reimburse_num);
                    data.put("Organisation", Organisation);
                    data.put("title", "National Healthcare Reiumbursement");          
                }
                if(ai.equals("1")&&thirdpos.equals("1")){
                    ai = aiAndData.substring(1,4);
                    National_Healthcare_reimburse_num = aiAndData.substring(4);
                    Organisation = "France CIP";
                    data.put("ai", ai);
                    data.put("National Healthcare Reiumbursement Number", National_Healthcare_reimburse_num);
                    data.put("Organisation", Organisation);
                    data.put("title", "National Healthcare Reiumbursement");  
                }
                if(ai.equals("1")&&thirdpos.equals("2")){
                    ai = aiAndData.substring(1,4);
                    National_Healthcare_reimburse_num = aiAndData.substring(4);
                    Organisation = "Spain National Code";
                    data.put("ai", ai);
                    data.put("National Healthcare Reiumbursement Number", National_Healthcare_reimburse_num);
                    data.put("Organisation", Organisation);
                    data.put("title", "National Healthcare Reiumbursement"); 
                }
                if(ai.equals("1")&&thirdpos.equals("3")){
                    ai = aiAndData.substring(1,4);
                    National_Healthcare_reimburse_num = aiAndData.substring(4);
                    Organisation = "Brazil ANVISA";
                    data.put("ai", ai);
                    data.put("National Healthcare Reiumbursement Number", National_Healthcare_reimburse_num);
                    data.put("Organisation", Organisation);
                    data.put("title", "National Healthcare Reiumbursement"); 
                }
                if(ai.equals("1")&&thirdpos.equals("4")){
                    ai = aiAndData.substring(1,4);
                    National_Healthcare_reimburse_num = aiAndData.substring(4);
                    Organisation = "Porutgal Infarmed";
                    data.put("ai", ai);
                    data.put("National Healthcare Reiumbursement Number", National_Healthcare_reimburse_num);
                    data.put("Organisation", Organisation);
                    data.put("title", "National Healthcare Reiumbursement"); 
                }
            case"2":
                
                
}
}
}

package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.*;

public class Parse_Digit_3 extends Pattern_Parser {
    
    public Parse_Digit_3() {
        
        super();
        
        String ai = "";
        String element = "";
        String count = "";
        double value;
        
        matches = new ArrayList();
        patterns = new ArrayList<>();
    
        Pattern p30 = Pattern.compile("^30[0-9]{1,8}[%\\x1D]");         
        Pattern p30eol = Pattern.compile("^30[0-9]{1,8}$");             
        Pattern p310n = Pattern.compile("^310[0-9]{1}[0-9]{6}");              
        Pattern p311n = Pattern.compile("^311[0-9]{1}[0-9]{6}");              
        Pattern p312n = Pattern.compile("^312[0-9]{1}[0-9]{6}");              
        Pattern p313n = Pattern.compile("^313[0-9]{1}[0-9]{6}");              
        Pattern p314n = Pattern.compile("^314[0-9]{1}[0-9]{6}");              
        Pattern p315n = Pattern.compile("^315[0-9]{1}[0-9]{6}");              
        Pattern p316n = Pattern.compile("^316[0-9]{1}[0-9]{6}");              
        Pattern p320n = Pattern.compile("^320[0-9]{1}[0-9]{6}");              
        Pattern p321n = Pattern.compile("^321[0-9]{1}[0-9]{6}");              
        Pattern p322n = Pattern.compile("^322[0-9]{1}[0-9]{6}");              
        Pattern p323n = Pattern.compile("^323[0-9]{1}[0-9]{6}");              
        Pattern p324n = Pattern.compile("^324[0-9]{1}[0-9]{6}");              
        Pattern p325n = Pattern.compile("^325[0-9]{1}[0-9]{6}");              
        Pattern p326n = Pattern.compile("^326[0-9]{1}[0-9]{6}");              
        Pattern p327n = Pattern.compile("^327[0-9]{1}[0-9]{6}");              
        Pattern p328n = Pattern.compile("^328[0-9]{1}[0-9]{6}");              
        Pattern p329n = Pattern.compile("^329[0-9]{1}[0-9]{6}");              
        Pattern p330n = Pattern.compile("^330[0-9]{1}[0-9]{6}");              
        Pattern p331n = Pattern.compile("^331[0-9]{1}[0-9]{6}");               
        Pattern p332n = Pattern.compile("^332[0-9]{1}[0-9]{6}");               
        Pattern p333n = Pattern.compile("^333[0-9]{1}[0-9]{6}");               
        Pattern p334n = Pattern.compile("^334[0-9]{1}[0-9]{6}");               
        Pattern p335n = Pattern.compile("^335[0-9]{1}[0-9]{6}");               
        Pattern p336n = Pattern.compile("^336[0-9]{1}[0-9]{6}");               
        Pattern p337n = Pattern.compile("^337[0-9]{1}[0-9]{6}");               
        Pattern p340n = Pattern.compile("^340[0-9]{1}[0-9]{6}");               
        Pattern p341n = Pattern.compile("^341[0-9]{1}[0-9]{6}");               
        Pattern p342n = Pattern.compile("^342[0-9]{1}[0-9]{6}");               
        Pattern p343n = Pattern.compile("^343[0-9]{1}[0-9]{6}");               
        Pattern p344n = Pattern.compile("^344[0-9]{1}[0-9]{6}");               
        Pattern p345n = Pattern.compile("^345[0-9]{1}[0-9]{6}");               
        Pattern p346n = Pattern.compile("^346[0-9]{1}[0-9]{6}");               
        Pattern p347n = Pattern.compile("^347[0-9]{1}[0-9]{6}");               
        Pattern p348n = Pattern.compile("^348[0-9]{1}[0-9]{6}");               
        Pattern p349n = Pattern.compile("^349[0-9]{1}[0-9]{6}");               
        Pattern p350n = Pattern.compile("^350[0-9]{1}[0-9]{6}");               
        Pattern p351n = Pattern.compile("^351[0-9]{1}[0-9]{6}");               
        Pattern p352n = Pattern.compile("^352[0-9]{1}[0-9]{6}");               
        Pattern p353n = Pattern.compile("^353[0-9]{1}[0-9]{6}");               
        Pattern p354n = Pattern.compile("^354[0-9]{1}[0-9]{6}");               
        Pattern p355n = Pattern.compile("^355[0-9]{1}[0-9]{6}");              
        Pattern p356n = Pattern.compile("^356[0-9]{1}[0-9]{6}");              
        Pattern p357n = Pattern.compile("^357[0-9]{1}[0-9]{6}");              
        Pattern p360n = Pattern.compile("^360[0-9]{1}[0-9]{6}");              
        Pattern p361n = Pattern.compile("^361[0-9]{1}[0-9]{6}");              
        Pattern p362n = Pattern.compile("^362[0-9]{1}[0-9]{6}");              
        Pattern p363n = Pattern.compile("^363[0-9]{1}[0-9]{6}");              
        Pattern p364n = Pattern.compile("^364[0-9]{1}[0-9]{6}");              
        Pattern p365n = Pattern.compile("^365[0-9]{1}[0-9]{6}");              
        Pattern p366n = Pattern.compile("^366[0-9]{1}[0-9]{6}");              
        Pattern p367n = Pattern.compile("^367[0-9]{1}[0-9]{6}");              
        Pattern p368n = Pattern.compile("^368[0-9]{1}[0-9]{6}");              
        Pattern p369n = Pattern.compile("^369[0-9]{1}[0-9]{6}");              
        Pattern p37 = Pattern.compile("^37[0-9]{1,8}[%\\x1D]");          
        Pattern p37eol = Pattern.compile("^37[0-9]{1,8}$");              
        Pattern p390n = Pattern.compile("^390[0-9]{1}[0-9]{1,15}[%\\x1D]");      
        Pattern p390neol = Pattern.compile("^390[0-9]{1}[0-9]{1,15}$");          
        Pattern p391n = Pattern.compile("^390[0-9]{1}[0-9]{3}[0-9]{1,15}[%\\x1D]");
        Pattern p391neol = Pattern.compile("^390[0-9]{1}[0-9]{3}[0-9]{1,15}$"); 
        Pattern p392n = Pattern.compile("^392[0-9]{1}[0-9]{1,15}[%\\x1D]");      
        Pattern p392neol = Pattern.compile("^392[0-9]{1}[0-9]{1,15}$");          
        Pattern p393n = Pattern.compile("^393[0-9]{1}[0-9]{3}[0-9]{1,15}[%\\x1D]");
        Pattern p393neol = Pattern.compile("^393[0-9]{1}[0-9]{3}[0-9]{1,15}$");
        Pattern p394n = Pattern.compile("^394[0-9]{1}[0-9]{6}[%\\x1D]");        
        Pattern p394neol = Pattern.compile("^394[0-9]{1}[0-9]{4}$");
        
        patterns.add(p30);
        patterns.add(p30eol);
        patterns.add(p310n);
        patterns.add(p311n);
        patterns.add(p312n);
        patterns.add(p313n);
        patterns.add(p314n);
        patterns.add(p315n);
        patterns.add(p316n);
        patterns.add(p320n);
        patterns.add(p321n);
        patterns.add(p322n);
        patterns.add(p323n);
        patterns.add(p324n);
        patterns.add(p325n);
        patterns.add(p326n);
        patterns.add(p327n);
        patterns.add(p328n);
        patterns.add(p329n);
        patterns.add(p330n);
        patterns.add(p331n);
        patterns.add(p332n);
        patterns.add(p333n);
        patterns.add(p334n);
        patterns.add(p335n);
        patterns.add(p336n);
        patterns.add(p337n);
        patterns.add(p340n);
        patterns.add(p341n);
        patterns.add(p342n);
        patterns.add(p343n);
        patterns.add(p344n);
        patterns.add(p345n);
        patterns.add(p346n);
        patterns.add(p347n);
        patterns.add(p348n);
        patterns.add(p349n);
        patterns.add(p350n);
        patterns.add(p351n);
        patterns.add(p352n);
        patterns.add(p352n);
        patterns.add(p353n);
        patterns.add(p354n);
        patterns.add(p355n);
        patterns.add(p356n);
        patterns.add(p357n);
        patterns.add(p360n);
        patterns.add(p361n);
        patterns.add(p362n);
        patterns.add(p363n);
        patterns.add(p364n);
        patterns.add(p365n);
        patterns.add(p366n);
        patterns.add(p367n);
        patterns.add(p368n);
        patterns.add(p369n);
        patterns.add(p37);
        patterns.add(p37eol);
        patterns.add(p390n);
        patterns.add(p390neol);
        patterns.add(p391n);
        patterns.add(p391neol);
        patterns.add(p392n);
        patterns.add(p392neol);
        patterns.add(p393n);
        patterns.add(p393neol);
        patterns.add(p394n);
        patterns.add(p394neol);
        
        data = new LinkedHashMap<>();
        String aiAndData = parsePattern(patterns).group().replace("%", "");
        
        switch (aiAndData.substring(1, 2)) {
            case "0":
                ai = aiAndData.substring(0, 2);
                count = aiAndData.substring(2);
                data.put("var_count", count);
                data.put("title", "VAR. COUNT");
                break;
            case "1":
                ai = aiAndData.substring(0, 4);
                switch (ai.substring(2, 3)) {
                    case "0":
                        data.put("title", "NET WEIGHT (kg)");
                        break;
                    case "1":
                        data.put("title", "LENGTH (m)");
                        break;
                    case "2":
                        data.put("title", "WIDTH (m)");
                        break;
                    case "3":
                        data.put("title", "HEIGHT (m)");
                        break;
                    case "4":
                        data.put("title", "AREA (m\u00B2)");
                        break;
                    case "5":
                        data.put("title", "NET VOLUME (l)");
                        break;   
                    case "6":
                        data.put("title", "NET VOLUME (m\u00B3)");
                        break;
                }
                
                data.put("value", getDecimalDouble(ai, aiAndData.substring(4)));
                break;
            case "2":
                ai = aiAndData.substring(0, 4);
                switch (ai.substring(2, 3)) {
                    case "0":
                        data.put("title", "NET WEIGHT (lb)");
                        break;
                    case "1":
                        data.put("title", "LENGTH (i)");
                        break;
                    case "2":
                        data.put("title", "LENGTH (f)");
                        break;
                    case "3":
                        data.put("title", "LENGTH (y)");
                        break;
                    case "4":
                        data.put("title", "WIDTH (i)");
                        break;
                    case "5":
                        data.put("title", "WIDTH (f)");
                        break;
                    case "6":
                        data.put("title", "WIDTH (y)");
                        break;
                    case "7":
                        data.put("title", "HEIGHT (i)");
                        break;
                    case "8":
                        data.put("title", "HEIGHT (f)");
                        break;
                    case "9":
                        data.put("title", "HEIGHT (y)");
                        break;
                }
                
                data.put("value", getDecimalDouble(ai, aiAndData.substring(4)));
                break;
            case "3":
                ai = aiAndData.substring(0, 4);
                switch (ai.substring(2, 3)) {
                    case "0":
                        data.put("title", "GROSS WEIGHT (kg)");
                        break;
                    case "1":
                        data.put("title", "LENGTH (m), log");
                        break;
                    case "2":
                        data.put("title", "WIDTH (m), log");
                        break;
                    case "3":
                        data.put("title", "HEIGHT (m), log");
                        break;
                    case "4":
                        data.put("title", "AREA (m\u00B2), log");
                        break;
                    case "5":
                        data.put("title", "VOLUME (l), log");
                        break;
                    case "6":
                        data.put("title", "VOLUME (m\u00B3), log");
                        break;
                    case "7":
                        data.put("title", "KG PER m\u00B2");
                        break;
                }
                
                data.put("value", getDecimalDouble(ai, aiAndData.substring(4)));
                break;
            case "4":
                ai = aiAndData.substring(0, 4);
                switch (ai.substring(2, 3)) {
                    case "0":
                        data.put("title", "GROSS WEIGHT (lb)");
                        break;
                    case "1":
                        data.put("title", "LENGTH (i), log");
                        break;
                    case "2":
                        data.put("title", "LENGTH (f), log");
                        break;
                    case "3":
                        data.put("title", "LENGTH (y), log");
                        break;
                    case "4":
                        data.put("title", "WIDTH (i), log");
                        break;
                    case "5":
                        data.put("title", "WIDTH (f), log");
                        break;
                    case "6":
                        data.put("title", "WIDTH (y), log");
                        break;
                    case "7":
                        data.put("title", "HEIGHT (i), log");
                        break;
                    case "8":
                        data.put("title", "HEIGHT (f), log");
                        break;
                    case "9":
                        data.put("title", "HEIGHT (y), log");
                        break;
                }
                
                data.put("value", getDecimalDouble(ai, aiAndData.substring(4)));
                break;
            case "5":
                ai = aiAndData.substring(0, 4);
                switch (ai.substring(2, 3)) {
                    case "0":
                        data.put("title", "AREA (i\u00B2)");
                        break;
                    case "1":
                        data.put("title", "AREA (f\u00B2)");
                        break;
                    case "2":
                        data.put("title", "AREA (y\u00B2)");
                        break;
                    case "3":
                        data.put("title", "AREA (i\u00B2), log");
                        break;
                    case "4":
                        data.put("title", "AREA (f\u00B2), log");
                        break;
                    case "5":
                        data.put("title", "AREA (y\u00B2), log");
                        break;
                    case "6":
                        data.put("title", "NET WEIGHT (t)");
                        break;
                    case "7":
                        data.put("title", "NET VOLUME (oz)");
                        break;
                }
                
                data.put("value", getDecimalDouble(ai, aiAndData.substring(4)));
                break;
            case "6":
                ai = aiAndData.substring(0, 4);
                data.put("value", aiAndData.substring(4, 8));
                switch (ai.substring(2, 3)) {
                    case "0":
                        data.put("title", "NET VOLUME (q)");
                        break;
                    case "1":
                        data.put("title", "NET VOLUME (g)");
                        break;
                    case "2":
                        data.put("title", "VOLUME (q), log");
                        break;
                    case "3":
                        data.put("title", "VOLUME (g), log");
                        break;
                    case "4":
                        data.put("title", "VOLUME (i\u00B3)");
                        break;
                    case "5":
                        data.put("title", "VOLUME (f\u00B3)");
                        break;
                    case "6":
                        data.put("title", "VOLUME (y\u00B3)");
                        break;
                    case "7":
                        data.put("title", "VOLUME (i\u00B3), log");
                        break;
                    case "8":
                        data.put("title", "VOLUME (f\u00B3), log");
                        break;
                    case "9":
                        data.put("title", "VOLUME (y\u00B3), log");
                        break;
                }
                
                data.put("value", getDecimalDouble(ai, aiAndData.substring(4)));
                break;
            case "7":
                ai = aiAndData.substring(0, 2);
                count = aiAndData.substring(2);
                data.put("count", count);
                data.put("title", "COUNT");
                break;
            case "9":
                ai = aiAndData.substring(0, 4);
                switch (ai.substring(2, 3)) {
                    case "0":
                        data.put("title", "AMOUNT");
                        data.put("value", getDecimalDouble(ai, aiAndData.substring(4)));
                        break;
                    case "1":
                        data.put("title", "AMOUNT");
                        data.put("iso_code", aiAndData.substring(4, 7));
                        data.put("amount_payable", getDecimalDouble(ai, aiAndData.substring(7)));
                        break;
                    case "2":
                        data.put("title", "PRICE");
                        data.put("amount_payable", getDecimalDouble(ai, aiAndData.substring(4)));
                        break;
                    case "3":
                        data.put("title", "PRICE");
                        data.put("iso_code", aiAndData.substring(4, 7));
                        data.put("amount_payable", getDecimalDouble(ai, aiAndData.substring(7)));
                        break;
                    case "4":
                        data.put("title", "PRCNT OFF");
                        data.put("discount_prcnt", getDecimalDouble(ai, aiAndData.substring(4)) + "%");
                        break;
                }
                
                break;
            default:
                break;
        }
        data.put("ai", ai);
        data.put("element", aiAndData);
        fields.add(data);
    }
}

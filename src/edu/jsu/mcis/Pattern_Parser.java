package edu.jsu.mcis;

import java.math.BigDecimal;
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
            throw new Exception("Invalid Code!");
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
        boolean valid010, exists010, valid019_1, valid019_2, exists019, 
                valid02_1, valid02_2, exists02, valid029, exists029, valid10_1, 
                valid10_2, valid10_3, valid10_4, exists10, valid11_1, valid11_2,
                valid11_3, valid11_4, exists11, valid12_1, valid12_2, exists12, 
                valid17, exists17, valid20_1, valid20_2, valid20_3, valid20_4,
                exists20, valid21_1, valid21_2, exists21, valid22, exists22,
                valid240_1, valid240_2, valid240_3, valid240_4, exists240, 
                valid241_1, valid241_2, valid241_3, valid241_4, exists241, 
                valid242_1, valid242_2, valid242_3, valid242_4, exists242,
                valid243, exists243, valid250_1, valid250_2, valid250_3, 
                exists250, valid251_1, valid251_2, exists251, valid254, 
                exists254, valid30_1, valid30_2, exists30, valid31_1, valid31_2,
                exists31, valid33, exists33, valid337, exists337, valid37_1,
                valid37_2, valid37_3, exists37, valid390_1, valid390_2, 
                valid390_3, exists390, valid391_1, valid391_2, exists391,
                valid392_1, valid392_2, valid392_3, exists392, valid393_1, 
                valid393_2, valid393_3, exists393, valid394, exists394,
                valid403, exists403, valid415, exists415, valid422_1, 
                valid422_2, valid422_3, valid422_4, exists422, valid423_1,
                valid423_2, exists423, valid424_1, valid424_2, exists424, 
                valid425_1, valid425_2, exists425, valid426_1, valid426_2, 
                exists426, valid427_1, valid427_2, valid427_3, exists427,
                valid7001_1, valid7001_2, valid7001_3, valid7001_4, exists7001, 
                valid7002_1, valid7002_2, exists7002, valid7003_1, valid7003_2,
                exists7003, valid7004_1, valid7004_2, exists7004, valid7005_1, 
                valid7005_2, exists7005, valid7006_1, valid7006_2, exists7006, 
                valid7007_1, valid7007_2, exists7007, valid7008_1, valid7008_2, 
                exists7008, valid7009_1, valid7009_2, exists7009, valid7010_1, 
                valid7010_2, exists7010, valid703_1, valid703_2, exists703, 
                valid710, exists710, valid7020_1, valid7020_2, valid7020_3,
                exists7020, valid7021_1, valid7021_2, exists7021, valid7022_1, 
                valid7022_2, valid7022_3, exists7022, valid723_1, valid723_2,
                exists723, exists8001, valid8001_1, exists8005, valid8005_1,
                valid8005_2, exists8007, valid8007_1, valid8007_2, exists8008,
                valid8008_1, valid8008_2, exists8009, valid8009_1, valid8009_2,
                exists8011, valid8011_1, exists8012, valid8012_1, valid8012_2,
                exists8019, valid8019_1, valid8019_2, exists8020, valid8020_1,
                exists8026, valid8026_1, valid8026_2, exists8111, valid8111_1,
                exists8200, valid8200_1;
        valid010 = exists010 = valid019_1 = valid019_2 = exists019 = 
                valid02_1 = valid02_2 = exists02 = valid029 = exists029 = 
                valid10_1 = valid10_2 = valid10_3 = valid10_4 = exists10 = 
                valid11_1 = valid11_2 = valid11_3 = valid11_4 = exists11 = 
                valid12_1 = valid12_2 = exists12 = valid17 = exists17 = 
                valid20_1 = valid20_2 = valid20_3 = valid20_4 = exists20 = 
                valid21_1 = valid21_2 = exists21 = valid22 = exists22 = 
                valid240_1 = valid240_2 = valid240_3 = valid240_4 = exists240 =
                valid241_1 = valid241_2 = valid241_3 = valid241_4 = exists241 =
                valid242_1 = valid242_2 = valid242_3 = valid242_4 = exists242 = 
                valid243 = exists243 = valid250_1 = valid250_2 = valid250_3 =
                exists250 = valid251_1 = valid251_2 = exists251 = valid254 = 
                exists254 = valid30_1 = valid30_2 = exists30 = valid31_1 = 
                valid31_2 = exists31 = valid33 = exists33 = valid337 =
                exists337 = valid37_1 = valid37_2 = valid37_3 = exists37 = 
                valid390_1 = valid390_2 = valid390_3 = exists390 = valid391_1 =
                valid391_2 = exists391 = valid392_1 = valid392_2 = valid392_3 =
                exists392 = valid393_1 = valid393_2 = valid393_3 = exists393 =
                valid394 = exists394 = valid403 = exists403 = valid415 = 
                exists415 = valid422_1 = valid422_2 = valid422_3 = valid422_4 = 
                exists422 = valid423_1 = valid423_2 = exists423 = valid424_1 =
                valid424_2 = exists424 = valid425_1 = valid425_2 = exists425 =
                valid426_1 = valid426_2 = exists426 = valid427_1 = valid427_2 =
                valid427_3 = exists427 = valid7001_1 = valid7001_2 = 
                valid7001_3 = valid7001_4 = exists7001 = valid7002_1 =
                valid7002_2 = exists7002 = valid7003_1 = valid7003_2 = 
                exists7003 = valid7004_1 = valid7004_2 = exists7004 =
                valid7005_1 = valid7005_2 = exists7005 = valid7006_1 = 
                valid7006_2 = exists7006 = valid7007_1 = valid7007_2 = 
                exists7007 = valid7008_1 = valid7008_2 = exists7008 =
                valid7009_1 = valid7009_2 = exists7009 = valid7010_1 = 
                valid7010_2 = exists7010 = valid703_1 = valid703_2 = exists703 = 
                valid710 = exists710 = valid7020_1 = valid7020_2 = valid7020_3 =
                exists7020 = valid7021_1 = valid7021_2 = exists7021 = 
                valid7022_1 = valid7022_2 = valid7022_3 = exists7022 = 
                valid723_1 = valid723_2 = exists723 = exists8001 = valid8001_1 =
                exists8005 = valid8005_1 = valid8005_2 = exists8007 = 
                valid8007_1 = valid8007_2 = exists8008 = valid8008_1 = 
                valid8008_2 = exists8009 = valid8009_1 = valid8009_2 = 
                exists8011 = valid8011_1 = exists8012 = valid8012_1 = 
                valid8012_2 = exists8019 = valid8019_1 = valid8019_2 = 
                exists8020 = valid8020_1 = exists8026 = valid8026_1 = 
                valid8026_2 = exists8111 = valid8111_1 = exists8200 = 
                valid8200_1 = false; 
        
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
                    if (code2.startsWith("01")) {
                        valid10_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid10_2 = true;
                    } else if (code2.startsWith("8006")) {
                        valid10_3 = true;
                    } else if (code2.startsWith("8026")) {
                        valid10_4 = true;
                    }
                    
                }
                
                if (code1.startsWith("11") || code1.startsWith("13") || code1.startsWith("15") || code1.startsWith("16") || code1.startsWith("17")) {
                    exists11 = true;
                    if (code2.startsWith("01")) {
                        valid11_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid11_2 = true;
                    } else if (code2.startsWith("8006")) {
                        valid11_3 = true;
                    } else if (code2.startsWith("8026")) {
                        valid11_4 = true;
                    }
                }
                
                if (code1.startsWith("12")) {
                    exists12 = true;
                    if (code2.startsWith("8020")) {
                        valid12_1 = true;
                    } else if (code2.startsWith("415")) {
                        valid12_2 = true;
                    }
                    
                }
                
                if (code1.startsWith("17")) {
                    exists17 = true;
                    if (code2.startsWith("255")) {
                        valid17 = true;
                    }
                }
                
                if (code1.startsWith("20")) {
                    exists20 = true;
                    if (code2.startsWith("01")) {
                        valid20_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid20_2 = true;
                    } else if (code2.startsWith("8006")) {
                        valid20_3 = true;
                    } else if (code2.startsWith("8026")) {
                        valid20_4 = true;
                    }
                }
                
                if (code1.startsWith("21")) {
                    exists21 = true;
                    if (code2.startsWith("01")) {
                        valid21_1 = true;
                    } else if (code2.startsWith("8006")) {
                        valid21_2 = true;
                    }
                }
                
                if (code1.startsWith("22")) {
                    exists22 = true;
                    if (code2.startsWith("01")) {
                        valid22 = true;
                    }
                }
                
                if (code1.startsWith("240")) {
                    exists240 = true;
                    if (code2.startsWith("01")) {
                        valid240_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid240_2 = true;
                    } else if (code2.startsWith("8006")) {
                        valid240_3 = true;
                    } else if (code2.startsWith("8026")) {
                        valid240_4 = true;
                    }
                }
                
                if (code1.startsWith("241")) {
                    exists241 = true;
                    if (code2.startsWith("01")) {
                        valid241_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid241_2 = true;
                    } else if (code2.startsWith("8006")) {
                        valid241_3 = true;
                    } else if (code2.startsWith("8026")) {
                        valid241_4 = true;
                    }                    
                }
                
                if (code1.startsWith("242")) {
                    exists242 = true;
                    if (code2.startsWith("019")) {
                        valid242_1 = true;
                    } else if (code2.startsWith("029")) {
                        valid242_2 = true;
                    } else if (code2.startsWith("80069")) {
                        valid242_3 = true;
                    } else if (code2.startsWith("80269")) {
                        valid242_4 = true;
                    }
                }
                
                if (code1.startsWith("243")) {
                    exists243 = true;
                    if (code2.startsWith("01")) {
                        valid243 = true;
                    }
                }
                
                if (code1.startsWith("250")) {
                    exists250 = true;
                    if (code2.startsWith("01")) {
                        valid250_1 = true;
                    } else if (code2.startsWith("8006")) {
                        valid250_2 = true;
                    } else if (code2.startsWith("21")) {
                        valid250_3 = true;
                    }
                }
                
                if (code1.startsWith("251")) {
                    exists251 = true;
                    if (code2.startsWith("01")) {
                        valid251_1 = true;
                    } else if (code2.startsWith("8006")) {
                        valid251_2 = true;
                    }
                }
                
                if (code1.startsWith("254")) {
                    exists254 = true;
                    if (code2.startsWith("414")) {
                        valid254 = true;
                    }
                }
                
                if (code1.startsWith("30")) {
                    exists30 = true;
                    if (code2.startsWith("01")) {
                        valid30_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid30_2 = true;
                    }
                }
                
                if (code1.startsWith("31") || code1.startsWith("32") || code1.startsWith("35") || code1.startsWith("36")) {
                    exists31 = true;
                    if (code2.startsWith("01")) {
                        valid31_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid31_2 = true;
                    }
                }
                
                if (code1.startsWith("33") || code1.startsWith("34") || code1.startsWith("35") || code1.startsWith("36")) {
                    exists33 = true;
                    if (code2.startsWith("01") || code2.startsWith("02")) {
                        valid33 = true;
                    }
                }
                
                if (code1.startsWith("337")) {
                    exists337 = true;
                    if (code2.startsWith("01")) {
                        valid337 = true;
                    }
                }
                
                if (code1.startsWith("37")) {
                    exists37 = true;
                    if (code2.startsWith("00")) {
                        valid37_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid37_2 = true;
                    } else if (code1.startsWith("8026")) {
                        valid37_3 = true;
                    }
                }
                
                if (code1.startsWith("390")) {
                    exists390 = true;
                    if (code2.startsWith("8020")) {
                        valid390_1 = true;
                    } else if (code2.startsWith("415")) {
                        valid390_2 = true;
                    } else if (code2.startsWith("255")) {
                        valid390_3 = true;
                    }
                }
                
                if (code1.startsWith("391")) {
                    exists391 = true;
                    if (code2.startsWith("8020")) {
                        valid391_1 = true;
                    } else if (code2.startsWith("415")) {
                        valid391_2 = true;
                    }
                }
                
                if (code1.startsWith("392")) {
                    exists392 = true;
                    if (code2.startsWith("01")) {
                        valid392_1 = true;
                    } else if (code2.startsWith("30")) {
                        valid392_2 = true;
                    } else if (code2.startsWith("31") || code1.startsWith("32") || code1.startsWith("35") || code1.startsWith("36")) {
                        valid392_3 = true;
                    }
                }
                
                if (code1.startsWith("393")) {
                    exists393 = true;
                    if (code2.startsWith("01")) {
                        valid393_1 = true;
                    } else if (code2.startsWith("30")) {
                        valid393_2 = true;
                    } else if (code2.startsWith("31") || code1.startsWith("32") || code1.startsWith("35") || code1.startsWith("36")) {
                        valid393_3 = true;
                    }
                }
                
                if (code1.startsWith("394")) {
                    exists394 = true;
                    if (code2.startsWith("255")) {
                        valid394 = true;
                    }
                }
                
                if (code1.startsWith("403")) {
                    exists403 = true;
                    if (code2.startsWith("00")) {
                        valid403 = true;
                    }
                }
                
                if (code1.startsWith("415")) {
                    exists415 = true;
                    if (code2.startsWith("8020")) {
                        valid415 = true;
                    }
                }
                
                if (code1.startsWith("422")) {
                    exists422 = true;
                    if (code2.startsWith("01")) {
                        valid422_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid422_2 = true;
                    } else if (code2.startsWith("8006")) {
                        valid422_3 = true;
                    } else if (code2.startsWith("8026")) {
                        valid422_4 = true;
                    }                    
                }
                
                if (code1.startsWith("423")) {
                    exists423 = true;
                    if (code2.startsWith("01")) {
                        valid423_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid423_2 = true;
                    }
                }
                
                if (code1.startsWith("424")) {
                    exists424 = true;
                    if (code2.startsWith("01")) {
                        valid424_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid424_2 = true;
                    }
                }
                
                if (code1.startsWith("425")) {
                    exists425 = true;
                    if (code2.startsWith("01")) {
                        valid425_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid425_2 = true;
                    }
                }
                
                if (code1.startsWith("426")) {
                    exists426 = true;
                    if (code2.startsWith("01")) {
                        valid426_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid426_2 = true;
                    }
                }
                
                if (code1.startsWith("427")) {
                    exists427 = true;
                    if (code2.startsWith("01")) {
                        valid427_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid427_2 = true;
                    } else if (code2.startsWith("422")) {
                        valid427_3 = true;
                    }
                }
                
                if (code1.startsWith("7001")) {
                    exists7001 = true;
                    if (code2.startsWith("01")) {
                        valid7001_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7001_2 = true;
                    } else if (code2.startsWith("8006")) {
                        valid7001_3 = true;
                    } else if (code2.startsWith("8026")) {
                        valid7001_4 = true;
                    }                    
                }
                
                if (code1.startsWith("7002")) {
                    exists7002 = true;
                    if (code2.startsWith("01")) {
                        valid7002_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7002_2 = true;
                    }
                }
                
                if (code1.startsWith("7003")) {
                    exists7003 = true;
                    if (code2.startsWith("01")) {
                        valid7003_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7003_2 = true;
                    }
                }
                
                if (code1.startsWith("7004")) {
                    exists7004 = true;
                    if (code2.startsWith("10")) {
                        valid7004_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7004_2 = true;
                    }
                }
                
                if (code1.startsWith("7005")) {
                    exists7005 = true;
                    if (code2.startsWith("01")) {
                        valid7005_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7005_2 = true;
                    }
                }
                
                if (code1.startsWith("7006")) {
                    exists7006 = true;
                    if (code2.startsWith("01")) {
                        valid7006_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7006_2 = true;
                    }
                }
                
                if (code1.startsWith("7007")) {
                    exists7007 = true;
                    if (code2.startsWith("01")) {
                        valid7007_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7007_2 = true;
                    }
                }
                
                if (code1.startsWith("7008")) {
                    exists7008 = true;
                    if (code2.startsWith("01")) {
                        valid7008_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7008_2 = true;
                    }
                }
                
                if (code1.startsWith("7009")) {
                    exists7009 = true;
                    if (code2.startsWith("01")) {
                        valid7009_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7009_2 = true;
                    }
                }
                
                if (code1.startsWith("7010")) {
                    exists7010 = true;
                    if (code2.startsWith("01")) {
                        valid7010_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid7010_2 = true;
                    }
                }
                
                if (code1.startsWith("703")) {
                    exists703 = true;
                    if (code2.startsWith("01")) {
                        valid703_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid703_2 = true;
                    }
                }
                
                if (code1.startsWith("710") || code1.startsWith("711") || code1.startsWith("712") || code1.startsWith("713") || code1.startsWith("714")) {
                    exists710 = true;
                    if (code2.startsWith("01")) {
                        valid710 = true;
                    }
                }
                
                if (code1.startsWith("7020")) {
                    exists7020 = true;
                    if (code2.startsWith("01")) {
                        valid7020_1 = true;
                    } else if (code2.startsWith("8006")) {
                        valid7020_2 = true;
                    } else if (code2.startsWith("416")) {
                        valid7020_3 = true;
                    }
                }
                
                if (code1.startsWith("7021")) {
                    exists7021 = true;
                    if (code2.startsWith("01")) {
                        valid7021_1 = true;
                    } else if (code2.startsWith("8006")) {
                        valid7021_2 = true;
                    }
                }
                
                if (code1.startsWith("7022")) {
                    exists7022 = true;
                    if (code2.startsWith("01")) {
                        valid7022_1 = true;
                    } else if (code2.startsWith("8006")) {
                        valid7022_2 = true;
                    } else if (code2.startsWith("7021")) {
                        valid7022_3 = true;
                    }
                }
                
                if (code1.startsWith("723")) {
                    exists723 = true;
                    if (code2.startsWith("01")) {
                        valid723_1 = true;
                    } else if (code2.startsWith("8004")) {
                        valid723_2 = true;
                    }
                }
                
                if (code1.startsWith("8001")) {
                    exists8001 = true;
                    if (code2.startsWith("01")) {
                        valid8001_1 = true;
                    }
                }
                
                if (code1.startsWith("8005")) {
                    exists8005 = true;
                    if (code2.startsWith("01")) {
                        valid8005_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid8005_2 = true;
                    }
                }
                
                if (code1.startsWith("8007")) {
                    exists8007 = true;
                    if (code2.startsWith("8020")) {
                        valid8007_1 = true;
                    } else if (code2.startsWith("415")) {
                        valid8007_2 = true;
                    }
                }
                
                if (code1.startsWith("8008")) {
                    exists8008 = true;
                    if (code2.startsWith("01")) {
                        valid8008_1 = true;
                    } else if (code2.startsWith("02")) {
                        valid8008_2 = true;
                    }
                }
                
                if (code1.startsWith("8009")) {
                    exists8009 = true;
                    if (code2.startsWith("01")) {
                        valid8009_1 = true;
                    } else if (code2.startsWith("00")) {
                        valid8009_2 = true;
                    }
                }
                
                if (code1.startsWith("8011")) {
                    exists8011 = true;
                    if (code2.startsWith("8010")) {
                        valid8011_1 = true;
                    }
                }
                
                if (code1.startsWith("8012")) {
                    exists8012 = true;
                    if (code2.startsWith("01")) {
                        valid8012_1 = true;
                    } else if (code2.startsWith("8006")) {
                        valid8012_2 = true;
                    }
                }
                
                if (code1.startsWith("8019")) {
                    exists8019 = true;
                    if (code2.startsWith("8017")) {
                        valid8019_1 = true;
                    } else if (code2.startsWith("8018")) {
                        valid8019_2 = true;
                    }
                }
                
                if (code1.startsWith("8020")) {
                    exists8020 = true;
                    if (code2.startsWith("415")) {
                        valid8020_1 = true;
                    }
                }
                
                if (code1.startsWith("8026")) {
                    exists8026 = true;
                    if (code2.startsWith("00")) {
                        valid8026_1 = true;
                    } else if (code2.startsWith("37")) {
                        valid8026_2 = true;
                    }
                }
                
                if (code1.startsWith("8111")) {
                    exists8111 = true;
                    if (code2.startsWith("255")) {
                        valid8111_1 = true;
                    }
                }
                
                if (code1.startsWith("8200")) {
                    exists8200 = true;
                    if (code2.startsWith("01")) {
                        valid8200_1 = true;
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
            
            if (exists10 && !(valid10_1 ^ valid10_2 ^ valid10_3 ^ valid10_4)) {
                return false;
            }
            
            if (exists11 && !(valid11_1 ^ valid11_2 ^ valid11_3 ^ valid11_4)) {
                return false;
            }
            
            if (exists12 && !(valid12_1 && valid12_2)) {
                return false;
            }
            
            if (exists17 && !valid17) {
                return false;
            }
            
            if (exists20 && !(valid20_1 ^ valid20_2 ^ valid20_3 ^ valid20_4)) {
                return false;
            }
            
            if (exists21 && !(valid21_1 ^ valid21_2)) {
                return false;
            }
            
            if (exists22 && !valid22) {
                return false;
            }
            
            if (exists240 && !(valid240_1 ^ valid240_2 ^ valid240_3 ^ valid240_4)) {
                return false;
            }
            
            if (exists241 && !(valid241_1 ^ valid241_2 ^ valid241_3 ^ valid241_4)) {
                return false;
            }
            
            if (exists242 && !(valid242_1 ^ valid242_2 ^ valid242_3 ^ valid242_4)) {
                return false;
            }
            
            if (exists243 && !valid243) {
                return false;
            }
            
            if (exists250 && !((valid250_1 ^ valid250_2) && valid250_3)) {
                return false;
            }
            
            if (exists251 && !(valid251_1 ^ valid251_2)) {
                return false;
            }
            
            if (exists254 && !valid254) {
                return false;
            }
            
            if (exists30 && !(valid30_1 ^ valid30_2)) {
                return false;
            }
            
            if (exists31 && !(valid31_1 ^ valid31_2)) {
                return false;
            }
            
            if (exists33 && !valid33) {
                return false;
            }
            
            if (exists337 && !valid337) {
                return false;
            }
            
            if (exists37 && !(valid37_1 && (valid37_2 ^ valid37_3))) {
                return false;
            }
            
            if (exists390 && !(valid390_1 && valid390_2 && valid390_3)) {
                return false;
            }
            
            if (exists391 && !(valid391_1 && valid391_2)) {
                return false;
            }
            
            if (exists392 && !(valid392_1 && (valid392_2 ^ valid392_3))) {
                return false;
            }
            
            if (exists393 && !(valid393_1 && (valid393_2 ^ valid393_3))) {
                return false;
            }
            
            if (exists394 && !valid394) {
                return false;
            }
            
            if (exists403 && !valid403) {
                return false;
            }
            
            if (exists415 && !valid415) {
                return false;
            }
            
            if (exists422 && !(valid422_1 ^ valid422_2 ^ valid422_3 ^ valid422_4)) {
                return false;
            }
            
            if (exists423 && !(valid423_1 ^ valid423_2)) {
                return false;
            }
            
            if (exists424 && !(valid424_1 ^ valid424_2)) {
                return false;
            }
            
            if (exists425 && !(valid425_1 ^ valid425_2)) {
                return false;
            }
            
            if (exists426 && !(valid426_1 ^ valid426_2)) {
                return false;
            }
            
            if (exists427 && !((valid427_1 ^ valid427_2) && valid427_3)) {
                return false;
            }
            
            if (exists7001 && !(valid7001_1 ^ valid7001_2 ^ valid7001_3 ^ valid7001_4)) {
                return false;
            }
            
            if (exists7002 && !(valid7002_1 ^ valid7002_2)) {
                return false;
            }
            
            if (exists7003 && !(valid7003_1 && valid7003_2)) {
                return false;
            }
            
            if (exists7004 && !(valid7004_1 ^ valid7004_2)) {
                return false;
            }
            
            if (exists7005 && !(valid7005_1 ^ valid7005_2)) {
                return false;
            }
            
            if (exists7006 && !(valid7006_1 ^ valid7006_2)) {
                return false;
            }
            
            if (exists7007 && !(valid7007_1 ^ valid7007_2)) {
                return false;
            }
            
            if (exists7008 && !(valid7008_1 ^ valid7008_2)) {
                return false;
            }
            
            if (exists7009 && !(valid7009_1 ^ valid7009_2)) {
                return false;
            }
            
            if (exists7010 && !(valid7010_1 ^ valid7010_2)) {
                return false;
            }
            
            if (exists703 && !(valid703_1 ^ valid703_2)) {
                return false;
            }
            
            if (exists710 && !valid710) {
                return false;
            }
            
            if (exists7020 && !((valid7020_1 ^ valid7020_2) && valid7020_3)) {
                return false;
            }
            
            if (exists7021 && !(valid7021_1 ^ valid7021_2)) {
                return false;
            }
            
            if (exists7022 && !((valid7022_1 ^ valid7022_2) && valid7022_3)) {
                return false;
            }
            
            if (exists723 && !(valid723_1 ^ valid723_2)) {
                return false;
            }
            
            if (exists8001 && !(valid8001_1)) {
                return false;
            }
            
            if (exists8005 && !(valid8005_1 ^ valid8005_2)) {
                return false;
            }
            
            if (exists8007 && !(valid8007_1 && valid8007_2)){
                return false;
            }
            
            if (exists8008 && !(valid8008_1 ^ valid8008_2)){
                return false;
            }
            
            if (exists8009 && !(valid8009_1 || valid8009_2)){
                return false;
            }
            
            if (exists8011 && !(valid8011_1)) {
                return false;
            }
            
            if (exists8012 && !(valid8012_1 ^ valid8012_2)) {
                return false;
            }
            
            if (exists8019 && !(valid8019_1 ^ valid8019_2)){
                return false;
            }
            
            if (exists8020 && !(valid8020_1)){
                return false;
            }
            
            if (exists8026 && !(valid8026_1 && valid8026_2)){
                return false;
            }
            
            if (exists8111 && !(valid8111_1)){
                return false;
            }
            
            if (exists8200 && !(valid8200_1)){
                return false;
            }
        } //End of second for-loop
        
        return true;
    }
} /*Needs a return*/    
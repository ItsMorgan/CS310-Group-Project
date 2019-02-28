package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_7 extends Pattern_Parser {
    
    ArrayList<Matcher> matches = new ArrayList();
    
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
}

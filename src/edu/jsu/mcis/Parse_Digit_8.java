package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_8 extends Pattern_Parser {
    
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
}

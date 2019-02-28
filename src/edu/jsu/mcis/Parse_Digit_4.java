package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_4 extends Pattern_Parser {
    
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
}

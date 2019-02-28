package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_2 extends Pattern_Parser {
    
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
}


package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_9 extends Pattern_Parser {
    
    ArrayList<Matcher> matches = new ArrayList();
    
    Pattern p90 = Pattern.compile("^90(.){1,30}[%\\x1D]");
    Pattern p90eol = Pattern.compile("^90(.){1,30}$");        
    Pattern p9N = Pattern.compile("^9[1-9]{1}(.){1,90}[%\\x1D]");
    Pattern p9Neol = Pattern.compile("^9[1-9]{1}(.){1,90}$");
}

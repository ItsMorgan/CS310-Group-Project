
package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_0 extends Pattern_Parser {

    ArrayList<Matcher> matches = new ArrayList();
    
    Pattern p00 = Pattern.compile("^00[0-9]{18}");         
    Pattern p01 = Pattern.compile("^01[0-9]{14}");          
    Pattern p02 = Pattern.compile("^02[0-9]{14}");

}

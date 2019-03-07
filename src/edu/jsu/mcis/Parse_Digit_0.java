package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Parse_Digit_0 extends Pattern_Parser {

    public Parse_Digit_0() {
        
        super();
        
        String code = super.code;
        
        matches = new ArrayList();

        Pattern p00 = Pattern.compile("^00[0-9]{18}");         
        Pattern p01 = Pattern.compile("^01[0-9]{14}");          
        Pattern p02 = Pattern.compile("^02[0-9]{14}");
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        patterns.add(p00);
        patterns.add(p01);
        patterns.add(p02);
        
        String aiAndData = super.parsePattern(patterns, code).group();
    }
    
    public String parse() {
        
        return code;
    }

    public ArrayList<Matcher> getMatches() {
        
        return matches;
    }

}

package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Pattern_Parser {
    
    public String parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        /* Echo input string */
        
        System.out.println("Parsing: " + input + "\n");
        
        /* Create precompiled pattern matchers (for AIs 01, 17, and 10) */
        
        Pattern p00 = Pattern.compile("^00[0-9]{18}");         // AI #00
        Pattern p01 = Pattern.compile("^01[0-9]{14}");         // AI #01
        Pattern p02= Pattern.compile("^02[0-9]{14}");          // AI #02       
        Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]"); // AI #10
        Pattern p10eol = Pattern.compile("^10(.){1,20}$");     // AI #10 (eol)
        Pattern p11 = Pattern.compile("^p11[0-9]{6}");         // AI #11
        Pattern p12 = Pattern.compile("^p12[0-9]{6}");         // AI #12
        Pattern p13 = Pattern.compile("^p13[0-9]{6}");         // AI #13
        Pattern p15 = Pattern.compile("^p15[0-9]{6}");         // AI #15
        Pattern p16 = Pattern.compile("^p16[0-9]{6}");         // AI #16
        Pattern p17 = Pattern.compile("^p17[0-9]{6}");         // AI #17
        
        /* Add pattern matchers to iterable collection */
        
        patterns.add(p01);
        patterns.add(p17);
        patterns.add(p10);
        patterns.add(p10eol);
        
        /* Loop until input is fully processed, or an unknown code is found */
        
        while ( !code.isEmpty() && matched ) {
            
            matched = false;
            
            /* Run input string against recognized pattern matchers */
            
            for (Pattern p : patterns) {
                
                /* Run next pattern matcher */
                Matcher m = p.matcher(code);
                
                /* Was it a match? */
                if (m.find()) {
                    
                    /* Flip "matched" flag */
                    matched = true;

                    /* Get string offset of the end of the matched code */
                    int end = m.end();

                    /* Print matched code */
                    System.out.println("Found Code: " + m.group());

                    /* Strip matched code from the input string */
                    code = code.substring(end).trim();

                }

            }
            
        }
        
        /* Print original input string */
        
        System.out.println("\nFinished Parsing: " + input);
        
        /* Replace this with a JSON string containing the parsed code data */
        
        return ( "" );
        
    }
    
    
}

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
        
        Pattern p00 = Pattern.compile("^00[0-9]{18}");           // AI #00
        Pattern p01 = Pattern.compile("^01[0-9]{14}");           // AI #01
        Pattern p02= Pattern.compile("^02[0-9]{14}");            // AI #02       
        Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]");   // AI #10
        Pattern p10eol = Pattern.compile("^10(.){1,20}$");       // AI #10 (eol)
        Pattern p11 = Pattern.compile("^11[0-9]{6}");            // AI #11
        Pattern p12 = Pattern.compile("^12[0-9]{6}");            // AI #12
        Pattern p13 = Pattern.compile("^13[0-9]{6}");            // AI #13
        Pattern p15 = Pattern.compile("^15[0-9]{6}");            // AI #15
        Pattern p16 = Pattern.compile("^16[0-9]{6}");            // AI #16
        Pattern p17 = Pattern.compile("^17[0-9]{6}");            // AI #17
        Pattern p20 = Pattern.compile("^20[0-9]{2}");            // AI #20
        Pattern p21 = Pattern.compile("^21(.){1,20}[%\\x1D]");    // AI #21
        Pattern p21eol = Pattern.compile("^21(.){1,20}$");       // AI #21 (eol)
        Pattern p22 = Pattern.compile("^22(.){1,20}[%\\x1D]");    // AI #22
        Pattern p22eol = Pattern.compile("^22(.){1,20}$");       // AI #22 (eol)
        Pattern p240 = Pattern.compile("^240(.){1,20}[%\\x1D]");  // AI #240
        Pattern p240eol = Pattern.compile("^240(.){1,20}$");     // AI #240 (eol)
        Pattern p241 = Pattern.compile("^240(.){1,30}[%\\x1D]");  // AI #241
        Pattern p241eol = Pattern.compile("^240(.){1,30}$");     // AI #241 (eol)
        
        
        
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

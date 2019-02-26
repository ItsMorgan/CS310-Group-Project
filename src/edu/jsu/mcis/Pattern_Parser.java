package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Pattern_Parser {
    
    public ArrayList<Matcher> parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        ArrayList<Matcher> matches = new ArrayList();
        
        /* Echo input string */
        
        System.out.println("Parsing: " + input + "\n");
        
        /* Create precompiled pattern matchers (for AIs 01, 17, and 10) */
        
        Pattern p00 = Pattern.compile("^01[0-9]{18}");         // AI #00
        Pattern p01 = Pattern.compile("^01[0-9]{14}");         // AI #01 
        Pattern p02 = Pattern.compile("^02[0-9]{14}");         // AI #02
        Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]"); // AI #10
        Pattern p10eol = Pattern.compile("^10(.){1,20}$");     // AI #10 (eol)
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
        Pattern p240eol = Pattern.compile("^240(.){1,30}$");     // AI #240 (eol)
        Pattern p243 = Pattern.compile("^243(.){1,20}[%\\x1D]"); // AI #243
        Pattern p243eol = Pattern.compile("^243(.){1,20}$");     // AI #243
        Pattern p250 = Pattern.compile("^250(.){1,30}[%\\x1D]"); // AI #243
        Pattern p250eol = Pattern.compile("^250(.){1,30}$");     // AI #243
        Pattern p251 = Pattern.compile("^251(.){1,30}[%\\x1D]"); // AI #243
        Pattern p251eol = Pattern.compile("^251(.){1,30}$");     // AI #243
        Pattern p253 = Pattern.compile("^253[0-9]{13}(.){1,17}[%\\x1D]"); // AI #243
        Pattern p253eol = Pattern.compile("^253[0-9]{13}(.){1,17}$"); // AI #243
        Pattern p254 = Pattern.compile("^254(.){1,20}[%\\x1D]"); // AI #243
        Pattern p254eol = Pattern.compile("^254(.){1,20}[%\\x1D]"); // AI #243
        Pattern p255 = Pattern.compile("^255[0-9]{13}[0-9]{1,12}[%\\x1D]"); // AI #243
        Pattern p255eol = Pattern.compile("^255[0-9]{13}[0-9]{1,12}$"); // AI #243
        Pattern p30 = Pattern.compile("^30[0-9]{1,8}[%\\x1D]");         // AI #30
        Pattern p30eol = Pattern.compile("^30[0-9]{1,8}$");             // AI #30eol
        Pattern p310n = Pattern.compile("^310n[0-9]{6}");               // AI #310n
        Pattern p311n = Pattern.compile("^311n[0-9]{6}");               // AI #311n
        Pattern p312n = Pattern.compile("^312n[0-9]{6}");               // AI #312n
        Pattern p313n = Pattern.compile("^313n[0-9]{6}");               // AI #313n
        Pattern p314n = Pattern.compile("^314n[0-9]{6}");               // AI #314n
        Pattern p315n = Pattern.compile("^315n[0-9]{6}");               // AI #315n
        Pattern p316n = Pattern.compile("^316n[0-9]{6}");               // AI #316n
        Pattern p320n = Pattern.compile("^320n[0-9]{6}");               // AI #320n
        Pattern p321n = Pattern.compile("^321n[0-9]{6}");               // AI #321n
        Pattern p322n = Pattern.compile("^322n[0-9]{6}");               // AI #322n
        Pattern p323n = Pattern.compile("^323n[0-9]{6}");               // AI #323n
        Pattern p324n = Pattern.compile("^324n[0-9]{6}");               // AI #324n
        Pattern p325n = Pattern.compile("^325n[0-9]{6}");               // AI #325n
        Pattern p326n = Pattern.compile("^326n[0-9]{6}");               // AI #326n
        Pattern p327n = Pattern.compile("^327n[0-9]{6}");               // AI #327n
        Pattern p328n = Pattern.compile("^328n[0-9]{6}");               // AI #328n
        Pattern p329n = Pattern.compile("^329n[0-9]{6}");               // AI #329n
        Pattern p330n = Pattern.compile("^330n[0-9]{6}");               // AI #330n
        Pattern p331n = Pattern.compile("^331n[0-9]{6}");               // AI #331n
        Pattern p332n = Pattern.compile("^332n[0-9]{6}");               // AI #332n
        Pattern p333n = Pattern.compile("^333n[0-9]{6}");               // AI #333n
        Pattern p334n = Pattern.compile("^334n[0-9]{6}");               // AI #334n
        Pattern p335n = Pattern.compile("^335n[0-9]{6}");               // AI #335n
        Pattern p336n = Pattern.compile("^336n[0-9]{6}");               // AI #336n
        Pattern p337n = Pattern.compile("^337n[0-9]{6}");               // AI #337n
        Pattern p340n = Pattern.compile("^340n[0-9]{6}");               // AI #340n
        Pattern p341n = Pattern.compile("^341n[0-9]{6}");               // AI #341n
        Pattern p342n = Pattern.compile("^342n[0-9]{6}");               // AI #342n
        Pattern p343n = Pattern.compile("^343n[0-9]{6}");               // AI #342n
        Pattern p344n = Pattern.compile("^344n[0-9]{6}");               // AI #344n
        Pattern p345n = Pattern.compile("^345n[0-9]{6}");               // AI #345n
        Pattern p346n = Pattern.compile("^346n[0-9]{6}");               // AI #346n
        Pattern p347n = Pattern.compile("^347n[0-9]{6}");               // AI #347n
        Pattern p348n = Pattern.compile("^348n[0-9]{6}");               // AI #348n
        Pattern p349n = Pattern.compile("^349n[0-9]{6}");               // AI #349n
        Pattern p350n = Pattern.compile("^350n[0-9]{6}");               // AI #350n
        Pattern p351n = Pattern.compile("^351n[0-9]{6}");               // AI #351n
        Pattern p352n = Pattern.compile("^352n[0-9]{6}");               // AI #352n
        Pattern p353n = Pattern.compile("^353n[0-9]{6}");               // AI #353n
        Pattern p354n = Pattern.compile("^354n[0-9]{6}");               // AI #353n
        Pattern p355n = Pattern.compile("^355n[0-9]{6}");               // AI #355n
        Pattern p356n = Pattern.compile("^356n[0-9]{6}");               // AI #356n
        Pattern p357n = Pattern.compile("^357n[0-9]{6}");               // AI #357n
        Pattern p360n = Pattern.compile("^360n[0-9]{6}");               // AI #360n
        Pattern p361n = Pattern.compile("^361n[0-9]{6}");               // AI #361n
        Pattern p362n = Pattern.compile("^362n[0-9]{6}");               // AI #362n
        Pattern p363n = Pattern.compile("^363n[0-9]{6}");               // AI #363n
        Pattern p364n = Pattern.compile("^364n[0-9]{6}");               // AI #364n
        Pattern p365n = Pattern.compile("^365n[0-9]{6}");               // AI #365n
        Pattern p366n = Pattern.compile("^366n[0-9]{6}");               // AI #366n
        Pattern p367n = Pattern.compile("^367n[0-9]{6}");               // AI #367n
        Pattern p368n = Pattern.compile("^368n[0-9]{6}");               // AI #368n
        Pattern p369n = Pattern.compile("^369n[0-9]{6}");               // AI #369n
        Pattern p37 = Pattern.compile("^37(.){1,8}[%\\x1D]");           // AI #37
        Pattern p37eol = Pattern.compile("^37(.){1,8}$");               // AI #37eol
        Pattern p390n = Pattern.compile("^390n(.){1,15}[%\\x1D]");      // AI #390n
        Pattern p390neol = Pattern.compile("^390n(.){1,15}$");          // AI #390neol
        Pattern p391n = Pattern.compile("^390n[0-9]{3}(.){1,15}[%\\x1D]");      // AI #390n
        Pattern p391neol = Pattern.compile("^390n[0-9]{3}(.){1,15}}$");          // AI #390neol
        Pattern p392n = Pattern.compile("^392n(.){1,15}[%\\x1D]");      // AI #392n
        Pattern p392neol = Pattern.compile("^392n(.){1,15}$");          // AI #392neol
        Pattern p393n = Pattern.compile("^393n[0-9]{3}(.){1,15}[%\\x1D]");      // AI #393n
        Pattern p393neol = Pattern.compile("^393n[0-9]{3}(.){1,15}}$");          // AI #393neol
        
        
        Pattern p7230 = Pattern.compile("^7230(.){2}(.){1,28}[%\\1xD]");
        Pattern p7230eol = Pattern.compile("^7230(.){2}(.){1,28}$");
        Pattern p7231 = Pattern.compile("^7231(.){2}(.){1,28}[%\\1xD]");
        Pattern p7231eol = Pattern.compile("^7231(.){2}(.){1,28}$");
        Pattern p7232 = Pattern.compile("^7232(.){2}(.){1,28}[%\\1xD]");
        Pattern p7232eol = Pattern.compile("^7232(.){2}(.){1,28}$");
        Pattern p7233 = Pattern.compile("^7233(.){2}(.){1,28}[%\\1xD]");
        Pattern p7233eol = Pattern.compile("^7233(.){2}(.){1,28}$");
        Pattern p7234 = Pattern.compile("^7234(.){2}(.){1,28}[%\\1xD]");
        Pattern p7234eol = Pattern.compile("^7234(.){2}(.){1,28}$");
        Pattern p7235 = Pattern.compile("^7235(.){2}(.){1,28}[%\\1xD]");
        Pattern p7235eol = Pattern.compile("^7235(.){2}(.){1,28}$");
        Pattern p7236 = Pattern.compile("^7236(.){2}(.){1,28}[%\\1xD]");
        Pattern p7236eol = Pattern.compile("^7236(.){2}(.){1,28}$");
        Pattern p7237 = Pattern.compile("^7237(.){2}(.){1,28}[%\\1xD]");
        Pattern p7237eol = Pattern.compile("^7237(.){2}(.){1,28}$");
        Pattern p7238 = Pattern.compile("^7238(.){2}(.){1,28}[%\\1xD]");
        Pattern p7238eol = Pattern.compile("^7238(.){2}(.){1,28}$");
        Pattern p7239 = Pattern.compile("^7239(.){2}(.){1,28}[%\\1xD]");
        Pattern p7239eol = Pattern.compile("^7239.){2}(.){1,28}$");
        
        
        Pattern p8001 = Pattern.compile("^8001[0-9]{14}[%\\1xD]");
        Pattern p8001eol = Pattern.compile("^8001[0-9]{14}$");
        Pattern p8002 = Pattern.compile("^8002(.){1,20}[%\\1xD]");
        Pattern p8002eol = Pattern.compile("^8002(.){1,20}$");
        Pattern p8003 = Pattern.compile("^8003[0-9]{14}(.){1,16}[%\\1xD]");
        Pattern p8003eol = Pattern.compile("^8003[0-9]{14}(.){1,16}$");
        
        
        
        
        Pattern p8110 = Pattern.compile("^8110(.){1,70}[%\\x1D]");
        Pattern p8110eol = Pattern.compile("^8110(.){1,70}$");
        Pattern p8026 = Pattern.compile("^8026[0-9]{14}[0-9]{2}[0-9]{2}[%\\x1D]");
        Pattern p8026eol = Pattern.compile("^8026[0-9]{14}[0-9]{2}[0-9]{2}$");
        Pattern p8111 = Pattern.compile("^8112(.){1,70}[%\\1xD]");
        Pattern p8111eol = Pattern.compile("^8112(.){1,70}$"); 
        Pattern p8200 = Pattern.compile("^8200(.){1,70}[%\\1xD]");
        Pattern p8200eol = Pattern.compile("^8200(.){1,70}$");
        Pattern p90 = Pattern.compile("^90(.){1,30}[%\\1xD]");
        Pattern p90eol = Pattern.compile("^90(.){1,30}$");        
        Pattern p91 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p91eol = Pattern.compile("^90(.){1,90}$");        
        Pattern p92 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p92eol = Pattern.compile("^90(.){1,90}$");        
        Pattern p93 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p93eol = Pattern.compile("^90(.){1,90}$");
        Pattern p94 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p94eol = Pattern.compile("^90(.){1,90}$");
        Pattern p95 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p95eol = Pattern.compile("^90(.){1,90}$");
        Pattern p96 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p96eol = Pattern.compile("^90(.){1,90}$");
        Pattern p97 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p97eol = Pattern.compile("^90(.){1,90}$");
        Pattern p98 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p98eol = Pattern.compile("^90(.){1,90}$");
        Pattern p99 = Pattern.compile("^90(.){1,90}[%\\1xD]");
        Pattern p99eol = Pattern.compile("^90(.){1,90}$");        
        /* Add pattern matchers to iterable collection */
        
        patterns.add(p00);
        patterns.add(p01);
        patterns.add(p02);
        patterns.add(p10);
        patterns.add(p10eol);
        patterns.add(p11);
        patterns.add(p12);
        patterns.add(p13);
        patterns.add(p15);
        patterns.add(p16);
        patterns.add(p17);
        patterns.add(p20);
        patterns.add(p21);
        patterns.add(p21eol);
        patterns.add(p22);
        patterns.add(p22eol);
        patterns.add(p240);
        patterns.add(p240eol);
        patterns.add(p243);
        patterns.add(p243eol);
        patterns.add(p250);
        patterns.add(p250eol);
        patterns.add(p251);
        patterns.add(p251eol);
        patterns.add(p253);
        patterns.add(p253eol);
        patterns.add(p254);
        patterns.add(p254eol);
        patterns.add(p255);
        patterns.add(p255eol);
        patterns.add(p30);
        patterns.add(p30eol);
        patterns.add(p310n);
        patterns.add(p311n);
        patterns.add(p312n);
        patterns.add(p313n);
        patterns.add(p314n);
        patterns.add(p315n);
        patterns.add(p316n);
        patterns.add(p320n);
        patterns.add(p321n);
        patterns.add(p322n);
        patterns.add(p323n);
        patterns.add(p324n);
        patterns.add(p325n);
        patterns.add(p326n);
        patterns.add(p327n);
        patterns.add(p328n);
        patterns.add(p329n);
        patterns.add(p330n);
        patterns.add(p331n);
        patterns.add(p332n);
        patterns.add(p333n);
        patterns.add(p334n);
        patterns.add(p335n);
        patterns.add(p336n);
        patterns.add(p337n);
        patterns.add(p340n);
        patterns.add(p341n);
        patterns.add(p342n);
        patterns.add(p343n);
        patterns.add(p344n);
        patterns.add(p345n);
        patterns.add(p346n);
        patterns.add(p347n);
        patterns.add(p348n);
        patterns.add(p349n);
        patterns.add(p350n);
        patterns.add(p351n);
        patterns.add(p352n);
        patterns.add(p353n);
        patterns.add(p354n);
        patterns.add(p355n);
        patterns.add(p356n);
        patterns.add(p357n);
        patterns.add(p360n);
        patterns.add(p361n);
        patterns.add(p362n);
        patterns.add(p363n);
        patterns.add(p364n);
        patterns.add(p365n);
        patterns.add(p366n);
        patterns.add(p367n);
        patterns.add(p368n);
        patterns.add(p369n);
        
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
                    
                    matches.add(m);
                    
                    /* Strip matched code from the input string */
                    code = code.substring(end).trim();

                }

            }
            
        }
        
        /* Print original input string */
                
        /* Replace this with a JSON string containing the parsed code data */
        
        return matches;
        
    }
    
    
}

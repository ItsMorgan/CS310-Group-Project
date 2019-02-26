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
        Pattern p393n = Pattern.compile("^393n[0-9]{3}(.){1,15}");      // AI #393n
        Pattern p393neol = Pattern.compile("^393n[0-9]{3}(.){1,15}}$");          // AI #393neol
        Pattern p7004 = Pattern.compile("^7004[0-9](.){1,4}");    //AI 7004
        Pattern p7004eol = Pattern.compile("^7004[0-9](.){1,4}}$"); //AI 7004eol
        Pattern p7005 = Pattern.compile("^7005(.){1,12}[%\\x1D]");   //AI 7005
        Pattern p7005eol = Pattern.compile("^7005(.){1,12}}$"); //AI 7005eol
        Pattern p7006 = Pattern.compile("^7006[0-9](.){1,6}");   //AI 7006
        Pattern p7006eol = Pattern.compile("^7006[0-9](.){1,6}}$");  //AI 7006eol
        Pattern p7007 = Pattern.compile("^7007[0-9](.){6,12}");   //AI 7007
        Pattern p7007eol = Pattern.compile("^7007[0-9]{4}(.){6,12}}$");  //AI 7007eol
        Pattern p7008 = Pattern.compile("^7008(.){1,3}[%\\x1D]");   //AI 7008
        Pattern p7008eol = Pattern.compile("^7008(.){1,3}}$");  //AI 7008eol
        Pattern p7009 = Pattern.compile("^7009[0-9](.){1,10}[%\\x1D]");   //AI 7009
        Pattern p7009eol = Pattern.compile("^7009[0-9](.){1,10}}$");  //AI 7009eol
        Pattern p7010 = Pattern.compile("^7010(.){1,2}[%\\x1D]");   //AI 7010
        Pattern p7010eol = Pattern.compile("^7010(.){1,2}}$");  //AI 7010eol
        Pattern p7020 = Pattern.compile("^7020(.){1,20}[%\\x1D]");   //AI 7020
        Pattern p7020eol = Pattern.compile("^7020(.){1,20}}$");  //AI 7020eol
        Pattern p7021 = Pattern.compile("^7021(.){1,20}[%\\x1D]");   //AI 7021
        Pattern p7021eol = Pattern.compile("^7021(.){1,20}}$");  //AI 7021eol
        Pattern p7022 = Pattern.compile("^7022(.){1,20}[%\\x1D]");   //AI 7022
        Pattern p7022eol = Pattern.compile("^7022(.){1,20}}$");  //AI 7022eol
        Pattern p7023 = Pattern.compile("^7023(.){1,30}[%\\x1D]");   //AI 7023
        Pattern p7023eol = Pattern.compile("^7023(.){1,30}}$");  //AI 7023eol
        Pattern p7030s = Pattern.compile("^703[0-9]{1}[0-9]{3}(.){1,27}[%\\x1D]");  //AI 703s
        Pattern p703seol = Pattern.compile("^703[0-9]{1}[0-9]{3}(.){1,27}}$"); //AI 703seol
        Pattern p710 = Pattern.compile("^710(.){1,20}[%\\x1D]");    //AI 710
        Pattern p710eol = Pattern.compile("^710(.){1,20}}$");    //AI 710eol
        Pattern p711 = Pattern.compile("^711(.){1,20}[%\\x1D]"); //AI 711
        Pattern p711eol = Pattern.compile("^711(.){1,20}}$");   //AI 711eol
        Pattern p712 = Pattern.compile("^712(.){1,20}[%\\1xD]");    //AI 712
        Pattern p712eol = Pattern.compile("^712(.){1,20}}$");   //AI 712eol
        Pattern p713 = Pattern.compile("^713(.){1,20}[%\\1xD]");    //AI 713
        Pattern p713eol = Pattern.compile("^713(.){1,20}}$");   //AI 713eol
        Pattern p714 = Pattern.compile("^714(.){1,20}[%\\1xD]");    //AI 714
        Pattern p714eol = Pattern.compile("^714(.){1,20}}$");  //AI 714eol
        Pattern p8001 = Pattern.compile("^8001[0-9](.){1,14}");    //AI 8001
        Pattern p8001eol = Pattern.compile("^8001[0-9](.){1,14}}$");   //AI 8001eol
        Pattern p8002 = Pattern.compile("^8002(.){1,20}[%\\1xD]");  //AI 8002
        Pattern p8002eol = Pattern.compile("^8002(.){1,20}}$"); //AI 8002eol
        Pattern p8003 = Pattern.compile("^8003[0-9]{14}(.){1,16}[%\\1xD]"); //AI 8003
        Pattern p8003eol = Pattern.compile("^8003[0-9]{14}(.){1,16}}$"); //AI 8003eol
        Pattern p8004 = Pattern.compile("^8004(.){1,30}[%\\1xD]");  //AI 8004
        Pattern p8004eol = Pattern.compile("^8004(.){1,30}}$"); //AI 8004eol
        Pattern p8005 = Pattern.compile("^8005[0-9](.){6}");   //AI 8005
        Pattern p8005eol = Pattern.compile("^8005[0-9](.){6}}$");  //AI 8005eol
        Pattern p8006 = Pattern.compile("^8006[0-9]{14}(.)[0-9]{2}(.)[0-9]{2}"); //AI 8006
        Pattern p8006eol = Pattern.compile("^8006[0-9]{14}(.)[0-9]{2}(.)[0-9]{2}}$");    //AI 8006eol
        Pattern p8007 = Pattern.compile("^8007(.){1,34}[%\\1xD]");  //AI 8007
        Pattern p8007eol = Pattern.compile("^8007(.){1,34}}$"); //AI 8007eol
        Pattern p8008 = Pattern.compile("^8008[0-9]{8}(.)[0-9]{1,4}");  //AI 8008
        Pattern p8008eol = Pattern.compile("^8008[0-9]{8}(.)[0-9]{1,4}}$"); //AI 8008eol
        Pattern p8009 = Pattern.compile("^8009(.){1,50}[%\\1xD]"); //AI 8009
        Pattern p8009eol = Pattern.compile("^8009(.){1,50}}$");    //AI 8009eol
        Pattern p8010 = Pattern.compile("^8010(.){1,30}[%//1xD]"); //AI 8010
        Pattern p8010eol = Pattern.compile("^8010(.){1,30}}$"); //AI 8010
        Pattern p8011 = Pattern.compile("^8011[0-9]{1,12}");    //AI 8011
        Pattern p8011eol = Pattern.compile("^8011[0-9]{1,12}}$");   //AI 8011eol
        Pattern p8012 = Pattern.compile("^8012(.){1,20}[%//1xD]");  //AI 8012
        Pattern p8012eol = Pattern.compile("^8012(.){1,20}}$"); //AI 8012eol
        
        
        
        
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

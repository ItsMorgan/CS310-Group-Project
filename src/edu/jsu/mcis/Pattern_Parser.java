package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.regex.*;

public class Pattern_Parser {
    
    public ArrayList<Matcher> parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        ArrayList<Matcher> matches = new ArrayList();
        
        Pattern p00 = Pattern.compile("^01[0-9]{18}");         
        Pattern p01 = Pattern.compile("^01[0-9]{14}");          
        Pattern p02 = Pattern.compile("^02[0-9]{14}");         
        Pattern p10 = Pattern.compile("^10(.){1,20}[%\\x1D]"); 
        Pattern p10eol = Pattern.compile("^10(.){1,20}$");     
        Pattern p11 = Pattern.compile("^11[0-9]{6}");          
        Pattern p12 = Pattern.compile("^12[0-9]{6}");            
        Pattern p13 = Pattern.compile("^13[0-9]{6}");            
        Pattern p15 = Pattern.compile("^15[0-9]{6}");            
        Pattern p16 = Pattern.compile("^16[0-9]{6}");            
        Pattern p17 = Pattern.compile("^17[0-9]{6}");            
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
        Pattern p30 = Pattern.compile("^30[0-9]{1,8}[%\\x1D]");         
        Pattern p30eol = Pattern.compile("^30[0-9]{1,8}$");             
        Pattern p310n = Pattern.compile("^310[0-9]{1}[0-9]{6}");              
        Pattern p311n = Pattern.compile("^311[0-9]{1}[0-9]{6}");              
        Pattern p312n = Pattern.compile("^312[0-9]{1}[0-9]{6}");              
        Pattern p313n = Pattern.compile("^313[0-9]{1}[0-9]{6}");              
        Pattern p314n = Pattern.compile("^314[0-9]{1}[0-9]{6}");              
        Pattern p315n = Pattern.compile("^315[0-9]{1}[0-9]{6}");              
        Pattern p316n = Pattern.compile("^316[0-9]{1}[0-9]{6}");              
        Pattern p320n = Pattern.compile("^320[0-9]{1}[0-9]{6}");              
        Pattern p321n = Pattern.compile("^321[0-9]{1}[0-9]{6}");              
        Pattern p322n = Pattern.compile("^322[0-9]{1}[0-9]{6}");              
        Pattern p323n = Pattern.compile("^323[0-9]{1}[0-9]{6}");              
        Pattern p324n = Pattern.compile("^324[0-9]{1}[0-9]{6}");              
        Pattern p325n = Pattern.compile("^325[0-9]{1}[0-9]{6}");              
        Pattern p326n = Pattern.compile("^326[0-9]{1}[0-9]{6}");              
        Pattern p327n = Pattern.compile("^327[0-9]{1}[0-9]{6}");              
        Pattern p328n = Pattern.compile("^328[0-9]{1}[0-9]{6}");              
        Pattern p329n = Pattern.compile("^329[0-9]{1}[0-9]{6}");              
        Pattern p330n = Pattern.compile("^330[0-9]{1}[0-9]{6}");              
        Pattern p331n = Pattern.compile("^331[0-9]{1}[0-9]{6}");               
        Pattern p332n = Pattern.compile("^332[0-9]{1}[0-9]{6}");               
        Pattern p333n = Pattern.compile("^333[0-9]{1}[0-9]{6}");               
        Pattern p334n = Pattern.compile("^334[0-9]{1}[0-9]{6}");               
        Pattern p335n = Pattern.compile("^335[0-9]{1}[0-9]{6}");               
        Pattern p336n = Pattern.compile("^336[0-9]{1}[0-9]{6}");               
        Pattern p337n = Pattern.compile("^337[0-9]{1}[0-9]{6}");               
        Pattern p340n = Pattern.compile("^340[0-9]{1}[0-9]{6}");               
        Pattern p341n = Pattern.compile("^341[0-9]{1}[0-9]{6}");               
        Pattern p342n = Pattern.compile("^342[0-9]{1}[0-9]{6}");               
        Pattern p343n = Pattern.compile("^343[0-9]{1}[0-9]{6}");               
        Pattern p344n = Pattern.compile("^344[0-9]{1}[0-9]{6}");               
        Pattern p345n = Pattern.compile("^345[0-9]{1}[0-9]{6}");               
        Pattern p346n = Pattern.compile("^346[0-9]{1}[0-9]{6}");               
        Pattern p347n = Pattern.compile("^347[0-9]{1}[0-9]{6}");               
        Pattern p348n = Pattern.compile("^348[0-9]{1}[0-9]{6}");               
        Pattern p349n = Pattern.compile("^349[0-9]{1}[0-9]{6}");               
        Pattern p350n = Pattern.compile("^350[0-9]{1}[0-9]{6}");               
        Pattern p351n = Pattern.compile("^351[0-9]{1}[0-9]{6}");               
        Pattern p352n = Pattern.compile("^352[0-9]{1}[0-9]{6}");               
        Pattern p353n = Pattern.compile("^353[0-9]{1}[0-9]{6}");               
        Pattern p354n = Pattern.compile("^354[0-9]{1}[0-9]{6}");               
        Pattern p355n = Pattern.compile("^355[0-9]{1}[0-9]{6}");              
        Pattern p356n = Pattern.compile("^356[0-9]{1}[0-9]{6}");              
        Pattern p357n = Pattern.compile("^357[0-9]{1}[0-9]{6}");              
        Pattern p360n = Pattern.compile("^360[0-9]{1}[0-9]{6}");              
        Pattern p361n = Pattern.compile("^361[0-9]{1}[0-9]{6}");              
        Pattern p362n = Pattern.compile("^362[0-9]{1}[0-9]{6}");              
        Pattern p363n = Pattern.compile("^363[0-9]{1}[0-9]{6}");              
        Pattern p364n = Pattern.compile("^364[0-9]{1}[0-9]{6}");              
        Pattern p365n = Pattern.compile("^365[0-9]{1}[0-9]{6}");              
        Pattern p366n = Pattern.compile("^366[0-9]{1}[0-9]{6}");              
        Pattern p367n = Pattern.compile("^367[0-9]{1}[0-9]{6}");              
        Pattern p368n = Pattern.compile("^368[0-9]{1}[0-9]{6}");              
        Pattern p369n = Pattern.compile("^369[0-9]{1}[0-9]{6}");              
        Pattern p37 = Pattern.compile("^37[0-9]{1,8}[%\\x1D]");          
        Pattern p37eol = Pattern.compile("^37[0-9]{1,8}$");              
        Pattern p390n = Pattern.compile("^390[0-9]{1}[0-9]{1,15}[%\\x1D]");      
        Pattern p390neol = Pattern.compile("^390[0-9]{1}[0-9]{1,15}$");          
        Pattern p391n = Pattern.compile("^390[0-9]{1}[0-9]{3}[0-9]{1,15}[%\\x1D]");
        Pattern p391neol = Pattern.compile("^390[0-9]{1}[0-9]{3}[0-9]{1,15}$"); 
        Pattern p392n = Pattern.compile("^392[0-9]{1}[0-9]{1,15}[%\\x1D]");      
        Pattern p392neol = Pattern.compile("^392[0-9]{1}[0-9]{1,15}$");          
        Pattern p393n = Pattern.compile("^393[0-9]{1}[0-9]{3}[0-9]{1,15}[%\\x1D]");
        Pattern p393neol = Pattern.compile("^393[0-9]{1}[0-9]{3}[0-9]{1,15}$");
        Pattern p394n = Pattern.compile("^394[0-9]{1}[0-9]{6}[%\\x1D]");        
        Pattern p394neol = Pattern.compile("^394[0-9]{1}[0-9]{4}$");         
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
        Pattern p7001 = Pattern.compile("^7001[0-9]{13}[%\\x1D]");
        Pattern p7001eol = Pattern.compile("^7001[0-9]{13}[%\\x1D]");
        Pattern p7002 = Pattern.compile("^7002(.){1,30}[%\\x1D]");
        Pattern p7002eol = Pattern.compile("^7002(.){1,30}$");
        Pattern p7003 = Pattern.compile("^7003[0-9]{10}[%\\x1D]");
        Pattern p7003eol = Pattern.compile("^7003[0-9]{10}$");
        Pattern p723s = Pattern.compile("^723[0-9]{1}(.){2}(.){1,28}[%\\x1D]");
        Pattern p723seol = Pattern.compile("^723[0-9]{1}(.){2}(.){1,28}$");
        Pattern p7004 = Pattern.compile("^7004[0-9](.){1,4}");
        Pattern p7004eol = Pattern.compile("^7004[0-9](.){1,4}$");
        Pattern p7005 = Pattern.compile("^7005(.){1,12}[%\\x1D]"); 
        Pattern p7005eol = Pattern.compile("^7005(.){1,12}$"); 
        Pattern p7006 = Pattern.compile("^7006[0-9](.){1,6}");   
        Pattern p7006eol = Pattern.compile("^7006[0-9](.){1,6}$");  
        Pattern p7007 = Pattern.compile("^7007[0-9](.){6,12}");  
        Pattern p7007eol = Pattern.compile("^7007[0-9]{4}(.){6,12}$"); 
        Pattern p7008 = Pattern.compile("^7008(.){1,3}[%\\x1D]");  
        Pattern p7008eol = Pattern.compile("^7008(.){1,3}$"); 
        Pattern p7009 = Pattern.compile("^7009[0-9](.){1,10}[%\\x1D]"); 
        Pattern p7009eol = Pattern.compile("^7009[0-9](.){1,10}$");
        Pattern p7010 = Pattern.compile("^7010(.){1,2}[%\\x1D]");
        Pattern p7010eol = Pattern.compile("^7010(.){1,2}$"); 
        Pattern p7020 = Pattern.compile("^7020(.){1,20}[%\\x1D]");
        Pattern p7020eol = Pattern.compile("^7020(.){1,20}$"); 
        Pattern p7021 = Pattern.compile("^7021(.){1,20}[%\\x1D]"); 
        Pattern p7021eol = Pattern.compile("^7021(.){1,20}$"); 
        Pattern p7022 = Pattern.compile("^7022(.){1,20}[%\\x1D]"); 
        Pattern p7022eol = Pattern.compile("^7022(.){1,20}$"); 
        Pattern p7023 = Pattern.compile("^7023(.){1,30}[%\\x1D]"); 
        Pattern p7023eol = Pattern.compile("^7023(.){1,30}$"); 
        Pattern p703s = Pattern.compile("^703[0-9]{1}[0-9]{3}(.){1,27}[%\\x1D]");
        Pattern p703seol = Pattern.compile("^703[0-9]{1}[0-9]{3}(.){1,27}$");
        Pattern p710 = Pattern.compile("^710(.){1,20}[%\\x1D]");
        Pattern p710eol = Pattern.compile("^710(.){1,20}$"); 
        Pattern p711 = Pattern.compile("^711(.){1,20}[%\\x1D]");
        Pattern p711eol = Pattern.compile("^711(.){1,20}$");
        Pattern p712 = Pattern.compile("^712(.){1,20}[%\\x1D]"); 
        Pattern p712eol = Pattern.compile("^712(.){1,20}$"); 
        Pattern p713 = Pattern.compile("^713(.){1,20}[%\\x1D]"); 
        Pattern p713eol = Pattern.compile("^713(.){1,20}$");
        Pattern p714 = Pattern.compile("^714(.){1,20}[%\\x1D]"); 
        Pattern p714eol = Pattern.compile("^714(.){1,20}$");
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
        Pattern p90 = Pattern.compile("^90(.){1,30}[%\\x1D]");
        Pattern p90eol = Pattern.compile("^90(.){1,30}$");        
        Pattern p9N = Pattern.compile("^9[1-9]{1}(.){1,90}[%\\x1D]");
        Pattern p9Neol = Pattern.compile("^9[1-9]{1}(.){1,90}$");        
       
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
        patterns.add(p37);
        patterns.add(p37eol);
        patterns.add(p390n);
        patterns.add(p390neol);
        patterns.add(p391n);
        patterns.add(p391neol);
        patterns.add(p392n);
        patterns.add(p392neol);
        patterns.add(p393n);
        patterns.add(p393neol);
        patterns.add(p394n);
        patterns.add(p394neol);
        patterns.add(p400);
        patterns.add(p400eol);
        patterns.add(p401);
        patterns.add(p401eol);
        patterns.add(p402);
        patterns.add(p402eol);
        patterns.add(p403);
        patterns.add(p403eol);
        patterns.add(p410);
        patterns.add(p411);
        patterns.add(p412);
        patterns.add(p413);
        patterns.add(p414);
        patterns.add(p415);
        patterns.add(p416);
        patterns.add(p420);
        patterns.add(p420eol);
        patterns.add(p421);
        patterns.add(p421eol);
        patterns.add(p422);
        patterns.add(p422eol);
        patterns.add(p423);
        patterns.add(p423eol);
        patterns.add(p424);
        patterns.add(p424eol);
        patterns.add(p425);
        patterns.add(p425eol);
        patterns.add(p426);
        patterns.add(p426eol);
        patterns.add(p427);
        patterns.add(p427eol);
        patterns.add(p7001);
        patterns.add(p7001eol);
        patterns.add(p7002);
        patterns.add(p7002eol);
        patterns.add(p7003);
        patterns.add(p7003eol);
        patterns.add(p7004);
        patterns.add(p7004eol);
        patterns.add(p7005);
        patterns.add(p7005eol);
        patterns.add(p7006);
        patterns.add(p7006eol);
        patterns.add(p7007);
        patterns.add(p7007eol);
        patterns.add(p7008);
        patterns.add(p7008eol);
        patterns.add(p7009);
        patterns.add(p7009eol);
        patterns.add(p7010);
        patterns.add(p7010eol);
        patterns.add(p7020);
        patterns.add(p7020eol);
        patterns.add(p7021);
        patterns.add(p7021eol);
        patterns.add(p7022);
        patterns.add(p7022eol);
        patterns.add(p7023);
        patterns.add(p7023eol);
        patterns.add(p703s);
        patterns.add(p703seol);
        patterns.add(p710);
        patterns.add(p710eol);
        patterns.add(p711);
        patterns.add(p711eol);
        patterns.add(p712);
        patterns.add(p712eol);
        patterns.add(p713);
        patterns.add(p713eol);
        patterns.add(p714);
        patterns.add(p714eol);
        patterns.add(p723s);
        patterns.add(p723seol);
        patterns.add(p8001);
        patterns.add(p8001eol);
        patterns.add(p8002);
        patterns.add(p8002eol);
        patterns.add(p8003);
        patterns.add(p8003eol);
        patterns.add(p8004);
        patterns.add(p8004eol);
        patterns.add(p8005);
        patterns.add(p8005eol);
        patterns.add(p8006);
        patterns.add(p8006eol);
        patterns.add(p8007);
        patterns.add(p8007eol);
        patterns.add(p8008);
        patterns.add(p8008eol);
        patterns.add(p8009);
        patterns.add(p8009eol);
        patterns.add(p8010);
        patterns.add(p8010eol);
        patterns.add(p8011);
        patterns.add(p8011eol);
        patterns.add(p8012);
        patterns.add(p8012eol);
        patterns.add(p8013);
        patterns.add(p8013eol);
        patterns.add(p8017);
        patterns.add(p8017eol);
        patterns.add(p8018);
        patterns.add(p8018eol);
        patterns.add(p8019);
        patterns.add(p8019eol);
        patterns.add(p8020);
        patterns.add(p8020eol);
        patterns.add(p8110);
        patterns.add(p8110eol);
        patterns.add(p8026);
        patterns.add(p8026eol);
        patterns.add(p8111);
        patterns.add(p8111eol);
        patterns.add(p8112);
        patterns.add(p8112eol);
        patterns.add(p8200);
        patterns.add(p8200eol);
        patterns.add(p90);
        patterns.add(p90eol);
        patterns.add(p9N);
        patterns.add(p9Neol);

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

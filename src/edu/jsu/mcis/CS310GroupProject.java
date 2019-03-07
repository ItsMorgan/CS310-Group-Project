package edu.jsu.mcis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.simple.JSONArray;

public class CS310GroupProject {

    public static void main(String[] args) {
        
        String input = "17150119";
        
        Pattern_Parser patternParser = new Pattern_Parser();
        JSONArray fields;
        
        fields = patternParser.parse(input);
                
        System.out.println(fields.toJSONString());
        
    }
    
}

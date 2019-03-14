package edu.jsu.mcis;

import org.json.simple.JSONArray;

public class CS310GroupProject {

    public static void main(String[] args) {
        
        String input = "93123";
        
        Pattern_Parser patternParser = new Pattern_Parser();
        JSONArray fields;
        
        fields = patternParser.parse(input);
                
        System.out.println(fields.toJSONString());
        
    }
    
}

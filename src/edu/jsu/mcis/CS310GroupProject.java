package edu.jsu.mcis;

import org.json.simple.JSONArray;

public class CS310GroupProject {

    public static void main(String[] args) throws Exception {
        
        String input = "111234568026123456789012345678";
        
        Pattern_Parser patternParser = new Pattern_Parser();
        JSONArray fields;
        
        fields = patternParser.parse(input);
                
        System.out.println(fields.toJSONString());
        
    }
    
}

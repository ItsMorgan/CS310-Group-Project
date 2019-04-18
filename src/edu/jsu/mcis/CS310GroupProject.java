package edu.jsu.mcis;

import org.json.simple.JSONArray;

public class CS310GroupProject {

    public static void main(String[] args) throws Exception {
        
        String input = "0109501101530003";
        
        if (args.length > 0) {
            input = args[0];
        }
        
        parse(input);
    }
    
    public static String parse(String input) throws Exception {
        
        Pattern_Parser patternParser = new Pattern_Parser();
        
        JSONArray fields = patternParser.parse(input);
        
        System.out.println(fields.toJSONString());
        
        return fields.toJSONString();
    }
    
}

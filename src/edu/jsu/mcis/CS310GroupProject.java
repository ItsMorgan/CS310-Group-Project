package edu.jsu.mcis;

import org.json.simple.JSONArray;

public class CS310GroupProject {

    public static void main(String[] args) throws Exception {
        
        String input = "010061414199999610123ABC%211234567890%3012345678";
        if (args.length > 0) {
            input = args[0];
        }
        Pattern_Parser patternParser = new Pattern_Parser();
        JSONArray fields;
        
        fields = patternParser.parse(input);
                
        System.out.println(fields.toJSONString());
        
    }
    
}

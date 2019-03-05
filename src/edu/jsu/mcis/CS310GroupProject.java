package edu.jsu.mcis;

public class CS310GroupProject {

    public static void main(String[] args) {
        
        String input = "";
        
        Pattern_Parser patternParser = new Pattern_Parser() {};
        AI_Parser aiParser = new AI_Parser();
        
        aiParser.parse(patternParser.parse(input));
        
    }
    
}

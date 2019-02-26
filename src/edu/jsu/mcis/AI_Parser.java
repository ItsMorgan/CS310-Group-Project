package edu.jsu.mcis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class AI_Parser {
    
    private LinkedHashMap<String, String[]> allAiAndData = new LinkedHashMap<>();
    private LinkedHashMap<String, JSONArray> currentAiAndData = new LinkedHashMap<>();
    
    private void addAiToHeaders() {
        BufferedReader reader = null;

        try {
            URL path = AI_Parser.class.getResource("AIData.txt");
            File file = new File(path.getFile());
            reader = new BufferedReader(new FileReader(file));

            String line;
            
            while ((line = reader.readLine()) != null) {
                String key = line.split(" &# ")[0];
                String[] data = new String[2];
                data[0] = line.split(" &# ")[1];
                data[1] = line.split(" &# ")[2];
                allAiAndData.put(key, data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    String parse(ArrayList<Matcher> matchers) {
        addAiToHeaders();
                
        StringBuilder ai = new StringBuilder();
        String[] ais = new String[matchers.size()];
        
        for (int matcherIndex = 0; matcherIndex < matchers.size(); matcherIndex++) {
            
            Matcher matcher = matchers.get(matcherIndex);
            
            char[] aiPattern = matcher.pattern().toString().toCharArray();
            boolean isAiNumber = true;
            for (Character character : aiPattern) {
                if (!Character.isDigit(character) && !character.equals("^"))
                    isAiNumber = false;
                if (isAiNumber && !character.equals("^")) {
                    ai.append(character);
                }
            }
            
            ais[matcherIndex] = ai.toString();
        }
        
        for (int aisIndex = 0; aisIndex < ais.length; aisIndex++) {
                
            JSONArray jsonData = new JSONArray();
            for (String data : allAiAndData.get(ais[aisIndex])) {
                jsonData.add(data);
            }
            currentAiAndData.put(ais[aisIndex], jsonData);
        }
        
        return JSONValue.toJSONString(currentAiAndData);
    }
}

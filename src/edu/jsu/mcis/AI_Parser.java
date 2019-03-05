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
    private ArrayList<String> codes = new ArrayList<>();
    private ArrayList<String> ais = new ArrayList<>();
    
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
    
    ArrayList<Matcher> parse(String matchers) {
        addAiToHeaders();
        return new ArrayList<Matcher>();   
    }
}

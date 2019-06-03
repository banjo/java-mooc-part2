package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {
    private Map<String, String> translation;
    private File file;

    public MindfulDictionary() {
        this.translation = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this();
        this.file = new File(file);

    }

    public void add(String word, String translation) {
        if (!this.translation.containsKey(word)) {
            this.translation.put(word, translation);
        }

        if (!this.translation.containsKey(translation)) {
            this.translation.put(translation, word);
        }

    }


    public String translate(String word) {
        if (translation.containsKey(word)) {
            return translation.get(word);
        }

        if (translation.containsKey(word)) {
            return translation.get(word);
        }

        return null;
    }

    public void remove(String word) {
        if (translation.containsKey(word)) {
            translation.remove(translation.get(word));
            translation.remove(word);

        }
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(this.file);
            loadFile(reader);
            reader.close();
            return true;
        } catch (Exception e) {
            return false;
        }


    }

    public void loadFile(Scanner reader) {
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] parts = line.split(":");
            this.translation.put(parts[0], parts[1]);
            this.translation.put(parts[1], parts[0]);
        }

    }

    public boolean save() {
        ArrayList<String> dontInclude = new ArrayList<String>();

        try {
            FileWriter writer = new FileWriter(this.file);
            for (String line : translation.keySet()) {

                if (dontInclude.contains(line)) {
                    continue;
                }

                String newString = line + ":" + translation.get(line);
                writer.write(newString + "\n");
                dontInclude.add(translation.get(line));
            }
            writer.close();
            dontInclude.clear();
            return true;
        } catch (Exception e) {
            dontInclude.clear();
            return false;
        }
    }
}

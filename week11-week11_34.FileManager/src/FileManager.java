
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public FileManager() {
    }

    public List<String> read(String file) throws FileNotFoundException {
        List<String> read = new ArrayList<String>();
        File fileObject = new File(file);
        Scanner reader = new Scanner(fileObject);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            read.add(line);
        }


        return read;
    }

    public void save(String file, String text) throws IOException {
        File fo = new File(file);
        FileWriter fw = new FileWriter(fo);
        fw.write(text);
        fw.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        File fo = new File(file);
        FileWriter fw = new FileWriter(fo);

        for (String text : texts) {
            fw.write(text + "\n");
        }

        fw.close();

    }
}

import java.io.*;
import java.util.ArrayList;

public class NumberedFile {

    static void numberedFile(File inputFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            String[] lines = bufferedReader.lines().toArray(String[]::new);
            bufferedReader.close();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputFile));
            for (int i = 0; i < lines.length; i++) {
                lines[i] = String.format("/* %d */ %s", i + 1, lines[i]);
            }

            bufferedWriter.write(String.join("\n", lines));
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        numberedFile(new File("in.txt"));
    }
}

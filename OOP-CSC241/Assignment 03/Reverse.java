import java.io.*;
import java.util.Collections;

public class Reverse {
    private static void reverseFile(File outputFile, File inputFile) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            String[] lines = bufferedReader.lines().sorted(Collections.reverseOrder()).toArray(String[]::new);
            bufferedWriter.write(String.join("\n", lines));

            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reverseFile(new File("out.txt"), new File("in.txt"));
    }
}

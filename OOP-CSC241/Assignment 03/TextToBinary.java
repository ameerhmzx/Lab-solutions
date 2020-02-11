import java.io.*;
import java.util.ArrayList;

public class TextToBinary {
    static void textFileToBinaryFile(File inputFile, File outputFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            ArrayList<String> lines = new ArrayList<>();
            bufferedReader.lines().forEach(lines::add);
            bufferedReader.close();

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFile));
            out.writeObject(lines);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        textFileToBinaryFile(new File("in.txt"), new File("out.bin"));
    }
}

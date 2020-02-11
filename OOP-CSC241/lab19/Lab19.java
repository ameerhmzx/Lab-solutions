import java.io.*;

public class Lab19 {
    public static void main(String[] args) throws IOException {
        try {
            File sourceFile = new File("test.dat");
            File distFile = new File("test-out.dat");

            FileOutputStream fileOutputStream = new FileOutputStream(distFile);
            FileInputStream fileInputStream = new FileInputStream(sourceFile);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            bufferedOutputStream.write(bufferedInputStream.readAllBytes());
            bufferedOutputStream.close();
            bufferedInputStream.close();
        }
        catch (FileNotFoundException e){
            File sourceFile = new File("test.dat");
            new DataOutputStream(new FileOutputStream(sourceFile)).write(new byte[]{55, 127, 126});
            main(args);
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedRead {
    public static void main(String[] args) throws IOException {

        String path = "Users\\gayathripamarthi\\IOOperations\\AboutMe.txt";
        FileReader reader = null;
        BufferedReader bw = null;
        try {
            File file = new File(path);
            reader = new FileReader(file);
            bw = new BufferedReader(reader);
            String str = bw.readLine();
            while (str != null) {
                System.out.println(str);
                str = bw.readLine();
            }
        } catch (Exception e) {
            System.out.println("Some Exception is caught");
        } finally {
            bw.close();
            reader.close();

        }

    }

}


//Using Buffer we can read and write from a file very fast
//File reader and File writer read and write the characters one by one, so the number of harddisk hits will be more so
// Using BufferReader and BufferWriter it stores temporaryly in buffer and we write flush to writes on to the harddisk at a time 
//when we use write it only writes to the memory file i.e into buffer not to the actual file
//so we should use flush to actually write on to the file
//if we close it flushes and closes the file
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBuffer {
    public static void main(String[] args) throws IOException {

        String path = "Users\\gayathripamarthi\\IOOperations\\AboutMe.txt";
        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            File file = new File(path);
            file.createNewFile();
            writer = new FileWriter(file, true);
            bw = new BufferedWriter(writer);
            bw.write("Gayathri pamarthi");
            bw.newLine();
            bw.write("She is very good");
            bw.flush();
        } catch (Exception e) {
            System.out.println("Some Exception is caught");
        } finally {
            bw.close();
            writer.close();

        }

    }
}
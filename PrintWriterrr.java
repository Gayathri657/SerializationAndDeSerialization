//Using FileReader and File Writer we are able to store only characters 
// so if we want to any datatype we go for print writer

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterrr {
    public static void main(String[] args) throws IOException {
        File file = new File("Users\\gayathripamarthi\\IOOperations\\AboutMe.txt");
        PrintWriter p = new PrintWriter(new FileWriter(file, true));
        p.println();
        p.println("hoooo!!!! HIIII");
        p.println("Where are you heading???");
        p.println(65);

        p.close();
    }

}

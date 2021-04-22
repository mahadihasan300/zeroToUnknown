package JavaBasic2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/H:/application for fb.txt");
        Scanner scanner = new Scanner(file);

        String fileContent = "";
        while (scanner.hasNextLine()) {
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
            //System.out.println(scanner.nextLine());
        }

        FileWriter writer = new FileWriter("/H:/newWritterFile.txt");
        writer.write(fileContent);
        writer.close();
    }
}

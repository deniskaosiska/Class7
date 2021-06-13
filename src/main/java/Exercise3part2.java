import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise3part2 {
    public static void main(String[] args) throws IOException {
        Exercise3Part3and4 instance = Exercise3Part3and4.getInstance();
        System.out.println(instance);
        instance.writeTexts();
//        File newFile = new File("C:\\Users\\Denis.Kozyra\\OneDrive - xcircular.com\\Desktop\\den.txt");
//        if (newFile.exists())
//            System.out.println ("The file already exist");
//         else {
//            newFile.createNewFile();
//        }
//        FileWriter fw = new FileWriter(newFile);
//         BufferedWriter bw = new BufferedWriter(fw);
//         bw.write(instance);
//         bw.close();
    }
}

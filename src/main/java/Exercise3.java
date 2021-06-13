import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;
//
//public class Exercise3 {
//    private static Exercise3 instance = new Exercise3();
//
//    private Exercise3(){ }
//    public void writeText() throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        File newFile = new File("C:\\Users\\Denis.Kozyra\\OneDrive - xcircular.com\\Desktop\\log.txt");
//        if (newFile.exists())
//            System.out.println ("The file already exist");
//        else {
//            newFile.createNewFile();
//        }
//        FileWriter fw = new FileWriter(newFile);
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write(name);
//        bw.close();
//    }
//    public static Exercise3 getInstance(){
//        return instance;
//    }
//}

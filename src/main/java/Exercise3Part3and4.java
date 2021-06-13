import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Exercise3Part3and4 {

        private static Exercise3Part3and4 instance = new Exercise3Part3and4();

        private Exercise3Part3and4(){ }
        public void writeTexts() throws IOException {
            System.out.println("Type your name");
            Scanner scanner1 = new Scanner(System.in);
            String name = scanner1.next();
            System.out.println("Type your age");
            Scanner scanner2 = new Scanner(System.in);
            int age = scanner2.nextInt();
            System.out.println("Type your adress");
            Scanner scanner3 = new Scanner(System.in);
            String adress = scanner3.next();
            System.out.println("Type your phone");
            Scanner scanner4 = new Scanner(System.in);
            String phone = scanner4.next();
            File newFile = new File("C:\\Users\\Denis.Kozyra\\OneDrive - xcircular.com\\Desktop\\log.txt");
            if (newFile.exists())
                System.out.println ("The file already exist");
            else {
                newFile.createNewFile();
            }
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name);
            bw.write(age);
            bw.write(adress);
            bw.write(phone);
            bw.close();
        }
        public static Exercise3Part3and4 getInstance(){
            return instance;
        }
    }


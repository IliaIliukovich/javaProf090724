package lesson20241203.iostreams;

import java.io.*;
import java.util.Scanner;

public class ReadFileExamples {

    public static void main(String[] args) {

//        Reader reader = null;
//        try {
//            reader = new FileReader("resources/file.txt");
//
//            int i = reader.read();
//            while (i != -1) {
//                char c = (char) i;
//                System.out.println(c);
//                i = reader.read();
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//           e.printStackTrace();
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

//        try (
//            Reader reader = new FileReader("resources/file.txt");
//            BufferedReader bufferedReader = new BufferedReader(reader);
//        ) {
//            String line = bufferedReader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//        } catch (IOException e) {
//           e.printStackTrace();
//        }

        try (
            Scanner scanner = new Scanner(new File("src/main/resources/file.txt"));
        ) {
           while (scanner.hasNext()) {
               System.out.println(scanner.nextLine());
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}

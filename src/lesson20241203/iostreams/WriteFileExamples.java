package lesson20241203.iostreams;

import java.io.*;

public class WriteFileExamples {

    public static void main(String[] args) {
        File file = new File("resources/file.txt");
        System.out.println(file.exists());

//        try {
//            Writer writer = new FileWriter(file);
//            writer.write("abc");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Writer writer = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            writer = new FileWriter(file, true);
//            bufferedWriter = new BufferedWriter(writer);
//
//            bufferedWriter.newLine();
//            bufferedWriter.write("abc");
//            bufferedWriter.newLine();
//            bufferedWriter.write("cde");
//
//            // IOException
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (writer != null) {
//                    writer.close();
//                }
//                if (bufferedWriter != null) {
//                    bufferedWriter.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        // try-with-resources
        try (
            Writer writer = new FileWriter(file); // implements Closable
            BufferedWriter bufferedWriter = new BufferedWriter(writer); // implements Closable
        ) {
            bufferedWriter.write("abc");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}

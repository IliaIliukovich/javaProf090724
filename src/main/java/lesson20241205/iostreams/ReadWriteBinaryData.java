package lesson20241205.iostreams;

import java.io.*;

public class ReadWriteBinaryData {
    public static void main(String[] args) {

        // Записать 3 бита '101' в файл, считать их.
        // 000 001 010 011 100 101

        byte data = 0b101;
        data = 5;

        try (OutputStream stream = new FileOutputStream("src/main/resources/binaryFile")){
            stream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputStream = new FileInputStream("src/main/resources/binaryFile")){
            int input = inputStream.read();
            System.out.println(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Kitten image:
        try (InputStream inputStream = new FileInputStream("src/main/resources/kitten.png")){
            int input = inputStream.read();
            for (int i = 0; i < 10; i++) {
                System.out.println(input + " : " + Integer.toHexString(input) + " : " + (char) input);
                input = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

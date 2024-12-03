package summary20241129.iostreams;

import java.io.File;
import java.util.Arrays;

public class FileExamples {

    public static void main(String[] args) {
        File fileOrFolder = new File("resources\\file.txt");
        System.out.println(fileOrFolder.exists());
        System.out.println(fileOrFolder.isFile());

        fileOrFolder = new File("resources/newFolder");
        fileOrFolder.mkdir();
        System.out.println(fileOrFolder.exists());
        String[] listed = fileOrFolder.list();
        System.out.println(Arrays.toString(listed));

    }



}

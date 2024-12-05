package lesson20241205.iostreams;

import java.io.*;
import java.util.Arrays;

public class ReadWriteObject {

    public static void main(String[] args) {
        Address address = new Address("NY", "Wall Street");
        Person person = new Person("Tom", 24, address);

        byte[] byteArray = null;
        try (
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
        ) {
            outputStream.writeObject(person);
            byteArray = out.toByteArray();

            System.out.println(Arrays.toString(byteArray));
            for (int i = 0; i < byteArray.length; i++) {
                System.out.print((char) byteArray[i] + " ");
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
            Person deserializedPerson = (Person) objectInputStream.readObject();
            System.out.println(person);
            System.out.println(deserializedPerson);
            System.out.println(person == deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }



}

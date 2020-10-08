package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HelloWorld_Serialization {

    public static void main(String[]args) throws IOException {
        try {

            String str = "Hello, World";
            FileOutputStream ous = new FileOutputStream("String.txt");
            ObjectOutputStream oos = new ObjectOutputStream(ous);
            oos.writeObject(str);
            oos.flush();
            oos.close();
            System.out.println("Serialized");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

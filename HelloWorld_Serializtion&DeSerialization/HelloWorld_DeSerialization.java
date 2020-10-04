package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HelloWorld_DeSerialization {

    public static void main(String[]args) throws IOException {

        try{

            FileInputStream ins = new FileInputStream("String.txt");
            ObjectInputStream oin = new ObjectInputStream(ins);
            String str = (String) oin.readObject();
            System.out.println("De-serialized");
            System.out.println(str);

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}

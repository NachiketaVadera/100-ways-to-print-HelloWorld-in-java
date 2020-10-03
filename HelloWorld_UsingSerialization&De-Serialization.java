
import java.io.*;

class serializn {

    public static void main(String[]args) throws IOException {
        try {

            String str1 = "Hello, World";
            FileOutputStream ous = new FileOutputStream("String.txt");
            ObjectOutputStream oos = new ObjectOutputStream(ous);
            oos.writeObject(str1);
            oos.flush();
            oos.close();
            System.out.println("Serialized");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class de_serializn {
    public static void main(String[]args) throws IOException{

        try{

            FileInputStream ins = new FileInputStream("String.txt");
            ObjectInputStream oin = new ObjectInputStream(ins);
            String str2 = (String) oin.readObject();
            System.out.println("De-serialized");
            System.out.println(str2);

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}

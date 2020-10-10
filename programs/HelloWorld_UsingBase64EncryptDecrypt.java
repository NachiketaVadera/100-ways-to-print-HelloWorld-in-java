import java.util.Base64;

/**
 * This class shows how to use java.util.Base64 encoder
 * and decoder to securely encrypt/decrypt string - Hello World.
 * */
public class HelloWorld_UsingBase64EncryptDecrypt {

    public static void main(String[] args) {

        String greeting = "Hello, World";
        // Get Encoder
        Base64.Encoder base64Encoder = Base64.getEncoder();

        String encodedStr = base64Encoder.encodeToString(greeting.getBytes());
        System.out.println("Encoded message: "+encodedStr);

        // Get decoder
        Base64.Decoder base64Decoder = Base64.getDecoder();

        String decodedStr = new String(base64Decoder.decode(encodedStr));
        System.out.println("Decoded message: "+decodedStr);

        if(decodedStr.equals(greeting)) {
            System.out.println("Encryption-Decryption working successfully");
        }else {
            System.out.println("Encryption-Decryption not working.");
        }
    }
}

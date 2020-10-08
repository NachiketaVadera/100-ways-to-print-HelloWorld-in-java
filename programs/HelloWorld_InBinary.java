public class HelloWorld_InBinary {
        public static void main(String[] args) {
                String text = "Hello, World!";
                byte[] bytes = text.getBytes();
                StringBuilder binary = new StringBuilder();

                for (byte b : bytes) {
                        int val = b;
                        for (int i = 0; i < 8; i++) {
                                binary.append((val & 128) == 0 ? 0 : 1);
                                val <<= 1;
                        }
                        binary.append(' ');
                }

                System.out.println(text + " in binary is \n" + binary.toString());
        }
}

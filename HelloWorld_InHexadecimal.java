/**
 * @author Haris Fi on 03.10.2020
 * @project 100-ways-to-print-HelloWorld-in-java
 **/
public class HelloWorld_InHexadecimal {

	public static void main(String[] args) {
		String hexString = "48656c6c6f2c20776f726c6421";
        	byte[] bytes = hexStringToByteArray(hexString);
          	try {
              		System.out.println(new String(bytes, "UTF-8"));
          	} catch (Exception e) {
              		e.printStackTrace();
          	}
	}
	
	public static byte[] hexStringToByteArray(String hex) {
    		int l = hex.length();
    		byte[] data = new byte[l / 2];
    		for (int i = 0; i < l; i += 2) {
        		data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
    		}
		return data;
	}
}

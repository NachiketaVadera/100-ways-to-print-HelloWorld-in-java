
public class HelloWorld_OneCharEverySecond {
	public static void main(String[] args) throws InterruptedException {
		String helloWorld = "Hello, World!";
		
		for(char c:helloWorld.toCharArray()) {
			System.out.print(c);
			Thread.sleep(1000);
		}
	}
}

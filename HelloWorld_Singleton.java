
public class HelloWorld_Singleton {
	
	private String str1;
	
    private  HelloWorld_Singleton() {
    	str1 ="Hello,World!";
	}
    
    public static HelloWorld_Singleton getInstance(){
    	return new HelloWorld_Singleton();
    }
    
    public static void main(String[] args) {
    	System.out.println(HelloWorld_Singleton.getInstance().str1);
    	
	}

}


public class HelloWorld_Singleton {
	
	private String greetings;
	
	private static HelloWorld_Singleton singletonClass= null;
	
    private  HelloWorld_Singleton() {
    	greetings ="Hello,World!";
	}
    
    public static HelloWorld_Singleton getInstance(){
    	
    	if(singletonClass == null){
    		 singletonClass = new HelloWorld_Singleton();
    	} 
    	return singletonClass;
    	
    }
    
    public static void main(String[] args) {
    	System.out.println(HelloWorld_Singleton.getInstance().greetings);
    	
	}

}

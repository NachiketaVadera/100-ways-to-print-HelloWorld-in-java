import java.lang.*;

class HelloWorld_CharAt {

public static void main(String args[])
{
    String word = "Hello World" ;

    for (int i=0;i<word.length();i++)
    {

        System.out.println(word.charAt(i));
        try
        {
            Thread.sleep(200);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    }
}


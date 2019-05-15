public class CustomException {
  public static void main(String[] args) {
    ExceptionExecution ee = new ExceptionExecution();
    try {
      ee.printException();
    } catch(MyException e) {
      System.out.println(e.toString());
    }
  }
}
class MyException extends Exception {
  public String toString() {
  return "Hello, World!";
  }
}
class ExceptionExecution {
  public void printException() throws MyException {
    throw new MyException();
  }
}

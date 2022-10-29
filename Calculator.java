public class Calculator{

  //This is a constructor
  public Calculator() {

  }

  //add method
  public int add(int a, int b) {
    return a + b;
  }

  //subtract method
  public int subtract(int a, int b) {
    return a - b;
  }
  //multiply method
  public int multiply(int a, int b) {
    return a * b;
  }

  //divide method
  public int divide(int a, int b) {
    return a / b;
  }

  //modulo method
  public int modulo(int a, int b) {
    return a % b;
  }
  
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    
    //Calling all methods created above on myCalculator object
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    System.out.println(myCalculator.multiply(5, 5));
    System.out.println(myCalculator.divide(20, 4));
    System.out.println(myCalculator.modulo(10, 3));
  }
}

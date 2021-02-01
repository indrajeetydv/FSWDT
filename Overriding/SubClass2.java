import java.io.*; 
  
class SuperClass2 { 
  
    // SuperClass declares an unclecked exception 
    void method() throws RuntimeException 
    { 
        System.out.println("SuperClass"); 
    } 
} 
  
class SubClass2 extends SuperClass2 { 
  
    // SubClass declaring without exception 
    void method() throws /*RuntimeException* (working)//*Exception(not working)*/ArithmeticException
    { 
        System.out.println("SubClass"); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass2 s = new SubClass2(); 
        s.method();
    } 
} 
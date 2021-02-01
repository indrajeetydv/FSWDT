import java.io.*; 
  
class SuperClass4 { 
  
    // SuperClass declares an Unchecked exception 
    void method() throws ArithmeticException 
    { 
        System.out.println("SuperClass"); 
    } 
} 
  
// SuperClass inherited by the SubClass 
class SubClass4 extends SuperClass4 { 
  
    // SubClass declaring without exception 
    void method() 
    { 
        System.out.println("SubClass"); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass4 s = new SubClass4(); 
       s.method(); 
       
    } 
} 
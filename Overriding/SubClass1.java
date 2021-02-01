import java.io.*; 
  
class SuperClass1 {   
    // SuperClass doesn't declare any exception 
    void method(){ 
        System.out.println("SuperClass"); 
    } 
} 
  
class SubClass1 extends SuperClass1 { 
 
    // method() declaring UnChecked Exception IOException 
    void method() throws ArithmeticException{  
        System.out.println("SubClass"); 
    } 
  
    // Driver code 
    public static void main(String args[]){ 
        SuperClass1 s = new SubClass1(); 
        s.method(); 
    } 
} 
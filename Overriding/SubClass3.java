import java.io.*; 
  
class SuperClass3 { 
  
    // SuperClass declares an checked exception 
    void method() throws IOException 
    { 
        System.out.println("SuperClass"); 
    } 
} 
  
// SuperClass inherited by the SubClass 
class SubClass3 extends SuperClass3 { 
  
    // SubClass declaring without exception 
    void method() 
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
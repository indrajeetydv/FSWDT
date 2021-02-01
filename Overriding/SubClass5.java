import java.io.*; 
  
class SuperClass5 { 
  
    // SuperClass declares an Checked exception 
    void method() throws Exception 
    { 
        System.out.println("SuperClass"); 
    } 
} 
  

class SubClass5 extends SuperClass5 { 
  
    // SubClass declaring without exception 
    void method() throws /*RuntimeException* (working)//*Exception(not working)*/ArithmeticException
    { 
        System.out.println("SubClass"); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass5 s = new SubClass5(); 
       // s.method();
        try { 
            s.method(); 
        }catch (ArithmeticException e) { 
            System.out.println("ArithmeticException catch executed");
            e.printStackTrace(); 
        }  
        catch (Exception e) { 
            System.out.println("Exception catch executed");
            e.printStackTrace(); 
        } 
    } 
} 
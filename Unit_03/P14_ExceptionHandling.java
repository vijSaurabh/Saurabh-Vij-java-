package Unit_03;
/*we use try & catch to write sensitive code so that it doesn't terminates
 * alag alag case kae liye alag alag catch hota hai 
 * 1 try kae multiple catch ho saktae hai
 * kabhi super class ka exception catch mae pahelae nhi likh sakthe
 * either use try,catch or throw
 * throws :-we let complier decide how to deal with the exception 
 * we use throw in only function
 * finally is generally use to cleanup i.e. close a file etc 
 * 
 * 
 */
import java.util.*;
public class P14_ExceptionHandling {

	public static void main(String[] args) {
	      ABCDE obj = new ABCDE();
	     // obj.basicExeption();
	     // obj.InputMismatchException();
	      //obj.indexOutOfBoundExceptionPart1();
	      //obj.stackOverflowError(12);
	      //obj.nullPointerException();
	      //obj.useofthrow_and_finaaly();
	      obj.manualExceptionThrow();
	}
}
class ABCDE{
	
	void basicExeption() {
		try {
			//sensitive code
			int b=0;
			int a = 100/b;
			System.out.println(a);
		 
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			//rest of the code!
			System.out.println("Done!");
		}	
	
	void InputMismatchException() {
		//java.utils.InputMismatchException
		
		try {
			Scanner sr = new Scanner(System.in);
			System.out.println("enter a no");
			int a=sr.nextInt();
			System.out.println("you entered"+a);
			sr.close();
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void stackOverflowError(int a) {
		try {
			while(a>0) {
				a++;
				stackOverflowError(a);
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done!");//it will not work becoz stackoverflowis a error
	}
	
	void indexOutOfBoundExceptionPart1() {
		try {
		int[] nums= {1,2,3,4};
		System.out.println(nums[10]);
	  }catch(Exception e) {
			System.out.println(e.getMessage());
		}
		// The finally stmt lets you exe code,after try...catch
		//no matter what ;used to do important things like clearing memory
		System.out.println("Done!");
	}
	void nullPointerException() {
		try {
			String s = null;
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
  
	void useofThrow(int age)throws Exception{
		/*kuch method aisae hote hai jo throw use nhi krna chahtae isliye throws kr dete hai
		  jo bhi usko use karega. ya tu use usme catch krna padega ya throw
		  
		  checked_exception(compile-time exception)  :-  when the compiler is able to check
		                                              that their is need of exception while compiling 
		  unchecked_exception(run_time exception):-when the exception occurs at the runtime 
		*/
		if (age<18) {
			throw new Exception();
		}else {
			System.out.println("you are allowed to enter");
		}
		
	}
    void useofthrow_and_finaaly () {
    	try {
    		useofThrow(7);
    	}catch(Exception e) {
    		e.printStackTrace();//
    	}
    	finally {
    		System.out.println("The try catch block is finished");
    	}
    }
    void manualExceptionThrow()
    {
    	try {
    		calculateAge(-1);
    	}catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    }
    
    void calculateAge(int r) throws ManualEXception{
    	
    	if(r<0) {
    		throw new ManualEXception();
    		
    	}
    	else System.out.println("you can enter");
    }
    
    @SuppressWarnings("serial")
    class ManualEXception extends Exception{
    	@Override
    	public String getMessage()
    	{
    		String detailMessage = "Exception Occured";
    		return detailMessage;
    	}
    } 
}

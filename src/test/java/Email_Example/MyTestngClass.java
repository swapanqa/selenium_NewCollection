package Email_Example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class MyTestngClass {
	
	
	
  @Test
  public void test1() {
	  
	 int a=49;
	 int b=49;
	 
	 Assert.assertEquals(a, b);
	  
	  System.out.println("=====Test done=============");
	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	 System.out.println("=======Start the test===================="); 
	  
	  
  }
  
  
  

  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException {
	  
	  if(result.getStatus() == ITestResult.FAILURE) {
		  EmailDemo.emailSend(); 
	  }
	  
	  
  }

}

package org.unittesting;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RullAll {

	@Test
	
	public void TestCase() {

    Result run = JUnitCore.runClasses(Page1.class,page2.class,Page3.class);
    
   System.out.println("Ignore count = "+run.getIgnoreCount());
   System.out.println("Failur Count = "+run.getFailureCount());
   System.out.println("RunCount ="+run.getRunCount());
   System.out.println("RunTime = "+run.getRunTime());
  List<Failure> li= run.getFailures();
  
  for (Failure fail : li) {
	  
	  System.out.println(fail);
	
}
    
    

	}
	
	
	
}

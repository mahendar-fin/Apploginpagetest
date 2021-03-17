package com.app.ExtentReportListener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.app.base.AppTestbase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Newreports extends AppTestbase {
	public static ExtentReports report;
	public static ExtentTest test;


	public Newreports() {
		super();
	}
	//public static HTMLReporter html;
@BeforeTest
	public void rep()
	{
		String Tc = "testcasename";
	

 report = new ExtentReports("./Reports/learn_automation1.html");
//report.startReporter(html ,true);

// test = new  ExtentTest(report);
 test=report.startTest(Tc);
 test.log(LogStatus.PASS, Tc);
 test.log(LogStatus.FAIL, Tc);
 test.log(LogStatus.ERROR, Tc);
 test.log(LogStatus.INFO, Tc);
 test.log(LogStatus.SKIP, Tc);
// I used (.) in path where represent the current working directory


    // Create object of ExtentReports class- This is main class which will create report


    // attach the reporter which we created in Step 1

	}
	
	@AfterTest
	public void endreport()
	{
		report.flush();
		
	}
}



package com.site.tests.Utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Reporter {


    private static ExtentReports reporter;
    private static ExtentTest logger ;
    
    

    public static ExtentReports getReport() {
        return reporter;
    }
    public static void setLogger(ExtentTest logger) {
        Reporter.logger = logger;
    }

    public static ExtentTest getLogger() {
        return logger;
    }

    public static ExtentTest generatereport(String reportfileName , boolean replaceExisting , String testcase, String description   ){
        reporter = new ExtentReports( reportfileName,  replaceExisting);
        ExtentTest logger = reporter.startTest(testcase, description);
        return logger;
    }












}


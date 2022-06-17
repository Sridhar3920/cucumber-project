package org.runnerClass;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

public static void report(String path) {
	File f=new File("D:\\eclipse\\CucumberFramework\\report\\JVMReport");
	Configuration c=new Configuration(f, "facebook");
	c.addClassifications("OS", "WINDOWS");
	c.addClassifications("Tools", "ECLIPSE");
	List<String> l=new LinkedList<String>();
	l.add(path);
	ReportBuilder r=new ReportBuilder(l, c);
	r.generateReports();
	
}
}

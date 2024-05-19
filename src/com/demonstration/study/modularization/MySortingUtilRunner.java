package com.demonstration.study.modularization;

public class MySortingUtilRunner {
	/*
	 * MODULARIZATION:
	 * -This is being able to separate your applications into modules and then connect them by adding them to each other's classpath 
	 * -This was done for modularization-consumer-jar and /modularization-service-jar; The consumer need the service jar to work 
	 * -So we added the service-jar to the consumer-jar
	 * -Adding to Classpath:
	 * 		-Right Click on the needing project
	 * 		-Click on properties
	 * 		-Click on the projects tab
	 * 		-Click on Classpath
	 * 		-Navigate to the right and click on add
	 * 		-Select the Jar
	 * 		-Click on Apply and Close
	 * 		-Make necessary imports
	 * -Creating a Java Module is like creating a java project since it is actually a project
	 * ==============================================================================================================
	 * A BETTER WAY TO MODULARIZE YOUR APP
	 * ==============================================================================================================
	 * -Create a Java Project || Add a name for the module-info.java file ||Click(on the project needing modules)->properties->project->modulepath->Add module->apply
	 * -Add required modules by adding "requires <module_name>" in the needing module
	 * -Export required classes in the module-info.java in the added module like this: "exports <package_name_of_the_classes>"
	 * 
	 */
	public static void main(String[] args) {

	}

}

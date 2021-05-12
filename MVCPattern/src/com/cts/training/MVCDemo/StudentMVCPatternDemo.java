package com.cts.training.MVCDemo;

public class StudentMVCPatternDemo {

	public static void main(String[] args) {
		
		//fetching data from database
		Student model = retriveStudentFromDatabase();
		
		//Create a view to write details on console
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model,view);
		
		//view.printStudentDetails(model.getName(), model.getRoolNo());
		
		controller.updateView();
		
		controller.setStudentName("john");
		
		controller.updateView();
		
		//view.printStudentDetails(model.getName(), model.getRoolNo());
	
		
		
		
		

	}
	
	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Siva");
		student.setRoolNo("01");
		return student;
	}

}

package com.cts.training.MVCDemo;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name){
	      model.setName(name);		
	   }

	   public String getStudentName(){
	      return model.getName();		
	   }

	   public void setStudentRollNo(String rollNo){
	      model.setRoolNo(rollNo);		
	   }

	   public String getStudentRollNo(){
	      return model.getRoolNo();		
	   }

	
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRoolNo());
	}
	

}

package com.hawkExample;

public class HelloWorld {
	
	private String message;
	
	public void setMessage(String message){
		this.message= message;
	}
	public void getMessage(){
		System.out.println("Hawk message : " + message);
	}
}

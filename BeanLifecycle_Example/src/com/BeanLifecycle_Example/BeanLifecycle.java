package com.BeanLifecycle_Example;

public class BeanLifecycle {
	private String message;
	
	public void setMessage(String message){
		this.message=message;
	}
	
	public void getMessage(){
		System.out.println("Hawk Message :"+message);	
	}
	public void init(){
		System.out.println("Bean is going through init");
	}
	
	public void destroy(){
		System.out.println("Bean will destroy now !");
	}
	
	

}

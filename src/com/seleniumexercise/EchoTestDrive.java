package com.seleniumexercise;

public class EchoTestDrive {
public static void main(String[] args) {
	Echo e1=new Echo();
	Echo e2 =new Echo();
	Echo e21=e1;
	 
	int x=0;
	while(x<4){
		e1.hello();
		e1.count=e1.count+1;
		if(x==3){
			e21.count=e21.count+1;
			
		}
		if(x>0){
			e21.count=e21.count+e1.count;
	}
		x=x+1;
	}
	System.out.println(e21.count);
	
}

}
 
class Echo{

	  int count=0;

	  void hello() {
		// TODO Auto-generated method stub
		System.out.println("helloooooooooooo");
	}
	
}
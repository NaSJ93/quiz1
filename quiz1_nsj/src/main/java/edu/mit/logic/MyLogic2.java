package edu.mit.logic;

public class MyLogic2 {
	
	public int addup(int num1,int num2) {
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public int evenAddup(int num1,int num2) {	//짝수만
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			if(i%2==0)
				sum+=i;
		}
		return sum;
	}
}

//Enter code here
import java.util.*;
  class  SimpleInterest {
	
	private double  amount;
	private double time;
	private double rate;
	
	void setValues(double pa, double tp, double ir){ 
		 //write code to assign value here 
		this.amount=pa;
		this.time=tp;
		this.rate=ir;
		}
	
	double getInterestAmount(){
	    
		double ans=(this.amount*this.time*this.rate)/100;
	//	double a=Math.round(ans)
		return (Math.round(ans*100))/100.0;
		
		 //write code to computer and return the interest amount rounded to two  decimal places 
		} 
  }
  class Main{ 
      
  public static void main(String args[]){ 
    SimpleInterest siOne = new SimpleInterest(); 
    SimpleInterest siTwo = new SimpleInterest(); 

    siOne.setValues(1005, 2, 7.5); 
    siTwo.setValues(1235.50, 2.5, 8.25);
    
    System.out.println("Simple interest amount for siOne is "+siOne.getInterestAmount());
    System.out.println("Simple interest amount for siTwo is "+siTwo.getInterestAmount());
  } 
}

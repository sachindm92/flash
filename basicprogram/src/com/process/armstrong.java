package com.process;

public class armstrong
{
	int x;
	int arm(int n,int a)
	{
	if(n!=0)
	{
		x=n%10;
		a=a+(x*x*x);
		n/=10 ;
		return arm(n,a);
	}
	return a;
	}
	public static void main(String[] arg)
	{
		armstrong A=new armstrong();
	int arm;
	System.out.println("Armstrong numbers between 1 to 1000");
	for(int num=1;num<500;num++)
	{
	arm=A.arm(num,0);
	if(arm==num)
	      System.out.println(num);
	}
	}
}

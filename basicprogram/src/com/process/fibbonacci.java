package com.process;

import java.util.Scanner;

public class fibbonacci
{
	int c=0,i=0,j=1,next;
	void fib(int n)
	{
	if(n>0)
	{
	    if(c<=1)
	      next=c;
	    else
	    {
		next=i+j;
		i=j;
		j=next;
	    }
	    System.out.print(next+" ");
	    c++;
	    fib(--n);
	}
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of terms");
	int num=sc.nextInt();
	fibbonacci f=new fibbonacci();
	System.out.println("Fibonacci series is ");
	f.fib(num);
	}
}
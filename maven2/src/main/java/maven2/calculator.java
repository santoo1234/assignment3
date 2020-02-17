package maven2;

import java.util.Scanner;
public class calculator{
static double add(double a,double b)
{
return a+b;
}
static double sub(double a,double b)
{
return a-b;
}
static double mul(double a,double b)
{
return a*b;
}
static double div(double a,double b)
{
return a/b;
}
public static void main(String args[])
{
Scanner v=new Scanner(System.in);
double a,b,res=0;
char op;
System.out.println("Enter first number");
a=v.nextFloat();
System.out.println("Enter second number");
b=v.nextFloat();
System.out.println("\nEnter the operation needed \n + for Addition\n - for substraction\n* for multiplication\n/ for division");
op=v.next().charAt(0);
switch(op)
{
case '+':
       res=add(a,b);
	System.out.println(res);
	break;
case '-':
	res=sub(a,b);
	System.out.println(res);
	break;
case '*':
	res=mul(a,b);
	System.out.println(res);
	break;
case '/':
	if(b==0)
	System.out.println("Division with Zero is not possible");
	else
	{
	res=div(a,b);
	System.out.println(res);
	}
}
}
}

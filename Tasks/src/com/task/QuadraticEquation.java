package com.task;
import static java.lang.Math.*;  
public class QuadraticEquation  
{  
 
static void calculateRoots(int a, int b, int c)  
{  
  
if (a == 0)   
{  
System.out.println("The value of a cannot be 0.");  
return;  
}  

int d = b * b - 4 * a * c;  
double sqrtval = sqrt(abs(d));  
if (d > 0)   
{  
System.out.println("The roots of the equation are real and different. \n");  
System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
}  
else if (d == 0)   
{  
System.out.println("The roots of the equation are real and same. \n");  
System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
}  

else   
{  
System.out.println("The roots of the equation are complex and different. \n");  
System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
}  
}  
 
public static void main(String args[])  
{  
  
int a = 1, b = -2, c = 5;      

calculateRoots(a, b, c);  
 
}  
}  

import java.io.*;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Math;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) 
	{
int a,b;
Scanner sc = new Scanner(System.in);
{
System.out.println("Enter two number");
a = sc.nextInt();
b = sc.nextInt();
System.out.println(" select the mathematical operator (+,-,*,/):");
char op = sc.next().charAt(0);
double num = 0;

switch (op) {
// case to add two numbers
case '+':
    num = a + b;
    break;

// case to subtract two numbers
case '-':
    num = a - b;
    break;

// case to multiply two numbers
case '*':
    num = a * b;
    break;

// case to divide two numbers
case '/':
    num = a / b;
    break;

default:
    System.out.println("You enter wrong input");
}
System.out.println("The final result:");
System.out.println();
System.out.println(a+ " " +op+ " " +b+ " = " + num);
}
	}
}


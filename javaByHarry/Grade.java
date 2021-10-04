import java.util.Scanner;
class Grade
{
public static void main(String[] args)
{
	char grade = 'B';
    grade = (char)(grade+8);
	System.out.println("your grade is :"+grade);
	System.out.println("-------------------------------------------------");
	grade = (char)(grade-8);
	System.out.println(grade);
}
}
package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner GradeInput=new Scanner(System.in);
	int Grade;
	String Name;

	//Input the Name and Grade
        System.out.println("Please enter the student's name.");
        Name= GradeInput.nextLine();
        System.out.println("Please enter the student's grade.");
        Grade= GradeInput.nextInt();
        System.out.println();

    //Checking the grade
        if (Grade<60)
            {
                System.out.println("Summary");
                System.out.println("Name: "+Name);
                System.out.println("Grade: F");
            }
        else
            {
                if (Grade<70)
                    {
                        System.out.println("Summary");
                        System.out.println("Name: "+Name);
                        System.out.println("Grade: D");
                    }
                else
                    {
                        if (Grade<80)
                            {
                                System.out.println("Summary");
                                System.out.println("Name: "+Name);
                                System.out.println("Grade: C");
                            }
                        else
                            {
                                if (Grade<90)
                                    {
                                        System.out.println("Summary");
                                        System.out.println("Name: "+Name);
                                        System.out.println("Grade: B");
                                    }
                                else
                                    {
                                        if (Grade<95)
                                            {
                                                System.out.println("Summary");
                                                System.out.println("Name: "+Name);
                                                System.out.println("Grade: A");
                                            }
                                        else
                                            {
                                                System.out.println("Summary");
                                                System.out.println("Name: "+Name);
                                                System.out.println("Grade: A+");
                                            }
                                    }
                            }
                    }
            }
    }
}

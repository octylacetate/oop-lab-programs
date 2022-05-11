import java.util.Scanner;
public class GradeMarks {
    public static void main(String[] args){
        Scanner myGrades = new Scanner(System.in);
        
		System.out.println("Enter your marks for oop : ");
		int gradesOop = myGrades.nextInt();
		System.out.println("Enter your marks for accounting : ");
		int gradesAccounting = myGrades.nextInt();
		System.out.println("Enter your marks for stats : ");
		int gradesStats = myGrades.nextInt();
		System.out.println("Enter your marks for english : ");
        int gradesEng = myGrades.nextInt();
		 int totalMarks=400,marks;
        marks = gradesOop + gradesStats + gradesAccounting + gradesEng;
		
		
		if(marks<=200){
			System.out.println("you fail!");
		}
		if(marks>200 && marks<=300){
				System.out.println("grade C");
		}
		if(marks>300 && marks<=350){
				System.out.println("grade B");
		}
		if(marks>350 && marks<=400){
				System.out.println("Grade A marvelous!");
		}	

if(marks>400 && marks<0){
	System.out.println("Invalid input plz check again");
	
}		
		
		
		
		
		
		
		


		
    }

}
import java.util.Scanner;
public class task2 {
    public static void  main(String[] args){
        System.out.println("Grade Calculator! ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int subjects= sc.nextInt();
        int sum =0;
        for(int i = 1; i <= subjects; i++){
            System.out.print("Enter marks of Subject " + i+ ": ");
            int marks = sc.nextInt();
            sum = sum + marks;
        }
        int perc = sum/subjects;
        System.out.println("Percentage: "+sum/subjects);

        System.out.println("Total Marks: "+sum+"/"+subjects*100);
        // System.out.println("");

        //Grading system
        if (perc <= 100 && perc>=90){
            System.out.println("Grade: A");
        }
        else if(perc <= 89 && perc>=75){
            System.out.println("Grade: B");
        }
        else if(perc <= 74 && perc>=50){
            System.out.println("Grade: C");
        }
        else if(perc <= 49 && perc>=35){
            System.out.println("Grade: D");
        }
        else if(perc <= 34 && perc>=27){
            System.out.println("Grade: B");
        }
        else{
            System.out.println("Grade: Fail");
        }
    
        sc.close();
    }
}

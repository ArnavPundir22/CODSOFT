import java.util.Scanner;

public class StudentGradeCalculator {
    public static float Sum = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number of Subjects: ");
        int NUmSub= input.nextInt();
        input.nextLine();
        String[] Subjects = new String[NUmSub];
        float[] Marks = new float[NUmSub];

        for(int i = 0; i<NUmSub;++i){
            System.out.print("Enter the Subject Name :");
            Subjects[i]= input.next();
            System.out.println();
            System.out.printf("Enter Marks in %s : ",Subjects[i]);
            Marks[i] = input.nextInt();
            if ( Marks[i]>100){
                System.out.println("# Enter the Marks out of 100");
                break;
            }
            System.out.println();
        }
        for(int i = 0; i < NUmSub;++i){
            Sum+=Marks[i];
        }
        int Total = NUmSub*100;
        char grade;
        float percentage = (Sum/Total)*100;
        if(percentage>90){
            grade='A';
        } else if (percentage>70) {
            grade='B';
        } else if (percentage>50) {
            grade='C';
        } else if (percentage>40) {
            grade='D';
        }else if (percentage>33){
            grade='E';
        }else grade='F';

        System.out.println("Total Marks : "+Sum);
        System.out.println("Average Percentage : "+percentage);
        System.out.println("Grade : "+grade);

    }
}

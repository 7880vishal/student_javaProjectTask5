import java.util.*;
public class student{
    public static void main (String args[]){
        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<6; i++){
            System.out.println("Enter marks of subject"+(i+1)+":");
            marks[i] = sc.nextInt();
            total = total+ marks[i];
        }
        sc .close();
        //calc avg here
        avg = total/6;
        System.out.println("The student grade is:");
        if(avg>=80){
            System.out.print("A");
        }
        else if(avg>=60 && avg<80) {
            System.out.print("B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else {
            System.out.print("D");
        }

    }
}
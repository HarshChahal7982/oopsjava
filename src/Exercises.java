import java.util.Scanner;
import java.util.Random;
public class Exercises {
    public static void main(String[] args) {
        //Exercise1
        /*
        write a java program to calculate percentage of a given student in CBSE board exam.his marks from 5 subjects must be taken
        as input from user out of 100.
         */
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter marks of students from the subjects");
//        float sub1=sc.nextFloat();
//        float sub2=sc.nextFloat();
//        float sub3=sc.nextFloat();
//        float sub4=sc.nextFloat();
//        float sub5=sc.nextFloat();
//        System.out.println("The percentage of student in exams is "+(sub1+sub2+sub5+sub3+sub4)/500*100);

        //Exercise2
        //create a rock,scissor and paper game.
        // Imagine we are going to play against computer. we have to generate input from computer also. also make this game like a series
        // and in the end who won most matches in series is the winner.
        // 1-rock    2-paper    3-scissor
        Scanner sc=new Scanner(System.in);
        Random rdm=new Random();
        System.out.println("let's play the game");
        int input;
        int win=0;
        int draw=0;
        int lose=0;
        do{
            System.out.println("enter your input");
           int user=sc.nextInt();
           int comp=rdm.nextInt(1,4);
            System.out.println("computer generated input -"+comp);
           if ((user==1 && comp==3) || (user==2 && comp==1) || (user==3 && comp==2)){
               System.out.println("User wins, comp lose");
               win++;
           }else if ((user==comp)){
               System.out.println("Match drawn");
               draw++;
           }else{
               System.out.println("comp wins, you lose");
               lose++;
           }
            System.out.println("enter 0 to stop this game");
           input=sc.nextInt();
        }while (input!=0);
        if (win>lose){
            System.out.println("you won the series");
        }else if (win<lose){
            System.out.println("you lose the series");
        }else{
            System.out.println("series drawn");
        }

    }
}

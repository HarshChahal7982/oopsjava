import java.util.Scanner;

public class JavaQuestions_Basics {
    public static void main(String[]args) {
        //Questions--
        //1. Calculate cgpa using three subjects
//        float english = 46;
//        float maths = 56;
//        float science = 55;
//        float cgpa = (english + maths + science) / 30;
//        System.out.println(cgpa);

        //2.Java program which ask the user to enter his/her name and greets them with "Hello <name>,have a good day text.
//        Scanner sc=new Scanner(System.in);
//        String letter="Hello <name>, have a good day";
//        System.out.println("enter your name");
//        String name=sc.next();
//        System.out.println(letter.replace("<name>",name));

        //3.program to detect whether number entered by user is integer or not.
//        Scanner sc=new Scanner(System.in);
//        boolean k=sc.hasNextInt();
//        System.out.println(k);

        //4.program to encrypt grade by adding 8 to it.decrypt it to show actual grade.
//        char grade='B';
//        grade=(char)(grade+8);
//        System.out.println(grade);
//        System.out.print("actual grade is-");
//        grade=(char)(grade-8);
//        System.out.println(grade);

        //5.use comparison operators to find out whether a given number is greater than user entered or not.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number");
//        float num=sc.nextFloat();
//        System.out.println(num>120);

        //6.write v^2-u^2/2as in a java program.
//        int v=8;
//        int u=2;
//        int a=3;
//        int s=2;
//        System.out.println((v*v-u*u)/(2*a*s));

        //7. convert a string to lowercase.
//        String k="Moi, OLEN Harsh. Hauska tavata";
//       k=k.toLowerCase();
//        System.out.println(k);

       //8. program to detect double and triple spaces in a string.
//         String moi="Hyvaa  ruokka halua,  ole    hyvaa ja kiitos";
//        System.out.println("Double spaces-");
//        System.out.println(moi.indexOf("  "));
//        System.out.println("Triple spaces-");
//        System.out.println(moi.indexOf("   "));

        //9. program to find out whether a student is pass or fail, if it requires total 40% and atleast 33% in each
        // subject to pass. take marks as an input from the user.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter marks of your subjects");
//        float sub1=sc.nextFloat();
//        float sub2=sc.nextFloat();
//        float sub3=sc.nextFloat();
//        if(((sub3+sub1+sub2)/300*100)>=40 && (sub1>=33) &&(sub2>=33)&&(sub3>=33)){
//            System.out.println("student has passed the exams");
//        }else{
//            System.out.println("student is fail in exams");
//        }

        //10.Calculate Income tax paid by an employee to the government as per slabs-
           /*
           Income slab              Tax
           2.5l-5.0l                  5%
           5.0l-10.0l                  20%
           Above 10.0l                 30%
           Take income as input from user
            */
//        Scanner sc=new Scanner(System.in);
//        float income=sc.nextFloat();
//        float tax=0;
//        if (income<2.5){
//            tax=tax+0;
//        }else if (income>=2.5 && income<5.0){
//            tax=tax+0.05f*(income-2.5f);
//        }else if(income>=5.0 && income<10.0){
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(income-5.0f);
//        }else {
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(10.f-5.0f);
//            tax=tax+0.3f*(income-10.f);
//        }
//        System.out.println("the tax paid by the employee is -"+tax);

        //11. Java program to find out the day of the week given the number( eg. 1 for monday)
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number from 1-7 to find out the corresponding day");
//        int number=sc.nextInt();
//        switch (number){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid Number");
//                break;
//        }

        //12. Java program to find out whether a year is leap year or not.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the year");
//        int year=sc.nextInt();
//        if((year%4==0 && year%100!=0) || (year%400==0)){
//            System.out.println(year+" is a leap year");
//        }else{
//            System.out.println(year+" is not a leap year");
//        }

        //13.program to find out the type of website from url
        /*
        .com--commercial website    .org-- organization website      .in--indian website
         */
//        Scanner sc=new Scanner(System.in);
//        String site=sc.nextLine();
//        if(site.endsWith(".com")){
//            System.out.println("commercial website");
//        }else if(site.endsWith(".org")){
//            System.out.println("organization website");
//        }else if(site.endsWith(".in")){
//            System.out.println("indian website");
//        }

        //14. Program to print following pattern
        /*
        ****
        ***
        **
        *
         */
//        int n=4;
//        for (int i=n;i>=1;i--){
//            for (int j=i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //15.print sum of first n even numbers using while loop
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i=0;
//        int sum=0;
//        while (i<n){
//            sum=sum+(2*i);
//            i++;
//        }
//        System.out.println(sum);

        //16.find factorial of number using for loops
//        Scanner sc=new Scanner(System.in);
//        int k=sc.nextInt();
//        int fact=1;
//        for (int i=1;i<=k;i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);

      //17.
        /*Make a menu driven program . The user can enter 2 numbers. if the user enters 1 then keep taking input from student's marks.
        if they enter 0 then stop.if he/she scores:
        marks>=90-print "This is good"
       89>=marks>=60-- print "This is also good"
       59>=marks>=0-- print "This is good as well"
         */
//        Scanner sc=new Scanner(System.in);
//        int input;
//        do{
//            System.out.println("enter Marks");
//            int marks=sc.nextInt();
//            if(marks>=90){
//                System.out.println("This is good");
//            }else if((89>=marks) && (marks>=60)){
//                System.out.println("This is also good");
//            }else if ((59>=marks) && (marks>=0)){
//                System.out.println("This is also good as well");
//            }
//            System.out.println("enter 1 to continue");
//            input=sc.nextInt();
//        }while (input==1);

        //18.Print if a number is prime or not.
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int counter=1;
//        for (int i=2;i<=num;i++){
//            if((num%1==0) && (num%i==0)){
//                counter++;
//            }
//        }
//        if (counter==2){
//            System.out.println(num+" is a prime number");
//        }else{
//            System.out.println(num+" is not a prime number");
//        }










    }
}

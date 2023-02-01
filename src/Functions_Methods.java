import java.util.Scanner;
public class Functions_Methods {
    //functions and Methods
   //1.
    public static void printname(String name){
        System.out.println(name);
        return;
    }
    //2.
    public static float sum(float x,float y){
        float sum=x+y;
        return sum;
    }
    //3.
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    //4.
        public static void printodd(int n){
             int sum=0;
             for (int i=1;i<=n;i++){
                 if (i%2!=0){
                     sum=sum+i;
                 }
             }
            System.out.println(sum);
        }

     //5.
        public static float returngreater(float a,float b){
          if (a>b){
              return a;
          }else {
              return b;
          }
        }

    //6.
        public static boolean eligibility(int a){
            if (a>18){
                return true;
            }else{
                return false;
            }
        }

        //8.
        public static void exponential(double x,double n){
         double k=1;
         for (int i=1;i<=n;i++){
             k=k*x;
         }
            System.out.println(k);
        }

        //9.
        public static void hcf(int a,int b){
        int gcd=1;
        for (int i=1;i<=a || i<=b;i++){
            if (a%i==0 && b%i==0){
                gcd=i;
            }
        }
            System.out.println(gcd);
        }

        //11.
    public static void printpattern(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //12.
    public static void printpattern2(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //13.
    public static void printaverage(int ...arr){
        float add=0;
        for (int i=0;i<arr.length;i++){
            add=add+arr[i];
        }
        System.out.println("Average of these numbers = "+add/arr.length);
        return;
    }

    //14.
    public static void convert_c_to_f(int t){
        System.out.println("Temperature in fahrenheit = "+(t*1.8+32));
    }

    //15.
    public static void sumnatural(int n){
        int adds=0;
        for (int i=1;i<=n;i++){
            adds=adds+i;
        }
        System.out.println("The sum of first"+ n +"natrual numbers = "+adds);
    }

    public static void main(String[]args) {

        //1. Print a given name in a function
//      Scanner sc=new Scanner(System.in);
//      String k=sc.nextLine();
//           printname(k);

        //2.Make a function to add two number and return the sum
//        Scanner sc=new Scanner(System.in);
//        float a=sc.nextFloat();
//        float b=sc.nextFloat();
//        System.out.println(sum(a,b));

        //3.Find factorial of a number.
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        factorial(n);

        //4.function to print sum of odd numbers from 1 to n.
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        printodd(n);

        //5.function takes 2 numbers and return greater of those two.
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float b=sc.nextFloat();
//        System.out.println(returngreater(a,b));

        //6.function that takes in age as input and returns if that person is eligible to vote or not.
//        Scanner sc = new Scanner(System.in);
//        int age=sc.nextInt();
//        System.out.println(eligibility(age));

        //7.program to enter numbers till the user wants and in end display the count of positive,negative and zeroes entered.
//        Scanner sc = new Scanner(System.in);
//        int positive=0;
//        int negative=0;
//        int zero=0;
//        int input;
//        do{
//            System.out.println("Enter the number");
//            int num=sc.nextInt();
//            if (num>0){
//                positive++;
//            }else if (num<0){
//                negative++;
//            }else if (num==0){
//                zero++;
//            }else{
//                System.out.println("Invalid input");
//            }
//            System.out.println("enter 1 to stop");
//            input=sc.nextInt();
//        }while (input!=1);
//        System.out.println("total positive numbers = "+positive);
//        System.out.println("total negative numbers = "+negative);
//        System.out.println("total zeroes = "+zero);

        //8. two numbers entered by user x and n.write function to find value of x^n.
//        Scanner sc = new Scanner(System.in);
//        double x=sc.nextDouble();
//        double n=sc.nextDouble();
//        exponential(x,n);

        //9. function that calculates the greatest common divisor of two numbers.
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        hcf(a,b);

        //10.
        /*program to print fibonacci series of n terms where n is input by user.
        0 1 1 2 3 5 8 13 21 34
        in fibonacci series a number is the sum of previous two numbers.
         */
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int a=0;
//        int b=1;
//        for (int i=1;i<=n;i++){
//            System.out.print(a+" ");
//            int c=a+b;
//            a=b;
//            b=c;
//        }

          //11. write a program using functions to print following pattern
        /*
        *
        **
        ***
        ****
         */
//        int n=3;
//        printpattern(n);

        //12.write a function to print following pattern
        /*
        ****
        ***
        **
        *
         */
//        int n=4;
//        printpattern2(n);

        //13.write a function to find average of a set of numbers passed as arguments
       // printaverage(1,7,-6,5,4);

        //14. write a function to convert celsius temperature into fahrenheit.
//        Scanner sc=new Scanner(System.in);
//        int temp=sc.nextInt();
//        convert_c_to_f(temp);

        //15. function to calculate sum of first n natural numbers
//        Scanner sc=new Scanner(System.in);
//        int k=sc.nextInt();
//        sumnatural(k);

    }
}

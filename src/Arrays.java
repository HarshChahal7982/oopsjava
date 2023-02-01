import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        // Arrays
        //1. create an array of 5 floats and calculate their sum
//        float[]arr={34.5f,60f,78.9f,100.5f,0.55f};
//        float sum=0;
//        for (int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);

        //2.write program to find out whether a given integer is present in array or not.
//         Scanner sc=new Scanner(System.in);
//        int[]arr={34,55,66,-78,-89,0,1,-2};
//        System.out.println("enter the integer you want to check");
//        int k=sc.nextInt();
//        boolean ispresent=false;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==k){
//                ispresent=true;
        //        break;
//            }
//        }
//       if (ispresent) {
//            System.out.println("Integer is present");
//        }else {
//           System.out.println("Integer is not present");
//        }

        //3.calculate average marks from an array containing marks of all students in physics using for each loop
//        Scanner sc=new Scanner(System.in);
//        float[]marks={34,56.5f,98.5f,70,55.5f,88.5f};
//        float sum=0;
//        for (int i=0;i<marks.length;i++){
//            sum=sum+marks[i];
//        }
//        System.out.println("Average marks in physics = "+sum/marks.length);

        //4. create a java program to add two matrices of size 2X3.
//        int[][]matrix1={{2,-7,8},
//                       {13,67,-5}};
//        int[][]matrix2={{12,-17,81},
//                {15,6,-50}};
//        int[][]average={{0,0,0},
//                {0,0,0}};
//        for (int i=0;i<2;i++){
//            for (int j=0;j<3;j++){
//                average[i][j]=matrix1[i][j]+matrix2[i][j];
//            }
//        }
//        for (int i=0;i<2;i++){
//            for (int j=0;j<3;j++){
//                System.out.print(average[i][j]+" ");
//            }
//            System.out.println();
//        }

        //5.write a java program to reverse an array
//        int[]arr={-6,41,43,5,-7,2};
//        int l=arr.length;
//        int n= Math.floorDiv(arr.length,2);
//        int temp;
//        for (int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int i=0;i<l;i++){
//            System.out.print(arr[i]+" ");
//        }

        //6. write java program to find maximum and minimum value in an array
//        int[]arr={23,56,77,89,-34,-67,0,1};
//        //maximum
//        int max=Integer.MIN_VALUE;
//        for (int element:arr){
//            if (element>max){
//                max=element;
//            }
//        }
//        System.out.println("maximum value in the array is "+max);
//        //minimum
//        int min=Integer.MAX_VALUE;
//        for (int element:arr){
//            if (element<min){
//                min=element;
//            }
//        }
//        System.out.println("maximum value in the array is "+min);

        //7.write a java program to find out whether an array is sorted or not.
//        int[]arr={-5,6,71,34,3};
//        boolean issorted=true;
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i]>arr[i+1]){
//                issorted=false;
//                break;
//            }
//        }
//        if (issorted){
//            System.out.println("Array is  sorted");
//        }else{
//            System.out.println("Array is not  sorted");
//        }

        //8.Take a matrix as input from the user. search for a given number x and print the indices at which it occurs.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter rows and columns");
//        int row=sc.nextInt();
//        int col=sc.nextInt();
//        int[][]matrix=new int[row][col];
//        System.out.println("enter elements of matrix");
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("enter element you want to found");
//        int x=sc.nextInt();
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//               if (x==matrix[i][j]){
//                   System.out.print("x is at index "+i+","+j);
//               }
//            }
//        }

        //9. for a given matrix of NXM print its transpose.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter rows and columns");
//        int row=sc.nextInt();
//        int col=sc.nextInt();
//        int[][]matrix=new int[row][col];
//        System.out.println("enter elements of matrix");
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("The transpose of matrix is shown below ");
//        for (int i=0;i<col;i++){
//            for (int j=0;j<row;j++){
//                System.out.print(matrix[j][i]+" ");
//            }
//            System.out.println();
//        }

        //10. Print the spiral order of matrix as output for a given matrix of numbers
        /*
        for example-
        1 5 7 9 10 11
        6 10 12 13 20 21
        9 25 29 30 32 41
        15 55 59 63 68 70
        40 70 79 81 95 105
        spiral order is given by 1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9 6 10 12 13 20 32 68 63 59 55 25 29 30
         */
       //we can do this question by taking input from the user also
        int[][]matrix={{2,-4,5},
                {1,7,11},
                {-8,3,1}};
        int top=0;
        int left=0;
        int right=2;
        int bottom=2;

        while(left<=right && top<=bottom){
            //1st row
            for (int i=left;i<=right;i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            //last col
            for (int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            if (left<=right){
                for (int i=right;i>=left;i--){
                    System.out.print(matrix[bottom][i]+" ");
                }
            }
            bottom--;
            if (top<=bottom){
                for (int i=bottom;i>=top;i--){
                    System.out.print(matrix[i][left]+" ");
                }
            }
            left++;

        }










    }
}

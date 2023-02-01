import java.util.Scanner;

//1.
class circle{
    int radius;

    circle(int r){
        this.radius=r;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}
class cylinders extends circle{
    int height;
    cylinders(int r,int h){
        super(r);
        this.height=h;
        this.radius=r;
    }

    public int getHeight() {
        return height;
    }


    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double area(){
        return 2*Math.PI*radius*(radius+height);
    }

}

//2.
class Rectangle{
    int length;
    int breadth;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public int area(){
        return length*breadth;
    }
}
class cuboid extends Rectangle{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    cuboid(int l,int b,int h){
        super(l,b);
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    public int area(){
        return 2*((length*breadth)+(breadth*height)+(length*height));
    }
    public int volume(){
        return length*breadth*height;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Inheritance
        //Questions
        //1. create a class circle and use inheritance to create another class from it.create methods and volume also
//           Scanner sc=new Scanner(System.in);
//           int radius=sc.nextInt();
//           int height=sc.nextInt();
//        circle c=new circle(radius);
//        cylinders obj=new cylinders(radius,height);
//        System.out.println("area of circle-"+c.area());
//        System.out.println("area of cylinder-"+obj.area());

        //2. create a class rectangle and use inheritance to create another class cuboid from it. also create getter and setter and method
        // for area and volume.
//         Rectangle rc=new Rectangle(3,2);
//         cuboid cb=new cuboid(3,2,4);
//        System.out.println("area of rectangle-"+rc.area());
//        System.out.println("volume of cuboid-"+cb.volume());

        
    }
}

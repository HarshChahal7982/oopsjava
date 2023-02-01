import java.util.Scanner;

//1.
class employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    };
    public void setname(String name){
        this.name=name;
    };
    public String getName(){
        return name;
    }
}

//2.
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

//3.
class cylinder{
    private int radius;
    private  int height;

    public cylinder(int radius,int height) {
        this.radius = radius;
        this.height=height;
    }

    public int getRadius(){
        return radius;
    };
    public void setRadius(int radius){
        this.radius=radius;
    };
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double area(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

//5.
class rectangle{
    private int length;
    private int breadth;
  public rectangle(){
      this.length=4;
      this.breadth=5;
  }
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength(){
      return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

//6.
class sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return (4.0d/3.0d)*Math.PI*radius*radius*radius;
    }
    public sphere(int r){
        this.radius=r;
    }
}

//7.


public class OOPs {
    public static void main(String[] args) {
          // OOPs-object oriented programming
        //1.create  a class employee with following properties and methods-
        /*
        salary(property)(int)   getsalary(method returning int)   name(property)(string)    getname(method returning string)
        setname(method changing name)
         */
//        employee obj=new employee();
//        obj.salary=23000;
//        obj.setname("Harry");
//        System.out.println(obj.getSalary());
//        System.out.println(obj.getName());

        //2. create a class square with a method to initialize its side, calculating area ,perimeter etc.
//          square obj=new square();
//          Scanner sc=new Scanner(System.in);
//          obj.side=sc.nextInt();
//        System.out.println("Area and perimeter of square are "+obj.area()+","+obj.perimeter());

        //3. create a class cylinder and use getter and setter to set its radius and height. also calculate surface area and volume.
//        Scanner sc=new Scanner(System.in);
//        cylinder obj=new cylinder();
//        obj.setRadius(7);
//        obj.setHeight(11);
//        System.out.println("Area = "+obj.area());
//        System.out.println("volume = "+obj.volume());

        //4. do the above question using constructor
//          cylinder cy=new cylinder(7,11);
//        System.out.println("Area = "+cy.area());
//        System.out.println("volume = "+cy.volume());

        //5.Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom perimeter.
//           rectangle rec=new rectangle();
//           rectangle rec2=new rectangle(3,11);
//        System.out.println(rec2.getBreadth());
//        System.out.println(rec.getBreadth());

        //6. repeat question 3 for sphere.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value of radius");
//        int r=sc.nextInt();
//        sphere sp=new sphere(r);
//      //  sp.setRadius(r);
//        System.out.println(sp.area());
//        System.out.println(sp.volume());




    }
}

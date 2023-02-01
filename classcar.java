class car{
    public String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setAmountOfFuel(int amountOfFuel) {
            this.amountOfFuel = amountOfFuel;
    }

    public int model;
    public int amountOfFuel;
    public void brake(){
        System.out.println("Car is breaking");
    }
    public void accelerate(){
      //  System.out.println("Car is accelerating");
        if (amountOfFuel>0) {
            amountOfFuel--;
        }
    }

    public void printData(){
        accelerate();
        System.out.println(brand);
        System.out.println(model);
        System.out.println(amountOfFuel);
    }
    public void refuel(int amount){
        amountOfFuel++;
        System.out.println("Fuel on the tank: "+amountOfFuel);
        System.out.println("Refuel: "+amount);
        System.out.println("Fuel on the tank after the refuel: "+(amount+amountOfFuel));
    }

   car(String brand, int model,int amountOfFuel) {
       this.brand=brand;
       this.model=model;
       this.amountOfFuel=amountOfFuel;
   }
//    car(){
//
//    }


}

public class classcar {
    public static void main(String[] args) {
        /*
      1.  Create a class Car

2. Define attributes: brand, model, amountOfFuel. Set all to public.

3. Create methods:

brake: Method prints “Car is breaking” accelerate: Method prints “Car is accelerating” and decreases the amount of fuel by one.
printData: method prints the brand, model and the amount of fuel to the console.

4. Create an object called car1. Assign the values like Fiat (brand), 500 (model), 50 (fuel).
Call methods printData, accelerate and break and then call printData again (make sure the amount of fuel is decreased).

5. Try to chance the accelerate method so that the amount of fuel has to be more than 0.

6. Create a method refuel. The method has one parameter amount.
Using amount you can define how much is refueled. Notice that there might be some fuel in the tank already.
In the method, print something like:

Fuel on the tank: 10 Refuel: 5 <-- this is the parameter amount Fuel on the tank after the refuel: 15

7. Create a default constructor.

8. Create a parameterized constructor that you can assign the values of brand, model and amountOfFuel.

9. Create a new object (car2) using the parameterized constructor
         */

     car car1=new car();
     car1.setBrand("Fiat");
     car1.setModel(500);
     car1.setAmountOfFuel(10);
        car1.printData();
       car car2=new car("Fiat",400,40);
       car2.printData();
        car1.refuel(5);


    }
}

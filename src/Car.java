public class Car {

    String color = "red";
    String engine = "v6";
}
    class CarTest {
        public static void main(String[] args) {
            int a;
            Car car1= new Car ();
//            Car car2=car1;
//            Car car3;

//            System.out.println(car2.engine);
            car1.color="black";
            car1.engine="v8";
//            System.out.println(new Car().color);
            System.out.println("Cvet: "+car1.color);
//            System.out.println(car1.color);
            System.out.println("Motor: "+car1.engine);
//            System.out.println(car1.engine);
        }
}


public class CarConstruct {
    CarConstruct(String cvet,String motor){
        color=cvet;
        engine=motor;

        System.out.println("цвет машины: "+ color+" мотор машины: "+engine);
    }
    String color;
    String engine;
}

class CarConstructTest{
    public static void main(String[] args) {
        CarConstruct car1=new CarConstruct("black","v6");

        CarConstruct car2=new CarConstruct("red","v4");
//        System.out.println(car1.color);
//        System.out.println(car1.engine);
    }
}

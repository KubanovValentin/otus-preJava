public class Student {
    int numberStBilet;
    String nameSt;
    String name2St;
    int yearLess;
   double estimationM;
    double estimationE;
    double estimationL;

    double rez ;
}
class StudentTest {
    public static void main(String[] args) {
        Student St1 = new Student();
        Student St2 = new Student();
        Student St3 = new Student();

        St1.numberStBilet=100;
        St1.nameSt="Вася";
        St1.name2St="Белый";
        St1.yearLess=2020;
        St1.estimationM=6.5;
        St1.estimationE=8.3;
        St1.estimationL=9.6;
        St1.rez=(St1.estimationM+St1.estimationE+St1.estimationL)/3;

        St2.numberStBilet=101;
        St2.nameSt="Витя";
        St2.name2St="Черный";
        St2.yearLess=2019;
        St2.estimationM=7.9;
        St2.estimationE=9.3;
        St2.estimationL=5.8;
        St2.rez=(St2.estimationM+St2.estimationE+St2.estimationL)/3;
        St3.numberStBilet=102;
        St3.nameSt="Петя";
        St3.name2St="Серый";
        St3.yearLess=2021;
        St3.estimationM=8.3;
        St3.estimationE=6.5;
        St3.estimationL=8.7;
        St3.rez=(St3.estimationM+St3.estimationE+St3.estimationL)/3;

        System.out.println("Средняя арифметическая оценка студента : " + St1.nameSt + " " + St1.name2St + " является - " + St1.rez);
        System.out.println("Средняя арифметическая оценка студента : " + St2.nameSt + " " + St2.name2St + " является - " + St2.rez);
        System.out.println("Средняя арифметическая оценка студента : " + St3.nameSt + " " + St3.name2St + " является - " + St3.rez);
    }
}

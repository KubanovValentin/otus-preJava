public class Student {
    int numberStBilet;
    String nameSt;
    String name2St;
    int yearLess;
    int estimationM;
    int estimationE;
    int estimationL;

    int rez ;
}
class StudentTest {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();

        Student1.numberStBilet=100;
        Student1.nameSt="Вася";
        Student1.name2St="Белый";
        Student1.yearLess=2020;
        Student1.estimationM=5;
        Student1.estimationE=5;
        Student1.estimationL=5;
        Student1.rez=(Student1.estimationM+Student1.estimationE+Student1.estimationL)/3;

        Student2.numberStBilet=101;
        Student2.nameSt="Витя";
        Student2.name2St="Черный";
        Student2.yearLess=2019;
        Student2.estimationM=5;
        Student2.estimationE=4;
        Student2.estimationL=3;
        Student2.rez=(Student2.estimationM+Student2.estimationE+Student2.estimationL)/3;

        Student3.numberStBilet=102;
        Student3.nameSt="Петя";
        Student3.name2St="Серый";
        Student3.yearLess=2021;
        Student3.estimationM=2;
        Student3.estimationE=3;
        Student3.estimationL=4;
        Student3.rez=(Student3.estimationM+Student3.estimationE+Student3.estimationL)/3;

        System.out.println(Student1.rez);
        System.out.println(Student2.rez);
        System.out.println(Student3.rez);
    }
}

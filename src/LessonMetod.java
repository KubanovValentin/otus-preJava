public class LessonMetod {
    int summa(int a,int b,int c){//параметры (в скобках)
        int result =a + b + c;
        return result;
    }
    int sredneeArifm(int a1,int b1,int c1){
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}
class Test {
    public static void main(String[] args) {
        LessonMetod l = new LessonMetod();
        int summaTrexChisel = l.summa(1,2,3);//аргументы (в скобках)

        System.out.println(summaTrexChisel);
        System.out.println(l.summa(10,24,32));
        System.out.println(l.sredneeArifm(20,40,60));
    }
}

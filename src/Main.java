public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");
//        byte(1),short(2),int(4),long(8)
//        boolean(1),char(2),float(4),double(8)
//==================================================================================================
// бинарное представление типов в памяти(от старшего левого до младшего правого)
//====================================================================================================

//         byte a= 0;
//         a=-128;
//         printBinary(a,8);
//         a = 1;
//         printBinary(a,8);
//        --------------------
//        int a =Integer.MAX_VALUE;//2147483647
//        System.out.println("a = " + a);
//        printBinary(a,32);
//        ----------------------
//        long a =Long.MAX_VALUE;
//        System.out.println("a = " + a);
//        printBinary(a,64);
//        ----------------------
//        boolean a = true;
//        System.out.println("a = " + a);
//        boolean b = false;
//        System.out.println("b = " + b);
//        ----------------------
//            char a =37;
//            System.out.println("a = " + a);
//            printBinary(a,16);
//        ----------------------
//        float a = 120.123456789f;
//        System.out.println("a = " + a);
//        ----------------------
//        double a = 120.123456789;
//        System.out.println("a = " + a);
//    }
//    public static void printBinary(byte value, int size) {
//        for (int i=size-1;i>=0;i--){
//            long mask = 1L << i;
//            long result = (mask & value)>>i;
//            System.out.print(result);
//        }
//        System.out.println();
//    }
//--------------------------------------

//    public static void printBinary(int value, int size) {
//        for (int i=size-1;i>=0;i--){
//            long mask = 1 << i;
//            long result = (mask & value)>>i;
//            System.out.print(result);
//        }
//        System.out.println();
//    }

//--------------------------------------


//    public static void printBinary(long value, int size) {
//        for (int i=size-1;i>=0;i--){
//            long mask = 1L << i;
//            long result = (mask & value)>>i;
//            System.out.print(result);
//        }
//        System.out.println();
//
//    }
// ==================================================================================================
//      битовые операторы
//====================================================================================================


// &,|,^
//<<,>>,~
//-----------------------
// &,|,^
//        int a = 9;
//        printBinary(a,4);
//        int b = 5;
//        printBinary(b,4);
//        printBinary( b & a,4);//побитовое сравнение(и)
//        printBinary(b | a,4);//побитовое сравнение (или)
//        printBinary(b^a,4);//побитовое сравнение (ксор (исключение))
//        a = a^b;
//        b =  a^b;
//        a = a^b;
//        System.out.println(a);
//        System.out.println(b);// одно из свойств поменяем местами значение
//  --------------------
        //<<,>>,>>>,~
//        int a=5;
//        printBinary(a,32);
//        int b=a<<7;
//        printBinary(b,32);//сдвигаются на количество ячеек и если влево то последние биты теряются)
//        System.out.println(b);
////       >>> в основном применяеться с минусом
////       ~   меняет 1 на 0 и наоборот
//
//
//    }
//        public static void printBinary(long value, int size) {
//               for (int i=size-1;i>=0;i--){
//                    long mask = 1L << i;
//                    long result = (mask & value)>>i;
//                    System.out.print(result);
//                }
//               System.out.println();
//
//        }
// ==================================================================================================
//      логические операторы
//====================================================================================================

//&&,||!
//==,!=,>,<,<=,>=


//    boolean a = true;
//    boolean b = false;

//    boolean c = a && b;
//    boolean c = a || b;
        //   boolean c = !b;

//        int a =1;
//        int b =0;
//        boolean c = a == b;
//        boolean c = a != b;
//        boolean c = a > b;
//        boolean c = a < b;
//        boolean c = a >= b;
//        boolean c = a <= b;
//        System.out.println(c);
//    }
//        public static void printBinary(long value, int size) {
//               for (int i=size-1;i>=0;i--){
//                    long mask = 1L << i;
//                    long result = (mask & value)>>i;
//                    System.out.print(result);
//                }
//               System.out.println();
//
//        }
// ==================================================================================================
//      условные операторы
//====================================================================================================

//if,else,else if,switch


//        int hour = 21;
//        boolean isWorkTime = hour>=9 && hour<21;
//        if(isWorkTime){
//            System.out.println("hello");
//        }else if(hour==21){
//            System.out.println("valentin");
//        }
//        else {
//            System.out.println("bye");
//        }
//-------------------------------------------
//            int count =10;
//            switch (count){
//                case 1:
//                    System.out.println("0%");
//                    break;
//                case 2:
//                    System.out.println("10%");
//                    break;
//                case 3:
//                    System.out.println("20%");
//                    break;
//                case 4:
//                    System.out.println("30%");
//                    break;
//                case 5:
//                    System.out.println("40%");
//                    break;
//                case 6:
//                    System.out.println("50%");
//                    break;
//                case 7:
//                    System.out.println("60%");
//                    break;
//                default:
//                    System.out.println("70%");
//            }


//    }
//        public static void printBinary(long value, int size) {
//               for (int i=size-1;i>=0;i--){
//                    long mask = 1L << i;
//                    long result = (mask & value)>>i;
//                    System.out.print(result);
//                }
//               System.out.println();
//
//        }

// ==================================================================================================
//    циклы
//====================================================================================================
//for,while,do while

//        for (int i = 0; i < 32; i++){
//            System.out.println(i);
//        }
//---------------------
//        int i = 0;
//        for (; i < 32; i++){
//            System.out.println(i);
//       }
//-----------------------
//        int i = 0;
//        for (; ; i++){
//            System.out.println(i);
//            if(i > 31){
//                break;
//            }
//        }
//-----------------------
//        int i = 0;
//        for (; ;){//это аналогичный циклу while(true)
//            System.out.println(i);
//            if(i > 31){
//                break;
//            }
//            i++;
//        }
//
//    }
//        public static void printBinary(long value, int size) {
//               for (int i=size-1;i>=0;i--){
//                    long mask = 1L << i;
//                    long result = (mask & value)>>i;
//                    System.out.print(result);
//                }
//               System.out.println();
//
//        }
//=============================================================================================
// ============================Заур============================================================
//===============================================================================================
//        System.out.print("A ");
//        System.out.println("a");
//        System.out.print("B ");
//        System.out.println("b");
//        System.out.print("C ");
//        System.out.println("c");

//        System.out.println("abcdif");//1.
//        System.out.println();        //2.
//        System.out.println("ghjklm");//3.

//        -----------------дз
//        System.out.println("             РУБАИ ");
//        System.out.println("Много лет размышлял я над жизнью земной.");
//        System.out.println("Непонятного нет для меня под луной.");
//        System.out.println("Мне известно, что мне ничего не известно!");
//        System.out.println("Вот последняя правда, открытая мной.");
//        System.out.println("                             О.Хайям");


//        ---------------------------
//           byte b1 =10;
//           byte b2 = 20;
//           byte b3 = 100;
//
//           short s1 = 5;
//           short s2 = -10;
//           short s3 = 0;
//
//           int i1= 500;
//           long l1 = 1000;
//           long l2 = -1234573130000000L;//что бы не было ошибки- надо писать буковку L
//
//
//           float f1 = 3.14F;
//           double d1=4.12;
//
//           char c1 = '1';
//           char c2 ='a';
//           char c3=')';
//           char c4=1300; //десятеричная система
//           char c5='\u06FB';//шестнадцатая
//           System.out.println(c5+" "+c4);
//
//
//           boolean bool1 = true;
//           boolean bool2 = false;

//              int a1 = 60; //десятеричная система
//              int a2 = 0b111100;//двоичная система
//              int a3 = 0B111100;//двоичная система (bin)
//
//              int a4 = 074;//восьмеричная система (oct)
//
//              int a5 = 0x3c;//шестнадцатая система (hex)
//              int a6 = 0X3C;//шестнадцатая система (hex)
//
//
//
//           int a7= 1_000_000;
//        System.out.println(a7);
//        -----------------дз
//        byte b1 = 12;
//        System.out.println(b1);
//        byte b2 = 0b1100;
//        System.out.println(b2);
//        byte b3 = 014;
//        System.out.println(b3);
//        byte b4 = 0xc;
//        System.out.println(b4);
//
//        short s1 = 1300;
//        System.out.println(s1);
//        short s2 = 0b101_000_101_00;
//        System.out.println(s2);
//        short s3 = 02424;
//        System.out.println(s3);
//        short s4 = 0x514;
//        System.out.println(s4);
//
//        int i1 = 0;
//        System.out.println(i1);
//        int i2 = 0b0;
//        System.out.println(i2);
//        int i3 = 00;
//        System.out.println(i3);
//        int i4 = 0x0;
//        System.out.println(i4);
//
//        long l1 = 123456789L;
//        System.out.println(l1);
//        long l2 = 0b111_010_110_111_100_110_100_010_101L;
//        System.out.println(l2);
//        long l3 = 0726746425L;
//        System.out.println(l3);
//        long l4 = 0x75BCD15L;
//        System.out.println(l4);
//
//
//        float f1 = 123.123f;
//        float f2 = 123.123F;
//
//        double d1 = 2345.56343;
//        double d2 = 2345.56343d;
//
//        boolean bool1 = true;
//        boolean bool2 = false;
//
//
//        char c1 = 'Ф';
//        char c4=1060;
//        char c5='\u0424';
//        System.out.println(c1+" "+c4 +" "+c5);


//       ------------------------------------------------------
//       типы операторов


//        ------арифмитический (+,-,*,/,%,++,--)
//        int a = 5;
//        int b = 10;
//        int c = a+b;
//        int x =1,y=2,z=3;
//        System.out.println(a+b);
//          System.out.println(c);
//        System.out.println(b-a);
//        System.out.println(a*b);
//        System.out.println(a/b);
//          System.out.println(a%b);

//        int x = 5;
//        int y= 3;
//        int z = x - y++;//postfix
//        System.out.println(z);
//        System.out.println(y);
//        int z = x - ++y;//prefix
//        System.out.println(z);
//        System.out.println(y);

//        может быть на экзамене-------
//        int a =5;
//        int b = ++a - --a - a-- + a++;
//
//        System.out.println(b);

//        ------присваивание(=,+=,-=,*=,/=)
//           int a =5;
//           a = a +3;//
//           a+=3;//равносильно выше(что означает сначала прибавь а потом присвой)
//        System.out.println(a);
//----------------
//        int a = 3;
//        int b = 50;
//        int c = 0;
//
//        a=b=c=18;// оператор присвоения начинает работать с права на лево
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//----------------
//        long a = 100L;
//        int b = a;
//        ------сравнения (<,>,<=,>=,==,!=)

//    int a =3;
//    int b = 5;
//    boolean b1 = a>b;
//        System.out.println(a>b);
//        ------логический (&&,||,!)

//        boolean x = true;
//        boolean y = false;
//        boolean z = true;
//
//        boolean result = x && y && z;
//        boolean result1 = x || y || z;
//
//        System.out.println(result);
//        System.out.println(result1);
//
//        int a = 5;
//        int b = 10;
//        boolean c = !(a<b);
//        System.out.println(c);

//        ----------------------
//        char a = 'a';
//        int b = 5;
//        System.out.println(a+b);
//        System.out.println(a%b);
//------------------------дз

//        int i1 =5;
//        int i2 =11;
//        double d1 = 5.5;
//        double d2 = 1.3;
//        long l = 20L;
//        double result = 0;
//        result = i2/d1 + d2%i1-l;
//        System.out.println(result);
//
//        int a = 5;
//         a = a-- - --a + ++a + a++ + a;
//        System.out.println(a);
//
//        int b=8;
//        b=++b - b++ + ++b - --b;
//        System.out.println(b);
//        -----------------------класс.обьект





    }

//    int b = 20;
//    byte b2 = 30;
//    char c = 'a';
//
//    String str = "privet";

}

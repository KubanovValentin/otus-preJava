public class BankAccaunt {
    int id;
    String name;
    double balance;

//    public static void main(String[] args) {
//        BankAccaunt MyAccaunt = new BankAccaunt();
//        BankAccaunt YourAccaunt = new BankAccaunt();
//        BankAccaunt HisAccaunt = new BankAccaunt();
//
//
//        MyAccaunt.id=1;
//        MyAccaunt.name="Zaur";
//        MyAccaunt.balance=12.34;
//
//
//        YourAccaunt.id=2;
//        YourAccaunt.name="Mike";
//        YourAccaunt.balance=234.34;
//
//        HisAccaunt.id=3;
//        HisAccaunt.name="Valentin";
//        HisAccaunt. balance=323.432;
//
//
//        System.out.println(MyAccaunt.id);
//        System.out.println(HisAccaunt.balance);
//    }
}
    class  BankAccauntTest{
    public static void main(String[] args) {
        BankAccaunt MyAccaunt = new BankAccaunt();
        BankAccaunt YourAccaunt = new BankAccaunt();
        BankAccaunt HisAccaunt = new BankAccaunt();


        MyAccaunt.id=1;
        MyAccaunt.name="Zaur";
        MyAccaunt.balance=12.34;


        YourAccaunt.id=2;
        YourAccaunt.name="Mike";
        YourAccaunt.balance=234.34;

        HisAccaunt.id=3;
        HisAccaunt.name="Valentin";
        HisAccaunt. balance=323.432;


        System.out.println(MyAccaunt.id);
        System.out.println(HisAccaunt.name);
    }
}
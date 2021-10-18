public class BankAccaunt {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccaunt MyAccaunt = new BankAccaunt();
        BankAccaunt YourAccaunt = new BankAccaunt();
        BankAccaunt HisAccaunt = new BankAccaunt();


        MyAccaunt.id=1;
        MyAccaunt.name="Zaur";
        MyAccaunt.balance=12.34;
        System.out.println(MyAccaunt.id);
        System.out.println(MyAccaunt.balance);
    }
}

public class Varriables {

    void showInterest(){
        double amount;
        double interest;

        amount = 1200.00;
        System.out.println("Amount: " + amount);

        interest = 3.0;
        amount = amount * (100+interest)/interest;
        System.out.println("After a year: " + amount);

        amount = amount * (100+interest)/interest;
        System.out.println("After 2 year: " + amount);
    }

    public static void main(String[] args){
        new Varriables().showInterest();
    }
}

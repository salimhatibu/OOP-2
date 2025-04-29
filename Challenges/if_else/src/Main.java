public class Main {

    void if_else(){

        int marks = 50;
        if (marks >= 80){
            System.out.println("Excellent");
        }
        else if (marks >= 60){
            System.out.println("Average");
        }
        else if (marks >= 40){
            System.out.println("Poor");
        }
        else{
            System.out.println("Retake");
        }
    }
    public static void main(String[] args) {
        new Main().if_else();
    }
}
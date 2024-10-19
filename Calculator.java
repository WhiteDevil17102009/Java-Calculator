import java.util.*;

class Calculator{
    public Scanner sc = new Scanner(System.in);

    public int choice, y,z;

    public void printing(){
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for divison");
    }
    public void input(){
        choice = sc.nextInt();
    }

    public void input_variable(){
        System.out.println("Enter the first number:");
        y = sc.nextInt();
        System.out.println("Enter the second number: ");
        z = sc.nextInt();
    }

    public void add(){
        input_variable();
        int sum = y+z;
        System.out.println(sum);
    }

    public void sub(){
        input_variable();
        int sum = y-z;
        System.out.println(sum);
    }

    public void multi(){
        input_variable();
        int sum = y*z;
        System.out.println(sum);
    }

    public void div(){
        input_variable();
        int sum = y/z;
        System.out.println(sum);
    }

    public void processing(){
        switch(choice){
            case 1 -> add();
            case 2 -> sub();
            case 3 -> multi();
            case 4 -> div();
            default -> System.out.println("Invalid choice");
        }
    }

    public void game(){
        printing();
        input();
        processing();
    }

    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        Calculator f = new Calculator();
        
        f.game();

        int end = 0;

        while (end == 0){
        System.out.println("Do you wanna Calculate again(1 for yes/ 2 for no) ?");
        int answer = sc.nextInt();

        if(answer == 1){
            f.game();
        }
        else{
            System.out.println("Thank you!");
            end = -1;
        }
    }





        
    }
}

import java.io.StringBufferInputStream;

public class Machine {

//    int age;

    public Machine(String name) {
        System.out.println("Name: " + name);
    }

    public int checkAge(int number) {
//        age = number;
        System.out.println(number + " Years old");
        return number;
    }

    public boolean Counting(boolean ability) {
        boolean count = ability;
        System.out.println("This robot can counting process? " + ability);
        return count;
    }

    public static void main(String args[]) {
        Machine Bot = new Machine("Mac");
        Bot.checkAge(12);
        Bot.Counting(true);
    }
}

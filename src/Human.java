public class Human {

    int ageHuman;

    public Human(String name) {
        System.out.println("student name: " + name );
    }

    public void setAge (int age) {
        ageHuman = age;
    }

    public int checkAge() {
        System.out.println("age human: " + ageHuman + " years old");
        return ageHuman;

    }

    // to display in Terminal
    public static void main(String[]args) {
        Human NewName = new Human("John");
        NewName.setAge(16);
        NewName.checkAge();
        System.out.println("Value age: " + NewName.ageHuman);
    }
}

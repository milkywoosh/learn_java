public class Fruit {
    // variable instance;
    String name;
    int weight;

    public void FruitName (String input_name) {
        this.name = input_name;
    }

    public void scaleWeight(byte weightGram) {
        weight = weightGram;
    }

    public void showFruitInfo() {
        System.out.println("Fruit name: " + name);
        System.out.println("Fruit weight: " + weight);
    }

    public static void main(String[] args) {
        Fruit Mango = new Fruit();
        Mango.FruitName("Mango");
        Mango.scaleWeight((byte) 100);

        Fruit Apple = new Fruit();
        Apple.FruitName("Apple");
        Apple.scaleWeight((byte) 12);

        Mango.showFruitInfo();
        Apple.showFruitInfo();


    }
}

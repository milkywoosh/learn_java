public class Animal {


    // variabel instance !!
    // this variable will be assigned with void function which has argument on it
    String Name;
    byte weight;
    String habitat;
    boolean mamals;
    String foodtype;

    public void Animal_name(String arg_name) {
        this.Name = arg_name;
    }

    public void scaleWeight(byte arg_weight) {
        this.weight = arg_weight;
    }

    public void setHabitat(String arg_habitat) {
        this.habitat = arg_habitat;
    }

    public void setMamals(boolean arg_mamals) {
        this.mamals = arg_mamals;
    }

    public void setFoodtype(String arg_food) {
        this.foodtype = arg_food;
    }

    public void showInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Weight: " + weight);
        System.out.println("Habitat: " + habitat );
        System.out.println("Mamals: " + mamals);
        System.out.println("Food type: " + foodtype);
    }



    public static void main(String[] args) {
//        String name = "Cat";
//        boolean meowing = true;
//        short height = 100;
//        System.out.println(height);
        
        Animal Cat = new Animal();
        Cat.Animal_name("Cat");
        Cat.scaleWeight((byte)12);
        Cat.setHabitat("land");
        Cat.setFoodtype("Omnivore");
        Cat.setMamals(true);
        Cat.showInfo();

    }
}

public class Main {
    public static void main(String[] args) {

        // Create an array of geometricShape and Character objects
        Object[] objects = new Object[6];
        objects[0] = new Circle("Circle", 5);
        objects[1] = new Rectangle("Rectangle", 4, 6);
        objects[2] = new Triangle("Triangle", 3, 8);
        objects[3] = new Player("Hero", 10, "Warrior");
        objects[4] = new Enemy("Orc", 8, "Brute");
        objects[5] = new Player("Mage", 12, "Mage");

        // Iterate through the array and perform actions using polymorphism
        for (Object obj : objects) {
            if (obj instanceof geometricShape) {
                geometricShape shape = (geometricShape) obj;
                System.out.println("Area of " + shape.name + ": " + shape.calculateArea());
            } else if (obj instanceof Character) {
                Character character = (Character) obj;
                character.attack();
                if (character instanceof Player) {
                    Player player = (Player) character;
                    player.useSpecialAbility();
                } else if (character instanceof Enemy) {
                    Enemy enemy = (Enemy) character;
                    enemy.yell();
                }
            }
        }
    }
}
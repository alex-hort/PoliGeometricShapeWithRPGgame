abstract class geometricShape {
    protected String name;

    public geometricShape(String name) {
        this.name = name;
    }

    abstract double calculateArea();
}

class Circle extends geometricShape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends geometricShape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Triangle extends geometricShape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Character {
    protected String name;
    protected int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }
}

class Player extends Character {
    private String playerClass;

    public Player(String name, int level, String playerClass) {
        super(name, level);
        this.playerClass = playerClass;
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses special ability as a " + playerClass + "!");
    }
}

class Enemy extends Character {
    private String type;

    public Enemy(String name, int level, String type) {
        super(name, level);
        this.type = type;
    }

    public void yell() {
        System.out.println(name + " the " + type + " lets out a fearsome cry!");
    }
}




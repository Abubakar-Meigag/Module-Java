

class Configuration {

    public static final int MAX_USERS = 100;
    private final String systemName;

    public Configuration(String systemName) {
        this.systemName = systemName;
    }

//    public void setSystemName(String name) {
//        this.systemName = name; // compile error: cannot assign a value to final variable
//    }
}


class Polygon {

    private final int numberOfSides;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public final void describe() {
        System.out.println("I am a polygon with " + numberOfSides + " sides!");
    }

//    public void SetNumberOfSides(int numberOfSides) {
//        return this.numberOfSides;
//    } // FinalSafety.java:31: error: incompatible types: unexpected return value
//        return this.numberOfSides;

}

class Triangle extends Polygon {
    public Triangle() {
        super(3);
    }
}


class FinalSafety {
    public static void main(String[] args) {

        Configuration config = new Configuration("process");
        // Configuration.MAX_USERS = 200; //FinalSafety.java:52: error: cannot assign a value to static final variable MAX_USERS
        System.out.println(config.MAX_USERS);

        Polygon poly = new Polygon(7);
        poly.describe();

        Triangle triangle = new Triangle();
        triangle.describe();

    }
}
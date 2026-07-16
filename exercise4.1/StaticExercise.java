

class Planet {

    private String name;
    private static int planetCount = 0;

    public Planet(String name) {
        this.name = name;
        Planet.planetCount++;
    }

    public static int getplanetCount() {
        return planetCount;
    }
}

class StaticExercise {

    public static void main(String[] args) {

        Planet Venus = new Planet("Venus");
        System.out.println(Planet.getplanetCount());

        Planet Jupiter = new Planet("Jupiter");
        System.out.println(Planet.getplanetCount());

        Planet pl3 = new Planet("Mars");
        System.out.println(Planet.getplanetCount());
    }




}
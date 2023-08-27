public abstract class Animal {
    private String name;
    private int distance;
    public Animal(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void run(int distance) {
        this.distance=distance;
        System.out.println(name+" пробежал "+distance+"м");
    }
    public void swim(int distance) {
        this.distance=distance;
        System.out.println(name+" пропыл "+distance+"м");
    }
}

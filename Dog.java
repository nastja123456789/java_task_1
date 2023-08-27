public class Dog extends Animal{
    private static final int MAX_RUN_DISTANCE=500;
    private static final int MAX_SWIM_DISTANCE=10;
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance<=MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(getName()+" не может пробежать больше "
            + MAX_RUN_DISTANCE+"м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance<=MAX_SWIM_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(getName()+" не может проплыть больше "
                    + MAX_SWIM_DISTANCE+"м");
        }
    }
}

public class HouseCat extends Animal{
    private static final int MAX_RUN_DISTANCE=200;
    private static final int MAX_SWIM_DISTANCE=0;
    public HouseCat(String name) {
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
            System.out.println(getName()+" не может плавать ");
    }
}

public class Duck extends Bird implements Flyable, Swimable {

    static int count = 0;
    public Duck(String id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Duck is eating");
    }

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is Swimming");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    void increamentCount() {
        count++;
    }

    @Override
    void decreamentCount() {
        count--;
    }
}

public class Crow extends Bird implements Flyable {

    static int count = 0;
    public Crow(String id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Crow is eating");
    }

    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    void increamentCount() {
        count++;
    }

    void decreamentCount() {
        count--;
    }
}

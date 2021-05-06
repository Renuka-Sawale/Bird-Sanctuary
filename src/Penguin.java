public class Penguin extends Bird implements Swimable {

    static int count = 0;
    public Penguin(String id) {
        this.id = id;
    }
    public void eat() {
        System.out.println("Penguin is eating");
    }

    public void swim() {
        System.out.println("Penguin is Swimming");
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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdSanctuaryManager {
    //List<Bird> birdList = new ArrayList<Bird>();
    Set<Bird> birdList = new HashSet<Bird>();
    public void add(Bird bird) {
        if (birdList.add(bird)) {
            bird.increamentCount();
        }
    }

    public void remove(Bird bird) {
        birdList.remove(bird);
        bird.decreamentCount();
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void print() {
        for (Bird bird: birdList) {
            if(bird instanceof Flyable) {
                ((Flyable)bird).fly();
            }
            if(bird instanceof Swimable) {
                Swimable swimable = (Swimable)bird;
                swimable.swim();
            }
            bird.eat();
        }
    }
}


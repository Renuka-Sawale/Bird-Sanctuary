public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome to Bird Sanctuary");
        BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
        Parrot parrot = new Parrot("p");
        Parrot parrot1 = new Parrot("p1");
        Parrot parrot2 = new Parrot("p2");
        Parrot parrot3 = new Parrot("p3");
        Duck duck = new Duck("d");
        Penguin penguin = new Penguin("pn");
        Crow crow = new Crow("c");
        Crow crow1 = new Crow("c");

        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(parrot1);
        birdSanctuaryManager.add(parrot2);
        birdSanctuaryManager.add(parrot3);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(penguin);
        birdSanctuaryManager.add(crow);
        birdSanctuaryManager.add(crow1);

        birdSanctuaryManager.print();

        System.out.println("Total no of Birds:" + birdSanctuaryManager.getAllCount());

        System.out.println("Total no of Parrot:" + parrot.getCount());
        System.out.println("Total no of Duck:" + duck.getCount());
        System.out.println("Total no of Penguin:" + penguin.getCount());
        System.out.println("Total no of Crow:" + crow.getCount());

        birdSanctuaryManager.remove(parrot1);
        birdSanctuaryManager.remove(parrot2);
        System.out.println("Total no of Parrot:" + parrot.getCount());
        System.out.println("Total no of Duck:" + duck.getCount());
        System.out.println("Total no of Penguin:" + penguin.getCount());
    }
}

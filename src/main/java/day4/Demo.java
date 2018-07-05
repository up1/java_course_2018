package day4;

interface MyRandom {
    int nextInt();
}

public class Demo {
    public int generateNumber(MyRandom random) {
        return random.nextInt();
    }

}

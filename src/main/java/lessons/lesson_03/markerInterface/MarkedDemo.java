package lessons.lesson_03.markerInterface;

public class MarkedDemo {
    public static void main(String[] args) {
        NonMarked nonMarked = new NonMarked();
        MarketClass marketClass = new MarketClass();
//        test(nonMarked);

        test(marketClass);
    }

    static void test(MyMark obj){
        System.out.println("test is ok");
    }
}


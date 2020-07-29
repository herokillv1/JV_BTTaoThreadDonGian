public class Main {
    public static void main(String[] args)  {
        NumberGenerator numberGenerator1 = new NumberGenerator(10);
        NumberGenerator2 numberGenerator2 = new NumberGenerator2(10);

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        thread1.setPriority(1);
        thread2.setPriority(4);

        thread1.start();
        thread2.start();
    }
}

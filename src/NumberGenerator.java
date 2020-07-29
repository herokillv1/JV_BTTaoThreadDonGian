public class NumberGenerator implements Runnable {
    private int lastNum;

    public NumberGenerator(int n){
        lastNum = n;
    }

    @Override
    synchronized public void run() {
        for (int i=1;i<=lastNum;i++){
            System.out.println(" "+i);
//            System.out.println(hashCode()+"hihi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

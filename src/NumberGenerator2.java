public class NumberGenerator2 implements Runnable {
    private int lastNum;

    public NumberGenerator2(int n){
        lastNum = n;
    }

    @Override
    synchronized public void run() {
        for (int i=lastNum;i>0;i--){
            System.err.println(" "+i);
//            System.out.println(hashCode()+"hihi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

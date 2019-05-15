/**
 * @author 孟赟强
 * @date 2019/5/15-7:39
 **/

public class ThreadTest {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,8,9,2,6,5};
        mThread[] m = new mThread[arr.length];
        for (int i = 0; i < m.length; i++) {
            m[i] = new mThread(arr[i]);
        }
        for (int i = 0; i < m.length; i++) {
            m[i].start();
        }
    }
}

class mThread extends Thread{
    int s=0;
    public mThread(int s){
        this.s = s;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(s*10+10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}

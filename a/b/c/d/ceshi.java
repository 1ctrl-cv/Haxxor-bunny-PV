package a.b.c.d;
import java.util.concurrent.TimeUnit;
    public class ceshi{
        public static void main(String[] args) {
                String[] s = {"take the blue crystal.you stay here and i show you where the haxxor bunny goes."};
                for(int i = 0; i < s.length; ++i ) {
                        System.out.print(s[i]);
                try {
                        TimeUnit.MILLISECONDS.sleep(100);
                } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
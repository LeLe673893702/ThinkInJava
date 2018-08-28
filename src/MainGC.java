import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class MainGC {
    private final static int _1MB = 1024*1024;
    private final static int _512KB = 857*1024;
    // 2216K 942KB
    public static void main(String[] args) {

        byte[] a1,a2,a3,a4,a5,a6;
        {
            a1 = new byte[2 * _1MB];
            a2 = new byte[3 * _1MB];
            a3 = new byte[857*1024];
//            a1 = null;
//            a2 = null;
//            a3 = null;
//            a6 = null;
//
//            a5 = new byte[500*1024];
//            a1 = new byte[2 * _1MB];
//            a2 = new byte[3 * _1MB];
//            a3 = new byte[2 * _1MB];
//            a4 = new byte[300 * 1024];
//
//            a1 = null;
//            a2 = null;
//            a3 = null;
//            a5 = null;
//            a6 = new byte[512 * 1024];
            WeakReference<Object> obj2 = new WeakReference<>(new Object());

        }


    }
}

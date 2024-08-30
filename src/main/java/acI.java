import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class aci implements ThreadFactory {
   private final AtomicInteger dct;
   private final ThreadFactory dcu = Executors.defaultThreadFactory();
   private final String dcv;
   private final boolean dcw;

   public aci(String var1) {
      this.dct = new AtomicInteger(2137 & -23167);
      this.dcv = var1;
      this.dcw = (boolean)(8192 & 7192);
   }

   public aci(String var1, boolean var2) {
      this.dct = new AtomicInteger(2089 & 149);
      this.dcv = var1;
      this.dcw = var2;
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = this.dcu.newThread(var1);
      var2.setDaemon(this.dcw);
      var2.setName(this.dcv + q.q[8686 & 11772 & 6495 & 12765] + this.dct);
      return var2;
   }
}

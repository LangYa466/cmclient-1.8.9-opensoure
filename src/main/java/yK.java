import java.util.Map;

public class YK extends Thread {
   private final YW czs;
   private final Map czt;
   private final byte[] czu;
   private final String czv;

   public YW agx() {
      return this.czs;
   }

   public YK(String var1, Map var2, byte[] var3, YW var4) {
      this.czv = var1;
      this.czt = var2;
      this.czu = var3;
      this.czs = var4;
   }

   public String agw() {
      return this.czv;
   }

   public byte[] agy() {
      return this.czu;
   }

   public void run() {
      try {
         YU.q(this.czv, this.czt, this.czu);
         this.czs.w(this.czv, this.czu, (Throwable)null);
      } catch (Exception var2) {
         this.czs.w(this.czv, this.czu, var2);
      }

   }
}

import java.util.IdentityHashMap;
import java.util.Map;

public class cC extends cv {
   private static final Map nG = new IdentityHashMap();

   public static void q(cv var0, int var1) {
      if (!nG.containsKey(var0)) {
         nG.put(var0, Integer.valueOf(var0.nv));
      }

      var0.nv = var1;
   }

   public boolean u(QI var1, NW var2) {
      return true;
   }

   public boolean cr() {
      return false;
   }

   public NV e(QI var1, NW var2, hI var3) {
      return null;
   }

   protected cC() {
      super(hn.zp);
   }

   public int cC() {
      return -1;
   }

   public void q(QI var1, NW var2, hI var3, float var4, int var5) {
   }

   public static void e(cv var0) {
      if (nG.containsKey(var0)) {
         int var1 = ((Integer)nG.get(var0)).intValue();
         q(var0, var1);
      }

   }

   public boolean q(hI var1, boolean var2) {
      return false;
   }
}

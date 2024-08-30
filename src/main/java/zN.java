import java.util.HashMap;
import java.util.Map;

public class Zn {
   private static long cBm = System.currentTimeMillis();
   private static Map cBn = null;
   private static final boolean cBo = Boolean.getBoolean(i.q[9710 & 4590]);

   public static synchronized Zk p(iO var0) {
      if (cBo && System.currentTimeMillis() > cBm + 5000L) {
         iQ var1 = hS.eV().CM;
         if (var1 != null) {
            q(var1.hl(), (Zk)null);
            cBm = System.currentTimeMillis();
         }
      }

      String var6 = var0.hl();
      if (var6 == null) {
         return null;
      } else {
         Zk var2 = (Zk)ahd().get(var6);
         if (var2 == null) {
            var2 = new Zk();
            ahd().put(var6, var2);
            Zm var3 = new Zm(var6);
            String var4 = YU.agQ() + u.q[4951 & 1853] + var6 + i.q[-28179 & 8685];
            YJ var5 = new YJ(var4, var3);
            var5.start();
         }

         return var2;
      }
   }

   public static void q(lL var0, iO var1, float var2, float var3) {
      Zk var4 = p(var1);
      if (var4 != null) {
         var4.q(var0, var1, var2, var3);
      }

   }

   private static Map ahd() {
      if (cBn == null) {
         cBn = new HashMap();
      }

      return cBn;
   }

   public static synchronized void q(String var0, Zk var1) {
      ahd().put(var0, var1);
   }
}

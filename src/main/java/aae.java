import java.util.HashMap;
import java.util.Map;

public class aaE {
   private static net.optifine.util.i cTp = new net.optifine.util.i(1);
   private static Map cTq = new HashMap();

   public static float q(int var0, float var1, float var2, float var3) {
      synchronized(cTq) {
         Integer var5 = var0;
         net.optifine.util.I var6 = (net.optifine.util.I)cTq.get(var5);
         if (var6 == null) {
            var6 = new net.optifine.util.I(var1, var2, var3);
            cTq.put(var5, var6);
         }

         float var7 = var6.E(var1, var2, var3);
         return var7;
      }
   }

   public static void amo() {
      synchronized(cTq) {
         cTq.clear();
      }
   }

   public static int amp() {
      synchronized(cTp) {
         return cTp.amu();
      }
   }
}

package net.optifine.util;

import java.util.HashMap;
import java.util.Map;

public class O {
   private static final Map cXQ = new HashMap();

   public static boolean e(String var0, long var1) {
      synchronized(cXQ) {
         long var4 = System.currentTimeMillis();
         Long var6 = (Long)cXQ.get(var0);
         if (var6 == null) {
            var6 = new Long(var4);
            cXQ.put(var0, var6);
         }

         long var7 = var6.longValue();
         if (var4 < var7 + var1) {
            return false;
         } else {
            cXQ.put(var0, new Long(var4));
            return true;
         }
      }
   }
}

package net.optifine.util;

import java.util.HashMap;
import java.util.Map;

public class s {
   private static final Map cVw = new HashMap();

   public static boolean C(String var0, int var1) {
      synchronized(cVw) {
         int var3 = .hS.eV().Bt.aeI;
         Integer var4 = (Integer)cVw.get(var0);
         if (var4 == null) {
            var4 = new Integer(var3);
            cVw.put(var0, var4);
         }

         int var5 = var4.intValue();
         if (var3 > var5 && var3 < var5 + var1) {
            return false;
         } else {
            cVw.put(var0, new Integer(var3));
            return true;
         }
      }
   }
}

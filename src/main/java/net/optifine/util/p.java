package net.optifine.util;

import java.util.HashMap;
import java.util.Map;

public class p {
   private static final Map cVt = new HashMap();
   private static final Map cVu = new HashMap();
   private static final Map cVv = new HashMap();

   public static int g(Class var0) {
      Integer var1 = (Integer)cVv.get(var0);
      return var1 == null ? -1 : var1.intValue();
   }

   static {
      for(int var0 = 0; var0 < 1000; ++var0) {
         Class var1 = .zv.dO(var0);
         if (var1 != null) {
            String var2 = .zv.dN(var0);
            if (var2 != null) {
               if (cVv.containsKey(var1)) {
                  .MV.cJ(.w.q[677 & -30013] + var1 + .w.q[-23645 & 19090] + cVv.get(var1) + .w.q[5803 & 19143] + var0);
               }

               if (cVu.containsKey(var2)) {
                  .MV.cJ(.w.q[19086 & -32027] + var2 + .w.q[-27934 & 20114] + cVu.get(var2) + .w.q[9923 & -11629] + var0);
               }

               if (cVt.containsKey(var2)) {
                  .MV.cJ(.w.q[686 & 917] + var2 + .w.q[-32043 & 2727] + cVt.get(var2) + .w.q[11142 & -27962] + var1);
               }

               cVv.put(var1, Integer.valueOf(var0));
               cVu.put(var2, Integer.valueOf(var0));
               cVt.put(var2, var1);
            }
         }
      }

   }

   public static int am(.zk var0) {
      return var0 == null ? -1 : g(var0.getClass());
   }

   public static Class gM(String var0) {
      Class var1 = (Class)cVt.get(var0);
      return var1;
   }

   public static int gN(String var0) {
      Integer var1 = (Integer)cVu.get(var0);
      return var1 == null ? -1 : var1.intValue();
   }
}

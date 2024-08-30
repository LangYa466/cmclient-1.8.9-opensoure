package net.optifine.shaders;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class o {
   private static int[] cDP = null;
   private static boolean cDw;

   public static void q(net.optifine.shaders.d var0) {
      pK();
      if (var0 != null) {
         ArrayList var1 = new ArrayList();
         String var2 = .o.q[2541 & 16749];
         InputStream var3 = var0.fm(var2);
         if (var3 != null) {
            w(var3, var2, var1);
         }

         if (var1.size() > 0) {
            cDP = C(var1);
         }
      }

   }

   public static void afE() {
      if (cDw) {
         cDw = false;
         q(net.optifine.shaders.F.akf());
      }

   }

   private static int[] C(List var0) {
      int[] var1 = new int[var0.size()];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = ((Integer)var0.get(var2)).intValue();
      }

      return var1;
   }

   public static int iN(int var0) {
      if (cDP == null) {
         return -1;
      } else if (var0 >= 0 && var0 < cDP.length) {
         int var1 = cDP[var0];
         return var1;
      } else {
         return -1;
      }
   }

   private static void w(List var0, int var1, int var2) {
      while(var0.size() <= var1) {
         var0.add(Integer.valueOf(-1));
      }

      var0.set(var1, Integer.valueOf(var2));
   }

   public static void pK() {
      cDP = null;
   }

   private static void w(InputStream var0, String var1, List var2) {
      if (var0 != null) {
         try {
            var0 = .ZE.w(var0, var1);
            net.optifine.util.F var3 = new net.optifine.util.F();
            var3.load(var0);
            var0.close();
            .MV.cM(.o.q[366 & 1007] + var1);
            .XZ var4 = new .XZ(.t.q[-29871 & 4980]);

            for(Object var6 : var3.keySet()) {
               String var7 = (String)var6;
               String var8 = var3.getProperty(var7);
               String var9 = .e.q[19415 & 823];
               if (!var7.startsWith(var9)) {
                  .MV.cJ(.o.q[16767 & -26129] + var7);
               } else {
                  String var10 = net.optifine.util.J.Q(var7, var9);
                  int var11 = .MV.u(var10, -1);
                  if (var11 < 0) {
                     .MV.cJ(.o.q[1396 & 10736] + var11);
                  } else {
                     int[] var12 = var4.eI(var8);
                     if (var12 != null && var12.length >= 1) {
                        for(int var13 = 0; var13 < var12.length; ++var13) {
                           int var14 = var12[var13];
                           w(var2, var14, var11);
                        }
                     } else {
                        .MV.cJ(.o.q[369 & 13169] + var7 + .q.q[4631 & 18454] + var8);
                     }
                  }
               }
            }
         } catch (IOException var15) {
            .MV.cJ(.u.q[25514 & 413] + var1);
         }
      }

   }
}

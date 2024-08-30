package net.optifine.shaders;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class w {
   private static boolean cDw;
   private static net.optifine.util.F cDx = null;
   private static net.optifine.shaders.q[][] cDy = (net.optifine.shaders.q[][])null;

   private static void q(List var0, net.optifine.shaders.q var1) {
      int[] var2 = var1.aey();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var2[var3];

         while(var4 >= var0.size()) {
            var0.add((Object)null);
         }

         Object var5 = (List)var0.get(var4);
         if (var5 == null) {
            var5 = new ArrayList();
            var0.set(var4, var5);
         }

         net.optifine.shaders.q var6 = new net.optifine.shaders.q(var1.ahM(), var1.iM(var4));
         ((List)var5).add(var6);
      }

   }

   private static void q(InputStream var0, String var1, List var2) {
      if (var0 != null) {
         try {
            var0 = .ZE.w(var0, var1);
            net.optifine.util.F var3 = new net.optifine.util.F();
            var3.load(var0);
            var0.close();
            .MV.cM(.i.q[24734 & 6174] + var1);
            .XZ var4 = new .XZ(.t.q[6992 & -31918]);

            for(Object var6 : var3.keySet()) {
               String var7 = (String)var6;
               String var8 = var3.getProperty(var7);
               if (var7.startsWith(.t.q[-8370 & 8830])) {
                  if (cDx == null) {
                     cDx = new net.optifine.util.F();
                  }

                  cDx.put(var7, var8);
               } else {
                  String var9 = .i.q[21535 & 447];
                  if (!var7.startsWith(var9)) {
                     .MV.cJ(.i.q[16480 & 9512] + var7);
                  } else {
                     String var10 = net.optifine.util.J.Q(var7, var9);
                     int var11 = .MV.u(var10, -1);
                     if (var11 < 0) {
                        .MV.cJ(.i.q[4144 & 11297] + var7);
                     } else {
                        .Yi[] var12 = var4.eO(var8);
                        if (var12 != null && var12.length >= 1) {
                           net.optifine.shaders.q var13 = new net.optifine.shaders.q(var11, var12);
                           q(var2, var13);
                        } else {
                           .MV.cJ(.i.q[1065 & 18611] + var7 + .q.q[8215 & -15178] + var8);
                        }
                     }
                  }
               }
            }
         } catch (IOException var14) {
            .MV.cJ(.u.q[-20035 & 1930] + var1);
         }
      }

   }

   public static void afE() {
      if (cDw) {
         cDw = false;
         q(net.optifine.shaders.F.akf());
      }

   }

   public static net.optifine.util.F ahN() {
      return cDx;
   }

   public static int bF(int var0, int var1) {
      if (cDy == null) {
         return var0;
      } else if (var0 >= 0 && var0 < cDy.length) {
         net.optifine.shaders.q[] var2 = cDy[var0];
         if (var2 == null) {
            return var0;
         } else {
            for(int var3 = 0; var3 < var2.length; ++var3) {
               net.optifine.shaders.q var4 = var2[var3];
               if (var4.bD(var0, var1)) {
                  return var4.ahM();
               }
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public static void q(net.optifine.shaders.d var0) {
      pK();
      if (var0 != null) {
         ArrayList var1 = new ArrayList();
         String var2 = .i.q[4159 & 11101];
         InputStream var3 = var0.fm(var2);
         if (var3 != null) {
            q(var3, var2, var1);
         }

         if (var1.size() > 0) {
            cDy = B(var1);
         }
      }

   }

   public static void pK() {
      cDy = (net.optifine.shaders.q[][])null;
      cDx = null;
   }

   private static net.optifine.shaders.q[][] B(List var0) {
      net.optifine.shaders.q[][] var1 = new net.optifine.shaders.q[var0.size()][];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            var1[var2] = (net.optifine.shaders.q[])var3.toArray(new net.optifine.shaders.q[var3.size()]);
         }
      }

      return var1;
   }
}

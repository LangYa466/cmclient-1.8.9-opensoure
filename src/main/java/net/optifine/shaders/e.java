package net.optifine.shaders;

public class E {
   public static .aab q(.aab[] var0, .ZP[] var1, boolean var2) {
      if (var0 == null) {
         return null;
      } else {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            .aab var4 = var0[var3];
            if (q(var4, var1, var2)) {
               return var4;
            }
         }

         return null;
      }
   }

   public static boolean q(.aab var0, .ZP[] var1, boolean var2) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         String[] var3 = var0.alN();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            .ZP var6 = q(var5, var1);
            if (var6 != null) {
               String var7 = var2 ? var6.akN() : var6.wx();
               String var8 = var0.gy(var5);
               if (!.MV.e(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static .ZP q(String var0, .ZP[] var1) {
      if (var1 == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            .ZP var3 = var1[var2];
            if (var3.bY().equals(var0)) {
               return var3;
            }
         }

         return null;
      }
   }
}

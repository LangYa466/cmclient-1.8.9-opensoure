package net.optifine.util;

public class B {
   private static final long cVS = 1048576L;
   private static long cVT = System.currentTimeMillis();
   private static long cVU = amL();
   private static boolean cVV = false;
   private static long cVW = cVT;
   private static long cVX = cVU;
   private static int cVY = 0;

   public static long amH() {
      return cVT;
   }

   public static long amI() {
      return (long)cVY / 1048576L;
   }

   public static long amJ() {
      return cVU / 1048576L;
   }

   public static boolean amK() {
      return cVV;
   }

   private static long amL() {
      Runtime var0 = Runtime.getRuntime();
      return var0.totalMemory() - var0.freeMemory();
   }

   public static void aW() {
      long var0 = System.currentTimeMillis();
      long var2 = amL();
      cVV = var2 < cVX;
      if (cVV) {
         long var4 = cVW - cVT;
         long var6 = cVX - cVU;
         double var8 = (double)var4 / 1000.0D;
         int var10 = (int)((double)var6 / var8);
         if (var10 > 0) {
            cVY = var10;
         }

         cVT = var0;
         cVU = var2;
      }

      cVW = var0;
      cVX = var2;
   }
}

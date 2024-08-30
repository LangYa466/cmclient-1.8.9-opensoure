package net.optifine.util;

public class G {
   public static double jI(int var0) {
      double var1 = (double)var0 / 4096.0D;
      var1 = var1 * 0.995D;
      double var3 = var1 * 2.0D - 1.0D;
      var3 = .Pq.J(var3, -1.0D, 1.0D);
      return (double).Pq.B(1.0D - var3 * var3);
   }

   public static double y(.rA var0) {
      int var1 = u(var0);
      double var2 = jI(var1);
      return var2;
   }

   public static int u(.rA var0) {
      .Se[] var1 = var0.rc().abQ();
      if (var1 == null) {
         return 0;
      } else {
         int var2 = var0.dt().aX() >> 4;
         .Se var3 = var1[var2];
         return var3 == null ? 0 : var3.acb();
      }
   }
}

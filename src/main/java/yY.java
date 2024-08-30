public class yy implements yA {
   private int k(OK var1) {
      return var1.WP() + 1 + (var1.WR() + 1) * 3;
   }

   protected GX q(yC var1, GX var2) {
      OK var3 = dr.N(var1.dT());
      yF var4 = dr.q(var1);
      GX var5 = var2.fp(1);
      q(var1.dV(), var5, 6, var3, var4);
      return var2;
   }

   public static void q(QI var0, GX var1, int var2, OK var3, yF var4) {
      double var5 = var4.cj();
      double var7 = var4.ci();
      double var9 = var4.ch();
      if (var3.WT() == OM.bQW) {
         var7 = var7 - 0.125D;
      } else {
         var7 = var7 - 0.15625D;
      }

      BD var11 = new BD(var0, var5, var7, var9, var1);
      double var12 = var0.bXs.nextDouble() * 0.1D + 0.2D;
      var11.aOd = (double)var3.WP() * var12;
      var11.aOO = 0.20000000298023224D;
      var11.aOL = (double)var3.WR() * var12;
      var11.aOd += var0.bXs.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.aOO += var0.bXs.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.aOL += var0.bXs.nextGaussian() * 0.007499999832361937D * (double)var2;
      var0.p(var11);
   }

   protected void q(yC var1, OK var2) {
      var1.dV().e(2000, var1.dU(), this.k(var2));
   }

   public final GX w(yC var1, GX var2) {
      GX var3 = this.q(var1, var2);
      this.w(var1);
      this.q(var1, dr.N(var1.dT()));
      return var3;
   }

   protected void w(yC var1) {
      var1.dV().e(1000, var1.dU(), 0);
   }
}

public class Gu extends Fm {
   public boolean q(GX var1, DD var2, QI var3, NW var4, OK var5, float var6, float var7, float var8) {
      cv var9 = var3.g(var4).ds();
      if (var9 instanceof dM) {
         if (var3.bXF) {
            return true;
         } else {
            w(var2, var3, var4);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean w(DD var0, QI var1, NW var2) {
      zu var3 = zu.Z(var1, var2);
      boolean var4 = false;
      double var5 = 7.0D;
      int var7 = var2.aY();
      int var8 = var2.aX();
      int var9 = var2.KO();

      for(zx var11 : var1.q(zx.class, new NV((double)var7 - var5, (double)var8 - var5, (double)var9 - var5, (double)var7 + var5, (double)var8 + var5, (double)var9 + var5))) {
         if (var11.yL() && var11.yP() == var0) {
            if (var3 == null) {
               var3 = zu.aa(var1, var2);
            }

            var11.q(var3, true);
            var4 = true;
         }
      }

      return var4;
   }

   public Gu() {
      this.r(yl.aLC);
   }
}

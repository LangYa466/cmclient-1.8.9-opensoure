public class GJ extends Fm {
   public boolean q(GX var1, DD var2, QI var3, NW var4, OK var5, float var6, float var7, float var8) {
      boolean var9 = var3.g(var4).ds().u(var3, var4);
      NW var10 = var9 ? var4 : var4.v(var5);
      if (!var2.q(var10, var5, var1)) {
         return false;
      } else {
         cv var11 = var3.g(var10).ds();
         if (!var3.q(var11, var10, false, var5, (zk)null, var1)) {
            return false;
         } else if (Ea.biq.e(var3, var10)) {
            --var1.bsH;
            var3.r(var10, Ea.biq.cx());
            return true;
         } else {
            return false;
         }
      }
   }

   public GJ() {
      this.r(yl.aLN);
   }
}

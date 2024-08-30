public class Go extends Fm {
   public boolean q(GX var1, DD var2, QI var3, NW var4, OK var5, float var6, float var7, float var8) {
      var4 = var4.v(var5);
      if (!var2.q(var4, var5, var1)) {
         return false;
      } else {
         if (var3.g(var4).ds().cB() == hn.zp) {
            var3.q((double)var4.aY() + 0.5D, (double)var4.aX() + 0.5D, (double)var4.KO() + 0.5D, r.q[1004 & 27564], 1.0F, bqU.nextFloat() * 0.4F + 0.8F);
            var3.r(var4, Ea.bkn.cx());
         }

         var1.w(1, var2);
         return true;
      }
   }

   public Go() {
      this.bqQ = 1;
      this.fg(64);
      this.r(yl.aLC);
   }
}

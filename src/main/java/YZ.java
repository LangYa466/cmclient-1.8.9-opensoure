public abstract class yz extends yy {
   protected float wM() {
      return 1.1F;
   }

   protected abstract zO q(QI var1, yF var2);

   protected void w(yC var1) {
      var1.dV().e(1002, var1.dU(), 0);
   }

   public GX q(yC var1, GX var2) {
      QI var3 = var1.dV();
      yF var4 = dr.q(var1);
      OK var5 = dr.N(var1.dT());
      zO var6 = this.q(var3, var4);
      var6.e((double)var5.WP(), (double)((float)var5.WQ() + 0.1F), (double)var5.WR(), this.wM(), this.wN());
      var3.p((zk)var6);
      var2.fp(1);
      return var2;
   }

   protected float wN() {
      return 6.0F;
   }
}

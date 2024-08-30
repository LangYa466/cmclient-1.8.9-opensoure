import java.util.Random;

public class rW extends sv {
   private Random Ed = new Random();
   private lX aqF;
   private static final PJ aqG = new PJ(q.q[11060 & 277]);

   // $FF: synthetic method
   public void e(zk var1, double var2, double var4, double var6, float var8, float var9) {
      this.q((BW)var1, var2, var4, var6, var8, var9);
   }

   public void q(BW var1, double var2, double var4, double var6, float var8, float var9) {
      this.aqF.Vj = var1.Dc().ds().cB() != hn.zp;
      this.aqF.Vi = var1.CZ();
      if (var1.CZ()) {
         double var10 = 0.02D;
         var2 += this.Ed.nextGaussian() * var10;
         var6 += this.Ed.nextGaussian() * var10;
      }

      super.q((zx)var1, var2, var4, var6, var8, var9);
   }

   // $FF: synthetic method
   protected PJ f(zk var1) {
      return this.q((BW)var1);
   }

   public rW(sx var1) {
      super(var1, new lX(0.0F), 0.5F);
      this.aqF = (lX)super.atf;
      this.w(new tn(this));
      this.w(new to(this));
   }

   protected PJ q(BW var1) {
      return aqG;
   }
}

import java.util.Random;

public class Rx extends Rl {
   private int cbZ;
   private int cca = 2;
   private int ccb = 1;
   private int ccc = 0;
   private Tu ccd = new Tg(Ea.bkp.cx().q(gc.vs, ge.vC), 9);
   private Tp cce = new Tp(false);

   protected Rl hu(int var1) {
      return (new Rx(var1, false)).e(this);
   }

   public SG p(Random var1) {
      return (SG)(var1.nextInt(3) > 0 ? this.cce : super.p(var1));
   }

   protected Rx(int var1, boolean var2) {
      super(var1);
      this.cbZ = this.ccc;
      if (var2) {
         this.cbp.bZG = 3;
         this.cbZ = this.ccb;
      }

   }

   public void q(QI var1, Random var2, RU var3, int var4, int var5, double var6) {
      this.caI = Ea.biQ.cx();
      this.cbm = Ea.bjj.cx();
      if ((var6 < -1.0D || var6 > 2.0D) && this.cbZ == this.cca) {
         this.caI = Ea.bgW.cx();
         this.cbm = Ea.bgW.cx();
      } else if (var6 > 1.0D && this.cbZ != this.ccb) {
         this.caI = Ea.biP.cx();
         this.cbm = Ea.biP.cx();
      }

      this.w(var1, var2, var3, var4, var5, var6);
   }

   public void q(QI var1, Random var2, NW var3) {
      super.q(var1, var2, var3);
      int var4 = 3 + var2.nextInt(6);

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var2.nextInt(16);
         int var7 = var2.nextInt(28) + 4;
         int var8 = var2.nextInt(16);
         NW var9 = var3.C(var6, var7, var8);
         if (var1.g(var9).ds() == Ea.biP) {
            var1.q(var9, Ea.biI.cx(), 2);
         }
      }

      for(int var10 = 0; var10 < 7; ++var10) {
         int var11 = var2.nextInt(16);
         int var12 = var2.nextInt(64);
         int var13 = var2.nextInt(16);
         this.ccd.w(var1, var2, var3.C(var11, var12, var13));
      }

   }

   private Rx e(Rl var1) {
      this.cbZ = this.cca;
      this.s(var1.jr, true);
      this.dC(var1.caU + t.q[3062 & 894]);
      this.q(new Rn(var1.cbh, var1.cae));
      this.m(var1.cax, var1.cbz);
      return this;
   }
}

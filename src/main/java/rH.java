import java.util.Random;

public class RH extends Rl {
   private Ta cct = new Ta();
   private SZ ccu = new SZ(4);
   private boolean ccv;

   public RH(int var1, boolean var2) {
      super(var1);
      this.ccv = var2;
      if (var2) {
         this.caI = Ea.biM.cx();
      }

      this.caz.clear();
   }

   protected Rl hu(int var1) {
      Rl var2 = (new RH(var1, true)).s(13828095, true).dC(this.caU + o.q[10143 & 918]).aaW().m(0.0F, 0.5F).q(new Rn(this.cbh + 0.1F, this.cae + 0.1F));
      var2.cbh = this.cbh + 0.3F;
      var2.cae = this.cae + 0.4F;
      return var2;
   }

   public void q(QI var1, Random var2, NW var3) {
      if (this.ccv) {
         for(int var4 = 0; var4 < 3; ++var4) {
            int var5 = var2.nextInt(16) + 8;
            int var6 = var2.nextInt(16) + 8;
            this.cct.w(var1, var2, var1.aq(var3.C(var5, 0, var6)));
         }

         for(int var7 = 0; var7 < 2; ++var7) {
            int var8 = var2.nextInt(16) + 8;
            int var9 = var2.nextInt(16) + 8;
            this.ccu.w(var1, var2, var1.aq(var3.C(var8, 0, var9)));
         }
      }

      super.q(var1, var2, var3);
   }

   public SG p(Random var1) {
      return new Tp(false);
   }
}

import java.util.Random;

public class RJ extends Rl {
   public SG p(Random var1) {
      return this.cbv;
   }

   public void q(QI var1, Random var2, RU var3, int var4, int var5, double var6) {
      double var8 = caB.s((double)var4 * 0.25D, (double)var5 * 0.25D);
      if (var8 > 0.0D) {
         int var10 = var4 & 15;
         int var11 = var5 & 15;

         for(int var12 = 255; var12 >= 0; --var12) {
            if (var3.R(var11, var12, var10).ds().cB() != hn.zp) {
               if (var12 == 62 && var3.R(var11, var12, var10).ds() != Ea.bgT) {
                  var3.q(var11, var12, var10, Ea.bgT.cx());
                  if (var8 < 0.12D) {
                     var3.q(var11, var12 + 1, var10, Ea.bhy.cx());
                  }
               }
               break;
            }
         }
      }

      this.w(var1, var2, var3, var4, var5, var6);
   }

   public int aN(NW var1) {
      return 6975545;
   }

   public dS q(Random var1, NW var2) {
      return dS.pT;
   }

   public int aM(NW var1) {
      double var2 = caB.s((double)var1.aY() * 0.0225D, (double)var1.KO() * 0.0225D);
      return var2 < -0.1D ? 5011004 : 6975545;
   }

   protected RJ(int var1) {
      super(var1);
      this.cbp.bZG = 2;
      this.cbp.bZz = 1;
      this.cbp.bZs = 1;
      this.cbp.bZW = 8;
      this.cbp.bZy = 10;
      this.cbp.bZO = 1;
      this.cbp.bZB = 4;
      this.cbp.bZt = 0;
      this.cbp.bZZ = 0;
      this.cbp.bZC = 5;
      this.cbi = 14745518;
      this.caG.add(new Ro(CA.class, 1, 1, 1));
   }
}

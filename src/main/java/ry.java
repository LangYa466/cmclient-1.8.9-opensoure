import java.util.Random;

public class Ry extends Rl {
   private boolean ccf;
   private static final hI ccg = Ea.bkg.cx().q(eQ.sd, ff.sB).q(es.rp, Boolean.valueOf(false));
   private static final hI cch = Ea.bkr.cx().q(eS.se, ff.sE);
   private static final hI cci = Ea.bkg.cx().q(eQ.sd, ff.sE).q(es.rp, Boolean.valueOf(false));

   public SG p(Random var1) {
      return (SG)(var1.nextInt(10) == 0 ? this.cby : (var1.nextInt(2) == 0 ? new Tl(cch, ccg) : (!this.ccf && var1.nextInt(3) == 0 ? new Td(false, 10, 20, cch, cci) : new Tr(false, 4 + var1.nextInt(7), cch, cci, true))));
   }

   public Ry(int var1, boolean var2) {
      super(var1);
      this.ccf = var2;
      if (var2) {
         this.cbp.bZG = 2;
      } else {
         this.cbp.bZG = 50;
      }

      this.cbp.bZC = 25;
      this.cbp.bZz = 4;
      if (!var2) {
         this.caG.add(new Ro(Db.class, 2, 1, 1));
      }

      this.caz.add(new Ro(CV.class, 10, 4, 4));
   }

   public void q(QI var1, Random var2, NW var3) {
      super.q(var1, var2, var3);
      int var4 = var2.nextInt(16) + 8;
      int var5 = var2.nextInt(16) + 8;
      int var6 = var2.nextInt(var1.aq(var3.C(var4, 0, var5)).aX() * 2);
      (new Tf()).w(var1, var2, var3.C(var4, var6, var5));
      Ts var7 = new Ts();

      for(int var10 = 0; var10 < 50; ++var10) {
         var6 = var2.nextInt(16) + 8;
         boolean var8 = true;
         int var9 = var2.nextInt(16) + 8;
         var7.w(var1, var2, var3.C(var6, 128, var9));
      }

   }

   public Tu a(Random var1) {
      return var1.nextInt(4) == 0 ? new Tq(gP.xx) : new Tq(gP.xw);
   }
}

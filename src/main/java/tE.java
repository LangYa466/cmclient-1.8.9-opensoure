import java.util.Random;

public class Te extends SY {
   private static final hI ciJ = Ea.bkg.cx().q(eQ.sd, ff.sC).q(es.rp, Boolean.valueOf(false));
   private static final hI ciK = Ea.bkr.cx().q(eS.se, ff.sC);
   private static final hI ciL = Ea.bjj.cx().q(dp.ot, dq.ow);
   private boolean ciM;

   public Te(boolean var1, boolean var2) {
      super(var1, 13, 15, ciK, ciJ);
      this.ciM = var2;
   }

   private void ah(QI var1, NW var2) {
      for(int var3 = -2; var3 <= 2; ++var3) {
         for(int var4 = -2; var4 <= 2; ++var4) {
            if (Math.abs(var3) != 2 || Math.abs(var4) != 2) {
               this.ai(var1, var2.C(var3, 0, var4));
            }
         }
      }

   }

   public boolean w(QI var1, Random var2, NW var3) {
      int var4 = this.d(var2);
      if (!this.q(var1, var2, var3, var4)) {
         return false;
      } else {
         this.q(var1, var3.aY(), var3.KO(), var3.aX() + var4, 0, var2);

         for(int var5 = 0; var5 < var4; ++var5) {
            cv var6 = var1.g(var3.gx(var5)).ds();
            if (var6.cB() == hn.zp || var6.cB() == hn.zK) {
               this.N(var1, var3.gx(var5), this.ciG);
            }

            if (var5 < var4 - 1) {
               var6 = var1.g(var3.C(1, var5, 0)).ds();
               if (var6.cB() == hn.zp || var6.cB() == hn.zK) {
                  this.N(var1, var3.C(1, var5, 0), this.ciG);
               }

               var6 = var1.g(var3.C(1, var5, 1)).ds();
               if (var6.cB() == hn.zp || var6.cB() == hn.zK) {
                  this.N(var1, var3.C(1, var5, 1), this.ciG);
               }

               var6 = var1.g(var3.C(0, var5, 1)).ds();
               if (var6.cB() == hn.zp || var6.cB() == hn.zK) {
                  this.N(var1, var3.C(0, var5, 1), this.ciG);
               }
            }
         }

         return true;
      }
   }

   private void q(QI var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = var6.nextInt(5) + (this.ciM ? this.ciE : 3);
      int var8 = 0;

      for(int var9 = var4 - var7; var9 <= var4; ++var9) {
         int var10 = var4 - var9;
         int var11 = var5 + Pq.bg((float)var10 / (float)var7 * 3.5F);
         this.o(var1, new NW(var2, var9, var3), var11 + (var10 > 0 && var11 == var8 && (var9 & 1) == 0 ? 1 : 0));
         var8 = var11;
      }

   }

   public void e(QI var1, Random var2, NW var3) {
      this.ah(var1, var3.Vh().Vg());
      this.ah(var1, var3.gz(2).Vg());
      this.ah(var1, var3.Vh().gA(2));
      this.ah(var1, var3.gz(2).gA(2));

      for(int var4 = 0; var4 < 5; ++var4) {
         int var5 = var2.nextInt(64);
         int var6 = var5 % 8;
         int var7 = var5 / 8;
         if (var6 == 0 || var6 == 7 || var7 == 0 || var7 == 7) {
            this.ah(var1, var3.C(-3 + var6, 0, -3 + var7));
         }
      }

   }

   private void ai(QI var1, NW var2) {
      for(int var3 = 2; var3 >= -3; --var3) {
         NW var4 = var2.gx(var3);
         cv var5 = var1.g(var4).ds();
         if (var5 == Ea.biQ || var5 == Ea.bjj) {
            this.N(var1, var4, ciL);
            break;
         }

         if (var5.cB() != hn.zp && var3 < 0) {
            break;
         }
      }

   }
}

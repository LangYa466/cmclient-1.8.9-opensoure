import java.util.Random;

public class cO {
   public static final hw nS = hw.q(u.q[-29889 & 10174], cP.class);
   public static final hu nT = hu.x(u.q[-31873 & 13119]);

   private void dj() {
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
   }

   public hI q(hI var1, Qx var2, NW var3) {
      if (var1.w(nS) == cP.nV) {
         hI var4 = var2.g(var3.v((OK)var1.w(or)));
         if (var4.ds() == this) {
            var1 = var1.q(nT, var4.w(nT));
         }
      }

      return var1;
   }

   public Fm q(hI var1, Random var2, int var3) {
      return var1.w(nS) == cP.nU ? null : Et.bnG;
   }

   public boolean cr() {
      return false;
   }

   public int e(hI var1) {
      int var2 = 0;
      var2 = var2 | ((OK)var1.w(or)).WI();
      if (var1.w(nS) == cP.nU) {
         var2 |= 8;
         if (((Boolean)var1.w(nT)).booleanValue()) {
            var2 |= 4;
         }
      }

      return var2;
   }

   public Fm i(QI var1, NW var2) {
      return Et.bnG;
   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      if (var1.bXF) {
         return true;
      } else {
         if (var3.w(nS) != cP.nU) {
            var2 = var2.v((OK)var3.w(or));
            var3 = var1.g(var2);
            if (var3.ds() != this) {
               return true;
            }
         }

         if (var1.bXI.ZT() && var1.ai(var2) != Rl.cbb) {
            if (((Boolean)var3.w(nT)).booleanValue()) {
               DD var11 = this.g(var1, var2);
               if (var11 != null) {
                  var4.w(new Op(u.q[23359 & -23685], new Object[0]));
                  return true;
               }

               var3 = var3.q(nT, Boolean.valueOf(false));
               var1.q(var2, var3, 4);
            }

            DG var12 = var4.M(var2);
            if (var12 == DG.beC) {
               var3 = var3.q(nT, Boolean.valueOf(true));
               var1.q(var2, var3, 4);
               return true;
            } else {
               if (var12 == DG.beE) {
                  var4.w(new Op(u.q[956 & 17215], new Object[0]));
               } else if (var12 == DG.beH) {
                  var4.w(new Op(u.q[2943 & -30915], new Object[0]));
               }

               return true;
            }
         } else {
            var1.am(var2);
            NW var9 = var2.v(((OK)var3.w(or)).WK());
            if (var1.g(var9).ds() == this) {
               var1.am(var9);
            }

            var1.q((zk)null, (double)var2.aY() + 0.5D, (double)var2.aX() + 0.5D, (double)var2.KO() + 0.5D, 5.0F, true, true);
            return true;
         }
      }
   }

   public static NW w(QI var0, NW var1, int var2) {
      OK var3 = (OK)var0.g(var1).w(or);
      int var4 = var1.aY();
      int var5 = var1.aX();
      int var6 = var1.KO();

      for(int var7 = 0; var7 <= 1; ++var7) {
         int var8 = var4 - var3.WP() * var7 - 1;
         int var9 = var6 - var3.WR() * var7 - 1;
         int var10 = var8 + 2;
         int var11 = var9 + 2;

         for(int var12 = var8; var12 <= var10; ++var12) {
            for(int var13 = var9; var13 <= var11; ++var13) {
               NW var14 = new NW(var12, var5, var13);
               if (f(var0, var14)) {
                  if (var2 <= 0) {
                     return var14;
                  }

                  --var2;
               }
            }
         }
      }

      return null;
   }

   public void e(Qx var1, NW var2) {
      this.dj();
   }

   protected hA cY() {
      return new hA(this, new ht[]{or, nS, nT});
   }

   public OS cn() {
      return OS.bSl;
   }

   public void q(QI var1, NW var2, hI var3, DD var4) {
      if (var4.bdO.bfz && var3.w(nS) == cP.nU) {
         NW var5 = var2.v(((OK)var3.w(or)).WK());
         if (var1.g(var5).ds() == this) {
            var1.am(var5);
         }
      }

   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      OK var5 = (OK)var3.w(or);
      if (var3.w(nS) == cP.nU) {
         if (var1.g(var2.v(var5.WK())).ds() != this) {
            var1.am(var2);
         }
      } else if (var1.g(var2.v(var5)).ds() != this) {
         var1.am(var2);
         if (!var1.bXF) {
            this.q(var1, var2, var3, 0);
         }
      }

   }

   public int cI() {
      return 1;
   }

   protected static boolean f(QI var0, NW var1) {
      return QI.c(var0, var1.Vj()) && !var0.g(var1).ds().cB().ec() && !var0.g(var1.Vi()).ds().cB().ec();
   }

   public boolean cw() {
      return false;
   }

   private DD g(QI var1, NW var2) {
      for(DD var4 : var1.bXt) {
         if (var4.zV() && var4.bem.equals(var2)) {
            return var4;
         }
      }

      return null;
   }

   public void q(QI var1, NW var2, hI var3, float var4, int var5) {
      if (var3.w(nS) == cP.nV) {
         super.q(var1, var2, var3, var4, 0);
      }

   }

   public cO() {
      super(hn.zq);
      this.q(this.nr.ez().q(nS, cP.nV).q(nT, Boolean.valueOf(false)));
      this.dj();
   }

   public hI J(int var1) {
      OK var2 = OK.gE(var1);
      return (var1 & 8) > 0 ? this.cx().q(nS, cP.nU).q(or, var2).q(nT, Boolean.valueOf((var1 & 4) > 0)) : this.cx().q(nS, cP.nV).q(or, var2);
   }
}

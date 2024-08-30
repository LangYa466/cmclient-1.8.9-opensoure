import java.util.Arrays;
import java.util.Random;

public class Rz extends Rl {
   private long ccj;
   private hI[] cck;
   private boolean ccl;
   private SE ccm;
   private boolean ccn;
   private SE cco;
   private SE ccp;

   protected Rl hu(int var1) {
      boolean var2 = this.car == Rl.cbt.car;
      Rz var3 = new Rz(var1, var2, this.ccn);
      if (!var2) {
         var3.q(caL);
         var3.dC(this.caU + t.q[1910 & 4982]);
      } else {
         var3.dC(this.caU + y.q[850 & 2906]);
      }

      var3.s(this.jr, true);
      return var3;
   }

   public int aM(NW var1) {
      return 9470285;
   }

   public int aN(NW var1) {
      return 10387789;
   }

   private hI K(int var1, int var2, int var3) {
      int var4 = (int)Math.round(this.ccp.s((double)var1 * 1.0D / 512.0D, (double)var1 * 1.0D / 512.0D) * 2.0D);
      return this.cck[(var2 + var4 + 64) % 64];
   }

   public void q(QI var1, Random var2, NW var3) {
      super.q(var1, var2, var3);
   }

   public Rz(int var1, boolean var2, boolean var3) {
      super(var1);
      this.ccl = var2;
      this.ccn = var3;
      this.abh();
      this.m(2.0F, 0.0F);
      this.caz.clear();
      this.caI = Ea.bjg.cx().q(fU.uX, fV.uZ);
      this.cbm = Ea.bir.cx();
      this.cbp.bZG = -999;
      this.cbp.bZs = 20;
      this.cbp.bZy = 3;
      this.cbp.cab = 5;
      this.cbp.bZz = 0;
      this.caz.clear();
      if (var3) {
         this.cbp.bZG = 5;
      }

   }

   public SG p(Random var1) {
      return this.can;
   }

   private void D(long var1) {
      this.cck = new hI[64];
      Arrays.fill(this.cck, Ea.bjy.cx());
      Random var3 = new Random(var1);
      this.ccp = new SE(var3, 1);

      for(int var12 = 0; var12 < 64; ++var12) {
         var12 += var3.nextInt(5) + 1;
         if (var12 < 64) {
            this.cck[var12] = Ea.bir.cx().q(dh.om, Fk.bqk);
         }
      }

      int var13 = var3.nextInt(4) + 2;

      for(int var5 = 0; var5 < var13; ++var5) {
         int var6 = var3.nextInt(3) + 1;
         int var7 = var3.nextInt(64);

         for(int var8 = 0; var7 + var8 < 64 && var8 < var6; ++var8) {
            this.cck[var7 + var8] = Ea.bir.cx().q(dh.om, Fk.bqn);
         }
      }

      int var14 = var3.nextInt(4) + 2;

      for(int var15 = 0; var15 < var14; ++var15) {
         int var17 = var3.nextInt(3) + 2;
         int var20 = var3.nextInt(64);

         for(int var9 = 0; var20 + var9 < 64 && var9 < var17; ++var9) {
            this.cck[var20 + var9] = Ea.bir.cx().q(dh.om, Fk.bqv);
         }
      }

      int var16 = var3.nextInt(4) + 2;

      for(int var18 = 0; var18 < var16; ++var18) {
         int var21 = var3.nextInt(3) + 1;
         int var23 = var3.nextInt(64);

         for(int var10 = 0; var23 + var10 < 64 && var10 < var21; ++var10) {
            this.cck[var23 + var10] = Ea.bir.cx().q(dh.om, Fk.bqx);
         }
      }

      int var19 = var3.nextInt(3) + 3;
      int var22 = 0;

      for(int var24 = 0; var24 < var19; ++var24) {
         byte var25 = 1;
         var22 += var3.nextInt(16) + 4;

         for(int var11 = 0; var22 + var11 < 64 && var11 < var25; ++var11) {
            this.cck[var22 + var11] = Ea.bir.cx().q(dh.om, Fk.bqj);
            if (var22 + var11 > 1 && var3.nextBoolean()) {
               this.cck[var22 + var11 - 1] = Ea.bir.cx().q(dh.om, Fk.bqr);
            }

            if (var22 + var11 < 63 && var3.nextBoolean()) {
               this.cck[var22 + var11 + 1] = Ea.bir.cx().q(dh.om, Fk.bqr);
            }
         }
      }

   }

   public void q(QI var1, Random var2, RU var3, int var4, int var5, double var6) {
      if (this.cck == null || this.ccj != var1.Zn()) {
         this.D(var1.Zn());
      }

      if (this.ccm == null || this.cco == null || this.ccj != var1.Zn()) {
         Random var8 = new Random(this.ccj);
         this.ccm = new SE(var8, 4);
         this.cco = new SE(var8, 1);
      }

      this.ccj = var1.Zn();
      double var22 = 0.0D;
      if (this.ccl) {
         int var10 = (var4 & -16) + (var5 & 15);
         int var11 = (var5 & -16) + (var4 & 15);
         double var12 = Math.min(Math.abs(var6), this.ccm.s((double)var10 * 0.25D, (double)var11 * 0.25D));
         if (var12 > 0.0D) {
            double var14 = 0.001953125D;
            double var16 = Math.abs(this.cco.s((double)var10 * var14, (double)var11 * var14));
            var22 = var12 * var12 * 2.5D;
            double var18 = Math.ceil(var16 * 50.0D) + 14.0D;
            if (var22 > var18) {
               var22 = var18;
            }

            var22 = var22 + 64.0D;
         }
      }

      int var24 = var4 & 15;
      int var25 = var5 & 15;
      int var26 = var1.Zr();
      hI var13 = Ea.bir.cx();
      hI var27 = this.cbm;
      int var15 = (int)(var6 / 3.0D + 3.0D + var2.nextDouble() * 0.25D);
      boolean var28 = Math.cos(var6 / 3.0D * 3.141592653589793D) > 0.0D;
      int var17 = -1;
      boolean var29 = false;

      for(int var19 = 255; var19 >= 0; --var19) {
         if (var3.R(var25, var19, var24).ds().cB() == hn.zp && var19 < (int)var22) {
            var3.q(var25, var19, var24, Ea.biP.cx());
         }

         if (var19 <= var2.nextInt(5)) {
            var3.q(var25, var19, var24, Ea.bha.cx());
         } else {
            hI var20 = var3.R(var25, var19, var24);
            if (var20.ds().cB() == hn.zp) {
               var17 = -1;
            } else if (var20.ds() == Ea.biP) {
               if (var17 == -1) {
                  var29 = false;
                  if (var15 <= 0) {
                     var13 = null;
                     var27 = Ea.biP.cx();
                  } else if (var19 >= var26 - 4 && var19 <= var26 + 1) {
                     var13 = Ea.bir.cx();
                     var27 = this.cbm;
                  }

                  if (var19 < var26 && (var13 == null || var13.ds().cB() == hn.zp)) {
                     var13 = Ea.bgT.cx();
                  }

                  var17 = var15 + Math.max(0, var19 - var26);
                  if (var19 < var26 - 1) {
                     var3.q(var25, var19, var24, var27);
                     if (var27.ds() == Ea.bir) {
                        var3.q(var25, var19, var24, var27.ds().cx().q(dh.om, Fk.bqk));
                     }
                  } else if (this.ccn && var19 > 86 + var15 * 2) {
                     if (var28) {
                        var3.q(var25, var19, var24, Ea.bjj.cx().q(dp.ot, dq.ov));
                     } else {
                        var3.q(var25, var19, var24, Ea.biQ.cx());
                     }
                  } else if (var19 <= var26 + 3 + var15) {
                     var3.q(var25, var19, var24, this.caI);
                     var29 = true;
                  } else {
                     hI var30;
                     if (var19 >= 64 && var19 <= 127) {
                        if (var28) {
                           var30 = Ea.bjy.cx();
                        } else {
                           var30 = this.K(var4, var19, var5);
                        }
                     } else {
                        var30 = Ea.bir.cx().q(dh.om, Fk.bqk);
                     }

                     var3.q(var25, var19, var24, var30);
                  }
               } else if (var17 > 0) {
                  --var17;
                  if (var29) {
                     var3.q(var25, var19, var24, Ea.bir.cx().q(dh.om, Fk.bqk));
                  } else {
                     hI var21 = this.K(var4, var19, var5);
                     var3.q(var25, var19, var24, var21);
                  }
               }
            }
         }
      }

   }
}

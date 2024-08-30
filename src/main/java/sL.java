import java.util.List;
import java.util.Random;

public class Sl implements RW {
   private Rl[] ceu;
   private SD cev;
   private Random cew;
   double[] cex;
   private QI cey;
   private SD cez;
   public SD ceA;
   private double[] ceB;
   double[] ceC;
   double[] ceD;
   double[] ceE;
   public SD ceF;
   private SD ceG;
   double[] ceH;

   public void lp() {
   }

   public NW q(QI var1, String var2, NW var3) {
      return null;
   }

   public void q(RW var1, int var2, int var3) {
      dJ.ps = true;
      NW var4 = new NW(var2 * 16, 0, var3 * 16);
      this.cey.ai(var4.C(16, 0, 16)).q(this.cey, this.cey.bXs, var4);
      dJ.ps = false;
   }

   public List q(zI var1, NW var2) {
      return this.cey.ai(var2).q(var1);
   }

   public RQ H(int var1, int var2) {
      this.cew.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      RU var3 = new RU();
      this.ceu = this.cey.ZB().q(this.ceu, var1 * 16, var2 * 16, 16, 16);
      this.q(var1, var2, var3);
      this.q(var3);
      RQ var4 = new RQ(this.cey, var3, var1, var2);
      byte[] var5 = var4.abB();

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = (byte)this.ceu[var6].car;
      }

      var4.abS();
      return var4;
   }

   public void q(RU var1) {
      for(int var2 = 0; var2 < 16; ++var2) {
         for(int var3 = 0; var3 < 16; ++var3) {
            byte var4 = 1;
            int var5 = -1;
            hI var6 = Ea.biz.cx();
            hI var7 = Ea.biz.cx();

            for(int var8 = 127; var8 >= 0; --var8) {
               hI var9 = var1.R(var2, var8, var3);
               if (var9.ds().cB() == hn.zp) {
                  var5 = -1;
               } else if (var9.ds() == Ea.biP) {
                  if (var5 == -1) {
                     if (var4 <= 0) {
                        var6 = Ea.bjN.cx();
                        var7 = Ea.biz.cx();
                     }

                     var5 = var4;
                     if (var8 >= 0) {
                        var1.q(var2, var8, var3, var6);
                     } else {
                        var1.q(var2, var8, var3, var7);
                     }
                  } else if (var5 > 0) {
                     --var5;
                     var1.q(var2, var8, var3, var7);
                  }
               }
            }
         }
      }

   }

   public Sl(QI var1, long var2) {
      this.cey = var1;
      this.cew = new Random(var2);
      this.cez = new SD(this.cew, 16);
      this.ceG = new SD(this.cew, 16);
      this.cev = new SD(this.cew, 8);
      this.ceA = new SD(this.cew, 10);
      this.ceF = new SD(this.cew, 16);
   }

   public void q(RQ var1, int var2, int var3) {
   }

   public boolean lr() {
      return true;
   }

   public int lo() {
      return 0;
   }

   private double[] q(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 684.412D;
      this.ceE = this.ceA.q(this.ceE, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
      this.ceH = this.ceF.q(this.ceH, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
      var8 = var8 * 2.0D;
      this.ceD = this.cev.q(this.ceD, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var10 / 160.0D, var8 / 80.0D);
      this.ceC = this.cez.q(this.ceC, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.cex = this.ceG.q(this.cex, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;

      for(int var13 = 0; var13 < var5; ++var13) {
         for(int var14 = 0; var14 < var7; ++var14) {
            float var15 = (float)(var13 + var2) / 1.0F;
            float var16 = (float)(var14 + var4) / 1.0F;
            float var17 = 100.0F - Pq.bh(var15 * var15 + var16 * var16) * 8.0F;
            if (var17 > 80.0F) {
               var17 = 80.0F;
            }

            if (var17 < -100.0F) {
               var17 = -100.0F;
            }

            for(int var18 = 0; var18 < var6; ++var18) {
               double var19 = 0.0D;
               double var21 = this.ceC[var12] / 512.0D;
               double var23 = this.cex[var12] / 512.0D;
               double var25 = (this.ceD[var12] / 10.0D + 1.0D) / 2.0D;
               if (var25 < 0.0D) {
                  var19 = var21;
               } else if (var25 > 1.0D) {
                  var19 = var23;
               } else {
                  var19 = var21 + (var23 - var21) * var25;
               }

               var19 = var19 - 8.0D;
               var19 = var19 + (double)var17;
               byte var27 = 2;
               if (var18 > var6 / 2 - var27) {
                  double var28 = (double)((float)(var18 - (var6 / 2 - var27)) / 64.0F);
                  var28 = Pq.J(var28, 0.0D, 1.0D);
                  var19 = var19 * (1.0D - var28) + -3000.0D * var28;
               }

               var27 = 8;
               if (var18 < var27) {
                  double var36 = (double)((float)(var27 - var18) / ((float)var27 - 1.0F));
                  var19 = var19 * (1.0D - var36) + -30.0D * var36;
               }

               var1[var12] = var19;
               ++var12;
            }
         }
      }

      return var1;
   }

   public boolean q(boolean var1, Pb var2) {
      return true;
   }

   public boolean q(RW var1, RQ var2, int var3, int var4) {
      return false;
   }

   public boolean lq() {
      return false;
   }

   public RQ a(NW var1) {
      return this.H(var1.aY() >> 4, var1.KO() >> 4);
   }

   public String ln() {
      return q.q[2621 & 639];
   }

   public void q(int var1, int var2, RU var3) {
      byte var4 = 2;
      int var5 = var4 + 1;
      byte var6 = 33;
      int var7 = var4 + 1;
      this.ceB = this.q(this.ceB, var1 * var4, 0, var2 * var4, var5, var6, var7);

      for(int var8 = 0; var8 < var4; ++var8) {
         for(int var9 = 0; var9 < var4; ++var9) {
            for(int var10 = 0; var10 < 32; ++var10) {
               double var11 = 0.25D;
               double var13 = this.ceB[((var8 + 0) * var7 + var9 + 0) * var6 + var10 + 0];
               double var15 = this.ceB[((var8 + 0) * var7 + var9 + 1) * var6 + var10 + 0];
               double var17 = this.ceB[((var8 + 1) * var7 + var9 + 0) * var6 + var10 + 0];
               double var19 = this.ceB[((var8 + 1) * var7 + var9 + 1) * var6 + var10 + 0];
               double var21 = (this.ceB[((var8 + 0) * var7 + var9 + 0) * var6 + var10 + 1] - var13) * var11;
               double var23 = (this.ceB[((var8 + 0) * var7 + var9 + 1) * var6 + var10 + 1] - var15) * var11;
               double var25 = (this.ceB[((var8 + 1) * var7 + var9 + 0) * var6 + var10 + 1] - var17) * var11;
               double var27 = (this.ceB[((var8 + 1) * var7 + var9 + 1) * var6 + var10 + 1] - var19) * var11;

               for(int var29 = 0; var29 < 4; ++var29) {
                  double var30 = 0.125D;
                  double var32 = var13;
                  double var34 = var15;
                  double var36 = (var17 - var13) * var30;
                  double var38 = (var19 - var15) * var30;

                  for(int var40 = 0; var40 < 8; ++var40) {
                     double var41 = 0.125D;
                     double var43 = var32;
                     double var45 = (var34 - var32) * var41;

                     for(int var47 = 0; var47 < 8; ++var47) {
                        hI var48 = null;
                        if (var43 > 0.0D) {
                           var48 = Ea.biz.cx();
                        }

                        int var49 = var40 + var8 * 8;
                        int var50 = var29 + var10 * 4;
                        int var51 = var47 + var9 * 8;
                        var3.q(var49, var50, var51, var48);
                        var43 += var45;
                     }

                     var32 += var36;
                     var34 += var38;
                  }

                  var13 += var21;
                  var15 += var23;
                  var17 += var25;
                  var19 += var27;
               }
            }
         }
      }

   }

   public boolean E(int var1, int var2) {
      return true;
   }
}

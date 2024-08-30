import java.util.List;
import java.util.Random;

public class So implements RW {
   private final SD cfn;
   private double[] cfo = new double[256];
   private final SD cfp;
   private final Sw cfq = new Sw(Ea.biS);
   double[] cex;
   private final Random cfr;
   private final SD cfs;
   private double[] cft;
   private final SV cfu = new SV();
   public final SD cfv;
   private final Ud cfw = new Ud();
   private final SW cfx = new SW();
   private double[] cfy = new double[256];
   private final SX cfz = new SX(Ea.bhW, false);
   double[] ceC;
   private final boolean cfA;
   private final Sx cfB = new Sz();
   double[] ceH;
   private final SS cfC = new SS();
   double[] ceE;
   private final QI cfD;
   public final SD cfE;
   private final Sw cfF = new Sw(Ea.bhx);
   private double[] cfG = new double[256];
   private final SD cfH;
   private final Tu cfI = new Tg(Ea.bhn.cx(), 14, hJ.h(Ea.bhG));
   double[] ceD;
   private final SX cfJ = new SX(Ea.bhW, true);
   private final SD cfK;

   public void q(RW var1, int var2, int var3) {
      dJ.ps = true;
      NW var4 = new NW(var2 * 16, 0, var3 * 16);
      Qn var5 = new Qn(var2, var3);
      this.cfw.q(this.cfD, this.cfr, var5);

      for(int var6 = 0; var6 < 8; ++var6) {
         this.cfz.w(this.cfD, this.cfr, var4.C(this.cfr.nextInt(16) + 8, this.cfr.nextInt(120) + 4, this.cfr.nextInt(16) + 8));
      }

      for(int var7 = 0; var7 < this.cfr.nextInt(this.cfr.nextInt(10) + 1) + 1; ++var7) {
         this.cfC.w(this.cfD, this.cfr, var4.C(this.cfr.nextInt(16) + 8, this.cfr.nextInt(120) + 4, this.cfr.nextInt(16) + 8));
      }

      for(int var8 = 0; var8 < this.cfr.nextInt(this.cfr.nextInt(10) + 1); ++var8) {
         this.cfu.w(this.cfD, this.cfr, var4.C(this.cfr.nextInt(16) + 8, this.cfr.nextInt(120) + 4, this.cfr.nextInt(16) + 8));
      }

      for(int var9 = 0; var9 < 10; ++var9) {
         this.cfx.w(this.cfD, this.cfr, var4.C(this.cfr.nextInt(16) + 8, this.cfr.nextInt(128), this.cfr.nextInt(16) + 8));
      }

      if (this.cfr.nextBoolean()) {
         this.cfq.w(this.cfD, this.cfr, var4.C(this.cfr.nextInt(16) + 8, this.cfr.nextInt(128), this.cfr.nextInt(16) + 8));
      }

      if (this.cfr.nextBoolean()) {
         this.cfF.w(this.cfD, this.cfr, var4.C(this.cfr.nextInt(16) + 8, this.cfr.nextInt(128), this.cfr.nextInt(16) + 8));
      }

      for(int var10 = 0; var10 < 16; ++var10) {
         this.cfI.w(this.cfD, this.cfr, var4.C(this.cfr.nextInt(16), this.cfr.nextInt(108) + 10, this.cfr.nextInt(16)));
      }

      for(int var11 = 0; var11 < 16; ++var11) {
         this.cfJ.w(this.cfD, this.cfr, var4.C(this.cfr.nextInt(16), this.cfr.nextInt(108) + 10, this.cfr.nextInt(16)));
      }

      dJ.ps = false;
   }

   public List q(zI var1, NW var2) {
      if (var1 == zI.aRM) {
         if (this.cfw.aZ(var2)) {
            return this.cfw.acI();
         }

         if (this.cfw.al(this.cfD, var2) && this.cfD.g(var2.Vj()).ds() == Ea.bkl) {
            return this.cfw.acI();
         }
      }

      Rl var3 = this.cfD.ai(var2);
      return var3.q(var1);
   }

   public boolean lr() {
      return true;
   }

   public void e(int var1, int var2, RU var3) {
      int var4 = this.cfD.Zr() + 1;
      double var5 = 0.03125D;
      this.cfG = this.cfH.q(this.cfG, var1 * 16, var2 * 16, 0, 16, 16, 1, var5, var5, 1.0D);
      this.cfo = this.cfH.q(this.cfo, var1 * 16, 109, var2 * 16, 16, 1, 16, var5, 1.0D, var5);
      this.cfy = this.cfp.q(this.cfy, var1 * 16, var2 * 16, 0, 16, 16, 1, var5 * 2.0D, var5 * 2.0D, var5 * 2.0D);

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            boolean var9 = this.cfG[var7 + var8 * 16] + this.cfr.nextDouble() * 0.2D > 0.0D;
            boolean var10 = this.cfo[var7 + var8 * 16] + this.cfr.nextDouble() * 0.2D > 0.0D;
            int var11 = (int)(this.cfy[var7 + var8 * 16] / 3.0D + 3.0D + this.cfr.nextDouble() * 0.25D);
            int var12 = -1;
            hI var13 = Ea.bhG.cx();
            hI var14 = Ea.bhG.cx();

            for(int var15 = 127; var15 >= 0; --var15) {
               if (var15 < 127 - this.cfr.nextInt(5) && var15 > this.cfr.nextInt(5)) {
                  hI var16 = var3.R(var8, var15, var7);
                  if (var16.ds() != null && var16.ds().cB() != hn.zp) {
                     if (var16.ds() == Ea.bhG) {
                        if (var12 == -1) {
                           if (var11 <= 0) {
                              var13 = null;
                              var14 = Ea.bhG.cx();
                           } else if (var15 >= var4 - 4 && var15 <= var4 + 1) {
                              var13 = Ea.bhG.cx();
                              var14 = Ea.bhG.cx();
                              if (var10) {
                                 var13 = Ea.bgW.cx();
                                 var14 = Ea.bhG.cx();
                              }

                              if (var9) {
                                 var13 = Ea.bhX.cx();
                                 var14 = Ea.bhX.cx();
                              }
                           }

                           if (var15 < var4 && (var13 == null || var13.ds().cB() == hn.zp)) {
                              var13 = Ea.bkv.cx();
                           }

                           var12 = var11;
                           if (var15 >= var4 - 1) {
                              var3.q(var8, var15, var7, var13);
                           } else {
                              var3.q(var8, var15, var7, var14);
                           }
                        } else if (var12 > 0) {
                           --var12;
                           var3.q(var8, var15, var7, var14);
                        }
                     }
                  } else {
                     var12 = -1;
                  }
               } else {
                  var3.q(var8, var15, var7, Ea.bha.cx());
               }
            }
         }
      }

   }

   public boolean q(boolean var1, Pb var2) {
      return true;
   }

   public void r(int var1, int var2, RU var3) {
      byte var4 = 4;
      int var5 = this.cfD.Zr() / 2 + 1;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.cft = this.q(this.cft, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for(int var9 = 0; var9 < var4; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < 16; ++var11) {
               double var12 = 0.125D;
               double var14 = this.cft[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.cft[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.cft[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.cft[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.cft[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.cft[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.cft[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.cft[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 8; ++var30) {
                  double var31 = 0.25D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 4; ++var41) {
                     double var42 = 0.25D;
                     double var44 = var33;
                     double var46 = (var35 - var33) * var42;

                     for(int var48 = 0; var48 < 4; ++var48) {
                        hI var49 = null;
                        if (var11 * 8 + var30 < var5) {
                           var49 = Ea.bkv.cx();
                        }

                        if (var44 > 0.0D) {
                           var49 = Ea.bhG.cx();
                        }

                        int var50 = var41 + var9 * 4;
                        int var51 = var30 + var11 * 8;
                        int var52 = var48 + var10 * 4;
                        var3.q(var50, var51, var52, var49);
                        var44 += var46;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }

   }

   public boolean q(RW var1, RQ var2, int var3, int var4) {
      return false;
   }

   public boolean E(int var1, int var2) {
      return true;
   }

   public RQ H(int var1, int var2) {
      this.cfr.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      RU var3 = new RU();
      this.r(var1, var2, var3);
      this.e(var1, var2, var3);
      this.cfB.q(this, this.cfD, var1, var2, var3);
      if (this.cfA) {
         this.cfw.q(this, this.cfD, var1, var2, var3);
      }

      RQ var4 = new RQ(this.cfD, var3, var1, var2);
      Rl[] var5 = this.cfD.ZB().q((Rl[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var6 = var4.abB();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (byte)var5[var7].car;
      }

      var4.abL();
      return var4;
   }

   public RQ a(NW var1) {
      return this.H(var1.aY() >> 4, var1.KO() >> 4);
   }

   public boolean lq() {
      return false;
   }

   public So(QI var1, boolean var2, long var3) {
      this.cfD = var1;
      this.cfA = var2;
      this.cfr = new Random(var3);
      this.cfs = new SD(this.cfr, 16);
      this.cfK = new SD(this.cfr, 16);
      this.cfn = new SD(this.cfr, 8);
      this.cfH = new SD(this.cfr, 4);
      this.cfp = new SD(this.cfr, 4);
      this.cfv = new SD(this.cfr, 10);
      this.cfE = new SD(this.cfr, 16);
      var1.hk(63);
   }

   private double[] q(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 2053.236D;
      this.ceE = this.cfv.q(this.ceE, var2, var3, var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
      this.ceH = this.cfE.q(this.ceH, var2, var3, var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
      this.ceD = this.cfn.q(this.ceD, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var10 / 60.0D, var8 / 80.0D);
      this.ceC = this.cfs.q(this.ceC, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.cex = this.cfK.q(this.cex, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      double[] var13 = new double[var6];

      for(int var14 = 0; var14 < var6; ++var14) {
         var13[var14] = Math.cos((double)var14 * 3.141592653589793D * 6.0D / (double)var6) * 2.0D;
         double var15 = (double)var14;
         if (var14 > var6 / 2) {
            var15 = (double)(var6 - 1 - var14);
         }

         if (var15 < 4.0D) {
            var15 = 4.0D - var15;
            var13[var14] -= var15 * var15 * var15 * 10.0D;
         }
      }

      for(int var31 = 0; var31 < var5; ++var31) {
         for(int var33 = 0; var33 < var7; ++var33) {
            double var16 = 0.0D;

            for(int var18 = 0; var18 < var6; ++var18) {
               double var19 = 0.0D;
               double var21 = var13[var18];
               double var23 = this.ceC[var12] / 512.0D;
               double var25 = this.cex[var12] / 512.0D;
               double var27 = (this.ceD[var12] / 10.0D + 1.0D) / 2.0D;
               if (var27 < 0.0D) {
                  var19 = var23;
               } else if (var27 > 1.0D) {
                  var19 = var25;
               } else {
                  var19 = var23 + (var25 - var23) * var27;
               }

               var19 = var19 - var21;
               if (var18 > var6 - 4) {
                  double var29 = (double)((float)(var18 - (var6 - 4)) / 3.0F);
                  var19 = var19 * (1.0D - var29) + -10.0D * var29;
               }

               if ((double)var18 < var16) {
                  double var36 = (var16 - (double)var18) / 4.0D;
                  var36 = Pq.J(var36, 0.0D, 1.0D);
                  var19 = var19 * (1.0D - var36) + -10.0D * var36;
               }

               var1[var12] = var19;
               ++var12;
            }
         }
      }

      return var1;
   }

   public void lp() {
   }

   public NW q(QI var1, String var2, NW var3) {
      return null;
   }

   public void q(RQ var1, int var2, int var3) {
      this.cfw.q(this, this.cfD, var2, var3, (RU)null);
   }

   public int lo() {
      return 0;
   }

   public String ln() {
      return u.q[797 & -22217];
   }
}

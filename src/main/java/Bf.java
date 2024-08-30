public abstract class BF extends zk implements QB {
   private boolean aYd;
   private String aYe;
   private double aYf;
   private int aYg;
   private double aXH;
   private double aYh;
   private double aYi;
   private double aYj;
   private static final int[][][] aYk = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private double aYl;
   private double aXG;
   private double aXA;

   public boolean xl() {
      return !this.aNQ;
   }

   public void p(double var1, double var3, double var5) {
      this.aNZ = var1;
      this.aNK = var3;
      this.aOt = var5;
      float var7 = this.gK / 2.0F;
      float var8 = this.gJ;
      this.e(new NV(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   public String bY() {
      return this.aYe != null ? this.aYe : super.bY();
   }

   public void bh(String var1) {
      this.aYe = var1;
   }

   public void k(double var1, double var3, double var5) {
      this.aXA = this.aOd = var1;
      this.aXG = this.aOO = var3;
      this.aXH = this.aOL = var5;
   }

   public void xp() {
      this.eo(-this.Cz());
      this.en(10);
      this.aG(this.Cs() + this.Cs() * 10.0F);
   }

   public boolean Cq() {
      return this.xG().dy(22) == 1;
   }

   public boolean mJ() {
      return true;
   }

   public void D(hI var1) {
      this.xG().e(20, Integer.valueOf(cv.i(var1)));
      this.ay(true);
   }

   public int Cr() {
      return !this.Cq() ? this.Cx() : this.xG().du(21);
   }

   public NV mI() {
      return null;
   }

   public PX v(double var1, double var3, double var5) {
      int var7 = Pq.D(var1);
      int var8 = Pq.D(var3);
      int var9 = Pq.D(var5);
      if (fv.P(this.vR, new NW(var7, var8 - 1, var9))) {
         --var8;
      }

      hI var10 = this.vR.g(new NW(var7, var8, var9));
      if (fv.h(var10)) {
         fx var11 = (fx)var10.w(((fv)var10.ds()).dK());
         int[][] var12 = aYk[var11.dm()];
         double var13 = 0.0D;
         double var15 = (double)var7 + 0.5D + (double)var12[0][0] * 0.5D;
         double var17 = (double)var8 + 0.0625D + (double)var12[0][1] * 0.5D;
         double var19 = (double)var9 + 0.5D + (double)var12[0][2] * 0.5D;
         double var21 = (double)var7 + 0.5D + (double)var12[1][0] * 0.5D;
         double var23 = (double)var8 + 0.0625D + (double)var12[1][1] * 0.5D;
         double var25 = (double)var9 + 0.5D + (double)var12[1][2] * 0.5D;
         double var27 = var21 - var15;
         double var29 = (var23 - var17) * 2.0D;
         double var31 = var25 - var19;
         if (var27 == 0.0D) {
            var1 = (double)var7 + 0.5D;
            var13 = var5 - (double)var9;
         } else if (var31 == 0.0D) {
            var5 = (double)var9 + 0.5D;
            var13 = var1 - (double)var7;
         } else {
            double var33 = var1 - var15;
            double var35 = var5 - var19;
            var13 = (var33 * var27 + var35 * var31) * 2.0D;
         }

         var1 = var15 + var27 * var13;
         var3 = var17 + var29 * var13;
         var5 = var19 + var31 * var13;
         if (var29 < 0.0D) {
            ++var3;
         }

         if (var29 > 0.0D) {
            var3 += 0.5D;
         }

         return new PX(var1, var3, var5);
      } else {
         return null;
      }
   }

   public void q(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.aYl = var1;
      this.aYi = var3;
      this.aYh = var5;
      this.aYj = (double)var7;
      this.aYf = (double)var8;
      this.aYg = var9 + 2;
      this.aOd = this.aXA;
      this.aOO = this.aXG;
      this.aOL = this.aXH;
   }

   protected boolean mG() {
      return false;
   }

   protected void r(HL var1) {
      if (var1.bL(p.q[5117 & 28668])) {
         int var2 = var1.bQ(p.q[21501 & -23555]);
         if (var1.d(p.q[3070 & -23553], 8)) {
            cv var3 = cv.z(var1.bG(p.q[27646 & -30722]));
            if (var3 == null) {
               this.D(Ea.bjN.cx());
            } else {
               this.D(var3.J(var2));
            }
         } else {
            cv var4 = cv.K(var1.bQ(p.q[10238 & -27650]));
            if (var4 == null) {
               this.D(Ea.bjN.cx());
            } else {
               this.D(var4.J(var2));
            }
         }

         this.ep(var1.bQ(p.q[1023 & 21503]));
      }

      if (var1.d(q.q[-24117 & 488], 8) && var1.bG(q.q[461 & 3546]).length() > 0) {
         this.aYe = var1.bG(q.q[11208 & 459]);
      }

   }

   public void aG(float var1) {
      this.aNw.e(19, Float.valueOf(var1));
   }

   public float Cs() {
      return this.aNw.dx(19);
   }

   public OX dh() {
      if (this.dg()) {
         Oo var2 = new Oo(this.aYe);
         var2.Vw().q(this.yl());
         var2.Vw().dc(this.ym().toString());
         return var2;
      } else {
         Op var1 = new Op(this.bY(), new Object[0]);
         var1.Vw().q(this.yl());
         var1.Vw().dc(this.ym().toString());
         return var1;
      }
   }

   public void x(zk var1) {
      if (!this.vR.bXF && !var1.aOm && !this.aOm && var1 != this.aND) {
         if (var1 instanceof zz && !(var1 instanceof DD) && !(var1 instanceof Co) && this.Ah() == BH.aYo && this.aOd * this.aOd + this.aOL * this.aOL > 0.01D && this.aND == null && var1.aNP == null) {
            var1.u(this);
         }

         double var2 = var1.aNZ - this.aNZ;
         double var4 = var1.aOt - this.aOt;
         double var6 = var2 * var2 + var4 * var4;
         if (var6 >= 9.999999747378752E-5D) {
            var6 = (double)Pq.B(var6);
            var2 = var2 / var6;
            var4 = var4 / var6;
            double var8 = 1.0D / var6;
            if (var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 = var2 * var8;
            var4 = var4 * var8;
            var2 = var2 * 0.10000000149011612D;
            var4 = var4 * 0.10000000149011612D;
            var2 = var2 * (double)(1.0F - this.aNJ);
            var4 = var4 * (double)(1.0F - this.aNJ);
            var2 = var2 * 0.5D;
            var4 = var4 * 0.5D;
            if (var1 instanceof BF) {
               double var10 = var1.aNZ - this.aNZ;
               double var12 = var1.aOt - this.aOt;
               PX var14 = (new PX(var10, 0.0D, var12)).XT();
               PX var15 = (new PX((double)Pq.bi(this.aOn * 3.1415927F / 180.0F), 0.0D, (double)Pq.bk(this.aOn * 3.1415927F / 180.0F))).XT();
               double var16 = Math.abs(var14.f(var15));
               if (var16 < 0.800000011920929D) {
                  return;
               }

               double var18 = var1.aOd + this.aOd;
               double var20 = var1.aOL + this.aOL;
               if (((BF)var1).Ah() == BH.aYq && this.Ah() != BH.aYq) {
                  this.aOd *= 0.20000000298023224D;
                  this.aOL *= 0.20000000298023224D;
                  this.z(var1.aOd - var2, 0.0D, var1.aOL - var4);
                  var1.aOd *= 0.949999988079071D;
                  var1.aOL *= 0.949999988079071D;
               } else if (((BF)var1).Ah() != BH.aYq && this.Ah() == BH.aYq) {
                  var1.aOd *= 0.20000000298023224D;
                  var1.aOL *= 0.20000000298023224D;
                  var1.z(this.aOd + var2, 0.0D, this.aOL + var4);
                  this.aOd *= 0.949999988079071D;
                  this.aOL *= 0.949999988079071D;
               } else {
                  var18 = var18 / 2.0D;
                  var20 = var20 / 2.0D;
                  this.aOd *= 0.20000000298023224D;
                  this.aOL *= 0.20000000298023224D;
                  this.z(var18 - var2, 0.0D, var20 - var4);
                  var1.aOd *= 0.20000000298023224D;
                  var1.aOL *= 0.20000000298023224D;
                  var1.z(var18 + var2, 0.0D, var20 + var4);
               }
            } else {
               this.z(-var2, 0.0D, -var4);
               var1.z(var2 / 4.0D, 0.0D, var4 / 4.0D);
            }
         }
      }

   }

   public boolean dg() {
      return this.aYe != null;
   }

   public PX r(double var1, double var3, double var5, double var7) {
      int var9 = Pq.D(var1);
      int var10 = Pq.D(var3);
      int var11 = Pq.D(var5);
      if (fv.P(this.vR, new NW(var9, var10 - 1, var11))) {
         --var10;
      }

      hI var12 = this.vR.g(new NW(var9, var10, var11));
      if (fv.h(var12)) {
         fx var13 = (fx)var12.w(((fv)var12.ds()).dK());
         var3 = (double)var10;
         if (var13.dL()) {
            var3 = (double)(var10 + 1);
         }

         int[][] var14 = aYk[var13.dm()];
         double var15 = (double)(var14[1][0] - var14[0][0]);
         double var17 = (double)(var14[1][2] - var14[0][2]);
         double var19 = Math.sqrt(var15 * var15 + var17 * var17);
         var15 = var15 / var19;
         var17 = var17 / var19;
         var1 = var1 + var15 * var7;
         var5 = var5 + var17 * var7;
         if (var14[0][1] != 0 && Pq.D(var1) - var9 == var14[0][0] && Pq.D(var5) - var11 == var14[0][2]) {
            var3 += (double)var14[0][1];
         } else if (var14[1][1] != 0 && Pq.D(var1) - var9 == var14[1][0] && Pq.D(var5) - var11 == var14[1][2]) {
            var3 += (double)var14[1][1];
         }

         return this.v(var1, var3, var5);
      } else {
         return null;
      }
   }

   public void ay(boolean var1) {
      this.xG().e(22, Byte.valueOf((byte)(var1 ? 1 : 0)));
   }

   public boolean q(Oz var1, float var2) {
      if (!this.vR.bXF && !this.aNQ) {
         if (this.q(var1)) {
            return false;
         } else {
            this.eo(-this.Cz());
            this.en(10);
            this.xo();
            this.aG(this.Cs() + var2 * 10.0F);
            boolean var3 = var1.Wv() instanceof DD && ((DD)var1.Wv()).bdO.bfz;
            if (var3 || this.Cs() > 40.0F) {
               if (this.aND != null) {
                  this.aND.u((zk)null);
               }

               if (var3 && !this.dg()) {
                  this.yo();
               } else {
                  this.e(var1);
               }
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public BF(QI var1, double var2, double var4, double var6) {
      this(var1);
      this.p(var2, var4, var6);
      this.aOd = 0.0D;
      this.aOO = 0.0D;
      this.aOL = 0.0D;
      this.aOf = var2;
      this.aNH = var4;
      this.aNW = var6;
   }

   public abstract BH Ah();

   protected void Ct() {
      double var1 = this.Cv();
      this.aOd = Pq.J(this.aOd, -var1, var1);
      this.aOL = Pq.J(this.aOL, -var1, var1);
      if (this.aNG) {
         this.aOd *= 0.5D;
         this.aOO *= 0.5D;
         this.aOL *= 0.5D;
      }

      this.h(this.aOd, this.aOO, this.aOL);
      if (!this.aNG) {
         this.aOd *= 0.949999988079071D;
         this.aOO *= 0.949999988079071D;
         this.aOL *= 0.949999988079071D;
      }

   }

   public String yj() {
      return this.aYe;
   }

   public int Cu() {
      return this.aNw.du(17);
   }

   public void e(Oz var1) {
      this.yo();
      if (this.vR.vU().bL(w.q[10477 & 4797])) {
         GX var2 = new GX(Et.bli, 1);
         if (this.aYe != null) {
            var2.bD(this.aYe);
         }

         this.q(var2, 0.0F);
      }

   }

   public void hv() {
      if (this.Cu() > 0) {
         this.en(this.Cu() - 1);
      }

      if (this.Cs() > 0.0F) {
         this.aG(this.Cs() - 1.0F);
      }

      if (this.aNK < -64.0D) {
         this.xI();
      }

      if (!this.vR.bXF && this.vR instanceof QU) {
         this.vR.bXK.cf(e.q[6982 & -23193]);
         Md var1 = ((QU)this.vR).aaq();
         int var2 = this.xb();
         if (this.aOE) {
            if (var1.PC()) {
               if (this.aNP == null && this.aOA++ >= var2) {
                  this.aOA = var2;
                  this.aOi = this.yf();
                  byte var3;
                  if (this.vR.bXI.ZQ() == -1) {
                     var3 = 0;
                  } else {
                     var3 = -1;
                  }

                  this.dE(var3);
               }

               this.aOE = false;
            }
         } else {
            if (this.aOA > 0) {
               this.aOA -= 4;
            }

            if (this.aOA < 0) {
               this.aOA = 0;
            }
         }

         if (this.aOi > 0) {
            --this.aOi;
         }

         this.vR.bXK.Ol();
      }

      if (this.vR.bXF) {
         if (this.aYg > 0) {
            double var14 = this.aNZ + (this.aYl - this.aNZ) / (double)this.aYg;
            double var17 = this.aNK + (this.aYi - this.aNK) / (double)this.aYg;
            double var5 = this.aOt + (this.aYh - this.aOt) / (double)this.aYg;
            double var7 = Pq.C(this.aYj - (double)this.aOn);
            this.aOn = (float)((double)this.aOn + var7 / (double)this.aYg);
            this.aNN = (float)((double)this.aNN + (this.aYf - (double)this.aNN) / (double)this.aYg);
            --this.aYg;
            this.p(var14, var17, var5);
            this.g(this.aOn, this.aNN);
         } else {
            this.p(this.aNZ, this.aNK, this.aOt);
            this.g(this.aOn, this.aNN);
         }
      } else {
         this.aOf = this.aNZ;
         this.aNH = this.aNK;
         this.aNW = this.aOt;
         this.aOO -= 0.03999999910593033D;
         int var15 = Pq.D(this.aNZ);
         int var16 = Pq.D(this.aNK);
         int var18 = Pq.D(this.aOt);
         if (fv.P(this.vR, new NW(var15, var16 - 1, var18))) {
            --var16;
         }

         NW var4 = new NW(var15, var16, var18);
         hI var19 = this.vR.g(var4);
         if (fv.h(var19)) {
            this.e(var4, var19);
            if (var19.ds() == Ea.bhA) {
               this.w(var15, var16, var18, ((Boolean)var19.w(fB.uh)).booleanValue());
            }
         } else {
            this.Ct();
         }

         this.xS();
         this.aNN = 0.0F;
         double var6 = this.aOf - this.aNZ;
         double var8 = this.aNW - this.aOt;
         if (var6 * var6 + var8 * var8 > 0.001D) {
            this.aOn = (float)(Pq.u(var8, var6) * 180.0D / 3.141592653589793D);
            if (this.aYd) {
               this.aOn += 180.0F;
            }
         }

         double var10 = (double)Pq.bl(this.aOn - this.aOF);
         if (var10 < -170.0D || var10 >= 170.0D) {
            this.aOn += 180.0F;
            this.aYd = !this.aYd;
         }

         this.g(this.aOn, this.aNN);

         for(zk var13 : this.vR.w(this, this.xE().C(0.20000000298023224D, 0.0D, 0.20000000298023224D))) {
            if (var13 != this.aND && var13.mJ() && var13 instanceof BF) {
               var13.x(this);
            }
         }

         if (this.aND != null && this.aND.aNQ) {
            if (this.aND.aNP == this) {
               this.aND.aNP = null;
            }

            this.aND = null;
         }

         this.xz();
      }

   }

   protected double Cv() {
      return 0.4D;
   }

   public void en(int var1) {
      this.aNw.e(17, Integer.valueOf(var1));
   }

   public hI Cw() {
      return !this.Cq() ? this.Aj() : cv.I(this.xG().du(20));
   }

   public BF(QI var1) {
      super(var1);
      this.aOM = true;
      this.d(0.98F, 0.7F);
   }

   public int Cx() {
      return 6;
   }

   protected void Cy() {
      if (this.aND != null) {
         this.aOd *= 0.996999979019165D;
         this.aOO *= 0.0D;
         this.aOL *= 0.996999979019165D;
      } else {
         this.aOd *= 0.9599999785423279D;
         this.aOO *= 0.0D;
         this.aOL *= 0.9599999785423279D;
      }

   }

   protected void mC() {
      this.aNw.w(17, new Integer(0));
      this.aNw.w(18, new Integer(1));
      this.aNw.w(19, new Float(0.0F));
      this.aNw.w(20, new Integer(0));
      this.aNw.w(21, new Integer(6));
      this.aNw.w(22, Byte.valueOf((byte)0));
   }

   protected void t(HL var1) {
      if (this.Cq()) {
         var1.s(p.q[27644 & -27651], true);
         hI var2 = this.Cw();
         PJ var3 = (PJ)cv.nk.z(var2.ds());
         var1.a(p.q[5118 & -30722], var3 == null ? q.q[2112 & -12005] : var3.toString());
         var1.a(p.q[9213 & -27651], var2.ds().e(var2));
         var1.a(p.q[1023 & -27649], this.Cr());
      }

      if (this.aYe != null && this.aYe.length() > 0) {
         var1.a(q.q[1480 & 25065], this.aYe);
      }

   }

   protected void e(NW var1, hI var2) {
      // $FF: Couldn't be decompiled
   }

   public static BF q(QI var0, double var1, double var3, double var5, BH var7) {
      // $FF: Couldn't be decompiled
   }

   public int Cz() {
      return this.aNw.du(18);
   }

   public double xX() {
      return 0.0D;
   }

   public void yo() {
      super.yo();
   }

   public NV A(zk var1) {
      return var1.mJ() ? var1.xE() : null;
   }

   public void w(int var1, int var2, int var3, boolean var4) {
   }

   public void eo(int var1) {
      this.aNw.e(18, Integer.valueOf(var1));
   }

   public hI Aj() {
      return Ea.bjN.cx();
   }

   public void ep(int var1) {
      this.xG().e(21, Integer.valueOf(var1));
      this.ay(true);
   }
}

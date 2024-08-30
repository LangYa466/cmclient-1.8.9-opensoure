import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class zk implements wZ {
   protected zi aNw;
   public QI vR;
   private boolean aNx;
   public boolean aNy;
   public int aNz;
   private int aNA;
   public boolean aNB;
   public float aNC;
   public zk aND;
   public double aNE;
   protected PX aNF;
   public boolean aNG;
   public double aNH;
   public float aNI;
   public float aNJ;
   public double aNK;
   protected boolean aNL;
   protected OK aNM;
   public float aNN;
   public int aNO;
   public zk aNP;
   public boolean aNQ;
   public int aNR;
   protected boolean aNS;
   public float gK;
   private int aNT;
   private long aNU;
   public boolean aNV;
   public double aNW;
   public int aNX;
   public boolean aNY;
   public double aNZ;
   public int aOa;
   protected NW aOb;
   public int aOc;
   public double aOd;
   public int aOe;
   public double aOf;
   public float aOg;
   private double aOh;
   public int aOi;
   public float aOj;
   private static final NV aOk = new NV(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
   public int aOl;
   private NV apF;
   public boolean aOm;
   public float aOn;
   private double aOo;
   private static int aOp;
   protected Random oF;
   public boolean aOq;
   public float aOr;
   public boolean aOs;
   public double aOt;
   public float aOu;
   protected UUID aOv;
   public float gJ;
   public boolean aOw;
   public int aOx;
   public int aOy;
   private final wE aOz;
   protected int aOA;
   private ahb aOB;
   public double aOC;
   public double aOD;
   protected boolean aOE;
   public float aOF;
   private int aOG;
   private boolean aOH;
   protected boolean aOI;
   protected boolean aOJ;
   public double aOK;
   public double aOL;
   public boolean aOM;
   public float aON;
   public double aOO;
   private aeI aOP;
   public boolean aOQ;

   public void ae(boolean var1) {
      this.t(1, var1);
   }

   protected void wZ() {
      int var1 = Pq.D(this.aNZ);
      int var2 = Pq.D(this.aNK - 0.20000000298023224D);
      int var3 = Pq.D(this.aOt);
      NW var4 = new NW(var1, var2, var3);
      hI var5 = this.vR.g(var4);
      cv var6 = var5.ds();
      if (var6.cC() != -1) {
         this.vR.q(OP.bRV, this.aNZ + ((double)this.oF.nextFloat() - 0.5D) * (double)this.gK, this.xE().bNT + 0.1D, this.aOt + ((double)this.oF.nextFloat() - 0.5D) * (double)this.gK, -this.aOd * 4.0D, 1.5D, -this.aOL * 4.0D, cv.i(var5));
      }

   }

   public final boolean xa() {
      return this.aOI;
   }

   public boolean z(zk var1) {
      return false;
   }

   public BD q(GX var1, float var2) {
      if (var1.bsH != 0 && var1.do1() != null) {
         BD var3 = new BD(this.vR, this.aNZ, this.aNK + (double)var2, this.aOt, var1);
         var3.Cj();
         this.vR.p(var3);
         return var3;
      } else {
         return null;
      }
   }

   public boolean g(double var1, double var3, double var5) {
      NV var7 = this.xE().D(var1, var3, var5);
      return this.r(var7);
   }

   public boolean q(Qt var1, QI var2, NW var3, hI var4, float var5) {
      return true;
   }

   public int xb() {
      return 0;
   }

   public void q(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.p(var1, var3, var5);
      this.g(var7, var8);
      List var11 = this.vR.q(this, this.xE().F(0.03125D, 0.0D, 0.03125D));
      if (!var11.isEmpty()) {
         double var12 = 0.0D;

         for(NV var15 : var11) {
            if (var15.bNX > var12) {
               var12 = var15.bNX;
            }
         }

         var3 = var3 + (var12 - this.xE().bNT);
         this.p(var1, var3, var5);
      }

   }

   public void h(double var1, double var3, double var5) {
      if (this.aOm) {
         this.e(this.xE().D(var1, var3, var5));
         this.xH();
      } else {
         this.vR.bXK.cf(u.q[17353 & 5963]);
         double var7 = this.aNZ;
         double var9 = this.aNK;
         double var11 = this.aOt;
         if (this.aOJ) {
            this.aOJ = false;
            var1 *= 0.25D;
            var3 *= 0.05000000074505806D;
            var5 *= 0.25D;
            this.aOd = 0.0D;
            this.aOO = 0.0D;
            this.aOL = 0.0D;
         }

         double var13 = var1;
         double var15 = var3;
         double var17 = var5;
         boolean var19 = this.aNG && this.hI() && this instanceof DD;
         if (var19) {
            double var20;
            for(var20 = 0.05D; var1 != 0.0D && this.vR.q(this, this.xE().D(var1, -1.0D, 0.0D)).isEmpty(); var13 = var1) {
               if (var1 < var20 && var1 >= -var20) {
                  var1 = 0.0D;
               } else if (var1 > 0.0D) {
                  var1 -= var20;
               } else {
                  var1 += var20;
               }
            }

            for(; var5 != 0.0D && this.vR.q(this, this.xE().D(0.0D, -1.0D, var5)).isEmpty(); var17 = var5) {
               if (var5 < var20 && var5 >= -var20) {
                  var5 = 0.0D;
               } else if (var5 > 0.0D) {
                  var5 -= var20;
               } else {
                  var5 += var20;
               }
            }

            for(; var1 != 0.0D && var5 != 0.0D && this.vR.q(this, this.xE().D(var1, -1.0D, var5)).isEmpty(); var17 = var5) {
               if (var1 < var20 && var1 >= -var20) {
                  var1 = 0.0D;
               } else if (var1 > 0.0D) {
                  var1 -= var20;
               } else {
                  var1 += var20;
               }

               var13 = var1;
               if (var5 < var20 && var5 >= -var20) {
                  var5 = 0.0D;
               } else if (var5 > 0.0D) {
                  var5 -= var20;
               } else {
                  var5 += var20;
               }
            }
         }

         List var54 = this.vR.q(this, this.xE().E(var1, var3, var5));
         NV var21 = this.xE();

         for(NV var23 : var54) {
            var3 = var23.w(this.xE(), var3);
         }

         this.e(this.xE().D(0.0D, var3, 0.0D));
         boolean var55 = this.aNG || var15 != var3 && var15 < 0.0D;

         for(NV var24 : var54) {
            var1 = var24.q(this.xE(), var1);
         }

         this.e(this.xE().D(var1, 0.0D, 0.0D));

         for(NV var60 : var54) {
            var5 = var60.e(this.xE(), var5);
         }

         this.e(this.xE().D(0.0D, 0.0D, var5));
         if (this.aNC > 0.0F && var55 && (var13 != var1 || var17 != var5)) {
            double var58 = var1;
            double var25 = var3;
            double var27 = var5;
            NV var29 = this.xE();
            this.e(var21);
            var3 = (double)this.aNC;
            List var30 = this.vR.q(this, this.xE().E(var13, var3, var17));
            NV var31 = this.xE();
            NV var32 = var31.E(var13, 0.0D, var17);
            double var33 = var3;

            for(NV var36 : var30) {
               var33 = var36.w(var32, var33);
            }

            var31 = var31.D(0.0D, var33, 0.0D);
            double var73 = var13;

            for(NV var38 : var30) {
               var73 = var38.q(var31, var73);
            }

            var31 = var31.D(var73, 0.0D, 0.0D);
            double var74 = var17;

            for(NV var40 : var30) {
               var74 = var40.e(var31, var74);
            }

            var31 = var31.D(0.0D, 0.0D, var74);
            NV var75 = this.xE();
            double var79 = var3;

            for(NV var43 : var30) {
               var79 = var43.w(var75, var79);
            }

            var75 = var75.D(0.0D, var79, 0.0D);
            double var80 = var13;

            for(NV var45 : var30) {
               var80 = var45.q(var75, var80);
            }

            var75 = var75.D(var80, 0.0D, 0.0D);
            double var81 = var17;

            for(NV var47 : var30) {
               var81 = var47.e(var75, var81);
            }

            var75 = var75.D(0.0D, 0.0D, var81);
            double var82 = var73 * var73 + var74 * var74;
            double var48 = var80 * var80 + var81 * var81;
            if (var82 > var48) {
               var1 = var73;
               var5 = var74;
               var3 = -var33;
               this.e(var31);
            } else {
               var1 = var80;
               var5 = var81;
               var3 = -var79;
               this.e(var75);
            }

            for(NV var51 : var30) {
               var3 = var51.w(this.xE(), var3);
            }

            this.e(this.xE().D(0.0D, var3, 0.0D));
            if (var58 * var58 + var27 * var27 >= var1 * var1 + var5 * var5) {
               var1 = var58;
               var3 = var25;
               var5 = var27;
               this.e(var29);
            }
         }

         this.vR.bXK.Ol();
         this.vR.bXK.cf(u.q[1904 & -21676]);
         this.xH();
         this.aNB = var13 != var1 || var17 != var5;
         this.aOs = var15 != var3;
         this.aNG = this.aOs && var15 < 0.0D;
         this.aNy = this.aNB || this.aOs;
         int var59 = Pq.D(this.aNZ);
         int var61 = Pq.D(this.aNK - 0.20000000298023224D);
         int var62 = Pq.D(this.aOt);
         NW var26 = new NW(var59, var61, var62);
         cv var63 = this.vR.g(var26).ds();
         if (var63.cB() == hn.zp) {
            cv var28 = this.vR.g(var26.Vj()).ds();
            if (var28 instanceof dM || var28 instanceof hb || var28 instanceof dN) {
               var63 = var28;
               var26 = var26.Vj();
            }
         }

         this.q(var3, this.aNG, var63, var26);
         if (var13 != var1) {
            this.aOd = 0.0D;
         }

         if (var17 != var5) {
            this.aOL = 0.0D;
         }

         if (var15 != var3) {
            var63.q(this.vR, this);
         }

         if (this.mG() && !var19 && this.aNP == null) {
            double var64 = this.aNZ - var7;
            double var67 = this.aNK - var9;
            double var72 = this.aOt - var11;
            if (var63 != Ea.bjK) {
               var67 = 0.0D;
            }

            if (var63 != null && this.aNG) {
               var63.q(this.vR, var26, this);
            }

            this.aOg = (float)((double)this.aOg + (double)Pq.B(var64 * var64 + var72 * var72) * 0.6D);
            this.aON = (float)((double)this.aON + (double)Pq.B(var64 * var64 + var67 * var67 + var72 * var72) * 0.6D);
            if (this.aON > (float)this.aNT && var63.cB() != hn.zp) {
               this.aNT = (int)this.aON + 1;
               if (this.xg()) {
                  float var34 = Pq.B(this.aOd * this.aOd * 0.20000000298023224D + this.aOO * this.aOO + this.aOL * this.aOL * 0.20000000298023224D) * 0.35F;
                  if (var34 > 1.0F) {
                     var34 = 1.0F;
                  }

                  this.q(this.xD(), var34, 1.0F + (this.oF.nextFloat() - this.oF.nextFloat()) * 0.4F);
               }

               this.q(var26, var63);
            }
         }

         try {
            this.xS();
         } catch (Throwable var52) {
            xW var66 = xW.q(var52, u.q[2931 & 9177]);
            ye var68 = var66.bd(u.q[2002 & 9074]);
            this.q(var68);
            throw new PI(var66);
         }

         boolean var65 = this.xA();
         if (this.vR.a(this.xE().F(0.001D, 0.001D, 0.001D))) {
            this.dD(1);
            if (!var65) {
               ++this.aOG;
               if (this.aOG == 0) {
                  this.dG(8);
               }
            }
         } else if (this.aOG <= 0) {
            this.aOG = -this.aOc;
         }

         if (var65 && this.aOG > 0) {
            this.q(w.q[-31319 & 4920], 0.7F, 1.6F + (this.oF.nextFloat() - this.oF.nextFloat()) * 0.4F);
            this.aOG = -this.aOc;
         }

         this.vR.bXK.Ol();
      }

   }

   public boolean xc() {
      return this.aNx;
   }

   public void x(zk var1) {
      if (var1.aND != this && var1.aNP != this && !var1.aOm && !this.aOm) {
         double var2 = var1.aNZ - this.aNZ;
         double var4 = var1.aOt - this.aOt;
         double var6 = Pq.y(var2, var4);
         if (var6 >= 0.009999999776482582D) {
            var6 = (double)Pq.B(var6);
            var2 = var2 / var6;
            var4 = var4 / var6;
            double var8 = 1.0D / var6;
            if (var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 = var2 * var8;
            var4 = var4 * var8;
            var2 = var2 * 0.05000000074505806D;
            var4 = var4 * 0.05000000074505806D;
            var2 = var2 * (double)(1.0F - this.aNJ);
            var4 = var4 * (double)(1.0F - this.aNJ);
            if (this.aND == null) {
               this.z(-var2, 0.0D, -var4);
            }

            if (var1.aND == null) {
               var1.z(var2, 0.0D, var4);
            }
         }
      }

   }

   public void e(NV var1) {
      this.apF = var1;
   }

   public boolean xd() {
      return this.vR.q(this.xE().C(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), hn.zY);
   }

   public PX l(float var1) {
      if (var1 == 1.0F) {
         return this.h(this.aNN, this.aOn);
      } else {
         float var2 = this.aOr + (this.aNN - this.aOr) * var1;
         float var3 = this.aOF + (this.aOn - this.aOF) * var1;
         return this.h(var2, var3);
      }
   }

   public zk(QI var1) {
      this.aNA = aOp++;
      this.aOK = 1.0D;
      this.apF = aOk;
      this.gK = 0.6F;
      this.gJ = 1.8F;
      this.aNT = 1;
      this.oF = new Random();
      this.aOc = 1;
      this.aNS = true;
      this.aOv = Pq.i(this.oF);
      this.aOz = new wE();
      this.vR = var1;
      this.p(0.0D, 0.0D, 0.0D);
      if (var1 != null) {
         this.aOe = var1.bXI.ZQ();
      }

      this.aNw = new zi(this);
      this.aNw.w(0, Byte.valueOf((byte)0));
      this.aNw.w(1, Short.valueOf((short)300));
      this.aNw.w(3, Byte.valueOf((byte)0));
      this.aNw.w(2, q.q[16384 & 1345]);
      this.aNw.w(4, Byte.valueOf((byte)0));
      this.mC();
   }

   protected void t(int var1, boolean var2) {
      byte var3 = this.aNw.dy(0);
      if (var2) {
         this.aNw.e(0, Byte.valueOf((byte)(var3 | 1 << var1)));
      } else {
         this.aNw.e(0, Byte.valueOf((byte)(var3 & ~(1 << var1))));
      }

   }

   public void af(boolean var1) {
      this.aNx = var1;
   }

   public void xe() {
      this.vR.bXK.cf(u.q[12111 & -15521]);
      if (this.aNP != null && this.aNP.aNQ) {
         this.aNP = null;
      }

      this.aOj = this.aOg;
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      this.aOr = this.aNN;
      this.aOF = this.aOn;
      if (!this.vR.bXF && this.vR instanceof QU) {
         this.vR.bXK.cf(e.q[326 & -29210]);
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

      this.yh();
      this.xz();
      if (this.vR.bXF) {
         this.aOG = 0;
      } else if (this.aOG > 0) {
         if (this.aOI) {
            this.aOG -= 4;
            if (this.aOG < 0) {
               this.aOG = 0;
            }
         } else {
            if (this.aOG % 20 == 0) {
               this.q(Oz.bPr, 1.0F);
            }

            --this.aOG;
         }
      }

      if (this.xd()) {
         this.xW();
         this.aNI *= 0.5F;
      }

      if (this.aNK < -64.0D) {
         this.xI();
      }

      if (!this.vR.bXF) {
         this.t(0, this.aOG > 0);
      }

      this.aNS = false;
      this.vR.bXK.Ol();
   }

   public boolean f(double var1) {
      double var3 = this.xE().Vd();
      if (Double.isNaN(var3)) {
         var3 = 1.0D;
      }

      var3 = var3 * 64.0D * this.aOK;
      return var1 < var3 * var3;
   }

   public void at(float var1) {
   }

   protected boolean w(double var1, double var3, double var5) {
      NW var7 = new NW(var1, var3, var5);
      double var8 = var1 - (double)var7.aY();
      double var10 = var3 - (double)var7.aX();
      double var12 = var5 - (double)var7.KO();
      List var14 = this.vR.i(this.xE());
      if (var14.isEmpty() && !this.vR.au(var7)) {
         return false;
      } else {
         byte var15 = 3;
         double var16 = 9999.0D;
         if (!this.vR.au(var7.Vh()) && var8 < var16) {
            var16 = var8;
            var15 = 0;
         }

         if (!this.vR.au(var7.Ve()) && 1.0D - var8 < var16) {
            var16 = 1.0D - var8;
            var15 = 1;
         }

         if (!this.vR.au(var7.Vi()) && 1.0D - var10 < var16) {
            var16 = 1.0D - var10;
            var15 = 3;
         }

         if (!this.vR.au(var7.Vg()) && var12 < var16) {
            var16 = var12;
            var15 = 4;
         }

         if (!this.vR.au(var7.Vk()) && 1.0D - var12 < var16) {
            var16 = 1.0D - var12;
            var15 = 5;
         }

         float var18 = this.oF.nextFloat() * 0.2F + 0.1F;
         if (var15 == 0) {
            this.aOd = (double)(-var18);
         }

         if (var15 == 1) {
            this.aOd = (double)var18;
         }

         if (var15 == 3) {
            this.aOO = (double)var18;
         }

         if (var15 == 4) {
            this.aOL = (double)(-var18);
         }

         if (var15 == 5) {
            this.aOL = (double)var18;
         }

         return true;
      }
   }

   protected void dD(int var1) {
      if (!this.aOI) {
         this.q(Oz.bPC, (float)var1);
      }

   }

   public double j(double var1, double var3, double var5) {
      double var7 = this.aNZ - var1;
      double var9 = this.aNK - var3;
      double var11 = this.aOt - var5;
      return (double)Pq.B(var7 * var7 + var9 * var9 + var11 * var11);
   }

   protected HT q(double... var1) {
      HT var2 = new HT();

      for(double var6 : var1) {
         var2.q(new HO(var6));
      }

      return var2;
   }

   public void q(OX var1) {
   }

   public String bY() {
      if (this.dg()) {
         return this.yj();
      } else {
         String var1 = zv.D(this);
         if (var1 == null) {
            var1 = w.q[-32297 & 3027];
         }

         return PO.dn(e.q[2967 & 13143] + var1 + w.q[635 & 9067]);
      }
   }

   public boolean y(DD var1) {
      return false;
   }

   public boolean xf() {
      return this.dH(3);
   }

   public boolean xg() {
      return this.aNL;
   }

   public boolean q(Oz var1) {
      return this.aOH && var1 != Oz.bPA && !var1.Wh();
   }

   protected final String xh() {
      return zv.D(this);
   }

   public void xi() {
      this.aOG = 0;
   }

   public void u(DD var1) {
   }

   public void w(Bt var1) {
      this.q(Oz.bPy, 5.0F);
      ++this.aOG;
      if (this.aOG == 0) {
         this.dG(8);
      }

   }

   public boolean xj() {
      return this.aNP != null;
   }

   public float q(Qt var1, QI var2, NW var3, hI var4) {
      return var4.ds().w(this);
   }

   public void q(byte var1) {
   }

   public int xk() {
      return 3;
   }

   public boolean xl() {
      return false;
   }

   public float c(zk var1) {
      float var2 = (float)(this.aNZ - var1.aNZ);
      float var3 = (float)(this.aNK - var1.aNK);
      float var4 = (float)(this.aOt - var1.aOt);
      return Pq.bh(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public PX vP() {
      return new PX(this.aNZ, this.aNK, this.aOt);
   }

   public double pP() {
      return 0.0D;
   }

   public QI vQ() {
      return this.vR;
   }

   protected void d(float var1, float var2) {
      if (var1 != this.gK || var2 != this.gJ) {
         float var3 = this.gK;
         this.gK = var1;
         this.gJ = var2;
         this.e(new NV(this.xE().bNW, this.xE().bNT, this.xE().bNY, this.xE().bNW + (double)this.gK, this.xE().bNT + (double)this.gJ, this.xE().bNY + (double)this.gK));
         if (this.gK > var3 && !this.aNS && !this.vR.bXF) {
            this.h((double)(var3 - this.gK), 0.0D, (double)(var3 - this.gK));
         }
      }

   }

   public void f(float var1, float var2) {
      if (this.aND != null) {
         this.aND.f(var1, var2);
      }

   }

   public void dE(int var1) {
      if (!this.vR.bXF && !this.aNQ) {
         this.vR.bXK.cf(u.q[1893 & -15379]);
         Md var2 = Md.Jc();
         int var3 = this.aOe;
         QU var4 = var2.gh(var3);
         QU var5 = var2.gh(var1);
         this.aOe = var1;
         if (var3 == 1 && var1 == 1) {
            var5 = var2.gh(0);
            this.aOe = 0;
         }

         this.vR.i(this);
         this.aNQ = false;
         this.vR.bXK.cf(u.q[7014 & -22673]);
         var2.Pw().q(this, var3, var4, var5);
         this.vR.bXK.cd(u.q[12135 & 17263]);
         zk var6 = zv.q(zv.D(this), var5);
         if (var6 != null) {
            var6.m(this);
            if (var3 == 1 && var1 == 1) {
               NW var7 = this.vR.at(var5.Zq());
               var6.q(var7, var6.aOn, var6.aNN);
            }

            var5.p(var6);
         }

         this.aNQ = true;
         this.vR.bXK.Ol();
         var4.aau();
         var5.aau();
         this.vR.bXK.Ol();
      }

   }

   public double D(NW var1) {
      return var1.N(this.aNZ, this.aNK, this.aOt);
   }

   public boolean xm() {
      return this.aNw.dy(3) == 1;
   }

   public int xn() {
      return this.aNw.dv(1);
   }

   public int hashCode() {
      return this.aNA;
   }

   protected void xo() {
      this.aNV = true;
   }

   public void xp() {
   }

   public boolean xq() {
      return false;
   }

   public BD q(Fm var1, int var2, float var3) {
      return this.q(new GX(var1, var2, 0), var3);
   }

   public boolean q(int var1, String var2) {
      return true;
   }

   public void dF(int var1) {
      this.aNA = var1;
   }

   public void k(double var1, double var3, double var5) {
      this.aOd = var1;
      this.aOO = var3;
      this.aOL = var5;
   }

   public void xr() {
      if (this.aND != null) {
         this.aND.p(this.aNZ, this.aNK + this.xX() + this.aND.pP(), this.aOt);
      }

   }

   public void l(boolean var1) {
      this.t(3, var1);
   }

   protected boolean xs() {
      return true;
   }

   protected abstract void r(HL var1);

   public boolean q(DH var1) {
      return true;
   }

   protected void q(double var1, boolean var3, cv var4, NW var5) {
      if (var3) {
         if (this.aNI > 0.0F) {
            if (var4 != null) {
               var4.q(this.vR, var5, this, this.aNI);
            } else {
               this.f(this.aNI, 1.0F);
            }

            this.aNI = 0.0F;
         }
      } else if (var1 < 0.0D) {
         this.aNI = (float)((double)this.aNI - var1);
      }

   }

   public void s(long var1) {
      this.aNU = var1;
   }

   public BD r(Fm var1, int var2) {
      return this.q(var1, var2, 0.0F);
   }

   public boolean xt() {
      return false;
   }

   public float xu() {
      return 0.1F;
   }

   public zk[] xv() {
      return null;
   }

   public void p(double var1, double var3, double var5) {
      this.aNZ = var1;
      this.aNK = var3;
      this.aOt = var5;
      float var7 = this.gK / 2.0F;
      float var8 = this.gJ;
      this.e(new NV(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   protected void xw() {
      float var1 = Pq.B(this.aOd * this.aOd * 0.20000000298023224D + this.aOO * this.aOO + this.aOL * this.aOL * 0.20000000298023224D) * 0.2F;
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.q(this.yk(), var1, 1.0F + (this.oF.nextFloat() - this.oF.nextFloat()) * 0.4F);
      float var2 = (float)Pq.D(this.xE().bNT);

      for(int var3 = 0; (float)var3 < 1.0F + this.gK * 20.0F; ++var3) {
         float var4 = (this.oF.nextFloat() * 2.0F - 1.0F) * this.gK;
         float var5 = (this.oF.nextFloat() * 2.0F - 1.0F) * this.gK;
         this.vR.q(OP.bRo, this.aNZ + (double)var4, (double)(var2 + 1.0F), this.aOt + (double)var5, this.aOd, this.aOO - (double)(this.oF.nextFloat() * 0.2F), this.aOL);
      }

      for(int var6 = 0; (float)var6 < 1.0F + this.gK * 20.0F; ++var6) {
         float var7 = (this.oF.nextFloat() * 2.0F - 1.0F) * this.gK;
         float var8 = (this.oF.nextFloat() * 2.0F - 1.0F) * this.gK;
         this.vR.q(OP.bRp, this.aNZ + (double)var7, (double)(var2 + 1.0F), this.aOt + (double)var8, this.aOd, this.aOO, this.aOL);
      }

   }

   public void ag(boolean var1) {
      this.aNw.e(4, Byte.valueOf((byte)(var1 ? 1 : 0)));
   }

   public HL xx() {
      return null;
   }

   public void v(zk var1) {
      this.aOz.q(var1.ya());
   }

   public boolean p(HL var1) {
      String var2 = this.xh();
      if (!this.aNQ && var2 != null && this.aND == null) {
         var1.a(w.q[18623 & 1341], var2);
         this.q(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean mD() {
      return true;
   }

   public void xy() {
   }

   public boolean xz() {
      if (this.vR.q(this.xE().C(0.0D, -0.4000000059604645D, 0.0D).F(0.001D, 0.001D, 0.001D), hn.zS, this)) {
         if (!this.aNL && !this.aNS) {
            this.xw();
         }

         this.aNI = 0.0F;
         this.aNL = true;
         this.aOG = 0;
      } else {
         this.aNL = false;
      }

      return this.aNL;
   }

   public boolean q(DD var1, PX var2) {
      return false;
   }

   public void q(NW var1, float var2, float var3) {
      this.q((double)var1.aY() + 0.5D, (double)var1.aX(), (double)var1.KO() + 0.5D, var2, var3);
   }

   public boolean xA() {
      return this.aNL || this.vR.aG(new NW(this.aNZ, this.aNK, this.aOt)) || this.vR.aG(new NW(this.aNZ, this.aNK + (double)this.gJ, this.aOt));
   }

   public OK xB() {
      return this.aNM;
   }

   protected abstract void mC();

   public float xC() {
      return this.gJ * 0.85F;
   }

   protected String xD() {
      return u.q[3923 & 5079];
   }

   public NV xE() {
      return this.apF;
   }

   public boolean xF() {
      return this.xL();
   }

   public zi xG() {
      return this.aNw;
   }

   public OX dh() {
      Oo var1 = new Oo(this.bY());
      var1.Vw().q(this.yl());
      var1.Vw().dc(this.ym().toString());
      return var1;
   }

   public boolean equals(Object var1) {
      return var1 instanceof zk ? ((zk)var1).aNA == this.aNA : false;
   }

   private void xH() {
      this.aNZ = (this.xE().bNW + this.xE().bNU) / 2.0D;
      this.aNK = this.xE().bNT;
      this.aOt = (this.xE().bNY + this.xE().bNV) / 2.0D;
   }

   protected void e(zz var1, zk var2) {
      if (var2 instanceof zz) {
         yS.q((zz)var2, var1);
      }

      yS.w(var1, var2);
   }

   public void ah(boolean var1) {
      this.aNw.e(3, Byte.valueOf((byte)(var1 ? 1 : 0)));
   }

   public boolean dg() {
      return this.aNw.dw(2).length() > 0;
   }

   protected void xI() {
      this.yo();
   }

   public int I(float var1) {
      NW var2 = new NW(this.aNZ, this.aNK + (double)this.xC(), this.aOt);
      return this.vR.q(var2, 0);
   }

   public void xJ() {
      this.aOJ = true;
      this.aNI = 0.0F;
   }

   private boolean r(NV var1) {
      return this.vR.q(this, var1).isEmpty() && !this.vR.p(var1);
   }

   public void w(zk var1, int var2) {
   }

   public void xK() {
      if (this.aNP.aNQ) {
         this.aNP = null;
      } else {
         this.aOd = 0.0D;
         this.aOO = 0.0D;
         this.aOL = 0.0D;
         this.hv();
         if (this.aNP != null) {
            this.aNP.xr();
            this.aOh += (double)(this.aNP.aOn - this.aNP.aOF);

            for(this.aOo += (double)(this.aNP.aNN - this.aNP.aOr); this.aOh >= 180.0D; this.aOh -= 360.0D) {
               ;
            }

            while(this.aOh < -180.0D) {
               this.aOh += 360.0D;
            }

            while(this.aOo >= 180.0D) {
               this.aOo -= 360.0D;
            }

            while(this.aOo < -180.0D) {
               this.aOo += 360.0D;
            }

            double var1 = this.aOh * 0.5D;
            double var3 = this.aOo * 0.5D;
            float var5 = 10.0F;
            if (var1 > (double)var5) {
               var1 = (double)var5;
            }

            if (var1 < (double)(-var5)) {
               var1 = (double)(-var5);
            }

            if (var3 > (double)var5) {
               var3 = (double)var5;
            }

            if (var3 < (double)(-var5)) {
               var3 = (double)(-var5);
            }

            this.aOh -= var1;
            this.aOo -= var3;
         }
      }

   }

   public void q(String var1, float var2, float var3) {
      if (!this.xP()) {
         this.vR.q(this, var1, var2, var3);
      }

   }

   public boolean xL() {
      boolean var1 = this.vR != null && this.vR.bXF;
      return !this.aOI && (this.aOG > 0 || var1 && this.dH(0));
   }

   public void b(zk var1) {
      this.q(var1.aNZ, var1.aNK, var1.aOt, var1.aOn, var1.aNN);
   }

   public boolean vR() {
      return false;
   }

   public PB q(double var1, float var3) {
      PX var4 = this.av(var3);
      PX var5 = this.l(var3);
      PX var6 = var4.K(var5.bUV * var1, var5.bUW * var1, var5.bUX * var1);
      return this.vR.q(var4, var6, false, false, true);
   }

   public boolean n(zk var1) {
      return this == var1;
   }

   public boolean r(int var1, GX var2) {
      return false;
   }

   protected abstract void t(HL var1);

   protected HT r(float... var1) {
      HT var2 = new HT();

      for(float var6 : var1) {
         var2.q(new HQ(var6));
      }

      return var2;
   }

   public void w(HL var1) {
      try {
         HT var2 = var1.s(u.q[21471 & -31913], 6);
         HT var6 = var1.s(u.q[856 & 988], 6);
         HT var7 = var1.s(w.q[2889 & 4997], 5);
         this.aOd = var6.fu(0);
         this.aOO = var6.fu(1);
         this.aOL = var6.fu(2);
         if (Math.abs(this.aOd) > 10.0D) {
            this.aOd = 0.0D;
         }

         if (Math.abs(this.aOO) > 10.0D) {
            this.aOO = 0.0D;
         }

         if (Math.abs(this.aOL) > 10.0D) {
            this.aOL = 0.0D;
         }

         this.aOf = this.aOD = this.aNZ = var2.fu(0);
         this.aNH = this.aNE = this.aNK = var2.fu(1);
         this.aNW = this.aOC = this.aOt = var2.fu(2);
         this.aOF = this.aOn = var7.fx(0);
         this.aOr = this.aNN = var7.fx(1);
         this.at(this.aOn);
         this.au(this.aOn);
         this.aNI = var1.bR(u.q[13145 & 859]);
         this.aOG = var1.bI(u.q[-27814 & 17371]);
         this.dJ(var1.bI(q.q[-20454 & 1115]));
         this.aNG = var1.bL(u.q[25435 & 8187]);
         this.aOe = var1.bQ(r.q[120 & 6004]);
         this.aOH = var1.bL(u.q[-10276 & 2940]);
         this.aOi = var1.bQ(u.q[-24739 & 1021]);
         if (var1.d(q.q[17321 & -25620], 4) && var1.d(q.q[939 & 2989], 4)) {
            this.aOv = new UUID(var1.bJ(q.q[10157 & 5048]), var1.bJ(q.q[1963 & 25513]));
         } else if (var1.d(e.q[-31873 & 29495], 8)) {
            this.aOv = UUID.fromString(var1.bG(e.q[823 & 20279]));
         }

         this.p(this.aNZ, this.aNK, this.aOt);
         this.g(this.aOn, this.aNN);
         if (var1.d(q.q[6603 & 488], 8) && var1.bG(q.q[462 & -15912]).length() > 0) {
            this.bh(var1.bG(q.q[479 & 3016]));
         }

         this.ah(var1.bL(e.q[16991 & 5062]));
         this.aOz.y(var1);
         this.ag(var1.bL(u.q[19295 & 5118]));
         this.r(var1);
         if (this.xs()) {
            this.p(this.aNZ, this.aNK, this.aOt);
         }

      } catch (Throwable var5) {
         xW var3 = xW.q(var5, u.q[11127 & 4969]);
         ye var4 = var3.bd(u.q[11235 & 18274]);
         this.q(var4);
         throw new PI(var3);
      }
   }

   public GX[] xM() {
      return null;
   }

   public void hv() {
      this.xe();
   }

   public long xN() {
      return this.aNU;
   }

   public boolean xO() {
      return true;
   }

   public zk vS() {
      return this;
   }

   public void E(NW var1) {
      if (this.aOi > 0) {
         this.aOi = this.yf();
      } else {
         if (!this.vR.bXF && !var1.equals(this.aOb)) {
            this.aOb = var1;
            hM var2 = Ea.bjr.L(this.vR, var1);
            double var3 = var2.eO().WT() == OM.bQV ? (double)var2.eI().KO() : (double)var2.eI().aY();
            double var5 = var2.eO().WT() == OM.bQV ? this.aOt : this.aNZ;
            var5 = Math.abs(Pq.H(var5 - (double)(var2.eO().WL().WJ() == ON.bRd ? 1 : 0), var3, var3 - (double)var2.eM()));
            double var7 = Pq.H(this.aNK - 1.0D, (double)var2.eI().aX(), (double)(var2.eI().aX() - var2.eN()));
            this.aNF = new PX(var5, var7, 0.0D);
            this.aNM = var2.eO();
         }

         this.aOE = true;
      }

   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else {
         this.xo();
         return false;
      }
   }

   public void q(double var1, double var3, double var5, float var7, float var8) {
      this.aOD = this.aOf = this.aNZ = var1;
      this.aNE = this.aNH = this.aNK = var3;
      this.aOC = this.aNW = this.aOt = var5;
      this.aOn = var7;
      this.aNN = var8;
      this.p(this.aNZ, this.aNK, this.aOt);
   }

   public boolean xP() {
      return this.aNw.dy(4) == 1;
   }

   public void w(double var1, double var3, double var5, float var7, float var8) {
      this.aOf = this.aNZ = var1;
      this.aNH = this.aNK = var3;
      this.aNW = this.aOt = var5;
      this.aOF = this.aOn = var7;
      this.aOr = this.aNN = var8;
      double var9 = (double)(this.aOF - var7);
      if (var9 < -180.0D) {
         this.aOF += 360.0F;
      }

      if (var9 >= 180.0D) {
         this.aOF -= 360.0F;
      }

      this.p(this.aNZ, this.aNK, this.aOt);
      this.g(var7, var8);
   }

   public NW dt() {
      return new NW(this.aNZ, this.aNK + 0.5D, this.aOt);
   }

   public void l(double var1, double var3, double var5) {
      this.q(var1, var3, var5, this.aOn, this.aNN);
   }

   public void L(boolean var1) {
      this.t(5, var1);
   }

   public boolean xQ() {
      if (this.aOm) {
         return false;
      } else {
         Ob var1 = new Ob(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

         for(int var2 = 0; var2 < 8; ++var2) {
            int var3 = Pq.D(this.aNK + (double)(((float)((var2 >> 0) % 2) - 0.5F) * 0.1F) + (double)this.xC());
            int var4 = Pq.D(this.aNZ + (double)(((float)((var2 >> 1) % 2) - 0.5F) * this.gK * 0.8F));
            int var5 = Pq.D(this.aOt + (double)(((float)((var2 >> 2) % 2) - 0.5F) * this.gK * 0.8F));
            if (var1.aY() != var4 || var1.aX() != var3 || var1.KO() != var5) {
               var1.D(var4, var3, var5);
               if (this.vR.g(var1).ds().ct()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void dG(int var1) {
      int var2 = var1 * 20;
      var2 = zc.q(this, var2);
      if (this.aOG < var2) {
         this.aOG = var2;
      }

   }

   public float xR() {
      return 0.0F;
   }

   public void m(zk var1) {
      HL var2 = new HL();
      var1.q(var2);
      this.w(var2);
      this.aOi = var1.aOi;
      this.aOb = var1.aOb;
      this.aNF = var1.aNF;
      this.aNM = var1.aNM;
   }

   public String toString() {
      return String.format(u.q[4967 & 17251], this.getClass().getSimpleName(), this.bY(), this.aNA, this.vR == null ? u.q[7013 & -30724] : this.vR.Zz().PW(), this.aNZ, this.aNK, this.aOt);
   }

   protected void xS() {
      NW var1 = new NW(this.xE().bNW + 0.001D, this.xE().bNT + 0.001D, this.xE().bNY + 0.001D);
      NW var2 = new NW(this.xE().bNU - 0.001D, this.xE().bNX - 0.001D, this.xE().bNV - 0.001D);
      if (this.vR.r(var1, var2)) {
         for(int var3 = var1.aY(); var3 <= var2.aY(); ++var3) {
            for(int var4 = var1.aX(); var4 <= var2.aX(); ++var4) {
               for(int var5 = var1.KO(); var5 <= var2.KO(); ++var5) {
                  NW var6 = new NW(var3, var4, var5);
                  hI var7 = this.vR.g(var6);

                  try {
                     var7.ds().q(this.vR, var6, var7, this);
                  } catch (Throwable var11) {
                     xW var9 = xW.q(var11, u.q[-30756 & 25429]);
                     ye var10 = var9.bd(u.q[17245 & 2037]);
                     ye.q(var10, var6, var7);
                     throw new PI(var9);
                  }
               }
            }
         }
      }

   }

   public NV mI() {
      return null;
   }

   protected boolean dH(int var1) {
      return (this.aNw.dy(0) & 1 << var1) != 0;
   }

   public boolean hI() {
      return this.dH(1);
   }

   protected void g(float var1, float var2) {
      this.aOn = var1 % 360.0F;
      this.aNN = var2 % 360.0F;
   }

   public void q(wG var1, int var2) {
      this.aOz.q(this, var1, var2);
   }

   public OK xT() {
      return OK.gE(Pq.D((double)(this.aOn * 4.0F / 360.0F) + 0.5D) & 3);
   }

   public boolean xU() {
      return this.dH(4);
   }

   public boolean xV() {
      return !this.aNQ;
   }

   protected void xW() {
      if (!this.aOI) {
         this.q(Oz.bPM, 4.0F);
         this.dG(15);
      }

   }

   public double xX() {
      return (double)this.gJ * 0.75D;
   }

   public ahb xY() {
      if (this.aOB == null) {
         this.aOB = new ahb();
      }

      return this.aOB;
   }

   public boolean xZ() {
      return this.dH(5);
   }

   public wE ya() {
      return this.aOz;
   }

   public aeI yb() {
      if (this.aOP == null) {
         this.aOP = new aeI();
      }

      return this.aOP;
   }

   public void bh(String var1) {
      this.aNw.e(2, var1);
   }

   public void au(float var1) {
   }

   public void u(zk var1) {
      this.aOo = 0.0D;
      this.aOh = 0.0D;
      if (var1 == null) {
         if (this.aNP != null) {
            this.q(this.aNP.aNZ, this.aNP.xE().bNT + (double)this.aNP.gJ, this.aNP.aOt, this.aOn, this.aNN);
            this.aNP.aND = null;
         }

         this.aNP = null;
      } else {
         if (this.aNP != null) {
            this.aNP.aND = null;
         }

         if (var1 != null) {
            for(zk var2 = var1.aNP; var2 != null; var2 = var2.aNP) {
               if (var2 == this) {
                  return;
               }
            }
         }

         this.aNP = var1;
         var1.aND = this;
      }

   }

   public double F(NW var1) {
      return var1.M(this.aNZ, this.aNK, this.aOt);
   }

   public void d(zz var1) {
   }

   public NV A(zk var1) {
      return null;
   }

   public void a(HL var1) {
   }

   protected void yc() {
      if (this.vR != null) {
         while(true) {
            if (this.aNK > 0.0D && this.aNK < 256.0D) {
               this.p(this.aNZ, this.aNK, this.aOt);
               if (!this.vR.q(this, this.xE()).isEmpty()) {
                  ++this.aNK;
                  continue;
               }
            }

            this.aOd = this.aOO = this.aOL = 0.0D;
            this.aNN = 0.0F;
            break;
         }
      }

   }

   public PX yd() {
      return null;
   }

   public PX av(float var1) {
      if (var1 == 1.0F) {
         return new PX(this.aNZ, this.aNK + (double)this.xC(), this.aOt);
      } else {
         double var2 = this.aOf + (this.aNZ - this.aOf) * (double)var1;
         double var4 = this.aNH + (this.aNK - this.aNH) * (double)var1 + (double)this.xC();
         double var6 = this.aNW + (this.aOt - this.aNW) * (double)var1;
         return new PX(var2, var4, var6);
      }
   }

   protected boolean mG() {
      return true;
   }

   public PX ye() {
      return this.aNF;
   }

   public boolean s(HL var1) {
      String var2 = this.xh();
      if (!this.aNQ && var2 != null) {
         var1.a(w.q[19517 & 8511], var2);
         this.q(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean e(hn var1) {
      double var2 = this.aNK + (double)this.xC();
      NW var4 = new NW(this.aNZ, var2, this.aOt);
      hI var5 = this.vR.g(var4);
      cv var6 = var5.ds();
      if (var6.cB() == var1) {
         float var7 = ey.Y(var5.ds().e(var5)) - 0.11111111F;
         float var8 = (float)(var4.aX() + 1) - var7;
         boolean var9 = var2 < (double)var8;
         return !var9 && this instanceof DD ? false : var9;
      } else {
         return false;
      }
   }

   public int yf() {
      return 300;
   }

   protected final PX h(float var1, float var2) {
      float var3 = Pq.bi(-var2 * 0.017453292F - 3.1415927F);
      float var4 = Pq.bk(-var2 * 0.017453292F - 3.1415927F);
      float var5 = -Pq.bi(-var1 * 0.017453292F);
      float var6 = Pq.bk(-var1 * 0.017453292F);
      return new PX((double)(var4 * var5), (double)var6, (double)(var3 * var5));
   }

   public void q(HL var1) {
      try {
         var1.w(u.q[-31913 & 18391], this.q(this.aNZ, this.aNK, this.aOt));
         var1.w(u.q[984 & -31911], this.q(this.aOd, this.aOO, this.aOL));
         var1.w(w.q[-31997 & 8961], this.r(this.aOn, this.aNN));
         var1.q(u.q[2909 & -23591], this.aNI);
         var1.q(u.q[-31909 & 14170], (short)this.aOG);
         var1.q(q.q[539 & -21350], (short)this.xn());
         var1.s(u.q[29535 & 859], this.aNG);
         var1.a(r.q[27508 & -32654], this.aOe);
         var1.s(u.q[6014 & 9180], this.aOH);
         var1.a(u.q[14175 & -31907], this.aOi);
         var1.q(q.q[-19542 & 19433], this.ym().getMostSignificantBits());
         var1.q(q.q[13225 & 2027], this.ym().getLeastSignificantBits());
         if (this.yj() != null && this.yj().length() > 0) {
            var1.a(q.q[973 & -31286], this.yj());
            var1.s(e.q[590 & 21206], this.xm());
         }

         this.aOz.u(var1);
         if (this.xP()) {
            var1.s(u.q[20479 & 9054], this.xP());
         }

         this.t(var1);
         if (this.aNP != null) {
            HL var2 = new HL();
            if (this.aNP.s(var2)) {
               var1.w(r.q[6911 & 26479], var2);
            }
         }

      } catch (Throwable var5) {
         xW var3 = xW.q(var5, u.q[3935 & 9055]);
         ye var4 = var3.bd(u.q[2916 & 1889]);
         this.q(var4);
         throw new PI(var3);
      }
   }

   public void r(QI var1) {
      this.vR = var1;
   }

   public void z(double var1, double var3, double var5) {
      this.aOd += var1;
      this.aOO += var3;
      this.aOL += var5;
      this.aOQ = true;
   }

   public boolean yg() {
      return this.xm();
   }

   protected void q(NW var1, cv var2) {
      cB var3 = var2.nl;
      if (this.vR.g(var1.Vi()).ds() == Ea.bhe) {
         var3 = Ea.bhe.nl;
         this.q(var3.dd(), var3.de() * 0.15F, var3.df());
      } else if (!var2.cB().eo()) {
         this.q(var3.dd(), var3.de() * 0.15F, var3.df());
      }

   }

   public void g(float var1, float var2, float var3) {
      float var4 = var1 * var1 + var2 * var2;
      if (var4 >= 1.0E-4F) {
         var4 = Pq.bh(var4);
         if (var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 = var1 * var4;
         var2 = var2 * var4;
         float var5 = Pq.bk(this.aOn * 3.1415927F / 180.0F);
         float var6 = Pq.bi(this.aOn * 3.1415927F / 180.0F);
         this.aOd += (double)(var1 * var6 - var2 * var5);
         this.aOL += (double)(var2 * var6 + var1 * var5);
      }

   }

   public void yh() {
      if (this.aNG && this.xf() && !this.xg()) {
         this.wZ();
      }

   }

   public void j(float var1, float var2) {
      float var3 = this.aNN;
      float var4 = this.aOn;
      this.aOn = (float)((double)this.aOn + (double)var1 * 0.15D);
      this.aNN = (float)((double)this.aNN - (double)var2 * 0.15D);
      this.aNN = Pq.n(this.aNN, -90.0F, 90.0F);
      this.aOr += this.aNN - var3;
      this.aOF += this.aOn - var4;
   }

   public int yi() {
      return this.aNA;
   }

   public String yj() {
      return this.aNw.dw(2);
   }

   public double x(double var1, double var3, double var5) {
      double var7 = this.aNZ - var1;
      double var9 = this.aNK - var3;
      double var11 = this.aOt - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   protected String yk() {
      return u.q[-11434 & 1879];
   }

   public void dI(int var1) {
   }

   public void ai(boolean var1) {
      this.t(4, var1);
   }

   protected DY yl() {
      HL var1 = new HL();
      String var2 = zv.D(this);
      var1.a(w.q[15741 & -16195], this.ym().toString());
      if (var2 != null) {
         var1.a(q.q[504 & 15354], var2);
      }

      var1.a(q.q[3191 & 16503], this.bY());
      return new DY(DZ.bgK, new Oo(var1.toString()));
   }

   public UUID ym() {
      return this.aOv;
   }

   public float J(float var1) {
      NW var2 = new NW(this.aNZ, this.aNK + (double)this.xC(), this.aOt);
      return this.vR.ao(var2) ? this.vR.aI(var2) : 0.0F;
   }

   public boolean i(DD var1) {
      return var1.hm() ? false : this.xZ();
   }

   public void yn() {
      this.yo();
   }

   public void yo() {
      this.aNQ = true;
   }

   public void q(ye var1) {
      var1.q(u.q[3960 & 878], new zl(this));
      var1.w(u.q[1001 & 2921], Integer.valueOf(this.aNA));
      var1.q(u.q[17258 & -21649], new zm(this));
      var1.w(u.q[-27781 & 1903], String.format(u.q[-31892 & 2926], this.aNZ, this.aNK, this.aOt));
      var1.w(u.q[19437 & 893], ye.f((double)Pq.D(this.aNZ), (double)Pq.D(this.aNK), (double)Pq.D(this.aOt)));
      var1.w(u.q[-31874 & 13294], String.format(u.q[876 & 11260], this.aOd, this.aOO, this.aOL));
      var1.q(u.q[2927 & -31761], new zn(this));
      var1.q(u.q[-31884 & 11120], new zo(this));
   }

   public double B(zk var1) {
      double var2 = this.aNZ - var1.aNZ;
      double var4 = this.aNK - var1.aNK;
      double var6 = this.aOt - var1.aOt;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void q(int var1, GX var2) {
   }

   public void dJ(int var1) {
      this.aNw.e(1, Short.valueOf((short)var1));
   }

   public boolean c(double var1, double var3, double var5) {
      double var7 = this.aNZ - var1;
      double var9 = this.aNK - var3;
      double var11 = this.aOt - var5;
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      return this.f(var13);
   }

   public boolean mJ() {
      return false;
   }
}

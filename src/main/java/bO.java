import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bo extends zx implements Bs, CP, zK {
   public Bp aWF;
   public double aSt;
   public Bx aWG;
   public Bp aWH;
   public float aWI;
   public Bp aWJ;
   public Bp aWK;
   public int aWL;
   public Bp aWM;
   public double[][] aWN = new double[64][3];
   private zk aMM;
   public Bp aWO;
   public boolean aWP;
   public double aSu;
   public Bp[] aWQ;
   public float aWR;
   public double aSx;
   public Bp aWS;
   public int aWT = -1;
   public boolean aWU;

   protected void mC() {
      super.mC();
   }

   public boolean xl() {
      return false;
   }

   public void yn() {
      this.yo();
   }

   public boolean q(Oz var1, float var2) {
      if (var1 instanceof OB && ((OB)var1).WE()) {
         this.t(var1, var2);
      }

      return false;
   }

   public zk[] xv() {
      return this.aWQ;
   }

   protected float zw() {
      return 5.0F;
   }

   private void h(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         zk var3 = (zk)var1.get(var2);
         if (var3 instanceof zz) {
            var3.q(Oz.n(this), 10.0F);
            this.e(this, var3);
         }
      }

   }

   private void BA() {
      this.aWP = false;
      ArrayList var1 = Lists.newArrayList(this.vR.bXt);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         if (((DD)var2.next()).hm()) {
            var2.remove();
         }
      }

      if (this.oF.nextInt(2) == 0 && !var1.isEmpty()) {
         this.aMM = (zk)var1.get(this.oF.nextInt(var1.size()));
      } else {
         while(true) {
            this.aSx = 0.0D;
            this.aSu = (double)(70.0F + this.oF.nextFloat() * 50.0F);
            this.aSt = 0.0D;
            this.aSx += (double)(this.oF.nextFloat() * 120.0F - 60.0F);
            this.aSt += (double)(this.oF.nextFloat() * 120.0F - 60.0F);
            double var3 = this.aNZ - this.aSx;
            double var5 = this.aNK - this.aSu;
            double var7 = this.aOt - this.aSt;
            boolean var9 = var3 * var3 + var5 * var5 + var7 * var7 > 100.0D;
            if (var9) {
               break;
            }
         }

         this.aMM = null;
      }

   }

   private boolean t(NV var1) {
      int var2 = Pq.D(var1.bNW);
      int var3 = Pq.D(var1.bNT);
      int var4 = Pq.D(var1.bNY);
      int var5 = Pq.D(var1.bNU);
      int var6 = Pq.D(var1.bNX);
      int var7 = Pq.D(var1.bNV);
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var2; var10 <= var5; ++var10) {
         for(int var11 = var3; var11 <= var6; ++var11) {
            for(int var12 = var4; var12 <= var7; ++var12) {
               NW var13 = new NW(var10, var11, var12);
               cv var14 = this.vR.g(var13).ds();
               if (var14.cB() != hn.zp) {
                  if (var14 != Ea.bim && var14 != Ea.bit && var14 != Ea.biz && var14 != Ea.bha && var14 != Ea.bhJ && this.vR.vU().bL(w.q[18323 & -25635])) {
                     var9 = this.vR.am(var13) || var9;
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      if (var9) {
         double var16 = var1.bNW + (var1.bNU - var1.bNW) * (double)this.oF.nextFloat();
         double var17 = var1.bNT + (var1.bNX - var1.bNT) * (double)this.oF.nextFloat();
         double var18 = var1.bNY + (var1.bNV - var1.bNY) * (double)this.oF.nextFloat();
         this.vR.q(OP.bRl, var16, var17, var18, 0.0D, 0.0D, 0.0D);
      }

      return var8;
   }

   private float j(double var1) {
      return (float)Pq.C(var1);
   }

   public double[] u(int var1, float var2) {
      if (this.zA() <= 0.0F) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.aWT - var1 * 1 & 63;
      int var4 = this.aWT - var1 * 1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.aWN[var3][0];
      double var8 = Pq.C(this.aWN[var4][0] - var6);
      var5[0] = var6 + var8 * (double)var2;
      var6 = this.aWN[var3][1];
      var8 = this.aWN[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = this.aWN[var3][2] + (this.aWN[var4][2] - this.aWN[var3][2]) * (double)var2;
      return var5;
   }

   private void K(NW var1) {
      boolean var2 = true;
      double var3 = 12.25D;
      double var5 = 6.25D;

      for(int var7 = -1; var7 <= 32; ++var7) {
         for(int var8 = -4; var8 <= 4; ++var8) {
            for(int var9 = -4; var9 <= 4; ++var9) {
               double var10 = (double)(var8 * var8 + var9 * var9);
               if (var10 <= 12.25D) {
                  NW var12 = var1.C(var8, var7, var9);
                  if (var7 < 0) {
                     if (var10 <= 6.25D) {
                        this.vR.r(var12, Ea.bha.cx());
                     }
                  } else if (var7 > 0) {
                     this.vR.r(var12, Ea.bjN.cx());
                  } else if (var10 > 6.25D) {
                     this.vR.r(var12, Ea.bha.cx());
                  } else {
                     this.vR.r(var12, Ea.bhw.cx());
                  }
               }
            }
         }
      }

      this.vR.r(var1, Ea.bha.cx());
      this.vR.r(var1.Vi(), Ea.bha.cx());
      NW var13 = var1.gx(2);
      this.vR.r(var13, Ea.bha.cx());
      this.vR.r(var13.Vh(), Ea.bjq.cx().q(gQ.xC, OK.bQG));
      this.vR.r(var13.Ve(), Ea.bjq.cx().q(gQ.xC, OK.bQF));
      this.vR.r(var13.Vg(), Ea.bjq.cx().q(gQ.xC, OK.bQE));
      this.vR.r(var13.Vk(), Ea.bjq.cx().q(gQ.xC, OK.bQD));
      this.vR.r(var1.gx(3), Ea.bha.cx());
      this.vR.r(var1.gx(4), Ea.bjW.cx());
   }

   private void BB() {
      if (this.aWG != null) {
         if (this.aWG.aNQ) {
            if (!this.vR.bXF) {
               this.q(this.aWK, Oz.w((Qt)null), 10.0F);
            }

            this.aWG = null;
         } else if (this.aOa % 10 == 0 && this.zA() < this.zE()) {
            this.aC(this.zA() + 1.0F);
         }
      }

      if (this.oF.nextInt(10) == 0) {
         float var1 = 32.0F;
         List var2 = this.vR.q(Bx.class, this.xE().C((double)var1, (double)var1, (double)var1));
         Bx var3 = null;
         double var4 = Double.MAX_VALUE;

         for(Bx var7 : var2) {
            double var8 = var7.B(this);
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }

         this.aWG = var3;
      }

   }

   public void hu() {
      if (this.vR.bXF) {
         float var1 = Pq.bi(this.aWR * 3.1415927F * 2.0F);
         float var2 = Pq.bi(this.aWI * 3.1415927F * 2.0F);
         if (var2 <= -0.3F && var1 >= -0.3F && !this.xP()) {
            this.vR.q(this.aNZ, this.aNK, this.aOt, p.q[1637 & -11447], 5.0F, 0.8F + this.oF.nextFloat() * 0.3F, false);
         }
      }

      this.aWI = this.aWR;
      if (this.zA() <= 0.0F) {
         float var27 = (this.oF.nextFloat() - 0.5F) * 8.0F;
         float var30 = (this.oF.nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.oF.nextFloat() - 0.5F) * 8.0F;
         this.vR.q(OP.bRl, this.aNZ + (double)var27, this.aNK + 2.0D + (double)var30, this.aOt + (double)var3, 0.0D, 0.0D, 0.0D);
      } else {
         this.BB();
         float var28 = 0.2F / (Pq.B(this.aOd * this.aOd + this.aOL * this.aOL) * 10.0F + 1.0F);
         var28 = var28 * (float)Math.pow(2.0D, this.aOO);
         if (this.aWU) {
            this.aWR += var28 * 0.5F;
         } else {
            this.aWR += var28;
         }

         this.aOn = Pq.bl(this.aOn);
         if (this.yV()) {
            this.aWR = 0.5F;
         } else {
            if (this.aWT < 0) {
               for(int var31 = 0; var31 < this.aWN.length; ++var31) {
                  this.aWN[var31][0] = (double)this.aOn;
                  this.aWN[var31][1] = this.aNK;
               }
            }

            if (++this.aWT == this.aWN.length) {
               this.aWT = 0;
            }

            this.aWN[this.aWT][0] = (double)this.aOn;
            this.aWN[this.aWT][1] = this.aNK;
            if (this.vR.bXF) {
               if (this.aPZ > 0) {
                  double var33 = this.aNZ + (this.aQJ - this.aNZ) / (double)this.aPZ;
                  double var38 = this.aNK + (this.aQq - this.aNK) / (double)this.aPZ;
                  double var40 = this.aOt + (this.aQV - this.aOt) / (double)this.aPZ;
                  double var42 = Pq.C(this.aQb - (double)this.aOn);
                  this.aOn = (float)((double)this.aOn + var42 / (double)this.aPZ);
                  this.aNN = (float)((double)this.aNN + (this.aQE - (double)this.aNN) / (double)this.aPZ);
                  --this.aPZ;
                  this.p(var33, var38, var40);
                  this.g(this.aOn, this.aNN);
               }
            } else {
               double var32 = this.aSx - this.aNZ;
               double var4 = this.aSu - this.aNK;
               double var6 = this.aSt - this.aOt;
               double var8 = var32 * var32 + var4 * var4 + var6 * var6;
               if (this.aMM != null) {
                  this.aSx = this.aMM.aNZ;
                  this.aSt = this.aMM.aOt;
                  double var10 = this.aSx - this.aNZ;
                  double var12 = this.aSt - this.aOt;
                  double var14 = Math.sqrt(var10 * var10 + var12 * var12);
                  double var16 = 0.4000000059604645D + var14 / 80.0D - 1.0D;
                  if (var16 > 10.0D) {
                     var16 = 10.0D;
                  }

                  this.aSu = this.aMM.xE().bNT + var16;
               } else {
                  this.aSx += this.oF.nextGaussian() * 2.0D;
                  this.aSt += this.oF.nextGaussian() * 2.0D;
               }

               if (this.aWP || var8 < 100.0D || var8 > 22500.0D || this.aNB || this.aOs) {
                  this.BA();
               }

               var4 = var4 / (double)Pq.B(var32 * var32 + var6 * var6);
               float var44 = 0.6F;
               var4 = Pq.J(var4, (double)(-var44), (double)var44);
               this.aOO += var4 * 0.10000000149011612D;
               this.aOn = Pq.bl(this.aOn);
               double var11 = 180.0D - Pq.u(var32, var6) * 180.0D / 3.141592653589793D;
               double var13 = Pq.C(var11 - (double)this.aOn);
               if (var13 > 50.0D) {
                  var13 = 50.0D;
               }

               if (var13 < -50.0D) {
                  var13 = -50.0D;
               }

               PX var15 = (new PX(this.aSx - this.aNZ, this.aSu - this.aNK, this.aSt - this.aOt)).XT();
               double var51 = (double)(-Pq.bi(this.aOn * 3.1415927F / 180.0F));
               PX var18 = (new PX((double)Pq.bk(this.aOn * 3.1415927F / 180.0F), this.aOO, var51)).XT();
               float var19 = ((float)var18.f(var15) + 0.5F) / 1.5F;
               if (var19 < 0.0F) {
                  var19 = 0.0F;
               }

               this.aQd *= 0.8F;
               float var20 = Pq.B(this.aOd * this.aOd + this.aOL * this.aOL) * 1.0F + 1.0F;
               double var21 = Math.sqrt(this.aOd * this.aOd + this.aOL * this.aOL) * 1.0D + 1.0D;
               if (var21 > 40.0D) {
                  var21 = 40.0D;
               }

               this.aQd = (float)((double)this.aQd + var13 * (0.699999988079071D / var21 / (double)var20));
               this.aOn += this.aQd * 0.1F;
               float var23 = (float)(2.0D / (var21 + 1.0D));
               float var24 = 0.06F;
               this.g(0.0F, -1.0F, var24 * (var19 * var23 + (1.0F - var23)));
               if (this.aWU) {
                  this.h(this.aOd * 0.800000011920929D, this.aOO * 0.800000011920929D, this.aOL * 0.800000011920929D);
               } else {
                  this.h(this.aOd, this.aOO, this.aOL);
               }

               PX var25 = (new PX(this.aOd, this.aOO, this.aOL)).XT();
               float var26 = ((float)var25.f(var18) + 1.0F) / 2.0F;
               var26 = 0.8F + 0.15F * var26;
               this.aOd *= (double)var26;
               this.aOL *= (double)var26;
               this.aOO *= 0.9100000262260437D;
            }

            this.aQB = this.aOn;
            this.aWK.gK = this.aWK.gJ = 3.0F;
            this.aWF.gK = this.aWF.gJ = 2.0F;
            this.aWM.gK = this.aWM.gJ = 2.0F;
            this.aWJ.gK = this.aWJ.gJ = 2.0F;
            this.aWH.gJ = 3.0F;
            this.aWH.gK = 5.0F;
            this.aWS.gJ = 2.0F;
            this.aWS.gK = 4.0F;
            this.aWO.gJ = 3.0F;
            this.aWO.gK = 4.0F;
            float var34 = (float)(this.u(5, 1.0F)[1] - this.u(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
            float var35 = Pq.bi(var34);
            float var39 = -Pq.bk(var34);
            float var5 = this.aOn * 3.1415927F / 180.0F;
            float var41 = Pq.bk(var5);
            float var7 = Pq.bi(var5);
            this.aWH.hv();
            this.aWH.q(this.aNZ + (double)(var41 * 0.5F), this.aNK, this.aOt - (double)(var7 * 0.5F), 0.0F, 0.0F);
            this.aWS.hv();
            this.aWS.q(this.aNZ + (double)(var7 * 4.5F), this.aNK + 2.0D, this.aOt + (double)(var41 * 4.5F), 0.0F, 0.0F);
            this.aWO.hv();
            this.aWO.q(this.aNZ - (double)(var7 * 4.5F), this.aNK + 2.0D, this.aOt - (double)(var41 * 4.5F), 0.0F, 0.0F);
            if (!this.vR.bXF && this.aQf == 0) {
               this.j(this.vR.w(this, this.aWS.xE().C(4.0D, 2.0D, 4.0D).D(0.0D, -2.0D, 0.0D)));
               this.j(this.vR.w(this, this.aWO.xE().C(4.0D, 2.0D, 4.0D).D(0.0D, -2.0D, 0.0D)));
               this.h(this.vR.w(this, this.aWK.xE().C(1.0D, 1.0D, 1.0D)));
            }

            double[] var43 = this.u(5, 1.0F);
            double[] var9 = this.u(0, 1.0F);
            float var45 = Pq.bk(this.aOn * 3.1415927F / 180.0F - this.aQd * 0.01F);
            float var46 = Pq.bi(this.aOn * 3.1415927F / 180.0F - this.aQd * 0.01F);
            this.aWK.hv();
            this.aWK.q(this.aNZ + (double)(var45 * 5.5F * var35), this.aNK + (var9[1] - var43[1]) * 1.0D + (double)(var39 * 5.5F), this.aOt - (double)(var46 * 5.5F * var35), 0.0F, 0.0F);

            for(int var47 = 0; var47 < 3; ++var47) {
               Bp var48 = null;
               if (var47 == 0) {
                  var48 = this.aWF;
               }

               if (var47 == 1) {
                  var48 = this.aWM;
               }

               if (var47 == 2) {
                  var48 = this.aWJ;
               }

               double[] var49 = this.u(12 + var47 * 2, 1.0F);
               float var50 = this.aOn * 3.1415927F / 180.0F + this.j(var49[0] - var43[0]) * 3.1415927F / 180.0F * 1.0F;
               float var52 = Pq.bk(var50);
               float var17 = Pq.bi(var50);
               float var53 = 1.5F;
               float var54 = (float)(var47 + 1) * 2.0F;
               var48.hv();
               var48.q(this.aNZ - (double)((var41 * var53 + var52 * var54) * var35), this.aNK + (var49[1] - var43[1]) * 1.0D - (double)((var54 + var53) * var39) + 1.5D, this.aOt + (double)((var7 * var53 + var17 * var54) * var35), 0.0F, 0.0F);
            }

            if (!this.vR.bXF) {
               this.aWU = this.t(this.aWK.xE()) | this.t(this.aWH.xE());
            }
         }
      }

   }

   protected void Af() {
      ++this.aWL;
      if (this.aWL >= 180 && this.aWL <= 200) {
         float var1 = (this.oF.nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.oF.nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.oF.nextFloat() - 0.5F) * 8.0F;
         this.vR.q(OP.bRm, this.aNZ + (double)var1, this.aNK + 2.0D + (double)var2, this.aOt + (double)var3, 0.0D, 0.0D, 0.0D);
      }

      boolean var4 = this.vR.vU().bL(r.q[19373 & -31763]);
      if (!this.vR.bXF) {
         if (this.aWL > 150 && this.aWL % 5 == 0 && var4) {
            int var5 = 1000;

            while(var5 > 0) {
               int var7 = BR.eu(var5);
               var5 -= var7;
               this.vR.p(new BR(this.vR, this.aNZ, this.aNK, this.aOt, var7));
            }
         }

         if (this.aWL == 1) {
            this.vR.r(1018, new NW(this), 0);
         }
      }

      this.h(0.0D, 0.10000000149011612D, 0.0D);
      this.aQB = this.aOn += 20.0F;
      if (this.aWL == 200 && !this.vR.bXF) {
         if (var4) {
            int var6 = 2000;

            while(var6 > 0) {
               int var8 = BR.eu(var6);
               var6 -= var8;
               this.vR.p(new BR(this.vR, this.aNZ, this.aNK, this.aOt, var8));
            }
         }

         this.K(new NW(this.aNZ, 64.0D, this.aOt));
         this.yo();
      }

   }

   public QI dV() {
      return this.vR;
   }

   private void j(List var1) {
      double var2 = (this.aWH.xE().bNW + this.aWH.xE().bNU) / 2.0D;
      double var4 = (this.aWH.xE().bNY + this.aWH.xE().bNV) / 2.0D;

      for(zk var7 : var1) {
         if (var7 instanceof zz) {
            double var8 = var7.aNZ - var2;
            double var10 = var7.aOt - var4;
            double var12 = var8 * var8 + var10 * var10;
            var7.z(var8 / var12 * 4.0D, 0.20000000298023224D, var10 / var12 * 4.0D);
         }
      }

   }

   protected boolean t(Oz var1, float var2) {
      return super.q(var1, var2);
   }

   public Bo(QI var1) {
      super(var1);
      this.aWQ = new Bp[]{this.aWK = new Bp(this, q.q[-28417 & 895], 6.0F, 6.0F), this.aWH = new Bp(this, r.q[10862 & 16982], 8.0F, 8.0F), this.aWF = new Bp(this, p.q[14912 & -32146], 4.0F, 4.0F), this.aWM = new Bp(this, p.q[8770 & -14780], 4.0F, 4.0F), this.aWJ = new Bp(this, p.q[704 & -29088], 4.0F, 4.0F), this.aWS = new Bp(this, p.q[-32371 & 13711], 4.0F, 4.0F), this.aWO = new Bp(this, p.q[10749 & 1423], 4.0F, 4.0F)};
      this.aC(this.zE());
      this.d(16.0F, 8.0F);
      this.aOm = true;
      this.aOI = true;
      this.aSu = 100.0D;
      this.aOw = true;
   }

   protected String zv() {
      return p.q[20167 & -32189];
   }

   protected void zj() {
   }

   public boolean q(Bp var1, Oz var2, float var3) {
      if (var1 != this.aWK) {
         var3 = var3 / 4.0F + 1.0F;
      }

      float var4 = this.aOn * 3.1415927F / 180.0F;
      float var5 = Pq.bk(var4);
      float var6 = Pq.bi(var4);
      this.aSx = this.aNZ + (double)(var5 * 5.0F) + (double)((this.oF.nextFloat() - 0.5F) * 2.0F);
      this.aSu = this.aNK + (double)(this.oF.nextFloat() * 3.0F) + 1.0D;
      this.aSt = this.aOt - (double)(var6 * 5.0F) + (double)((this.oF.nextFloat() - 0.5F) * 2.0F);
      this.aMM = null;
      if (var2.Wv() instanceof DD || var2.Ws()) {
         this.t(var2, var3);
      }

      return true;
   }

   protected void yJ() {
      super.yJ();
      this.q(zR.aSa).h(200.0D);
   }

   protected String zp() {
      return p.q[-30910 & 21098];
   }
}

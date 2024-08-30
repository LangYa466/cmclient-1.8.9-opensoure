import java.util.List;

public class Bw extends zk {
   private double aXz;
   private double aXA;
   private double aXB;
   private int aXC;
   private double aXD;
   private boolean aXE;
   private double aXF;
   private double aXG;
   private double aXH;
   private double aXI;
   private double aXJ;

   public int BU() {
      return this.aNw.du(18);
   }

   public void xp() {
      this.ej(-this.BU());
      this.ek(10);
      this.aF(this.BV() * 11.0F);
   }

   protected void mC() {
      this.aNw.w(17, new Integer(0));
      this.aNw.w(18, new Integer(1));
      this.aNw.w(19, new Float(0.0F));
   }

   public void q(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      if (var10 && this.aND != null) {
         this.aOf = this.aNZ = var1;
         this.aNH = this.aNK = var3;
         this.aNW = this.aOt = var5;
         this.aOn = var7;
         this.aNN = var8;
         this.aXC = 0;
         this.p(var1, var3, var5);
         this.aOd = this.aXA = 0.0D;
         this.aOO = this.aXG = 0.0D;
         this.aOL = this.aXH = 0.0D;
      } else {
         if (this.aXE) {
            this.aXC = var9 + 5;
         } else {
            double var11 = var1 - this.aNZ;
            double var13 = var3 - this.aNK;
            double var15 = var5 - this.aOt;
            double var17 = var11 * var11 + var13 * var13 + var15 * var15;
            if (var17 <= 1.0D) {
               return;
            }

            this.aXC = 3;
         }

         this.aXJ = var1;
         this.aXB = var3;
         this.aXF = var5;
         this.aXD = (double)var7;
         this.aXz = (double)var8;
         this.aOd = this.aXA;
         this.aOO = this.aXG;
         this.aOL = this.aXH;
      }

   }

   public void aF(float var1) {
      this.aNw.e(19, Float.valueOf(var1));
   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else if (!this.vR.bXF && !this.aNQ) {
         if (this.aND != null && this.aND == var1.Wv() && var1 instanceof OC) {
            return false;
         } else {
            this.ej(-this.BU());
            this.ek(10);
            this.aF(this.BV() + var2 * 10.0F);
            this.xo();
            boolean var3 = var1.Wv() instanceof DD && ((DD)var1.Wv()).bdO.bfz;
            if (var3 || this.BV() > 40.0F) {
               if (this.aND != null) {
                  this.aND.u(this);
               }

               if (!var3 && this.vR.vU().bL(w.q[1199 & -10003])) {
                  this.q(Et.bmc, 1, 0.0F);
               }

               this.yo();
            }

            return true;
         }
      } else {
         return true;
      }
   }

   protected void r(HL var1) {
   }

   public float BV() {
      return this.aNw.dx(19);
   }

   public NV mI() {
      return this.xE();
   }

   public Bw(QI var1, double var2, double var4, double var6) {
      this(var1);
      this.p(var2, var4, var6);
      this.aOd = 0.0D;
      this.aOO = 0.0D;
      this.aOL = 0.0D;
      this.aOf = var2;
      this.aNH = var4;
      this.aNW = var6;
   }

   public boolean y(DD var1) {
      if (this.aND != null && this.aND instanceof DD && this.aND != var1) {
         return true;
      } else {
         if (!this.vR.bXF) {
            var1.u(this);
         }

         return true;
      }
   }

   public void ej(int var1) {
      this.aNw.e(18, Integer.valueOf(var1));
   }

   protected boolean mG() {
      return false;
   }

   public double xX() {
      return -0.3D;
   }

   public void ek(int var1) {
      this.aNw.e(17, Integer.valueOf(var1));
   }

   public void hv() {
      super.hv();
      if (this.BW() > 0) {
         this.ek(this.BW() - 1);
      }

      if (this.BV() > 0.0F) {
         this.aF(this.BV() - 1.0F);
      }

      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      byte var1 = 5;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.xE().bNT + (this.xE().bNX - this.xE().bNT) * (double)(var4 + 0) / (double)var1 - 0.125D;
         double var7 = this.xE().bNT + (this.xE().bNX - this.xE().bNT) * (double)(var4 + 1) / (double)var1 - 0.125D;
         NV var9 = new NV(this.xE().bNW, var5, this.xE().bNY, this.xE().bNU, var7, this.xE().bNV);
         if (this.vR.w(var9, hn.zS)) {
            var2 += 1.0D / (double)var1;
         }
      }

      double var19 = Math.sqrt(this.aOd * this.aOd + this.aOL * this.aOL);
      if (var19 > 0.2975D) {
         double var6 = Math.cos((double)this.aOn * 3.141592653589793D / 180.0D);
         double var8 = Math.sin((double)this.aOn * 3.141592653589793D / 180.0D);

         for(int var10 = 0; (double)var10 < 1.0D + var19 * 60.0D; ++var10) {
            double var11 = (double)(this.oF.nextFloat() * 2.0F - 1.0F);
            double var13 = (double)(this.oF.nextInt(2) * 2 - 1) * 0.7D;
            if (this.oF.nextBoolean()) {
               double var15 = this.aNZ - var6 * var11 * 0.8D + var8 * var13;
               double var17 = this.aOt - var8 * var11 * 0.8D - var6 * var13;
               this.vR.q(OP.bRp, var15, this.aNK - 0.125D, var17, this.aOd, this.aOO, this.aOL);
            } else {
               double var43 = this.aNZ + var6 + var8 * var11 * 0.7D;
               double var44 = this.aOt + var8 - var6 * var11 * 0.7D;
               this.vR.q(OP.bRp, var43, this.aNK - 0.125D, var44, this.aOd, this.aOO, this.aOL);
            }
         }
      }

      if (this.vR.bXF && this.aXE) {
         if (this.aXC > 0) {
            double var23 = this.aNZ + (this.aXJ - this.aNZ) / (double)this.aXC;
            double var31 = this.aNK + (this.aXB - this.aNK) / (double)this.aXC;
            double var36 = this.aOt + (this.aXF - this.aOt) / (double)this.aXC;
            double var40 = Pq.C(this.aXD - (double)this.aOn);
            this.aOn = (float)((double)this.aOn + var40 / (double)this.aXC);
            this.aNN = (float)((double)this.aNN + (this.aXz - (double)this.aNN) / (double)this.aXC);
            --this.aXC;
            this.p(var23, var31, var36);
            this.g(this.aOn, this.aNN);
         } else {
            double var24 = this.aNZ + this.aOd;
            double var32 = this.aNK + this.aOO;
            double var37 = this.aOt + this.aOL;
            this.p(var24, var32, var37);
            if (this.aNG) {
               this.aOd *= 0.5D;
               this.aOO *= 0.5D;
               this.aOL *= 0.5D;
            }

            this.aOd *= 0.9900000095367432D;
            this.aOO *= 0.949999988079071D;
            this.aOL *= 0.9900000095367432D;
         }
      } else {
         if (var2 < 1.0D) {
            double var20 = var2 * 2.0D - 1.0D;
            this.aOO += 0.03999999910593033D * var20;
         } else {
            if (this.aOO < 0.0D) {
               this.aOO /= 2.0D;
            }

            this.aOO += 0.007000000216066837D;
         }

         if (this.aND instanceof zz) {
            zz var21 = (zz)this.aND;
            float var25 = this.aND.aOn + -var21.aQD * 90.0F;
            this.aOd += -Math.sin((double)(var25 * 3.1415927F / 180.0F)) * this.aXI * (double)var21.aPW * 0.05000000074505806D;
            this.aOL += Math.cos((double)(var25 * 3.1415927F / 180.0F)) * this.aXI * (double)var21.aPW * 0.05000000074505806D;
         }

         double var22 = Math.sqrt(this.aOd * this.aOd + this.aOL * this.aOL);
         if (var22 > 0.35D) {
            double var26 = 0.35D / var22;
            this.aOd *= var26;
            this.aOL *= var26;
            var22 = 0.35D;
         }

         if (var22 > var19 && this.aXI < 0.35D) {
            this.aXI += (0.35D - this.aXI) / 35.0D;
            if (this.aXI > 0.35D) {
               this.aXI = 0.35D;
            }
         } else {
            this.aXI -= (this.aXI - 0.07D) / 35.0D;
            if (this.aXI < 0.07D) {
               this.aXI = 0.07D;
            }
         }

         for(int var27 = 0; var27 < 4; ++var27) {
            int var33 = Pq.D(this.aNZ + ((double)(var27 % 2) - 0.5D) * 0.8D);
            int var34 = Pq.D(this.aOt + ((double)(var27 / 2) - 0.5D) * 0.8D);

            for(int var38 = 0; var38 < 2; ++var38) {
               int var12 = Pq.D(this.aNK) + var38;
               NW var41 = new NW(var33, var12, var34);
               cv var14 = this.vR.g(var41).ds();
               if (var14 == Ea.bhe) {
                  this.vR.am(var41);
                  this.aNB = false;
               } else if (var14 == Ea.bhy) {
                  this.vR.y(var41, true);
                  this.aNB = false;
               }
            }
         }

         if (this.aNG) {
            this.aOd *= 0.5D;
            this.aOO *= 0.5D;
            this.aOL *= 0.5D;
         }

         this.h(this.aOd, this.aOO, this.aOL);
         if (this.aNB && var19 > 0.2975D) {
            if (!this.vR.bXF && !this.aNQ) {
               this.yo();
               if (this.vR.vU().bL(w.q[189 & 16815])) {
                  for(int var28 = 0; var28 < 3; ++var28) {
                     this.q(Fm.C(Ea.bko), 1, 0.0F);
                  }

                  for(int var29 = 0; var29 < 2; ++var29) {
                     this.q(Et.bod, 1, 0.0F);
                  }
               }
            }
         } else {
            this.aOd *= 0.9900000095367432D;
            this.aOO *= 0.949999988079071D;
            this.aOL *= 0.9900000095367432D;
         }

         this.aNN = 0.0F;
         double var30 = (double)this.aOn;
         double var35 = this.aOf - this.aNZ;
         double var39 = this.aNW - this.aOt;
         if (var35 * var35 + var39 * var39 > 0.001D) {
            var30 = (double)((float)(Pq.u(var39, var35) * 180.0D / 3.141592653589793D));
         }

         double var42 = Pq.C(var30 - (double)this.aOn);
         if (var42 > 20.0D) {
            var42 = 20.0D;
         }

         if (var42 < -20.0D) {
            var42 = -20.0D;
         }

         this.aOn = (float)((double)this.aOn + var42);
         this.g(this.aOn, this.aNN);
         if (!this.vR.bXF) {
            List var16 = this.vR.w(this, this.xE().C(0.20000000298023224D, 0.0D, 0.20000000298023224D));
            if (var16 != null && !var16.isEmpty()) {
               for(int var45 = 0; var45 < var16.size(); ++var45) {
                  zk var18 = (zk)var16.get(var45);
                  if (var18 != this.aND && var18.mJ() && var18 instanceof Bw) {
                     var18.x(this);
                  }
               }
            }

            if (this.aND != null && this.aND.aNQ) {
               this.aND = null;
            }
         }
      }

   }

   public boolean mJ() {
      return true;
   }

   public void aw(boolean var1) {
      this.aXE = var1;
   }

   public int BW() {
      return this.aNw.du(17);
   }

   public void xr() {
      if (this.aND != null) {
         double var1 = Math.cos((double)this.aOn * 3.141592653589793D / 180.0D) * 0.4D;
         double var3 = Math.sin((double)this.aOn * 3.141592653589793D / 180.0D) * 0.4D;
         this.aND.p(this.aNZ + var1, this.aNK + this.xX() + this.aND.pP(), this.aOt + var3);
      }

   }

   public boolean xl() {
      return !this.aNQ;
   }

   protected void q(double var1, boolean var3, cv var4, NW var5) {
      if (var3) {
         if (this.aNI > 3.0F) {
            this.f(this.aNI, 1.0F);
            if (!this.vR.bXF && !this.aNQ) {
               this.yo();
               if (this.vR.vU().bL(w.q[22207 & -32595])) {
                  for(int var6 = 0; var6 < 3; ++var6) {
                     this.q(Fm.C(Ea.bko), 1, 0.0F);
                  }

                  for(int var7 = 0; var7 < 2; ++var7) {
                     this.q(Et.bod, 1, 0.0F);
                  }
               }
            }

            this.aNI = 0.0F;
         }
      } else if (this.vR.g((new NW(this)).Vj()).ds().cB() != hn.zS && var1 < 0.0D) {
         this.aNI = (float)((double)this.aNI - var1);
      }

   }

   public Bw(QI var1) {
      super(var1);
      this.aXE = true;
      this.aXI = 0.07D;
      this.aOM = true;
      this.d(1.5F, 0.6F);
   }

   public void k(double var1, double var3, double var5) {
      this.aXA = this.aOd = var1;
      this.aXG = this.aOO = var3;
      this.aXH = this.aOL = var5;
   }

   public NV A(zk var1) {
      return var1.xE();
   }

   protected void t(HL var1) {
   }
}

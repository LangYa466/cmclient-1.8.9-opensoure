import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;

public class Bq extends Cs implements Bs, zP {
   private int aWX;
   private static final Predicate aWY = new Br();
   private int[] aWZ = new int[2];
   private float[] aXa = new float[2];
   private float[] aXb = new float[2];
   private float[] aXc = new float[2];
   private float[] aXd = new float[2];
   private int[] aXe = new int[2];

   public void u(zk var1) {
      this.aNP = null;
   }

   public void xJ() {
   }

   private double ec(int var1) {
      return var1 <= 0 ? this.aNK + 3.0D : this.aNK + 2.2D;
   }

   public void aq(int var1, int var2) {
      this.aNw.e(17 + var1, Integer.valueOf(var2));
   }

   public static boolean v(cv var0) {
      return var0 != Ea.bha && var0 != Ea.bhw && var0 != Ea.bkD && var0 != Ea.bhJ && var0 != Ea.bim;
   }

   private float l(float var1, float var2, float var3) {
      float var4 = Pq.bl(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public float ed(int var1) {
      return this.aXc[var1];
   }

   public int zx() {
      return 4;
   }

   protected String zp() {
      return u.q[4429 & 16833];
   }

   public float ee(int var1) {
      return this.aXa[var1];
   }

   protected void yR() {
      if (this.BE() > 0) {
         int var1 = this.BE() - 1;
         if (var1 <= 0) {
            this.vR.q(this, this.aNZ, this.aNK + (double)this.xC(), this.aOt, 7.0F, false, this.vR.vU().bL(w.q[981 & 1937]));
            this.vR.r(1013, new NW(this), 0);
         }

         this.ei(var1);
         if (this.aOa % 10 == 0) {
            this.z(10.0F);
         }
      } else {
         super.yR();

         for(int var13 = 1; var13 < 3; ++var13) {
            if (this.aOa >= this.aXe[var13 - 1]) {
               this.aXe[var13 - 1] = this.aOa + 10 + this.oF.nextInt(10);
               if (this.vR.Kq() == Qr.bWg || this.vR.Kq() == Qr.bWh) {
                  int var2 = var13 - 1;
                  int var3 = this.aWZ[var13 - 1];
                  this.aWZ[var2] = this.aWZ[var13 - 1] + 1;
                  if (var3 > 15) {
                     float var4 = 10.0F;
                     float var5 = 5.0F;
                     double var6 = Pq.q(this.oF, this.aNZ - (double)var4, this.aNZ + (double)var4);
                     double var8 = Pq.q(this.oF, this.aNK - (double)var5, this.aNK + (double)var5);
                     double var10 = Pq.q(this.oF, this.aOt - (double)var4, this.aOt + (double)var4);
                     this.q(var13 + 1, var6, var8, var10, true);
                     this.aWZ[var13 - 1] = 0;
                  }
               }

               int var15 = this.ef(var13);
               if (var15 > 0) {
                  zk var18 = this.vR.bv(var15);
                  if (var18 != null && var18.xV() && this.B(var18) <= 900.0D && this.J(var18)) {
                     if (var18 instanceof DD && ((DD)var18).bdO.bfx) {
                        this.aq(var13, 0);
                     } else {
                        this.q(var13 + 1, (zz)var18);
                        this.aXe[var13 - 1] = this.aOa + 40 + this.oF.nextInt(20);
                        this.aWZ[var13 - 1] = 0;
                     }
                  } else {
                     this.aq(var13, 0);
                  }
               } else {
                  List var17 = this.vR.q(zz.class, this.xE().C(20.0D, 8.0D, 20.0D), Predicates.and(aWY, OD.bPV));

                  for(int var20 = 0; var20 < 10 && !var17.isEmpty(); ++var20) {
                     zz var22 = (zz)var17.get(this.oF.nextInt(var17.size()));
                     if (var22 != this && var22.xV() && this.J(var22)) {
                        if (var22 instanceof DD) {
                           if (!((DD)var22).bdO.bfx) {
                              this.aq(var13, var22.yi());
                           }
                        } else {
                           this.aq(var13, var22.yi());
                        }
                        break;
                     }

                     var17.remove(var22);
                  }
               }
            }
         }

         if (this.zc() != null) {
            this.aq(0, this.zc().yi());
         } else {
            this.aq(0, 0);
         }

         if (this.aWX > 0) {
            --this.aWX;
            if (this.aWX == 0 && this.vR.vU().bL(w.q[22421 & -23591])) {
               int var14 = Pq.D(this.aNK);
               int var16 = Pq.D(this.aNZ);
               int var19 = Pq.D(this.aOt);
               boolean var21 = false;

               for(int var23 = -1; var23 <= 1; ++var23) {
                  for(int var24 = -1; var24 <= 1; ++var24) {
                     for(int var7 = 0; var7 <= 3; ++var7) {
                        int var25 = var16 + var23;
                        int var9 = var14 + var7;
                        int var26 = var19 + var24;
                        NW var11 = new NW(var25, var9, var26);
                        cv var12 = this.vR.g(var11).ds();
                        if (var12.cB() != hn.zp && v(var12)) {
                           var21 = this.vR.y(var11, true) || var21;
                        }
                     }
                  }
               }

               if (var21) {
                  this.vR.w((DD)null, 1012, new NW(this), 0);
               }
            }
         }

         if (this.aOa % 20 == 0) {
            this.z(1.0F);
         }
      }

   }

   public void y(zz var1, float var2) {
      this.q(0, var1);
   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else if (var1 != Oz.bPH && !(var1.Wv() instanceof Bq)) {
         if (this.BE() > 0 && var1 != Oz.bPA) {
            return false;
         } else {
            if (this.BD()) {
               zk var3 = var1.Wj();
               if (var3 instanceof DM) {
                  return false;
               }
            }

            zk var5 = var1.Wv();
            if (var5 != null && !(var5 instanceof DD) && var5 instanceof zz && ((zz)var5).zM() == this.zM()) {
               return false;
            } else {
               if (this.aWX <= 0) {
                  this.aWX = 20;
               }

               for(int var4 = 0; var4 < this.aWZ.length; ++var4) {
                  this.aWZ[var4] += 3;
               }

               return super.q(var1, var2);
            }
         }
      } else {
         return false;
      }
   }

   public int I(float var1) {
      return 15728880;
   }

   public int ef(int var1) {
      return this.aNw.du(17 + var1);
   }

   protected String zC() {
      return u.q[4931 & 19799];
   }

   protected void zj() {
      this.aQw = 0;
   }

   protected void yJ() {
      super.yJ();
      this.q(zR.aSa).h(300.0D);
      this.q(zR.aSd).h(0.6000000238418579D);
      this.q(zR.aSe).h(40.0D);
   }

   public zH zM() {
      return zH.aRJ;
   }

   private void q(int var1, double var2, double var4, double var6, boolean var8) {
      this.vR.w((DD)null, 1014, new NW(this), 0);
      double var9 = this.eg(var1);
      double var11 = this.ec(var1);
      double var13 = this.eh(var1);
      double var15 = var2 - var9;
      double var17 = var4 - var11;
      double var19 = var6 - var13;
      DV var21 = new DV(this.vR, this, var15, var17, var19);
      if (var8) {
         var21.bo(true);
      }

      var21.aNK = var11;
      var21.aNZ = var9;
      var21.aOt = var13;
      this.vR.p(var21);
   }

   protected void mC() {
      super.mC();
      this.aNw.w(17, new Integer(0));
      this.aNw.w(18, new Integer(0));
      this.aNw.w(19, new Integer(0));
      this.aNw.w(20, new Integer(0));
   }

   public Bq(QI var1) {
      super(var1);
      this.aC(this.zE());
      this.d(0.9F, 3.5F);
      this.aOI = true;
      ((LD)this.yM()).bx(true);
      this.aPR.q(0, new AM(this));
      this.aPR.q(2, new zS(this, 1.0D, 40, 20.0F));
      this.aPR.q(5, new AV(this, 1.0D));
      this.aPR.q(6, new AW(this, DD.class, 8.0F));
      this.aPR.q(7, new Ar(this));
      this.aPM.q(1, new An(this, false, new Class[0]));
      this.aPM.q(2, new Ay(this, zx.class, 0, false, false, aWY));
      this.aPJ = 50;
   }

   private void q(int var1, zz var2) {
      this.q(var1, var2.aNZ, var2.aNK + (double)var2.xC() * 0.5D, var2.aOt, var1 == 0 && this.oF.nextFloat() < 0.001F);
   }

   private double eg(int var1) {
      if (var1 <= 0) {
         return this.aNZ;
      } else {
         float var2 = (this.aQB + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = Pq.bi(var2);
         return this.aNZ + (double)var3 * 1.3D;
      }
   }

   public void f(float var1, float var2) {
   }

   public void BC() {
      this.ei(220);
      this.aC(this.zE() / 3.0F);
   }

   private double eh(int var1) {
      if (var1 <= 0) {
         return this.aOt;
      } else {
         float var2 = (this.aQB + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = Pq.bk(var2);
         return this.aOt + (double)var3 * 1.3D;
      }
   }

   public void ei(int var1) {
      this.aNw.e(20, Integer.valueOf(var1));
   }

   public void hu() {
      this.aOO *= 0.6000000238418579D;
      if (!this.vR.bXF && this.ef(0) > 0) {
         zk var1 = this.vR.bv(this.ef(0));
         if (var1 != null) {
            if (this.aNK < var1.aNK || !this.BD() && this.aNK < var1.aNK + 5.0D) {
               if (this.aOO < 0.0D) {
                  this.aOO = 0.0D;
               }

               this.aOO += (0.5D - this.aOO) * 0.6000000238418579D;
            }

            double var2 = var1.aNZ - this.aNZ;
            double var4 = var1.aOt - this.aOt;
            double var6 = var2 * var2 + var4 * var4;
            if (var6 > 9.0D) {
               double var8 = (double)Pq.B(var6);
               this.aOd += (var2 / var8 * 0.5D - this.aOd) * 0.6000000238418579D;
               this.aOL += (var4 / var8 * 0.5D - this.aOL) * 0.6000000238418579D;
            }
         }
      }

      if (this.aOd * this.aOd + this.aOL * this.aOL > 0.05000000074505806D) {
         this.aOn = (float)Pq.u(this.aOL, this.aOd) * 57.295776F - 90.0F;
      }

      super.hu();

      for(int var20 = 0; var20 < 2; ++var20) {
         this.aXd[var20] = this.aXc[var20];
         this.aXb[var20] = this.aXa[var20];
      }

      for(int var21 = 0; var21 < 2; ++var21) {
         int var23 = this.ef(var21 + 1);
         zk var3 = null;
         if (var23 > 0) {
            var3 = this.vR.bv(var23);
         }

         if (var3 != null) {
            double var27 = this.eg(var21 + 1);
            double var28 = this.ec(var21 + 1);
            double var29 = this.eh(var21 + 1);
            double var10 = var3.aNZ - var27;
            double var12 = var3.aNK + (double)var3.xC() - var28;
            double var14 = var3.aOt - var29;
            double var16 = (double)Pq.B(var10 * var10 + var14 * var14);
            float var18 = (float)(Pq.u(var14, var10) * 180.0D / 3.141592653589793D) - 90.0F;
            float var19 = (float)(-(Pq.u(var12, var16) * 180.0D / 3.141592653589793D));
            this.aXa[var21] = this.l(this.aXa[var21], var19, 40.0F);
            this.aXc[var21] = this.l(this.aXc[var21], var18, 10.0F);
         } else {
            this.aXc[var21] = this.l(this.aXc[var21], this.aQB, 10.0F);
         }
      }

      boolean var22 = this.BD();

      for(int var24 = 0; var24 < 3; ++var24) {
         double var26 = this.eg(var24);
         double var5 = this.ec(var24);
         double var7 = this.eh(var24);
         this.vR.q(OP.bRv, var26 + this.oF.nextGaussian() * 0.30000001192092896D, var5 + this.oF.nextGaussian() * 0.30000001192092896D, var7 + this.oF.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
         if (var22 && this.vR.bXs.nextInt(4) == 0) {
            this.vR.q(OP.bRz, var26 + this.oF.nextGaussian() * 0.30000001192092896D, var5 + this.oF.nextGaussian() * 0.30000001192092896D, var7 + this.oF.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
         }
      }

      if (this.BE() > 0) {
         for(int var25 = 0; var25 < 3; ++var25) {
            this.vR.q(OP.bRz, this.aNZ + this.oF.nextGaussian() * 1.0D, this.aNK + (double)(this.oF.nextFloat() * 3.3F), this.aOt + this.oF.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
         }
      }

   }

   protected void r(boolean var1, int var2) {
      BD var3 = this.r(Et.blx, 1);
      if (var3 != null) {
         var3.Cg();
      }

      if (!this.vR.bXF) {
         for(DD var5 : this.vR.q(DD.class, this.xE().C(50.0D, 100.0D, 50.0D))) {
            var5.w(MX.bJB);
         }
      }

   }

   protected String zv() {
      return u.q[-31781 & 4454];
   }

   public boolean BD() {
      return this.zA() <= this.zE() / 2.0F;
   }

   public void t(HL var1) {
      super.t(var1);
      var1.a(u.q[18243 & 352], this.BE());
   }

   public void e(LJ var1) {
   }

   public int BE() {
      return this.aNw.du(20);
   }

   public void r(HL var1) {
      super.r(var1);
      this.ei(var1.bQ(u.q[964 & -22190]));
   }
}

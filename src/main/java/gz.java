import java.util.Random;

public class gZ extends cv {
   public static final hu[] xZ;
   public static final hu ya = hu.x(q.q[178 & 16912]);
   public static final hu yb = hu.x(q.q[-12967 & 862]);
   public static final hu yc = hu.x(q.q[1375 & 18775]);
   public static final hu yd = hu.x(q.q[341 & 25431]);
   public static final hu ye = hu.x(q.q[-28170 & 351]);

   public boolean cw() {
      return false;
   }

   public hI q(QI var1, NW var2, OK var3, float var4, float var5, float var6, int var7, zz var8) {
      hI var9 = this.cx().q(ya, Boolean.valueOf(false)).q(yd, Boolean.valueOf(false)).q(yc, Boolean.valueOf(false)).q(ye, Boolean.valueOf(false)).q(yb, Boolean.valueOf(false));
      return var3.WT().WW() ? var9.q(r(var3.WK()), Boolean.valueOf(true)) : var9;
   }

   public int q(Random var1) {
      return 0;
   }

   public int e(hI var1) {
      int var2 = 0;
      if (((Boolean)var1.w(ye)).booleanValue()) {
         var2 |= 1;
      }

      if (((Boolean)var1.w(yb)).booleanValue()) {
         var2 |= 2;
      }

      if (((Boolean)var1.w(yd)).booleanValue()) {
         var2 |= 4;
      }

      if (((Boolean)var1.w(yc)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public boolean u(QI var1, NW var2) {
      return true;
   }

   public hI J(int var1) {
      return this.cx().q(ye, Boolean.valueOf((var1 & 1) > 0)).q(yb, Boolean.valueOf((var1 & 2) > 0)).q(yd, Boolean.valueOf((var1 & 4) > 0)).q(yc, Boolean.valueOf((var1 & 8) > 0));
   }

   public int t(hI var1) {
      return Qo.YY();
   }

   public hI q(hI var1, Qx var2, NW var3) {
      return var1.q(ya, Boolean.valueOf(var2.g(var3.Vi()).ds().cl()));
   }

   public int cL() {
      return Qo.YY();
   }

   public static int m(hI var0) {
      int var1 = 0;

      for(hu var5 : xZ) {
         if (((Boolean)var0.w(var5)).booleanValue()) {
            ++var1;
         }
      }

      return var1;
   }

   static {
      xZ = new hu[]{ya, yd, ye, yb, yc};
   }

   public void e(QI var1, NW var2, hI var3, Random var4) {
      if (!var1.bXF && var1.bXs.nextInt(4) == 0) {
         byte var5 = 4;
         int var6 = 5;
         boolean var7 = false;

         label184:
         for(int var8 = -var5; var8 <= var5; ++var8) {
            for(int var9 = -var5; var9 <= var5; ++var9) {
               for(int var10 = -1; var10 <= 1; ++var10) {
                  if (var1.g(var2.C(var8, var10, var9)).ds() == this) {
                     --var6;
                     if (var6 <= 0) {
                        var7 = true;
                        break label184;
                     }
                  }
               }
            }
         }

         OK var18 = OK.u(var4);
         NW var19 = var2.Vi();
         if (var18 == OK.bQC && var2.aX() < 255 && var1.aj(var19)) {
            if (!var7) {
               hI var22 = var3;

               for(OK var26 : OO.bRh) {
                  if (var4.nextBoolean() || !this.g(var1.g(var19.v(var26)).ds())) {
                     var22 = var22.q(r(var26), Boolean.valueOf(false));
                  }
               }

               if (((Boolean)var22.w(yd)).booleanValue() || ((Boolean)var22.w(yc)).booleanValue() || ((Boolean)var22.w(ye)).booleanValue() || ((Boolean)var22.w(yb)).booleanValue()) {
                  var1.q(var19, var22, 2);
               }
            }
         } else if (var18.WT().WW() && !((Boolean)var3.w(r(var18))).booleanValue()) {
            if (!var7) {
               NW var21 = var2.v(var18);
               cv var23 = var1.g(var21).ds();
               if (var23.mS == hn.zp) {
                  OK var25 = var18.WL();
                  OK var28 = var18.WO();
                  boolean var30 = ((Boolean)var3.w(r(var25))).booleanValue();
                  boolean var32 = ((Boolean)var3.w(r(var28))).booleanValue();
                  NW var33 = var21.v(var25);
                  NW var17 = var21.v(var28);
                  if (var30 && this.g(var1.g(var33).ds())) {
                     var1.q(var21, this.cx().q(r(var25), Boolean.valueOf(true)), 2);
                  } else if (var32 && this.g(var1.g(var17).ds())) {
                     var1.q(var21, this.cx().q(r(var28), Boolean.valueOf(true)), 2);
                  } else if (var30 && var1.aj(var33) && this.g(var1.g(var2.v(var25)).ds())) {
                     var1.q(var33, this.cx().q(r(var18.WK()), Boolean.valueOf(true)), 2);
                  } else if (var32 && var1.aj(var17) && this.g(var1.g(var2.v(var28)).ds())) {
                     var1.q(var17, this.cx().q(r(var18.WK()), Boolean.valueOf(true)), 2);
                  } else if (this.g(var1.g(var21.Vi()).ds())) {
                     var1.q(var21, this.cx(), 2);
                  }
               } else if (var23.mS.eh() && var23.cw()) {
                  var1.q(var2, var3.q(r(var18), Boolean.valueOf(true)), 2);
               }
            }
         } else if (var2.aX() > 1) {
            NW var20 = var2.Vj();
            hI var11 = var1.g(var20);
            cv var12 = var11.ds();
            if (var12.mS == hn.zp) {
               hI var13 = var3;

               for(OK var15 : OO.bRh) {
                  if (var4.nextBoolean()) {
                     var13 = var13.q(r(var15), Boolean.valueOf(false));
                  }
               }

               if (((Boolean)var13.w(yd)).booleanValue() || ((Boolean)var13.w(yc)).booleanValue() || ((Boolean)var13.w(ye)).booleanValue() || ((Boolean)var13.w(yb)).booleanValue()) {
                  var1.q(var20, var13, 2);
               }
            } else if (var12 == this) {
               hI var27 = var11;

               for(OK var31 : OO.bRh) {
                  hu var16 = r(var31);
                  if (var4.nextBoolean() && ((Boolean)var3.w(var16)).booleanValue()) {
                     var27 = var27.q(var16, Boolean.valueOf(true));
                  }
               }

               if (((Boolean)var27.w(yd)).booleanValue() || ((Boolean)var27.w(yc)).booleanValue() || ((Boolean)var27.w(ye)).booleanValue() || ((Boolean)var27.w(yb)).booleanValue()) {
                  var1.q(var20, var27, 2);
               }
            }
         }
      }

   }

   public void cZ() {
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean cr() {
      return false;
   }

   public void e(Qx var1, NW var2) {
      float var3 = 0.0625F;
      float var4 = 1.0F;
      float var5 = 1.0F;
      float var6 = 1.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      boolean var10 = false;
      if (((Boolean)var1.g(var2).w(yb)).booleanValue()) {
         var7 = Math.max(var7, 0.0625F);
         var4 = 0.0F;
         var5 = 0.0F;
         var8 = 1.0F;
         var6 = 0.0F;
         var9 = 1.0F;
         var10 = true;
      }

      if (((Boolean)var1.g(var2).w(yc)).booleanValue()) {
         var4 = Math.min(var4, 0.9375F);
         var7 = 1.0F;
         var5 = 0.0F;
         var8 = 1.0F;
         var6 = 0.0F;
         var9 = 1.0F;
         var10 = true;
      }

      if (((Boolean)var1.g(var2).w(yd)).booleanValue()) {
         var9 = Math.max(var9, 0.0625F);
         var6 = 0.0F;
         var4 = 0.0F;
         var7 = 1.0F;
         var5 = 0.0F;
         var8 = 1.0F;
         var10 = true;
      }

      if (((Boolean)var1.g(var2).w(ye)).booleanValue()) {
         var6 = Math.min(var6, 0.9375F);
         var9 = 1.0F;
         var4 = 0.0F;
         var7 = 1.0F;
         var5 = 0.0F;
         var8 = 1.0F;
         var10 = true;
      }

      if (!var10 && this.g(var1.g(var2.Vi()).ds())) {
         var5 = Math.min(var5, 0.9375F);
         var8 = 1.0F;
         var4 = 0.0F;
         var7 = 1.0F;
         var6 = 0.0F;
         var9 = 1.0F;
      }

      this.w(var4, var5, var6, var7, var8, var9);
   }

   public boolean q(QI var1, NW var2, OK var3) {
      // $FF: Couldn't be decompiled
   }

   private boolean g(cv var1) {
      return var1.cw() && var1.mS.el();
   }

   private boolean M(QI var1, NW var2, hI var3) {
      hI var4 = var3;

      for(OK var6 : OO.bRh) {
         hu var7 = r(var6);
         if (((Boolean)var3.w(var7)).booleanValue() && !this.g(var1.g(var2.v(var6)).ds())) {
            hI var8 = var1.g(var2.Vi());
            if (var8.ds() != this || !((Boolean)var8.w(var7)).booleanValue()) {
               var3 = var3.q(var7, Boolean.valueOf(false));
            }
         }
      }

      if (m(var3) == 0) {
         return false;
      } else {
         if (var4 != var3) {
            var1.q(var2, var3, 2);
         }

         return true;
      }
   }

   public int q(Qx var1, NW var2, int var3) {
      return var1.ai(var2).aN(var2);
   }

   public gZ() {
      super(hn.zI);
      this.q(this.nr.ez().q(ya, Boolean.valueOf(false)).q(yd, Boolean.valueOf(false)).q(yc, Boolean.valueOf(false)).q(ye, Boolean.valueOf(false)).q(yb, Boolean.valueOf(false)));
      this.d(true);
      this.q(yl.aLF);
   }

   protected hA cY() {
      return new hA(this, new ht[]{ya, yd, yc, ye, yb});
   }

   public Fm q(hI var1, Random var2, int var3) {
      return null;
   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      if (!var1.bXF && !this.M(var1, var2, var3)) {
         this.q(var1, var2, var3, 0);
         var1.am(var2);
      }

   }

   public OS cn() {
      return OS.bSl;
   }

   public static hu r(OK var0) {
      // $FF: Couldn't be decompiled
   }

   public void q(QI var1, DD var2, NW var3, hI var4, No var5) {
      if (!var1.bXF && var2.FD() != null && var2.FD().do1() == Et.bnF) {
         var2.w(Nj.bKr[cv.w(this)]);
         q(var1, var3, new GX(Ea.bhV, 1, 0));
      } else {
         super.q(var1, var2, var3, var4, var5);
      }

   }

   public NV e(QI var1, NW var2, hI var3) {
      return null;
   }
}

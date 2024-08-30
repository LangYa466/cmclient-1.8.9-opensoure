import java.util.List;
import java.util.Random;

public class dc extends cv {
   public static final hy oh = hy.w(t.q[-30789 & 11223], 0, 3);

   public int e(hI var1) {
      return ((Integer)var1.w(oh)).intValue();
   }

   public void e(QI var1, NW var2, hI var3, int var4) {
      var1.q(var2, var3.q(oh, Integer.valueOf(Pq.G(var4, 0, 3))), 2);
      var1.y(var2, this);
   }

   public void q(QI var1, NW var2, hI var3, NV var4, List var5, zk var6) {
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
      super.q(var1, var2, var3, var4, var5, var6);
      float var7 = 0.125F;
      this.w(0.0F, 0.0F, 0.0F, var7, 1.0F, 1.0F);
      super.q(var1, var2, var3, var4, var5, var6);
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var7);
      super.q(var1, var2, var3, var4, var5, var6);
      this.w(1.0F - var7, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.q(var1, var2, var3, var4, var5, var6);
      this.w(0.0F, 0.0F, 1.0F - var7, 1.0F, 1.0F, 1.0F);
      super.q(var1, var2, var3, var4, var5, var6);
      this.cZ();
   }

   public Fm i(QI var1, NW var2) {
      return Et.bmX;
   }

   public void t(QI var1, NW var2) {
      if (var1.bXs.nextInt(20) == 1) {
         hI var3 = var1.g(var2);
         if (((Integer)var3.w(oh)).intValue() < 3) {
            var1.q(var2, var3.e(oh), 2);
         }
      }

   }

   public dc() {
      super(hn.zl, hm.zh);
      this.q(this.nr.ez().q(oh, Integer.valueOf(0)));
   }

   public void cZ() {
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean cr() {
      return false;
   }

   public void q(QI var1, NW var2, hI var3, zk var4) {
      int var5 = ((Integer)var3.w(oh)).intValue();
      float var6 = (float)var2.aX() + (6.0F + (float)(3 * var5)) / 16.0F;
      if (!var1.bXF && var4.xL() && var5 > 0 && var4.xE().bNT <= (double)var6) {
         var4.xi();
         this.e(var1, var2, var3, var5 - 1);
      }

   }

   public Fm q(hI var1, Random var2, int var3) {
      return Et.bmX;
   }

   public int y(QI var1, NW var2) {
      return ((Integer)var1.g(var2).w(oh)).intValue();
   }

   public hI J(int var1) {
      return this.cx().q(oh, Integer.valueOf(var1));
   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      if (var1.bXF) {
         return true;
      } else {
         GX var9 = var4.bdM.GE();
         if (var9 == null) {
            return true;
         } else {
            int var10 = ((Integer)var3.w(oh)).intValue();
            Fm var11 = var9.do1();
            if (var11 == Et.bou) {
               if (var10 < 3) {
                  if (!var4.bdO.bfz) {
                     var4.bdM.y(var4.bdM.bfu, new GX(Et.bmP));
                  }

                  var4.w(Nj.bKB);
                  this.e(var1, var2, var3, 3);
               }

               return true;
            } else if (var11 == Et.blF) {
               if (var10 > 0) {
                  if (!var4.bdO.bfz) {
                     GX var14 = new GX(Et.bnp, 1, 0);
                     if (!var4.bdM.G(var14)) {
                        var1.p(new BD(var1, (double)var2.aY() + 0.5D, (double)var2.aX() + 1.5D, (double)var2.KO() + 0.5D, var14));
                     } else if (var4 instanceof DH) {
                        ((DH)var4).q(var4.bdW);
                     }

                     var4.w(Nj.bKI);
                     --var9.bsH;
                     if (var9.bsH <= 0) {
                        var4.bdM.y(var4.bdM.bfu, (GX)null);
                     }
                  }

                  this.e(var1, var2, var3, var10 - 1);
               }

               return true;
            } else {
               if (var10 > 0 && var11 instanceof FH) {
                  FH var12 = (FH)var11;
                  if (var12.HI() == FJ.brs && var12.Z(var9)) {
                     var12.aa(var9);
                     this.e(var1, var2, var3, var10 - 1);
                     var4.w(Nj.bKu);
                     return true;
                  }
               }

               if (var10 > 0 && var11 instanceof FM && Ns.ar(var9) > 0) {
                  GX var13 = var9.HW();
                  var13.bsH = 1;
                  Ns.ap(var13);
                  if (var9.bsH <= 1 && !var4.bdO.bfz) {
                     var4.bdM.y(var4.bdM.bfu, var13);
                  } else {
                     if (!var4.bdM.G(var13)) {
                        var1.p(new BD(var1, (double)var2.aY() + 0.5D, (double)var2.aX() + 1.5D, (double)var2.KO() + 0.5D, var13));
                     } else if (var4 instanceof DH) {
                        ((DH)var4).q(var4.bdW);
                     }

                     var4.w(Nj.bKy);
                     if (!var4.bdO.bfz) {
                        --var9.bsH;
                     }
                  }

                  if (!var4.bdO.bfz) {
                     this.e(var1, var2, var3, var10 - 1);
                  }

                  return true;
               } else {
                  return false;
               }
            }
         }
      }
   }

   public boolean cv() {
      return true;
   }

   protected hA cY() {
      return new hA(this, new ht[]{oh});
   }

   public boolean cw() {
      return false;
   }
}

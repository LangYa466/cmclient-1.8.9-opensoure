import java.util.Random;

public class dl extends cT implements hk {
   public static final hy oo = hy.w(q.q[23268 & 1125], 0, 7);

   protected hA cY() {
      return new hA(this, new ht[]{oo});
   }

   protected Fm dk() {
      return Et.blu;
   }

   protected boolean r(cv var1) {
      return var1 == Ea.biE;
   }

   public hI J(int var1) {
      return this.cx().q(oo, Integer.valueOf(var1));
   }

   public boolean t(QI var1, NW var2, hI var3) {
      return (var1.ax(var2) >= 8 || var1.aw(var2)) && this.r(var1.g(var2.Vj()).ds());
   }

   protected Fm dl() {
      return Et.bnB;
   }

   public int e(hI var1) {
      return ((Integer)var1.w(oo)).intValue();
   }

   public void e(QI var1, NW var2, hI var3, Random var4) {
      super.e(var1, var2, var3, var4);
      if (var1.ar(var2.Vi()) >= 9) {
         int var5 = ((Integer)var3.w(oo)).intValue();
         if (var5 < 7) {
            float var6 = q(this, var1, var2);
            if (var4.nextInt((int)(25.0F / var6) + 1) == 0) {
               var1.q(var2, var3.q(oo, Integer.valueOf(var5 + 1)), 2);
            }
         }
      }

   }

   public Fm i(QI var1, NW var2) {
      return this.dk();
   }

   public void w(QI var1, Random var2, NW var3, hI var4) {
      this.s(var1, var3, var4);
   }

   protected static float q(cv var0, QI var1, NW var2) {
      float var3 = 1.0F;
      NW var4 = var2.Vj();

      for(int var5 = -1; var5 <= 1; ++var5) {
         for(int var6 = -1; var6 <= 1; ++var6) {
            float var7 = 0.0F;
            hI var8 = var1.g(var4.C(var5, 0, var6));
            if (var8.ds() == Ea.biE) {
               var7 = 1.0F;
               if (((Integer)var8.w(dK.pt)).intValue() > 0) {
                  var7 = 3.0F;
               }
            }

            if (var5 != 0 || var6 != 0) {
               var7 /= 4.0F;
            }

            var3 += var7;
         }
      }

      NW var12 = var2.Vg();
      NW var13 = var2.Vk();
      NW var14 = var2.Vh();
      NW var15 = var2.Ve();
      boolean var9 = var0 == var1.g(var14).ds() || var0 == var1.g(var15).ds();
      boolean var10 = var0 == var1.g(var12).ds() || var0 == var1.g(var13).ds();
      if (var9 && var10) {
         var3 /= 2.0F;
      } else {
         boolean var11 = var0 == var1.g(var14.Vg()).ds() || var0 == var1.g(var15.Vg()).ds() || var0 == var1.g(var15.Vk()).ds() || var0 == var1.g(var14.Vk()).ds();
         if (var11) {
            var3 /= 2.0F;
         }
      }

      return var3;
   }

   public boolean q(QI var1, Random var2, NW var3, hI var4) {
      return true;
   }

   public boolean q(QI var1, NW var2, hI var3, boolean var4) {
      return ((Integer)var3.w(oo)).intValue() < 7;
   }

   public Fm q(hI var1, Random var2, int var3) {
      return ((Integer)var1.w(oo)).intValue() == 7 ? this.dl() : this.dk();
   }

   public void s(QI var1, NW var2, hI var3) {
      int var4 = ((Integer)var3.w(oo)).intValue() + Pq.q(var1.bXs, 2, 5);
      if (var4 > 7) {
         var4 = 7;
      }

      var1.q(var2, var3.q(oo, Integer.valueOf(var4)), 2);
   }

   protected dl() {
      this.q(this.nr.ez().q(oo, Integer.valueOf(0)));
      this.d(true);
      float var1 = 0.5F;
      this.w(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
      this.q((yl)null);
      this.h(0.0F);
      this.q(nc);
      this.cX();
   }

   public void q(QI var1, NW var2, hI var3, float var4, int var5) {
      super.q(var1, var2, var3, var4, 0);
      if (!var1.bXF) {
         int var6 = ((Integer)var3.w(oo)).intValue();
         if (var6 >= 7) {
            int var7 = 3 + var5;

            for(int var8 = 0; var8 < var7; ++var8) {
               if (var1.bXs.nextInt(15) <= var6) {
                  q(var1, var2, new GX(this.dk(), 1, 0));
               }
            }
         }
      }

   }
}

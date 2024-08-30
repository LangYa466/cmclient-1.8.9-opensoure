import java.util.Random;

public class Sz extends Sx {
   protected void w(long var1, int var3, int var4, RU var5, double var6, double var8, double var10) {
      this.w(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.oF.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   protected void q(QI var1, int var2, int var3, int var4, int var5, RU var6) {
      int var7 = this.oF.nextInt(this.oF.nextInt(this.oF.nextInt(10) + 1) + 1);
      if (this.oF.nextInt(5) != 0) {
         var7 = 0;
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         double var9 = (double)(var2 * 16 + this.oF.nextInt(16));
         double var11 = (double)this.oF.nextInt(128);
         double var13 = (double)(var3 * 16 + this.oF.nextInt(16));
         int var15 = 1;
         if (this.oF.nextInt(4) == 0) {
            this.w(this.oF.nextLong(), var4, var5, var6, var9, var11, var13);
            var15 += this.oF.nextInt(4);
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            float var17 = this.oF.nextFloat() * 3.1415927F * 2.0F;
            float var18 = (this.oF.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.oF.nextFloat() * 2.0F + this.oF.nextFloat();
            this.w(this.oF.nextLong(), var4, var5, var6, var9, var11, var13, var19 * 2.0F, var17, var18, 0, 0, 0.5D);
         }
      }

   }

   protected void w(long var1, int var3, int var4, RU var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      double var19 = (double)(var3 * 16 + 8);
      double var21 = (double)(var4 * 16 + 8);
      float var23 = 0.0F;
      float var24 = 0.0F;
      Random var25 = new Random(var1);
      if (var16 <= 0) {
         int var26 = this.chD * 16 - 16;
         var16 = var26 - var25.nextInt(var26 / 4);
      }

      boolean var63 = false;
      if (var15 == -1) {
         var15 = var16 / 2;
         var63 = true;
      }

      int var27 = var25.nextInt(var16 / 2) + var16 / 4;

      for(boolean var28 = var25.nextInt(6) == 0; var15 < var16; ++var15) {
         double var29 = 1.5D + (double)(Pq.bk((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
         double var31 = var29 * var17;
         float var33 = Pq.bi(var14);
         float var34 = Pq.bk(var14);
         var6 += (double)(Pq.bi(var13) * var33);
         var8 += (double)var34;
         var10 += (double)(Pq.bk(var13) * var33);
         if (var28) {
            var14 = var14 * 0.92F;
         } else {
            var14 = var14 * 0.7F;
         }

         var14 = var14 + var24 * 0.1F;
         var13 += var23 * 0.1F;
         var24 = var24 * 0.9F;
         var23 = var23 * 0.75F;
         var24 = var24 + (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 2.0F;
         var23 = var23 + (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 4.0F;
         if (!var63 && var15 == var27 && var12 > 1.0F) {
            this.w(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 - 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            this.w(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 + 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            return;
         }

         if (var63 || var25.nextInt(4) != 0) {
            double var35 = var6 - var19;
            double var37 = var10 - var21;
            double var39 = (double)(var16 - var15);
            double var41 = (double)(var12 + 2.0F + 16.0F);
            if (var35 * var35 + var37 * var37 - var39 * var39 > var41 * var41) {
               return;
            }

            if (var6 >= var19 - 16.0D - var29 * 2.0D && var10 >= var21 - 16.0D - var29 * 2.0D && var6 <= var19 + 16.0D + var29 * 2.0D && var10 <= var21 + 16.0D + var29 * 2.0D) {
               int var43 = Pq.D(var6 - var29) - var3 * 16 - 1;
               int var44 = Pq.D(var6 + var29) - var3 * 16 + 1;
               int var45 = Pq.D(var8 - var31) - 1;
               int var46 = Pq.D(var8 + var31) + 1;
               int var47 = Pq.D(var10 - var29) - var4 * 16 - 1;
               int var48 = Pq.D(var10 + var29) - var4 * 16 + 1;
               if (var43 < 0) {
                  var43 = 0;
               }

               if (var44 > 16) {
                  var44 = 16;
               }

               if (var45 < 1) {
                  var45 = 1;
               }

               if (var46 > 120) {
                  var46 = 120;
               }

               if (var47 < 0) {
                  var47 = 0;
               }

               if (var48 > 16) {
                  var48 = 16;
               }

               boolean var49 = false;

               for(int var50 = var43; !var49 && var50 < var44; ++var50) {
                  for(int var51 = var47; !var49 && var51 < var48; ++var51) {
                     for(int var52 = var46 + 1; !var49 && var52 >= var45 - 1; --var52) {
                        if (var52 >= 0 && var52 < 128) {
                           hI var53 = var5.R(var50, var52, var51);
                           if (var53.ds() == Ea.bhW || var53.ds() == Ea.bkv) {
                              var49 = true;
                           }

                           if (var52 != var45 - 1 && var50 != var43 && var50 != var44 - 1 && var51 != var47 && var51 != var48 - 1) {
                              var52 = var45;
                           }
                        }
                     }
                  }
               }

               if (!var49) {
                  for(int var64 = var43; var64 < var44; ++var64) {
                     double var65 = ((double)(var64 + var3 * 16) + 0.5D - var6) / var29;

                     for(int var66 = var47; var66 < var48; ++var66) {
                        double var54 = ((double)(var66 + var4 * 16) + 0.5D - var10) / var29;

                        for(int var56 = var46; var56 > var45; --var56) {
                           double var57 = ((double)(var56 - 1) + 0.5D - var8) / var31;
                           if (var57 > -0.7D && var65 * var65 + var57 * var57 + var54 * var54 < 1.0D) {
                              hI var59 = var5.R(var64, var56, var66);
                              if (var59.ds() == Ea.bhG || var59.ds() == Ea.bjj || var59.ds() == Ea.biQ) {
                                 var5.q(var64, var56, var66, Ea.bjN.cx());
                              }
                           }
                        }
                     }
                  }

                  if (var63) {
                     break;
                  }
               }
            }
         }
      }

   }
}

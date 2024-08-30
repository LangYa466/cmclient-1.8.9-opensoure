import java.util.Random;

public class SA extends Sx {
   private float[] chE = new float[1024];

   protected void q(QI var1, int var2, int var3, int var4, int var5, RU var6) {
      if (this.oF.nextInt(50) == 0) {
         double var7 = (double)(var2 * 16 + this.oF.nextInt(16));
         double var9 = (double)(this.oF.nextInt(this.oF.nextInt(40) + 8) + 20);
         double var11 = (double)(var3 * 16 + this.oF.nextInt(16));
         byte var13 = 1;

         for(int var14 = 0; var14 < var13; ++var14) {
            float var15 = this.oF.nextFloat() * 3.1415927F * 2.0F;
            float var16 = (this.oF.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var17 = (this.oF.nextFloat() * 2.0F + this.oF.nextFloat()) * 2.0F;
            this.e(this.oF.nextLong(), var4, var5, var6, var7, var9, var11, var17, var15, var16, 0, 0, 3.0D);
         }
      }

   }

   protected void e(long var1, int var3, int var4, RU var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      Random var19 = new Random(var1);
      double var20 = (double)(var3 * 16 + 8);
      double var22 = (double)(var4 * 16 + 8);
      float var24 = 0.0F;
      float var25 = 0.0F;
      if (var16 <= 0) {
         int var26 = this.chD * 16 - 16;
         var16 = var26 - var19.nextInt(var26 / 4);
      }

      boolean var64 = false;
      if (var15 == -1) {
         var15 = var16 / 2;
         var64 = true;
      }

      float var27 = 1.0F;

      for(int var28 = 0; var28 < 256; ++var28) {
         if (var28 == 0 || var19.nextInt(3) == 0) {
            var27 = 1.0F + var19.nextFloat() * var19.nextFloat() * 1.0F;
         }

         this.chE[var28] = var27 * var27;
      }

      for(; var15 < var16; ++var15) {
         double var65 = 1.5D + (double)(Pq.bk((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
         double var30 = var65 * var17;
         var65 = var65 * ((double)var19.nextFloat() * 0.25D + 0.75D);
         var30 = var30 * ((double)var19.nextFloat() * 0.25D + 0.75D);
         float var32 = Pq.bi(var14);
         float var33 = Pq.bk(var14);
         var6 += (double)(Pq.bi(var13) * var32);
         var8 += (double)var33;
         var10 += (double)(Pq.bk(var13) * var32);
         var14 = var14 * 0.7F;
         var14 = var14 + var25 * 0.05F;
         var13 += var24 * 0.05F;
         var25 = var25 * 0.8F;
         var24 = var24 * 0.5F;
         var25 = var25 + (var19.nextFloat() - var19.nextFloat()) * var19.nextFloat() * 2.0F;
         var24 = var24 + (var19.nextFloat() - var19.nextFloat()) * var19.nextFloat() * 4.0F;
         if (var64 || var19.nextInt(4) != 0) {
            double var34 = var6 - var20;
            double var36 = var10 - var22;
            double var38 = (double)(var16 - var15);
            double var40 = (double)(var12 + 2.0F + 16.0F);
            if (var34 * var34 + var36 * var36 - var38 * var38 > var40 * var40) {
               return;
            }

            if (var6 >= var20 - 16.0D - var65 * 2.0D && var10 >= var22 - 16.0D - var65 * 2.0D && var6 <= var20 + 16.0D + var65 * 2.0D && var10 <= var22 + 16.0D + var65 * 2.0D) {
               int var42 = Pq.D(var6 - var65) - var3 * 16 - 1;
               int var43 = Pq.D(var6 + var65) - var3 * 16 + 1;
               int var44 = Pq.D(var8 - var30) - 1;
               int var45 = Pq.D(var8 + var30) + 1;
               int var46 = Pq.D(var10 - var65) - var4 * 16 - 1;
               int var47 = Pq.D(var10 + var65) - var4 * 16 + 1;
               if (var42 < 0) {
                  var42 = 0;
               }

               if (var43 > 16) {
                  var43 = 16;
               }

               if (var44 < 1) {
                  var44 = 1;
               }

               if (var45 > 248) {
                  var45 = 248;
               }

               if (var46 < 0) {
                  var46 = 0;
               }

               if (var47 > 16) {
                  var47 = 16;
               }

               boolean var48 = false;

               for(int var49 = var42; !var48 && var49 < var43; ++var49) {
                  for(int var50 = var46; !var48 && var50 < var47; ++var50) {
                     for(int var51 = var45 + 1; !var48 && var51 >= var44 - 1; --var51) {
                        if (var51 >= 0 && var51 < 256) {
                           hI var52 = var5.R(var49, var51, var50);
                           if (var52.ds() == Ea.bjc || var52.ds() == Ea.bgT) {
                              var48 = true;
                           }

                           if (var51 != var44 - 1 && var49 != var42 && var49 != var43 - 1 && var50 != var46 && var50 != var47 - 1) {
                              var51 = var44;
                           }
                        }
                     }
                  }
               }

               if (!var48) {
                  Ob var68 = new Ob();

                  for(int var69 = var42; var69 < var43; ++var69) {
                     double var70 = ((double)(var69 + var3 * 16) + 0.5D - var6) / var65;

                     for(int var53 = var46; var53 < var47; ++var53) {
                        double var54 = ((double)(var53 + var4 * 16) + 0.5D - var10) / var65;
                        boolean var56 = false;
                        if (var70 * var70 + var54 * var54 < 1.0D) {
                           for(int var57 = var45; var57 > var44; --var57) {
                              double var58 = ((double)(var57 - 1) + 0.5D - var8) / var30;
                              if ((var70 * var70 + var54 * var54) * (double)this.chE[var57 - 1] + var58 * var58 / 6.0D < 1.0D) {
                                 hI var60 = var5.R(var69, var57, var53);
                                 if (var60.ds() == Ea.biQ) {
                                    var56 = true;
                                 }

                                 if (var60.ds() == Ea.biP || var60.ds() == Ea.bjj || var60.ds() == Ea.biQ) {
                                    if (var57 - 1 < 10) {
                                       var5.q(var69, var57, var53, Ea.bhW.cx());
                                    } else {
                                       var5.q(var69, var57, var53, Ea.bjN.cx());
                                       if (var56 && var5.R(var69, var57 - 1, var53).ds() == Ea.bjj) {
                                          var68.D(var69 + var3 * 16, 0, var53 + var4 * 16);
                                          var5.q(var69, var57 - 1, var53, this.vR.ai(var68).caI);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (var64) {
                     break;
                  }
               }
            }
         }
      }

   }
}

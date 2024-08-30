public class XI {
   private final float[][] cuD = new float[16][3];
   private final float[][] cuE = new float[16][3];
   private Xg cuF = null;

   private void q(float[][] var1, float var2, int var3, int var4, float[][] var5) {
      int var6 = (int)Math.floor((double)var2);
      int var7 = (int)Math.ceil((double)var2);
      if (var6 == var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            float[] var9 = var1[var3 + var8 * var4 + var6];
            float[] var10 = var5[var8];
            System.arraycopy(var9, 0, var10, 0, 3);
         }
      } else {
         float var15 = 1.0F - (var2 - (float)var6);
         float var16 = 1.0F - ((float)var7 - var2);

         for(int var17 = 0; var17 < 16; ++var17) {
            float[] var11 = var1[var3 + var17 * var4 + var6];
            float[] var12 = var1[var3 + var17 * var4 + var7];
            float[] var13 = var5[var17];

            for(int var14 = 0; var14 < 3; ++var14) {
               var13[var14] = var11[var14] * var15 + var12[var14] * var16;
            }
         }
      }

   }

   public Xg afJ() {
      return this.cuF;
   }

   private static void cJ(String var0) {
      MV.cJ(w.q[-15789 & 1625] + var0);
   }

   private static void cM(String var0) {
      MV.cM(w.q[8785 & 2929] + var0);
   }

   public XI(Xg var1) {
      this.cuF = var1;
   }

   public boolean q(QI var1, float var2, int[] var3, boolean var4) {
      if (this.cuF == null) {
         return false;
      } else {
         int var5 = this.cuF.ac();
         if (var4 && var5 < 64) {
            return false;
         } else {
            int var6 = this.cuF.ab();
            if (var6 < 16) {
               cJ(w.q[557 & 25361] + var6);
               this.cuF = null;
               return false;
            } else {
               int var7 = 0;
               if (var4) {
                  var7 = var6 * 16 * 2;
               }

               float var8 = 1.1666666F * (var1.bs(1.0F) - 0.2F);
               if (var1.Zy() > 0) {
                  var8 = 1.0F;
               }

               var8 = MV.aZ(var8);
               float var9 = var8 * (float)(var6 - 1);
               float var10 = MV.aZ(var2 + 0.5F) * (float)(var6 - 1);
               float var11 = MV.aZ(MV.SL().aCj);
               boolean var12 = var11 > 1.0E-4F;
               float[][] var13 = this.cuF.aex();
               this.q(var13, var9, var7, var6, this.cuD);
               this.q(var13, var10, var7 + 16 * var6, var6, this.cuE);
               float[] var14 = new float[3];

               for(int var15 = 0; var15 < 16; ++var15) {
                  for(int var16 = 0; var16 < 16; ++var16) {
                     for(int var17 = 0; var17 < 3; ++var17) {
                        float var18 = MV.aZ(this.cuD[var15][var17] + this.cuE[var16][var17]);
                        if (var12) {
                           float var19 = 1.0F - var18;
                           var19 = 1.0F - var19 * var19 * var19 * var19;
                           var18 = var11 * var19 + (1.0F - var11) * var18;
                        }

                        var14[var17] = var18;
                     }

                     int var21 = (int)(var14[0] * 255.0F);
                     int var22 = (int)(var14[1] * 255.0F);
                     int var24 = (int)(var14[2] * 255.0F);
                     var3[var15 * 16 + var16] = -16777216 | var21 << 16 | var22 << 8 | var24;
                  }
               }

               return true;
            }
         }
      }
   }
}

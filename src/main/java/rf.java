public class rF {
   public float[] apV = new float[16];
   public boolean apW = false;
   public float[][] apX = new float[6][4];
   public float[] apY = new float[16];
   public float[] apZ = new float[16];

   private float q(float[] var1, float var2, float var3, float var4) {
      return var1[0] * var2 + var1[1] * var3 + var1[2] * var4 + var1[3];
   }

   public boolean w(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.apW) {
         return true;
      } else {
         float var13 = (float)var1;
         float var14 = (float)var3;
         float var15 = (float)var5;
         float var16 = (float)var7;
         float var17 = (float)var9;
         float var18 = (float)var11;

         for(int var19 = 0; var19 < 6; ++var19) {
            float[] var20 = this.apX[var19];
            float var21 = var20[0];
            float var22 = var20[1];
            float var23 = var20[2];
            float var24 = var20[3];
            if (var19 < 4) {
               if (var21 * var13 + var22 * var14 + var23 * var15 + var24 <= 0.0F || var21 * var16 + var22 * var14 + var23 * var15 + var24 <= 0.0F || var21 * var13 + var22 * var17 + var23 * var15 + var24 <= 0.0F || var21 * var16 + var22 * var17 + var23 * var15 + var24 <= 0.0F || var21 * var13 + var22 * var14 + var23 * var18 + var24 <= 0.0F || var21 * var16 + var22 * var14 + var23 * var18 + var24 <= 0.0F || var21 * var13 + var22 * var17 + var23 * var18 + var24 <= 0.0F || var21 * var16 + var22 * var17 + var23 * var18 + var24 <= 0.0F) {
                  return false;
               }
            } else if (var21 * var13 + var22 * var14 + var23 * var15 + var24 <= 0.0F && var21 * var16 + var22 * var14 + var23 * var15 + var24 <= 0.0F && var21 * var13 + var22 * var17 + var23 * var15 + var24 <= 0.0F && var21 * var16 + var22 * var17 + var23 * var15 + var24 <= 0.0F && var21 * var13 + var22 * var14 + var23 * var18 + var24 <= 0.0F && var21 * var16 + var22 * var14 + var23 * var18 + var24 <= 0.0F && var21 * var13 + var22 * var17 + var23 * var18 + var24 <= 0.0F && var21 * var16 + var22 * var17 + var23 * var18 + var24 <= 0.0F) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean e(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.apW) {
         return true;
      } else {
         float var13 = (float)var1;
         float var14 = (float)var3;
         float var15 = (float)var5;
         float var16 = (float)var7;
         float var17 = (float)var9;
         float var18 = (float)var11;

         for(int var19 = 0; var19 < 6; ++var19) {
            float[] var20 = this.apX[var19];
            float var21 = var20[0];
            float var22 = var20[1];
            float var23 = var20[2];
            float var24 = var20[3];
            if (var21 * var13 + var22 * var14 + var23 * var15 + var24 <= 0.0F && var21 * var16 + var22 * var14 + var23 * var15 + var24 <= 0.0F && var21 * var13 + var22 * var17 + var23 * var15 + var24 <= 0.0F && var21 * var16 + var22 * var17 + var23 * var15 + var24 <= 0.0F && var21 * var13 + var22 * var14 + var23 * var18 + var24 <= 0.0F && var21 * var16 + var22 * var14 + var23 * var18 + var24 <= 0.0F && var21 * var13 + var22 * var17 + var23 * var18 + var24 <= 0.0F && var21 * var16 + var22 * var17 + var23 * var18 + var24 <= 0.0F) {
               return false;
            }
         }

         return true;
      }
   }
}

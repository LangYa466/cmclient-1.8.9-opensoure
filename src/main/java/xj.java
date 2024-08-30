public class XJ {
   private int[] cuG = new int[0];
   private final XI cuH;
   private final XI cuI;
   private final XI cuJ;
   private int[] cuK = new int[0];

   private boolean q(int[] var1, float var2, int[] var3, float var4) {
      if (var3.length != var1.length) {
         return false;
      } else {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var1[var5];
            int var7 = var6 >> 16 & 255;
            int var8 = var6 >> 8 & 255;
            int var9 = var6 & 255;
            int var10 = var3[var5];
            int var11 = var10 >> 16 & 255;
            int var12 = var10 >> 8 & 255;
            int var13 = var10 & 255;
            int var14 = (int)((float)var7 * var2 + (float)var11 * var4);
            int var15 = (int)((float)var8 * var2 + (float)var12 * var4);
            int var16 = (int)((float)var9 * var2 + (float)var13 * var4);
            var1[var5] = -16777216 | var14 << 16 | var15 << 8 | var16;
         }

         return true;
      }
   }

   public XJ(XI var1, XI var2, XI var3) {
      if (var2 != null || var3 != null) {
         if (var2 == null) {
            var2 = var1;
         }

         if (var3 == null) {
            var3 = var2;
         }
      }

      this.cuJ = var1;
      this.cuI = var2;
      this.cuH = var3;
   }

   public boolean q(QI var1, float var2, int[] var3, boolean var4, float var5) {
      if (this.cuI == null && this.cuH == null) {
         return this.cuJ.q(var1, var2, var3, var4);
      } else {
         int var6 = var1.bXI.ZQ();
         if (var6 != 1 && var6 != -1) {
            float var7 = var1.bu(var5);
            float var8 = var1.bp(var5);
            float var9 = 1.0E-4F;
            boolean var10 = var7 > var9;
            boolean var11 = var8 > var9;
            if (!var10 && !var11) {
               return this.cuJ.q(var1, var2, var3, var4);
            } else {
               if (var7 > 0.0F) {
                  var8 /= var7;
               }

               float var12 = 1.0F - var7;
               float var13 = var7 - var8;
               if (this.cuG.length != var3.length) {
                  this.cuG = new int[var3.length];
                  this.cuK = new int[var3.length];
               }

               int var14 = 0;
               int[][] var15 = new int[][]{var3, this.cuG, this.cuK};
               float[] var16 = new float[3];
               if (var12 > var9 && this.cuJ.q(var1, var2, var15[var14], var4)) {
                  var16[var14] = var12;
                  ++var14;
               }

               if (var13 > var9 && this.cuI != null && this.cuI.q(var1, var2, var15[var14], var4)) {
                  var16[var14] = var13;
                  ++var14;
               }

               if (var8 > var9 && this.cuH != null && this.cuH.q(var1, var2, var15[var14], var4)) {
                  var16[var14] = var8;
                  ++var14;
               }

               return var14 == 2 ? this.q(var15[0], var16[0], var15[1], var16[1]) : var14 != 3 || this.q(var15[0], var16[0], var15[1], var16[1], var15[2], var16[2]);
            }
         } else {
            return this.cuJ.q(var1, var2, var3, var4);
         }
      }
   }

   private boolean q(int[] var1, float var2, int[] var3, float var4, int[] var5, float var6) {
      if (var3.length == var1.length && var5.length == var1.length) {
         for(int var7 = 0; var7 < var1.length; ++var7) {
            int var8 = var1[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var3[var7];
            int var13 = var12 >> 16 & 255;
            int var14 = var12 >> 8 & 255;
            int var15 = var12 & 255;
            int var16 = var5[var7];
            int var17 = var16 >> 16 & 255;
            int var18 = var16 >> 8 & 255;
            int var19 = var16 & 255;
            int var20 = (int)((float)var9 * var2 + (float)var13 * var4 + (float)var17 * var6);
            int var21 = (int)((float)var10 * var2 + (float)var14 * var4 + (float)var18 * var6);
            int var22 = (int)((float)var11 * var2 + (float)var15 * var4 + (float)var19 * var6);
            var1[var7] = -16777216 | var20 << 16 | var21 << 8 | var22;
         }

         return true;
      } else {
         return false;
      }
   }
}

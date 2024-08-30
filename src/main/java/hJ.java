import com.google.common.collect.Lists;
import java.util.ArrayList;

public class Hj implements He {
   public GX q(EZ var1) {
      GX var2 = null;
      int[] var3 = new int[3];
      int var4 = 0;
      int var5 = 0;
      FH var6 = null;

      for(int var7 = 0; var7 < var1.CB(); ++var7) {
         GX var8 = var1.er(var7);
         if (var8 != null) {
            if (var8.do1() instanceof FH) {
               var6 = (FH)var8.do1();
               if (var6.HI() != FJ.brs || var2 != null) {
                  return null;
               }

               var2 = var8.HW();
               var2.bsH = 1;
               if (var6.Z(var8)) {
                  int var9 = var6.Y(var2);
                  float var10 = (float)(var9 >> 16 & 255) / 255.0F;
                  float var11 = (float)(var9 >> 8 & 255) / 255.0F;
                  float var12 = (float)(var9 & 255) / 255.0F;
                  var4 = (int)((float)var4 + Math.max(var10, Math.max(var11, var12)) * 255.0F);
                  var3[0] = (int)((float)var3[0] + var10 * 255.0F);
                  var3[1] = (int)((float)var3[1] + var11 * 255.0F);
                  var3[2] = (int)((float)var3[2] + var12 * 255.0F);
                  ++var5;
               }
            } else {
               if (var8.do1() != Et.boc) {
                  return null;
               }

               float[] var17 = Dm.w(Fk.fc(var8.dm()));
               int var20 = (int)(var17[0] * 255.0F);
               int var22 = (int)(var17[1] * 255.0F);
               int var24 = (int)(var17[2] * 255.0F);
               var4 += Math.max(var20, Math.max(var22, var24));
               var3[0] += var20;
               var3[1] += var22;
               var3[2] += var24;
               ++var5;
            }
         }
      }

      if (var6 == null) {
         return null;
      } else {
         int var13 = var3[0] / var5;
         int var15 = var3[1] / var5;
         int var18 = var3[2] / var5;
         float var21 = (float)var4 / (float)var5;
         float var23 = (float)Math.max(var13, Math.max(var15, var18));
         var13 = (int)((float)var13 * var21 / var23);
         var15 = (int)((float)var15 * var21 / var23);
         var18 = (int)((float)var18 * var21 / var23);
         int var25 = (var13 << 8) + var15;
         var25 = (var25 << 8) + var18;
         var6.y(var2, var25);
         return var2;
      }
   }

   public GX[] w(EZ var1) {
      GX[] var2 = new GX[var1.CB()];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         GX var4 = var1.er(var3);
         if (var4 != null && var4.do1().Ho()) {
            var2[var3] = new GX(var4.do1().Hp());
         }
      }

      return var2;
   }

   public int Iu() {
      return 10;
   }

   public boolean e(EZ var1, QI var2) {
      GX var3 = null;
      ArrayList var4 = Lists.newArrayList();

      for(int var5 = 0; var5 < var1.CB(); ++var5) {
         GX var6 = var1.er(var5);
         if (var6 != null) {
            if (var6.do1() instanceof FH) {
               FH var7 = (FH)var6.do1();
               if (var7.HI() != FJ.brs || var3 != null) {
                  return false;
               }

               var3 = var6;
            } else {
               if (var6.do1() != Et.boc) {
                  return false;
               }

               var4.add(var6);
            }
         }
      }

      return var3 != null && !var4.isEmpty();
   }

   public GX Iv() {
      return null;
   }
}

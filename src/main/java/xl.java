import java.awt.Dimension;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public class XL {
   private final String cuN;
   private IntBuffer[] cuO;
   private final Dimension[] cuP;
   private final boolean cuQ;
   private final int[] cuR;
   private final int cuS;
   private final int cuT;
   private final int[][] cuU;

   public static void q(int var0, int var1, String var2) {
      Dimension[] var3 = w(var0, var1, var2);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Dimension var5 = var3[var4];
         int var6 = var5.width;
         int var7 = var5.height;
         int var8 = var4 + 1;
         GL11.glTexImage2D(3553, var8, 6408, var6, var7, 0, 32993, 33639, (ByteBuffer)null);
      }

   }

   public XL(String var1, int var2, int var3, int[] var4, boolean var5) {
      this.cuN = var1;
      this.cuS = var2;
      this.cuT = var3;
      this.cuR = var4;
      this.cuQ = var5;
      this.cuP = w(var2, var3, var1);
      this.cuU = q(var4, var2, var3, this.cuP);
      if (var5) {
         this.cuO = q(this.cuP, this.cuU);
      }

   }

   public static IntBuffer[] q(Dimension[] var0, int[][] var1) {
      if (var0 == null) {
         return null;
      } else {
         IntBuffer[] var2 = new IntBuffer[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            Dimension var4 = var0[var3];
            int var5 = var4.width * var4.height;
            IntBuffer var6 = py.bL(var5);
            int[] var7 = var1[var3];
            var6.clear();
            var6.put(var7);
            var6.clear();
            var2[var3] = var6;
         }

         return var2;
      }
   }

   public static int K(int var0, int var1, int var2, int var3) {
      int var4 = bB(var0, var1);
      int var5 = bB(var2, var3);
      int var6 = bB(var4, var5);
      return var6;
   }

   private static int bB(int var0, int var1) {
      int var2 = (var0 & -16777216) >> 24 & 255;
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 + var3) / 2;
      if (var2 == 0 && var3 == 0) {
         var2 = 1;
         var3 = 1;
      } else {
         if (var2 == 0) {
            var0 = var1;
            var4 /= 2;
         }

         if (var3 == 0) {
            var1 = var0;
            var4 /= 2;
         }
      }

      int var5 = (var0 >> 16 & 255) * var2;
      int var6 = (var0 >> 8 & 255) * var2;
      int var7 = (var0 & 255) * var2;
      int var8 = (var1 >> 16 & 255) * var3;
      int var9 = (var1 >> 8 & 255) * var3;
      int var10 = (var1 & 255) * var3;
      int var11 = (var5 + var8) / (var2 + var3);
      int var12 = (var6 + var9) / (var2 + var3);
      int var13 = (var7 + var10) / (var2 + var3);
      return var4 << 24 | var11 << 16 | var12 << 8 | var13;
   }

   public static Dimension[] w(int var0, int var1, String var2) {
      int var3 = net.optifine.util.K.jJ(var0);
      int var4 = net.optifine.util.K.jJ(var1);
      if (var3 == var0 && var4 == var1) {
         ArrayList var5 = new ArrayList();
         int var6 = var3;
         int var7 = var4;

         while(true) {
            var6 /= 2;
            var7 /= 2;
            if (var6 <= 0 && var7 <= 0) {
               Dimension[] var10 = (Dimension[])var5.toArray(new Dimension[var5.size()]);
               return var10;
            }

            if (var6 <= 0) {
               var6 = 1;
            }

            if (var7 <= 0) {
               var7 = 1;
            }

            int var8 = var6 * var7 * 4;
            Dimension var9 = new Dimension(var6, var7);
            var5.add(var9);
         }
      } else {
         MV.cJ(i.q[5306 & -24142] + var2 + i.q[8883 & 21947] + var0 + q.q[7419 & 595] + var1);
         return new Dimension[0];
      }
   }

   private int bC(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      return (var3 + var2 >> 1 << 24) + ((var3 & 16711422) + (var4 & 16711422) >> 1);
   }

   public static int[][] q(int[] var0, int var1, int var2, Dimension[] var3) {
      int[] var4 = var0;
      int var5 = var1;
      boolean var6 = true;
      int[][] var7 = new int[var3.length][];

      for(int var8 = 0; var8 < var3.length; ++var8) {
         Dimension var9 = var3[var8];
         int var10 = var9.width;
         int var11 = var9.height;
         int[] var12 = new int[var10 * var11];
         var7[var8] = var12;
         int var13 = var8 + 1;
         if (var6) {
            for(int var14 = 0; var14 < var10; ++var14) {
               for(int var15 = 0; var15 < var11; ++var15) {
                  int var16 = var4[var14 * 2 + var15 * 2 * var5];
                  int var17 = var4[var14 * 2 + 1 + var15 * 2 * var5];
                  int var18 = var4[var14 * 2 + 1 + (var15 * 2 + 1) * var5];
                  int var19 = var4[var14 * 2 + (var15 * 2 + 1) * var5];
                  int var20 = K(var16, var17, var18, var19);
                  var12[var14 + var15 * var10] = var20;
               }
            }
         }

         var4 = var12;
         var5 = var10;
         if (var10 <= 1 || var11 <= 1) {
            var6 = false;
         }
      }

      return var7;
   }
}

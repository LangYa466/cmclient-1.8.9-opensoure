package net.optifine.shaders;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class I {
   public static ByteBuffer alN = BufferUtils.createByteBuffer(4194304);
   public static final int cOr = -8421377;
   public static int[] btO = new int[1048576];
   public static final int cOs = 0;
   public static IntBuffer cOt = alN.asIntBuffer();
   public static final int cOu = 0;
   public static Map cOv = new HashMap();
   public static final int cOw = 1048576;

   public static int jo(int var0) {
      int var1 = 0;
      if ((var0 & -65536) != 0) {
         var1 += 16;
         var0 >>= 16;
      }

      if ((var0 & '\uff00') != 0) {
         var1 += 8;
         var0 >>= 8;
      }

      if ((var0 & 240) != 0) {
         var1 += 4;
         var0 >>= 4;
      }

      if ((var0 & 6) != 0) {
         var1 += 2;
         var0 >>= 2;
      }

      if ((var0 & 2) != 0) {
         ++var1;
      }

      return var1;
   }

   public static int[] bK(int var0, int var1) {
      int[] var2 = new int[var0 * 3];
      Arrays.fill(var2, 0, var0, var1);
      Arrays.fill(var2, var0, var0 * 2, -8421377);
      Arrays.fill(var2, var0 * 2, var0 * 3, 0);
      return var2;
   }

   public static .PJ e(.PJ var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         String var2 = var0.XA();
         String[] var3 = var2.split(.q.q[5644 & 2317]);
         String var4 = var3[0];
         return new .PJ(var0.Xz(), var4 + .q.q[-32081 & 4655] + var1 + .q.q[-7155 & 2156]);
      }
   }

   public static void q(int[] var0, int var1, int var2, int var3) {
      Math.min(var2, var3);
      int var4 = var1;
      int var5 = var2;
      int var6 = var3;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      int var10;
      for(var10 = 0; var5 > 1 && var6 > 1; var4 = var7) {
         var7 = var4 + var5 * var6;
         var8 = var5 / 2;
         var9 = var6 / 2;

         for(int var11 = 0; var11 < var9; ++var11) {
            int var12 = var7 + var11 * var8;
            int var13 = var4 + var11 * 2 * var5;

            for(int var14 = 0; var14 < var8; ++var14) {
               var0[var12 + var14] = O(var0[var13 + var14 * 2], var0[var13 + var14 * 2 + 1], var0[var13 + var5 + var14 * 2], var0[var13 + var5 + var14 * 2 + 1]);
            }
         }

         ++var10;
         var5 = var8;
         var6 = var9;
      }

      while(var10 > 0) {
         --var10;
         var5 = var2 >> var10;
         var6 = var3 >> var10;
         var4 = var7 - var5 * var6;
         int var19 = var4;

         for(int var20 = 0; var20 < var6; ++var20) {
            for(int var21 = 0; var21 < var5; ++var21) {
               if (var0[var19] == 0) {
                  var0[var19] = var0[var7 + var20 / 2 * var8 + var21 / 2] & 16777215;
               }

               ++var19;
            }
         }

         var7 = var4;
         var8 = var5;
      }

   }

   public static void q(net.optifine.shaders.h var0) {
      if (net.optifine.shaders.F.cLF && .pz.nD() == 33984) {
         if (net.optifine.shaders.F.cLW) {
            .pz.bQ(33986);
            .pz.bW(var0.cEx);
         }

         if (net.optifine.shaders.F.cMA) {
            .pz.bQ(33987);
            .pz.bW(var0.cEw);
         }

         .pz.bQ(33984);
      }

      .pz.bW(var0.cEy);
   }

   public static int[][] w(int var0, int var1, int[][] var2) {
      for(int var3 = 1; var3 <= var0; ++var3) {
         if (var2[var3] == null) {
            int var4 = var1 >> var3;
            int var5 = var4 * 2;
            int[] var6 = var2[var3 - 1];
            int[] var7 = var2[var3] = new int[var4 * var4];

            for(int var8 = 0; var8 < var4; ++var8) {
               for(int var9 = 0; var9 < var4; ++var9) {
                  int var10 = var8 * 2 * var5 + var9 * 2;
                  var7[var8 * var4 + var9] = O(var6[var10], var6[var10 + 1], var6[var10 + var5], var6[var10 + var5 + 1]);
               }
            }
         }
      }

      return var2;
   }

   public static .tF akJ() {
      .tD var0 = new .tD(1, 1);
      var0.rK()[0] = -1;
      var0.rL();
      return var0;
   }

   public static void q(net.optifine.shaders.h var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var8 = var2 * var3;
      IntBuffer var9 = jq(var8);
      var9.clear();
      var9.put(var1, 0, var8);
      var9.position(0).limit(var8);
      .pz.bW(var0.cEy);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      if (var1.length == var8 * 3) {
         var9.clear();
         var9.put(var1, var8, var8).position(0);
         var9.position(0).limit(var8);
      }

      .pz.bW(var0.cEx);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      if (var1.length == var8 * 3) {
         var9.clear();
         var9.put(var1, var8 * 2, var8);
         var9.position(0).limit(var8);
      }

      .pz.bW(var0.cEw);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      .pz.bQ(33984);
   }

   public static void w(int[] var0, int var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = var1;
      int var7 = var2;
      int var8 = var3;

      for(int var9 = var4; var6 > 0 && var7 > 0; var9 /= 2) {
         GL11.glCopyTexSubImage2D(3553, var5, var8, var9, 0, 0, var6, var7);
         ++var5;
         var6 /= 2;
         var7 /= 2;
         var8 /= 2;
      }

   }

   public static void bL(int var0, int var1) {
      if (net.optifine.shaders.F.cLF && .pz.nD() == 33984) {
         .pz.bQ(33986);
         .pz.bW(var0);
         .pz.bQ(33987);
         .pz.bW(var1);
         .pz.bQ(33984);
      }

   }

   public static boolean e(int[] var0, int var1, int var2) {
      int var3 = var1 * var2;
      if (var0[0] >>> 24 == 255 && var0[var3 - 1] == 0) {
         return true;
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = var0[var4] >>> 24;
            if (var5 != 0 && var5 != 255) {
               return true;
            }
         }

         return false;
      }
   }

   public static void q(net.optifine.shaders.h var0, int[] var1, int var2, int var3, boolean var4, boolean var5) {
      int var6 = var4 ? 9729 : 9728;
      int var7 = var5 ? '脯' : 10497;
      int var8 = var2 * var3;
      IntBuffer var9 = jq(var8);
      var9.clear();
      var9.put(var1, 0, var8).position(0).limit(var8);
      .pz.bW(var0.cEy);
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, 32993, 33639, var9);
      GL11.glTexParameteri(3553, 10241, var6);
      GL11.glTexParameteri(3553, 10240, var6);
      GL11.glTexParameteri(3553, 10242, var7);
      GL11.glTexParameteri(3553, 10243, var7);
      var9.put(var1, var8, var8).position(0).limit(var8);
      .pz.bW(var0.cEx);
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, 32993, 33639, var9);
      GL11.glTexParameteri(3553, 10241, var6);
      GL11.glTexParameteri(3553, 10240, var6);
      GL11.glTexParameteri(3553, 10242, var7);
      GL11.glTexParameteri(3553, 10243, var7);
      var9.put(var1, var8 * 2, var8).position(0).limit(var8);
      .pz.bW(var0.cEw);
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, 32993, 33639, var9);
      GL11.glTexParameteri(3553, 10241, var6);
      GL11.glTexParameteri(3553, 10240, var6);
      GL11.glTexParameteri(3553, 10242, var7);
      GL11.glTexParameteri(3553, 10243, var7);
      .pz.bW(var0.cEy);
   }

   public static void q(.tU var0, String var1, int[][] var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      net.optifine.shaders.h var9 = var0.aul;
      .tY.q(var2, var3, var4, var5, var6, var7, var8);
      boolean var10 = false;
      if (net.optifine.shaders.F.cLW) {
         int[][] var11 = q(var0, var1 + .r.q[25071 & -26161], var3, var4, var2.length, var10, -8421377);
         .pz.bW(var9.cEx);
         .tY.q(var11, var3, var4, var5, var6, var7, var8);
      }

      if (net.optifine.shaders.F.cMA) {
         int[][] var12 = q(var0, var1 + .r.q[27095 & 472], var3, var4, var2.length, var10, 0);
         .pz.bW(var9.cEw);
         .tY.q(var12, var3, var4, var5, var6, var7, var8);
      }

      .pz.bW(var9.cEy);
   }

   public static int[][] q(.tO var0, int[][] var1, int var2, int var3) {
      boolean var4 = true;
      return var1;
   }

   public static void al(int var0, int var1, int var2) {
      if (net.optifine.shaders.F.cLF && .pz.nD() == 33984) {
         .pz.bQ(33986);
         .pz.bW(var1);
         .pz.bQ(33987);
         .pz.bW(var2);
         .pz.bQ(33984);
      }

      .pz.bW(var0);
   }

   public static void q(int var0, int[] var1, int var2, int var3, .tD var4) {
      net.optifine.shaders.h var5 = var4.rH();
      .pz.bW(var5.cEy);
      q(var1, var2, var3, 0, 0, 0);
      .pz.bW(var5.cEx);
      q(var1, var2, var3, 0, 0, 1);
      .pz.bW(var5.cEw);
      q(var1, var2, var3, 0, 0, 2);
      .pz.bW(var5.cEy);
   }

   public static void akK() {
      .tS var0 = .hS.eV().fJ();
      .tF var1 = var0.f(.tU.awb);
      if (var1 != null) {
         net.optifine.shaders.h var2 = var1.rH();
         .pz.bW(var2.cEy);
         GL11.glTexParameteri(3553, 10241, net.optifine.shaders.F.cHo[net.optifine.shaders.F.cLb]);
         GL11.glTexParameteri(3553, 10240, net.optifine.shaders.F.cLt[net.optifine.shaders.F.cJT]);
         .pz.bW(var2.cEx);
         GL11.glTexParameteri(3553, 10241, net.optifine.shaders.F.cHo[net.optifine.shaders.F.cLV]);
         GL11.glTexParameteri(3553, 10240, net.optifine.shaders.F.cLt[net.optifine.shaders.F.cIe]);
         .pz.bW(var2.cEw);
         GL11.glTexParameteri(3553, 10241, net.optifine.shaders.F.cHo[net.optifine.shaders.F.cKi]);
         GL11.glTexParameteri(3553, 10240, net.optifine.shaders.F.cLt[net.optifine.shaders.F.cJl]);
         .pz.bW(0);
      }

   }

   public static int[][] w(int[][] var0, int var1, int var2, int var3) {
      int var4 = var0.length;
      int[][] var5 = new int[var4][];

      for(int var6 = 0; var6 < var4; ++var6) {
         int[] var7 = var0[var6];
         if (var7 != null) {
            int var8 = (var1 >> var6) * (var2 >> var6);
            int[] var9 = new int[var8 * 3];
            var5[var6] = var9;
            int var10 = var7.length / 3;
            int var11 = var8 * var3;
            int var12 = 0;
            System.arraycopy(var7, var11, var9, var12, var8);
            var11 = var11 + var10;
            var12 = var12 + var8;
            System.arraycopy(var7, var11, var9, var12, var8);
            var11 = var11 + var10;
            var12 = var12 + var8;
            System.arraycopy(var7, var11, var9, var12, var8);
         }
      }

      return var5;
   }

   public static void jp(int var0) {
      net.optifine.shaders.h var1 = (net.optifine.shaders.h)cOv.get(Integer.valueOf(var0));
      q(var1);
   }

   public static IntBuffer jq(int var0) {
      if (cOt.capacity() < var0) {
         int var1 = jt(var0);
         alN = BufferUtils.createByteBuffer(var1 * 4);
         cOt = alN.asIntBuffer();
      }

      return cOt;
   }

   public static IntBuffer bM(int var0, int var1) {
      int[] var2 = js(var0);
      IntBuffer var3 = jq(var0);
      Arrays.fill(btO, 0, var0, var1);
      cOt.put(btO, 0, var0);
      return cOt;
   }

   public static int am(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      return ((var0 >>> 24 & 255) * var2 + (var1 >>> 24 & 255) * var3) / 255 << 24 | ((var0 >>> 16 & 255) * var2 + (var1 >>> 16 & 255) * var3) / 255 << 16 | ((var0 >>> 8 & 255) * var2 + (var1 >>> 8 & 255) * var3) / 255 << 8 | ((var0 >>> 0 & 255) * var2 + (var1 >>> 0 & 255) * var3) / 255 << 0;
   }

   public static int[] jr(int var0) {
      int[] var1 = new int[var0 * 3];
      Arrays.fill(var1, 0, var0, 0);
      Arrays.fill(var1, var0, var0 * 2, -8421377);
      Arrays.fill(var1, var0 * 2, var0 * 3, 0);
      return var1;
   }

   public static void q(int[][] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 * var2;
      IntBuffer var7 = jq(var6);
      int var8 = var0.length;
      int var9 = 0;
      int var10 = var1;
      int var11 = var2;
      int var12 = var3;

      for(int var13 = var4; var10 > 0 && var11 > 0 && var9 < var8; ++var9) {
         int var14 = var10 * var11;
         int[] var15 = var0[var9];
         var7.clear();
         if (var15.length >= var14 * (var5 + 1)) {
            var7.put(var15, var14 * var5, var14).position(0).limit(var14);
            GL11.glTexSubImage2D(3553, var9, var12, var13, var10, var11, 32993, 33639, var7);
         }

         var10 >>= 1;
         var11 >>= 1;
         var12 >>= 1;
         var13 >>= 1;
      }

      var7.clear();
   }

   public static int[][] q(.tU var0, String var1, int var2, int var3, int var4, boolean var5, int var6) {
      net.optifine.shaders.h var7 = var0.aul;
      int[][] var8 = new int[var4][];
      int[] var9;
      var8[0] = var9 = new int[var2 * var3];
      boolean var10 = false;
      BufferedImage var11 = O(var0.h(new .PJ(var1)));
      if (var11 != null) {
         int var12 = var11.getWidth();
         int var13 = var11.getHeight();
         if (var12 + (var5 ? 16 : 0) == var2) {
            var10 = true;
            var11.getRGB(0, 0, var12, var12, var9, 0, var12);
         }
      }

      if (!var10) {
         Arrays.fill(var9, var6);
      }

      .pz.bW(var7.cEw);
      var8 = w(var8.length - 1, var2, var8);
      return var8;
   }

   public static int[] js(int var0) {
      if (btO == null) {
         btO = new int[1048576];
      }

      if (btO.length < var0) {
         btO = new int[jt(var0)];
      }

      return btO;
   }

   public static void q(.tO var0, int[] var1) {
   }

   public static void q(int var0, int var1, int var2, .tD var3) {
      net.optifine.shaders.h var4 = var3.rH();
      int[] var5 = var3.rK();
      int var6 = var1 * var2;
      Arrays.fill(var5, var6, var6 * 2, -8421377);
      Arrays.fill(var5, var6 * 2, var6 * 3, 0);
      .tY.b(var4.cEy, var1, var2);
      .tY.r(false, false);
      .tY.X(false);
      .tY.b(var4.cEx, var1, var2);
      .tY.r(false, false);
      .tY.X(false);
      .tY.b(var4.cEw, var1, var2);
      .tY.r(false, false);
      .tY.X(false);
      .pz.bW(var4.cEy);
   }

   public static int q(int var0, BufferedImage var1, boolean var2, boolean var3, .uL var4, .PJ var5, net.optifine.shaders.h var6) {
      int var7 = var1.getWidth();
      int var8 = var1.getHeight();
      int var9 = var7 * var8;
      int[] var10 = js(var9 * 3);
      var1.getRGB(0, 0, var7, var8, var10, 0, var7);
      q(var4, var5, var7, var8, var10);
      q(var6, var10, var7, var8, var2, var3);
      return var0;
   }

   public static net.optifine.shaders.h q(.tC var0) {
      net.optifine.shaders.h var1 = var0.aul;
      if (var1 == null) {
         int var2 = var0.pv();
         var1 = (net.optifine.shaders.h)cOv.get(Integer.valueOf(var2));
         if (var1 == null) {
            var1 = new net.optifine.shaders.h(var2, GL11.glGenTextures(), GL11.glGenTextures());
            cOv.put(Integer.valueOf(var2), var1);
         }

         var0.aul = var1;
      }

      return var1;
   }

   public static void w(int[] var0, int var1, int var2, int var3) {
      Math.min(var2, var3);
      int var4 = var1;
      int var5 = var2;
      int var6 = var3;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      int var10;
      for(var10 = 0; var5 > 1 && var6 > 1; var4 = var7) {
         var7 = var4 + var5 * var6;
         var8 = var5 / 2;
         var9 = var6 / 2;

         for(int var11 = 0; var11 < var9; ++var11) {
            int var12 = var7 + var11 * var8;
            int var13 = var4 + var11 * 2 * var5;

            for(int var14 = 0; var14 < var8; ++var14) {
               var0[var12 + var14] = P(var0[var13 + var14 * 2], var0[var13 + var14 * 2 + 1], var0[var13 + var5 + var14 * 2], var0[var13 + var5 + var14 * 2 + 1]);
            }
         }

         ++var10;
         var5 = var8;
         var6 = var9;
      }

      while(var10 > 0) {
         --var10;
         var5 = var2 >> var10;
         var6 = var3 >> var10;
         var4 = var7 - var5 * var6;
         int var19 = var4;

         for(int var20 = 0; var20 < var6; ++var20) {
            for(int var21 = 0; var21 < var5; ++var21) {
               if (var0[var19] == 0) {
                  var0[var19] = var0[var7 + var20 / 2 * var8 + var21 / 2] & 16777215;
               }

               ++var19;
            }
         }

         var7 = var4;
         var8 = var5;
      }

   }

   public static int O(int var0, int var1, int var2, int var3) {
      int var4 = ((var0 >>> 24 & 255) + (var1 >>> 24 & 255) + (var2 >>> 24 & 255) + (var3 >>> 24 & 255) + 2) / 4 << 24 | ((var0 >>> 16 & 255) + (var1 >>> 16 & 255) + (var2 >>> 16 & 255) + (var3 >>> 16 & 255) + 2) / 4 << 16 | ((var0 >>> 8 & 255) + (var1 >>> 8 & 255) + (var2 >>> 8 & 255) + (var3 >>> 8 & 255) + 2) / 4 << 8 | ((var0 >>> 0 & 255) + (var1 >>> 0 & 255) + (var2 >>> 0 & 255) + (var3 >>> 0 & 255) + 2) / 4 << 0;
      return var4;
   }

   public static int P(int var0, int var1, int var2, int var3) {
      int var4 = var0 >>> 24 & 255;
      int var5 = var1 >>> 24 & 255;
      int var6 = var2 >>> 24 & 255;
      int var7 = var3 >>> 24 & 255;
      int var8 = var4 + var5 + var6 + var7;
      int var9 = (var8 + 2) / 4;
      int var10;
      if (var8 != 0) {
         var10 = var8;
      } else {
         var10 = 4;
         var4 = 1;
         var5 = 1;
         var6 = 1;
         var7 = 1;
      }

      int var11 = (var10 + 1) / 2;
      int var12 = var9 << 24 | ((var0 >>> 16 & 255) * var4 + (var1 >>> 16 & 255) * var5 + (var2 >>> 16 & 255) * var6 + (var3 >>> 16 & 255) * var7 + var11) / var10 << 16 | ((var0 >>> 8 & 255) * var4 + (var1 >>> 8 & 255) * var5 + (var2 >>> 8 & 255) * var6 + (var3 >>> 8 & 255) * var7 + var11) / var10 << 8 | ((var0 >>> 0 & 255) * var4 + (var1 >>> 0 & 255) * var5 + (var2 >>> 0 & 255) * var6 + (var3 >>> 0 & 255) * var7 + var11) / var10 << 0;
      return var12;
   }

   private static void q(.uL var0, .PJ var1, int var2, int var3, int[] var4, int var5, int var6) {
      if (!q(var0, var1, var2, var3, var4, var5)) {
         Arrays.fill(var4, var5, var5 + var2 * var3, var6);
      }

   }

   public static void q(.tC var0, int var1) {
      net.optifine.shaders.h var2 = var0.aul;
      if (var2 != null) {
         var0.aul = null;
         cOv.remove(Integer.valueOf(var2.cEy));
         .pz.cd(var2.cEx);
         .pz.cd(var2.cEw);
         if (var2.cEy != var1) {
            net.optifine.shaders.x.fu(.p.q[-22915 & 19261] + var2.cEy + .p.q[639 & 4030] + var1);
            .pz.cd(var2.cEy);
         }
      }

   }

   public static void e(int[] var0, int var1, int var2, int var3) {
   }

   public static void w(net.optifine.shaders.h var0) {
      bL(var0.cEx, var0.cEw);
   }

   private static boolean q(.uL var0, .PJ var1, int var2, int var3, int[] var4, int var5) {
      if (var1 == null) {
         return false;
      } else {
         try {
            .uK var6 = var0.w(var1);
            BufferedImage var7 = ImageIO.read(var6.getInputStream());
            if (var7 == null) {
               return false;
            } else if (var7.getWidth() == var2 && var7.getHeight() == var3) {
               var7.getRGB(0, 0, var2, var3, var4, var5, var2);
               return true;
            } else {
               return false;
            }
         } catch (IOException var8) {
            return false;
         }
      }
   }

   public static void q(.uL var0, .PJ var1, int var2, int var3, int[] var4) {
      if (net.optifine.shaders.F.cLW) {
         q(var0, e(var1, .u.q[25599 & 8183]), var2, var3, var4, var2 * var3, -8421377);
      }

      if (net.optifine.shaders.F.cMA) {
         q(var0, e(var1, .e.q[25827 & 4578]), var2, var3, var4, var2 * var3 * 2, 0);
      }

   }

   public static void q(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 * var2;
      IntBuffer var7 = jq(var6);
      var7.clear();
      int var8 = var5 * var6;
      if (var0.length >= var8 + var6) {
         var7.put(var0, var8, var6).position(0).limit(var6);
         GL11.glTexSubImage2D(3553, 0, var3, var4, var1, var2, 32993, 33639, var7);
         var7.clear();
      }

   }

   public static void q(.tJ var0, .uL var1, List var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int[] var6 = null;

      for(Object var8 : var2) {
         String var9 = (String)var8;
         if (var9 != null) {
            try {
               .PJ var10 = new .PJ(var9);
               InputStream var11 = var1.w(var10).getInputStream();
               BufferedImage var12 = ImageIO.read(var11);
               if (var5 == 0) {
                  var3 = var12.getWidth();
                  var4 = var12.getHeight();
                  var5 = var3 * var4;
                  var6 = bK(var5, 0);
               }

               int[] var13 = js(var5 * 3);
               var12.getRGB(0, 0, var3, var4, var13, 0, var3);
               q(var1, var10, var3, var4, var13);

               for(int var14 = 0; var14 < var5; ++var14) {
                  int var15 = var13[var14] >>> 24 & 255;
                  var6[0 + var14] = am(var13[0 + var14], var6[0 + var14], var15);
                  var6[var5 + var14] = am(var13[var5 + var14], var6[var5 + var14], var15);
                  var6[var5 * 2 + var14] = am(var13[var5 * 2 + var14], var6[var5 * 2 + var14], var15);
               }
            } catch (IOException var16) {
               var16.printStackTrace();
            }
         }
      }

      q(var0.rH(), var6, var3, var4, false, false);
   }

   public static void q(int var0, int var1, int var2, int var3, .tL var4, .tU var5) {
      net.optifine.shaders.x.fv(.p.q[-32065 & 575] + var1 + .q.q[4426 & 28622] + var2 + .q.q[-32401 & 21850] + var3 + .q.q[6478 & -31798]);
      var5.avR = var2;
      var5.avX = var3;
      net.optifine.shaders.h var6 = q((.tC)var5);
      .tY.n(var6.cEy, var1, var2, var3);
      if (net.optifine.shaders.F.cLW) {
         .tY.n(var6.cEx, var1, var2, var3);
      }

      if (net.optifine.shaders.F.cMA) {
         .tY.n(var6.cEw, var1, var2, var3);
      }

      .pz.bW(var0);
   }

   public static void q(.tF var0) {
      int var1 = var0.pv();
      q(var0.rH());
      if (.pz.nD() == 33984) {
         int var2 = net.optifine.shaders.F.cIH;
         int var3 = net.optifine.shaders.F.cJD;
         if (var0 instanceof .tU) {
            net.optifine.shaders.F.cIH = ((.tU)var0).avR;
            net.optifine.shaders.F.cJD = ((.tU)var0).avX;
         } else {
            net.optifine.shaders.F.cIH = 0;
            net.optifine.shaders.F.cJD = 0;
         }

         if (net.optifine.shaders.F.cIH != var2 || net.optifine.shaders.F.cJD != var3) {
            net.optifine.shaders.F.cIB.bO(net.optifine.shaders.F.cIH, net.optifine.shaders.F.cJD);
         }
      }

   }

   public static BufferedImage O(.PJ var0) {
      try {
         if (!.MV.H(var0)) {
            return null;
         } else {
            InputStream var1 = .MV.b(var0);
            if (var1 == null) {
               return null;
            } else {
               BufferedImage var2 = ImageIO.read(var1);
               var1.close();
               return var2;
            }
         }
      } catch (IOException var3) {
         return null;
      }
   }

   public static int jt(int var0) {
      int var1 = var0 - 1;
      var1 = var1 | var1 >> 1;
      var1 = var1 | var1 >> 2;
      var1 = var1 | var1 >> 4;
      var1 = var1 | var1 >> 8;
      var1 = var1 | var1 >> 16;
      return var1 + 1;
   }
}

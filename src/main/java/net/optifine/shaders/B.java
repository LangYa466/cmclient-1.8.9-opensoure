package net.optifine.shaders;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;

public class b {
   int cFa;
   boolean cFb;
   int cFc;
   boolean cFd;
   int cFe = 0;
   boolean cFf;
   long[] cFg = new long[10];
   int cFh;
   boolean cFi;
   int cFj;

   public void L(long var1) {
      ++this.cFe;
      this.cFg[this.cFe] = var1;
   }

   public static void e(.qq var0) {
      net.optifine.shaders.b var1 = var0.alL;
      .uu var2 = var0.pQ();
      var1.cFh = var2.sT() / 4;
      var1.cFi = var2.sS();
      var1.cFf = var1.cFi;
      var1.cFd = var2.dc(0);
      var1.cFa = var1.cFi ? var2.sV() / 4 : 0;
      var1.cFc = var1.cFd ? var2.da(0) / 4 : 0;
      var1.cFj = 8;
   }

   public static boolean q(boolean var0, .qq var1) {
      var1.alL.ais();
      return var0;
   }

   public static void q(int var0, int var1, int var2, .qq var3) {
      if (var2 != 0) {
         .uu var4 = var3.pQ();
         int var5 = var4.sT();
         if (var5 == 56) {
            ByteBuffer var6 = var3.pN();
            var6.position(32);
            GL20.glVertexAttribPointer(net.optifine.shaders.F.cKT, 2, 5126, false, var5, var6);
            var6.position(40);
            GL20.glVertexAttribPointer(net.optifine.shaders.F.cIM, 4, 5122, false, var5, var6);
            var6.position(48);
            GL20.glVertexAttribPointer(net.optifine.shaders.F.cLe, 3, 5122, false, var5, var6);
            var6.position(0);
            GL20.glEnableVertexAttribArray(net.optifine.shaders.F.cKT);
            GL20.glEnableVertexAttribArray(net.optifine.shaders.F.cIM);
            GL20.glEnableVertexAttribArray(net.optifine.shaders.F.cLe);
            .pz.l(var0, var1, var2);
            GL20.glDisableVertexAttribArray(net.optifine.shaders.F.cKT);
            GL20.glDisableVertexAttribArray(net.optifine.shaders.F.cIM);
            GL20.glDisableVertexAttribArray(net.optifine.shaders.F.cLe);
         } else {
            .pz.l(var0, var1, var2);
         }
      }

   }

   public void q(.qq var1, int var2) {
      FloatBuffer var3 = var1.alE;
      IntBuffer var4 = var1.alG;
      int var5 = var1.pA();
      float var6 = var3.get(var2 + 0);
      float var7 = var3.get(var2 + 0 + 1);
      float var8 = var3.get(var2 + 0 + 2);
      float var9 = var3.get(var2 + 0 + this.cFc);
      float var10 = var3.get(var2 + 0 + this.cFc + 1);
      float var11 = var3.get(var2 + this.cFh);
      float var12 = var3.get(var2 + this.cFh + 1);
      float var13 = var3.get(var2 + this.cFh + 2);
      float var14 = var3.get(var2 + this.cFh + this.cFc);
      float var15 = var3.get(var2 + this.cFh + this.cFc + 1);
      float var16 = var3.get(var2 + 2 * this.cFh);
      float var17 = var3.get(var2 + 2 * this.cFh + 1);
      float var18 = var3.get(var2 + 2 * this.cFh + 2);
      float var19 = var3.get(var2 + 2 * this.cFh + this.cFc);
      float var20 = var3.get(var2 + 2 * this.cFh + this.cFc + 1);
      float var21 = var3.get(var2 + 3 * this.cFh);
      float var22 = var3.get(var2 + 3 * this.cFh + 1);
      float var23 = var3.get(var2 + 3 * this.cFh + 2);
      float var24 = var3.get(var2 + 3 * this.cFh + this.cFc);
      float var25 = var3.get(var2 + 3 * this.cFh + this.cFc + 1);
      float var26 = var16 - var6;
      float var27 = var17 - var7;
      float var28 = var18 - var8;
      float var29 = var21 - var11;
      float var30 = var22 - var12;
      float var31 = var23 - var13;
      float var32 = var27 * var31 - var30 * var28;
      float var33 = var28 * var29 - var31 * var26;
      float var34 = var26 * var30 - var29 * var27;
      float var35 = var32 * var32 + var33 * var33 + var34 * var34;
      float var36 = (double)var35 != 0.0D ? (float)(1.0D / Math.sqrt((double)var35)) : 1.0F;
      var32 = var32 * var36;
      var33 = var33 * var36;
      var34 = var34 * var36;
      var26 = var11 - var6;
      var27 = var12 - var7;
      var28 = var13 - var8;
      float var37 = var14 - var9;
      float var38 = var15 - var10;
      var29 = var16 - var6;
      var30 = var17 - var7;
      var31 = var18 - var8;
      float var39 = var19 - var9;
      float var40 = var20 - var10;
      float var41 = var37 * var40 - var39 * var38;
      float var42 = var41 != 0.0F ? 1.0F / var41 : 1.0F;
      float var43 = (var40 * var26 - var38 * var29) * var42;
      float var44 = (var40 * var27 - var38 * var30) * var42;
      float var45 = (var40 * var28 - var38 * var31) * var42;
      float var46 = (var37 * var29 - var39 * var26) * var42;
      float var47 = (var37 * var30 - var39 * var27) * var42;
      float var48 = (var37 * var31 - var39 * var28) * var42;
      var35 = var43 * var43 + var44 * var44 + var45 * var45;
      var36 = (double)var35 != 0.0D ? (float)(1.0D / Math.sqrt((double)var35)) : 1.0F;
      var43 = var43 * var36;
      var44 = var44 * var36;
      var45 = var45 * var36;
      var35 = var46 * var46 + var47 * var47 + var48 * var48;
      var36 = (double)var35 != 0.0D ? (float)(1.0D / Math.sqrt((double)var35)) : 1.0F;
      var46 = var46 * var36;
      var47 = var47 * var36;
      var48 = var48 * var36;
      float var49 = var34 * var44 - var33 * var45;
      float var50 = var32 * var45 - var34 * var43;
      float var51 = var33 * var43 - var32 * var44;
      float var52 = var46 * var49 + var47 * var50 + var48 * var51 < 0.0F ? -1.0F : 1.0F;
      int var53 = (int)(var32 * 127.0F) & 255;
      int var54 = (int)(var33 * 127.0F) & 255;
      int var55 = (int)(var34 * 127.0F) & 255;
      int var56 = (var55 << 16) + (var54 << 8) + var53;
      var4.put(var2 + 0 + this.cFa, var56);
      var4.put(var2 + this.cFh + this.cFa, var56);
      var4.put(var2 + 2 * this.cFh + this.cFa, var56);
      var4.put(var2 + 3 * this.cFh + this.cFa, var56);
      int var57 = ((int)(var43 * 32767.0F) & '\uffff') + (((int)(var44 * 32767.0F) & '\uffff') << 16);
      int var58 = ((int)(var45 * 32767.0F) & '\uffff') + (((int)(var52 * 32767.0F) & '\uffff') << 16);
      var4.put(var2 + 0 + 10, var57);
      var4.put(var2 + 0 + 10 + 1, var58);
      var4.put(var2 + this.cFh + 10, var57);
      var4.put(var2 + this.cFh + 10 + 1, var58);
      var4.put(var2 + 2 * this.cFh + 10, var57);
      var4.put(var2 + 2 * this.cFh + 10 + 1, var58);
      var4.put(var2 + 3 * this.cFh + 10, var57);
      var4.put(var2 + 3 * this.cFh + 10 + 1, var58);
      float var59 = (var9 + var14 + var19 + var24) / 4.0F;
      float var60 = (var10 + var15 + var20 + var25) / 4.0F;
      var3.put(var2 + 0 + 8, var59);
      var3.put(var2 + 0 + 8 + 1, var60);
      var3.put(var2 + this.cFh + 8, var59);
      var3.put(var2 + this.cFh + 8 + 1, var60);
      var3.put(var2 + 2 * this.cFh + 8, var59);
      var3.put(var2 + 2 * this.cFh + 8 + 1, var60);
      var3.put(var2 + 3 * this.cFh + 8, var59);
      var3.put(var2 + 3 * this.cFh + 8 + 1, var60);
   }

   public static void r(.qq var0) {
      if (var0.pQ().sS() && var0.alI == 7 && var0.alP % 4 == 0) {
         net.optifine.shaders.b var1 = var0.alL;
         e(var0);
         int var2 = var0.alP * var1.cFh;

         for(int var3 = 0; var3 < var2; var3 += var1.cFh * 4) {
            var1.q(var0, var3);
         }
      }

   }

   public static void t(.qq var0) {
      net.optifine.shaders.b var1 = var0.alL;
      if (var1.cFh == 14) {
         if (var0.alI == 7 && var0.alP % 4 == 0) {
            var1.q(var0, var0.pA() - 4 * var1.cFh);
         }

         long var2 = var1.cFg[var1.cFe];
         int var4 = var0.pA() - 14 + 12;
         var0.alG.put(var4, (int)var2);
         var0.alG.put(var4 + 1, (int)(var2 >> 32));
      }

   }

   public void ais() {
      this.cFg[this.cFe] = 0L;
      --this.cFe;
   }

   public static void w(.hI var0, .NW var1, .Qx var2, .qq var3) {
      .cv var4 = var0.ds();
      int var5;
      int var6;
      if (var0 instanceof .hE) {
         .hE var7 = (.hE)var0;
         var5 = var7.eG();
         var6 = var7.dm();
      } else {
         var5 = .cv.w(var4);
         var6 = var4.e(var0);
      }

      int var11 = net.optifine.shaders.w.bF(var5, var6);
      if (var11 >= 0) {
         var5 = var11;
      }

      int var8 = var4.cC();
      int var9 = ((var8 & '\uffff') << 16) + (var5 & '\uffff');
      int var10 = var6 & '\uffff';
      var3.alL.L(((long)var10 << 32) + (long)var9);
   }

   public static void q(.qq var0, ByteBuffer var1) {
      if (var0.alP == 0) {
         e(var0);
      }

      net.optifine.shaders.b var2 = var0.alL;
      if (var2.cFh == 14) {
         long var3 = var2.cFg[var2.cFe];
         int var5 = var1.limit() / 4;

         for(int var6 = 12; var6 + 1 < var5; var6 += 14) {
            int var7 = (int)var3;
            int var8 = (int)(var3 >> 32);
            var1.putInt(var6 * 4, var7);
            var1.putInt((var6 + 1) * 4, var8);
         }
      }

   }

   public static void y(.qq var0) {
      if (var0.alP == 0) {
         e(var0);
      }

   }

   public static void u(.qq var0) {
      var0.alL = new net.optifine.shaders.b();
   }

   public static void q(.qq var0, int[] var1) {
      if (var0.alP == 0) {
         e(var0);
      }

      net.optifine.shaders.b var2 = var0.alL;
      if (var2.cFh == 14) {
         long var3 = var2.cFg[var2.cFe];

         for(int var5 = 12; var5 + 1 < var1.length; var5 += 14) {
            var1[var5] = (int)var3;
            var1[var5 + 1] = (int)(var3 >> 32);
         }
      }

   }

   public static void i(.qq var0) {
      net.optifine.shaders.b var1 = var0.alL;
      if (var1.cFh == 14 && var0.alI == 7 && var0.alP % 4 == 0) {
         var1.q(var0, var0.pA() - 4 * var1.cFh);
      }

   }

   public static void o(.qq var0) {
      var0.alL.ais();
   }

   public b() {
      this.cFg[this.cFe] = 0L;
   }
}

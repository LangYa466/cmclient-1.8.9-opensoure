import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class aih {
   private static final IntBuffer dzZ = py.bL(138940616 & 1094878240);
   private final uL dAa;
   private final Map dAb = Maps.newHashMap();
   private static final Logger dAc = LogManager.getLogger();

   public static void q(int var0, BufferedImage var1, boolean var2) {
      b(var0, var1.getWidth(), var1.getHeight());
      w(var0, var1, var2);
   }

   private static void q(BufferedImage var0, boolean var1) {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = (-1805385578 & 22602273) / var2;
      int[] var5 = new int[var4 * var2];
      GL11.glTexParameteri(8167 & -12815, 14355 & 10793, 14211 & -22777);
      X(var1);

      for(int var6 = 3072 & -32768; var6 < var2 * var3; var6 += var2 * var4) {
         int var7 = var6 / var2;
         int var8 = Math.min(var4, var3 - var7);
         int var9 = var2 * var8;
         var0.getRGB(5124 & 2322, var7, var2, var8, var5, 12 & 5121, var2);
         q(var5, var9);
         GL11.glTexSubImage2D(-24591 & 3553, 10528 & -27431, 6216 & 20, var7, var2, var8, 696287477 & 70233577, -2146073745 & 183150455, dzZ);
      }

   }

   private static void r(int[] var0, int var1) {
      int[] var2 = var0;
      if (hS.eV().Br.aDR) {
         var2 = i(var0);
      }

      dzZ.clear();
      dzZ.put(var2, 25346 & 4180, var1);
      dzZ.position(1084 & 28672).limit(var1);
   }

   public aih(uL var1) {
      this.dAa = var1;
   }

   public static int[] i(int[] var0) {
      int[] var1 = new int[var0.length];

      for(int var2 = 112 & 3592; var2 < var0.length; ++var2) {
         int var3 = var0[var2] >> (3390 & 8216) & -32513 & 767;
         int var4 = var0[var2] >> (18512 & 8731) & 26879 & 1279;
         int var5 = var0[var2] >> (8200 & 17866) & -30977 & 29183;
         int var6 = var0[var2] & -30465 & 4351;
         int var7 = (var4 * (31 & 20510) + var5 * (1339 & 12987) + var6 * (24715 & -32693)) / (28900 & -32668);
         int var8 = (var4 * (16926 & 12318) + var5 * (-7969 & 2118)) / (12389 & -16284);
         int var9 = (var4 * (5535 & 24606) + var6 * (16998 & 14406)) / (16484 & 6500);
         var1[var2] = var3 << (-24552 & 2495) | var7 << (18001 & 20) | var8 << (236 & 26) | var9;
      }

      return var1;
   }

   private static void X(boolean var0) {
      if (var0) {
         GL11.glTexParameteri(24059 & 4065, 11278 & 14402, 31050 & 12032);
         GL11.glTexParameteri(4081 & 3567, 14391 & 10499, 32000 & 11122);
      } else {
         GL11.glTexParameteri(8167 & 3561, 10318 & 10242, 15625 & -5835);
         GL11.glTexParameteri(3567 & 3569, 27515 & 11271, -21239 & 14657);
      }

   }

   private static void b(int var0, int var1, int var2) {
      GL11.glDeleteTextures(var0);
      GL11.glBindTexture(3565 & 32225, var0);
      GL11.glTexImage2D(-29215 & 19953, 2099 & 8196, -26280 & 6537, var1, var2, 2114 & 20789, '釡' & -1608464141, 165735 & 944280575, (IntBuffer)null);
   }

   private static void q(int[] var0, int var1) {
      r(var0, var1);
   }

   public void S(PJ var1) {
      Object var2 = (tF)this.dAb.get(var1);
      if (var2 == null) {
         var2 = new aii(var1);
         this.w(var1, (tF)var2);
      }

      pz.bW(((tF)var2).pv());
   }

   public void w(PJ var1, tF var2) {
      try {
         var2.w(this.dAa);
      } catch (IOException var6) {
         Logger var10000 = dAc;
         String var10001 = i.q[-20880 & 9008 & -17990 & 6589];
         Object[] var10002 = new Object[18014 & 12290];
         var10002[21058 & 8221] = var1;
         var10002[897 & 20523] = var6;
         var10000.warn(var10001, var10002);
         this.dAb.put(var1, var2);
      } catch (Throwable var7) {
         xW var4 = xW.q(var7, w.q[18815 & 11103 & 20348 & 6143]);
         ye var5 = var4.bd(w.q[29693 & -18435 & -25251 & -29219]);
         var5.w(w.q[4446 & 7167 & 13695 & 10079], var1);
         var5.q(w.q[-14337 & -15873 & 12639 & -19585], () -> {
            return var2.getClass().getName();
         });
         throw new PI(var4);
      }

      this.dAb.put(var1, var2);
   }

   private static void w(int var0, BufferedImage var1, boolean var2) {
      GL11.glBindTexture(24041 & -28699, var0);
      q(var1, var2);
      GL30.glGenerateMipmap(-29205 & 3553);
   }
}

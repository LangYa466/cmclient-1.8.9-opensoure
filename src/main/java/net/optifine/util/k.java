package net.optifine.util;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class K {
   public static .tO cWi;
   public static final String cWj = "lava_flow";
   public static final String cWk = "coal_ore";
   public static final String cWl = "lava_still";
   public static final String cWm = "leaves_oak";
   public static final String cWn = "leaves_birch";
   public static final String cWo = "gold_ore";
   public static .tO cWp;
   public static final String cWq = "fire_layer_0";
   public static final String cWr = "stone";
   public static final String cWs = "bedrock";
   public static .tO cWt;
   public static final String cWu = "leaves_jungle";
   public static final String cWv = "compass";
   public static .tO cWw;
   public static final String cWx = "log_acacia_top";
   public static final String cWy = "sandstone_bottom";
   public static final String cWz = "grass_side_overlay";
   public static .tO cWA;
   public static .tO cWB;
   public static final String cWC = "netherrack";
   public static final String cWD = "fire_layer_1";
   public static final String cWE = "sand";
   public static .tO cWF;
   public static .tO cWG;
   public static .tO cWH;
   public static final String cWI = "obsidian";
   public static final String cWJ = "log_oak_top";
   public static final String cWK = "glowstone";
   public static final String cWL = "grass_side_snowed";
   public static final String cWM = "log_birch";
   public static final String cWN = "log_spruce";
   public static final String cWO = "leaves_spruce_opaque";
   public static final String cWP = "farmland_dry";
   public static .tO cWQ;
   public static final String cWR = "redstone_lamp_off";
   public static final String cWS = "cactus_side";
   public static final String cWT = "log_spruce_top";
   public static final String cWU = "log_jungle_top";
   public static final String cWV = "clay";
   public static final String cWW = "gravel";
   public static final String cWX = "sandstone_top";
   public static final String cWY = "log_big_oak";
   public static final String cWZ = "log_jungle";
   public static final String cXa = "leaves_spruce";
   public static final String cXb = "iron_ore";
   public static final String cXc = "end_stone";
   public static final String cXd = "snow";
   public static final String cXe = "log_oak";
   public static final String cXf = "log_birch_top";
   public static final String cXg = "log_big_oak_top";
   public static final String cXh = "mycelium_side";
   public static .tO cXi;
   public static .tO cXj;
   public static final String cXk = "water_still";
   public static final String cXl = "mycelium_top";
   public static final String cXm = "redstone_lamp_on";
   public static .tO cXn;
   public static final String cXo = "diamond_ore";
   public static final String cXp = "stone_slab_top";
   public static final String cXq = "grass_side";
   public static .tO cXr;
   public static final String cXs = "leaves_spruce";
   public static final String cXt = "water_flow";
   public static final String cXu = "lapis_ore";
   public static final String cXv = "dirt";
   public static final String cXw = "soul_sand";
   public static final String cXx = "portal";
   public static .tO cXy;
   public static final String cXz = "clock";
   public static final String cXA = "farmland_wet";
   public static final String cXB = "log_acacia";
   public static final String cXC = "leaves_acacia";
   public static final String cXD = "glass_pane_top";
   public static final String cXE = "minecraft:blocks/";
   public static final String cXF = "grass_top";
   public static final String cXG = "leaves_big_oak";
   public static .tO cXH;
   private static final IntBuffer cXI = .py.bL(256);
   public static final String cXJ = "minecraft:items/";
   public static .tO cXK;
   public static final String cXL = "glass";
   public static final String cXM = "coarse_dirt";
   public static final String cXN = "redstone_ore";
   public static final String cXO = "stone_slab_side";
   public static .tO cXP;

   public static int bW(int var0, int var1) {
      if (var0 == var1) {
         return var0;
      } else {
         int var2;
         for(var2 = var0 / var1 * var1; var2 < var0; var2 += var1) {
            ;
         }

         return var2;
      }
   }

   public static .tU fA() {
      return .hS.eV().fA();
   }

   public static BufferedImage q(BufferedImage var0, int var1) {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = var3 * var1 / var2;
      BufferedImage var5 = new BufferedImage(var1, var4, 2);
      Graphics2D var6 = var5.createGraphics();
      Object var7 = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      if (var1 < var2 || var1 % var2 != 0) {
         var7 = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
      }

      var6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, var7);
      var6.drawImage(var0, 0, 0, var1, var4, (ImageObserver)null);
      return var5;
   }

   public static int[] q(.tO var0, int var1, int var2) {
      List var3 = var0.sg();
      if (var3.size() <= var1) {
         return null;
      } else {
         int[][] var4 = (int[][])var3.get(var1);
         if (var4 != null && var4.length > var2) {
            int[] var5 = var4[var2];
            return var5;
         } else {
            return null;
         }
      }
   }

   public static int jJ(int var0) {
      int var1;
      for(var1 = 1; var1 < var0; var1 *= 2) {
         ;
      }

      return var1;
   }

   public static boolean gT(int var0) {
      int var1 = .Pq.gX(var0);
      return var1 == var0;
   }

   public static int amS() {
      for(int var0 = 65536; var0 > 0; var0 >>= 1) {
         .pz.w(32868, 0, 6408, var0, var0, 0, 6408, 5121, (IntBuffer)null);
         int var1 = GL11.glGetError();
         int var2 = .pz.z(32868, 0, 4096);
         if (var2 != 0) {
            return var0;
         }
      }

      return -1;
   }

   public static void w(String var0, int var1, int var2, int var3, int var4) {
      bW(var1);
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      File var5 = new File(var0);
      File var6 = var5.getParentFile();
      if (var6 != null) {
         var6.mkdirs();
      }

      for(int var7 = 0; var7 < 16; ++var7) {
         File var8 = new File(var0 + .q.q[559 & -28097] + var7 + .q.q[8460 & 2061]);
         var8.delete();
      }

      for(int var17 = 0; var17 <= var2; ++var17) {
         File var18 = new File(var0 + .q.q[7743 & 25327] + var17 + .q.q[-32756 & 16972]);
         int var9 = var3 >> var17;
         int var10 = var4 >> var17;
         int var11 = var9 * var10;
         IntBuffer var12 = BufferUtils.createIntBuffer(var11);
         int[] var13 = new int[var11];
         GL11.glGetTexImage(3553, var17, 32993, 33639, var12);
         var12.get(var13);
         BufferedImage var14 = new BufferedImage(var9, var10, 2);
         var14.setRGB(0, 0, var9, var10, var13, 0, var9);

         try {
            ImageIO.write(var14, .o.q[-32322 & 1062], var18);
            .MV.cM(.o.q[9210 & 475] + var18);
         } catch (Exception var16) {
            .MV.cJ(.o.q[-32289 & 11739] + var18);
            .MV.cJ(var16.getClass().getName() + .q.q[-18811 & 988] + var16.getMessage());
         }
      }

   }

   public static int jK(int var0) {
      int var1 = 1;

      for(int var2 = 0; var2 < var0; ++var2) {
         var1 *= 2;
      }

      return var1;
   }

   public static void amT() {
      .uL var0 = .MV.fF();
      if (var0 instanceof .uJ) {
         .uJ var1 = (.uJ)var0;
         net.optifine.util.L var2 = new net.optifine.util.L();
         var1.q(var2);
      }

      net.optifine.util.M var3 = new net.optifine.util.M();
      .PJ var4 = new .PJ(.o.q[2521 & 984]);
      .MV.fJ().q(var4, (.tH)var3);
   }

   public static void bW(int var0) {
      .pz.bW(var0);
   }

   public static String u(String var0, String var1) {
      String var2 = .o.q[-26263 & 909];
      if (var0.startsWith(var2)) {
         var0 = var0.substring(var2.length());
         return var0;
      } else if (var0.startsWith(.q.q[4534 & 17547])) {
         var0 = var0.substring(2);
         if (!var1.endsWith(.q.q[26751 & 95])) {
            var1 = var1 + .q.q[29791 & 2143];
         }

         var0 = var1 + var0;
         return var0;
      } else {
         if (var0.startsWith(.o.q[-32291 & 2009])) {
            var0 = var0.substring(1);
         }

         String var3 = .q.q[2388 & -3247];
         if (var0.startsWith(.q.q[-20245 & 17795])) {
            var0 = var0.substring(2);
            var0 = var3 + var0;
            return var0;
         } else if (var0.startsWith(.q.q[2143 & 4351])) {
            var0 = var3 + var0.substring(1);
            return var0;
         } else {
            return var0;
         }
      }
   }

   public static void s(.tO var0) {
      int[][] var1 = var0.cS(0);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         int[] var3 = var1[var2];
         if (var3 == null) {
            .MV.cM(var2 + .q.q[7852 & 25300] + var3);
         } else {
            .MV.cM(var2 + .q.q[19342 & 708] + var3.length);
         }
      }

   }

   public static .PJ r(.PJ var0, String var1) {
      if (!var0.Xz().equals(.q.q[-23693 & 880])) {
         return var0;
      } else {
         String var2 = var0.XA();
         String var3 = u(var2, var1);
         if (var3 != var2) {
            var0 = new .PJ(var0.Xz(), var3);
         }

         return var0;
      }
   }

   public static void aW() {
      .tU var0 = fA();
      if (var0 != null) {
         String var1 = .i.q[25598 & 2927];
         cXn = var0.av(var1 + .o.q[16839 & 455]);
         cXj = var0.av(var1 + .o.q[4060 & -32310]);
         cWG = var0.av(var1 + .o.q[12795 & 457]);
         cXr = var0.av(var1 + .w.q[-28054 & 1876]);
         cWw = var0.av(var1 + .o.q[12762 & 3562]);
         cXi = var0.av(var1 + .o.q[-15921 & 8667]);
         cWQ = var0.av(var1 + .o.q[-27700 & 19966]);
         cWi = var0.av(var1 + .o.q[-26163 & 16861]);
         cXK = var0.av(var1 + .o.q[15823 & 462]);
         cWH = var0.av(var1 + .o.q[8655 & 16847]);
         cXy = var0.av(var1 + .o.q[17364 & -30254]);
         cWp = var0.av(var1 + .o.q[21459 & 9681]);
         cXP = var0.av(var1 + .o.q[510 & 12754]);
         cWt = var0.av(var1 + .e.q[-30394 & 8550]);
         cWB = var0.av(var1 + .q.q[1504 & -15490]);
         cXH = var0.av(var1 + .o.q[20983 & 2003]);
         String var2 = .o.q[25076 & -27177];
         cWF = var0.av(var2 + .r.q[-28268 & 25661]);
         cWA = var0.av(var2 + .r.q[575 & 13653]);
      }

   }

   public static void e(.tO var0, int var1) {
      int var2 = var0.rZ();
      int var3 = var0.so();
      if (var0.sm() < 1) {
         ArrayList var4 = new ArrayList();
         int[][] var5 = new int[var1 + 1][];
         int[] var6 = new int[var2 * var3];
         var5[0] = var6;
         var4.add(var5);
         var0.t(var4);
      }

      ArrayList var12 = new ArrayList();
      int var13 = var0.sm();

      for(int var14 = 0; var14 < var13; ++var14) {
         int[] var7 = q(var0, var14, 0);
         if (var7 == null || var7.length < 1) {
            var7 = new int[var2 * var3];
         }

         if (var7.length != var2 * var3) {
            int var8 = (int)Math.round(Math.sqrt((double)var7.length));
            if (var8 * var8 != var7.length) {
               var7 = new int[1];
               var8 = 1;
            }

            BufferedImage var9 = new BufferedImage(var8, var8, 2);
            var9.setRGB(0, 0, var8, var8, var7, 0, var8);
            BufferedImage var10 = q(var9, var2);
            int[] var11 = new int[var2 * var3];
            var10.getRGB(0, 0, var2, var3, var11, 0, var2);
            var7 = var11;
         }

         int[][] var15 = new int[var1 + 1][];
         var15[0] = var7;
         var12.add(var15);
      }

      var0.t(var12);
      var0.cR(var1);
   }

   public static void r(.uL var0) {
      if (fA() != null) {
         .MV.cM(.o.q[8663 & 3031]);
         .Xw.pK();
         .XY.pK();
         aW();
         .XN.aW();
         .WQ.aW();
         .WR.aW();
         .XY.aW();
         .Xh.aW();
         .Xw.aW();
         .XP.aW();
         .Xp.aeM();
         net.optifine.shaders.F.afE();
         .XH.afE();
         .MV.Sx();
         .XV.afQ();
         .Xu.aW();
         .ts.aW();
         .Xt.aW();
         .Xe.aW();
         .MV.fJ().lS();
      }

   }

   public static .tF f(.PJ var0) {
      .tF var1 = .MV.fJ().f(var0);
      if (var1 != null) {
         return var1;
      } else if (!.MV.H(var0)) {
         return null;
      } else {
         .tK var2 = new .tK(var0);
         .MV.fJ().q(var0, var2);
         return var2;
      }
   }

   public static String gS(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? .q.q[-24573 & 20800] : var0.substring(0, var1);
   }

   public static BufferedImage q(String var0, BufferedImage var1) {
      if (var0.startsWith(.o.q[29143 & 3573]) || var0.startsWith(.o.q[1494 & 5078])) {
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         if (var2 == var3 * 2) {
            BufferedImage var4 = new BufferedImage(var2, var3 * 2, 2);
            Graphics2D var5 = var4.createGraphics();
            var5.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            var5.drawImage(var1, 0, 0, var2, var3, (ImageObserver)null);
            return var4;
         }
      }

      return var1;
   }

   public static void amU() {
      if (GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic) {
         float var0 = GL11.glGetFloat(34047);
         float var1 = (float).MV.RY();
         var1 = Math.min(var1, var0);
         GL11.glTexParameterf(3553, 34046, var1);
      }

   }

   public static Dimension r(InputStream var0, String var1) {
      Iterator var2 = ImageIO.getImageReadersBySuffix(var1);

      while(true) {
         if (var2.hasNext()) {
            ImageReader var3 = (ImageReader)var2.next();

            Dimension var4;
            try {
               ImageInputStream var5 = ImageIO.createImageInputStream(var0);
               var3.setInput(var5);
               int var6 = var3.getWidth(var3.getMinIndex());
               int var7 = var3.getHeight(var3.getMinIndex());
               var4 = new Dimension(var6, var7);
            } catch (IOException var11) {
               continue;
            } finally {
               var3.dispose();
            }

            return var4;
         }

         return null;
      }
   }

   public static int jL(int var0) {
      int var1 = 1;

      int var2;
      for(var2 = 0; var1 < var0; ++var2) {
         var1 *= 2;
      }

      return var2;
   }

   public static int bX(int var0, int var1) {
      if (var0 >= var1) {
         return var0;
      } else {
         int var2;
         for(var2 = var1 / var0 * var0; var2 < var1; var2 += var0) {
            ;
         }

         return var2;
      }
   }
}

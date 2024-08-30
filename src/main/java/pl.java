import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class PL {
   private static final Logger bUc = LogManager.getLogger();
   private static int[] bUd;
   private static final DateFormat bUe = new SimpleDateFormat(w.q[734 & -31074]);
   private static IntBuffer bUf;

   public static void q(File var0, String var1, int var2, int var3, vQ var4) {
      try {
         File var5 = new File(var0, o.q[1443 & -20377]);
         var5.mkdir();
         hS var6 = hS.eV();
         boolean var7 = var6.Bn.atS().bt.af();
         int var8 = MV.SL().aFb;
         kJ var9 = new kJ(var6);
         int var10 = var9.kq();
         int var11 = MV.Rp();
         boolean var12 = qa.ot() && var11 > 1;
         if (var12) {
            MV.SL().aFb = var10 * var11;
            d(var2 * var11, var3 * var11);
            pz.nE();
            pz.bY(16640);
            var6.fk().aa(true);
            var6.Bt.w(MV.ath, System.nanoTime());
         }

         if (qa.ot()) {
            var2 = var4.aIb;
            var3 = var4.aHZ;
         }

         int var13 = var2 * var3;
         if (bUf == null || bUf.capacity() < var13) {
            bUf = BufferUtils.createIntBuffer(var13);
            bUd = new int[var13];
         }

         GL11.glPixelStorei(3333, 1);
         GL11.glPixelStorei(3317, 1);
         bUf.clear();
         if (qa.ot()) {
            pz.bW(var4.aHV);
            GL11.glGetTexImage(3553, 0, 32993, 33639, bUf);
         } else {
            GL11.glReadPixels(0, 0, var2, var3, 32993, 33639, bUf);
         }

         bUf.get(bUd);
         tY.w(bUd, var2, var3);
         if (var7 && !var12) {
            aew.atw().dmx.submit(() -> {
               q(var6, var4, var1, var5, var2, var3, var12, var8);
            });
         } else {
            q(var6, var4, var1, var5, var2, var3, var12, var8);
         }
      } catch (Exception var16) {
         bUc.warn(o.q[16564 & 108], var16);
         hS.eV().BZ.iA().e(new Op(o.q[9509 & 20599], new Object[]{var16.getMessage()}));
      }

   }

   private static File i(File var0) {
      String var1 = bUe.format(new Date());
      int var2 = 1;

      while(true) {
         File var3 = new File(var0, var1 + (var2 == 1 ? q.q[16418 & -32751] : q.q[879 & -32193] + var2) + q.q[-32163 & 16652]);
         if (!var3.exists()) {
            return var3;
         }

         ++var2;
      }
   }

   public static void q(File var0, int var1, int var2, vQ var3) {
      q(var0, (String)null, var1, var2, var3);
   }

   private static void q(hS var0, vQ var1, String var2, File var3, int var4, int var5, boolean var6, int var7) {
      try {
         BufferedImage var8;
         if (!qa.ot()) {
            var8 = new BufferedImage(var4, var5, 1);
            var8.setRGB(0, 0, var4, var5, bUd, 0, var4);
         } else {
            var8 = new BufferedImage(var1.aHY, var1.aId, 1);
            int var9 = var1.aHZ - var1.aId;

            for(int var10 = var9; var10 < var1.aHZ; ++var10) {
               for(int var11 = 0; var11 < var1.aHY; ++var11) {
                  var8.setRGB(var11, var10 - var9, bUd[var10 * var1.aIb + var11]);
               }
            }
         }

         if (var6) {
            var0.fk().uZ();
            pz.nF();
            MV.SL().aFb = var7;
            d(var4, var5);
         }

         File var13;
         if (var2 == null) {
            var13 = i(var3);
         } else {
            var13 = new File(var3, var2);
         }

         var13 = var13.getCanonicalFile();
         ImageIO.write(var8, o.q[1638 & 8494], var13);
         Oo var15 = new Oo(var13.getName());
         var15.Vw().q(new DW(DX.bgx, var13.getAbsolutePath()));
         var15.Vw().y(Boolean.valueOf(true));
         var0.BZ.iA().e(new Op(o.q[-20441 & 559], new Object[]{var15}));
      } catch (Exception var12) {
         bUc.warn(o.q[1013 & 8236], var12);
         var0.BZ.iA().e(new Op(o.q[-32667 & 9637], new Object[]{var12.getMessage()}));
      }

   }

   private static void fX() {
      hS var0 = hS.eV();
      var0.fk().am(var0.Cr, var0.BB);
      if (var0.Bt != null) {
         var0.Bt.L(var0.Cr, var0.BB);
      }

   }

   private static void d(int var0, int var1) {
      hS var2 = hS.eV();
      var2.Cr = Math.max(1, var0);
      var2.BB = Math.max(1, var1);
      if (var2.Cx != null) {
         kJ var3 = new kJ(var2);
         var2.Cx.u(var2, var3.kr(), var3.kp());
      }

      fX();
   }
}

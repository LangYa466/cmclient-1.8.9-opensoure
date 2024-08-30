import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kN implements jC {
   private static final PJ PQ = new PJ(u.q[-31746 & 16110]);
   private static final ThreadPoolExecutor PR = new ScheduledThreadPoolExecutor(12, (new ThreadFactoryBuilder()).setNameFormat(i.q[5020 & 2967]).setDaemon(true).build());
   private static final PJ PS = new PJ(i.q[-2155 & 917]);
   private final mL PT;
   private final PJ PU;
   private static final Logger PV = LogManager.getLogger();
   private String PW;
   private final jI PX;
   private tD PY;
   private long PZ;
   private final hS Qa;

   private boolean kv() {
      return true;
   }

   public void f(int var1, int var2, int var3) {
   }

   // $FF: synthetic method
   static mL q(kN var0) {
      return var0.PT;
   }

   public mL kw() {
      return this.PT;
   }

   protected kN(jI var1, mL var2) {
      this.PX = var1;
      this.PT = var2;
      this.Qa = hS.eV();
      this.PU = new PJ(i.q[1021 & -3187] + var2.Zd + i.q[8078 & 910]);
      this.PY = (tD)this.Qa.fJ().f(this.PU);
   }

   private void kx() {
      if (this.PT.lJ() == null) {
         this.Qa.fJ().g(this.PU);
         this.PY = null;
      } else {
         ByteBuf var1 = Unpooled.copiedBuffer(this.PT.lJ(), Charsets.UTF_8);
         ByteBuf var2 = Base64.decode(var1);

         BufferedImage var3;
         label80: {
            try {
               var3 = tY.r(new ByteBufInputStream(var2));
               Validate.validState(var3.getWidth() == 64, w.q[739 & 17335], new Object[0]);
               Validate.validState(var3.getHeight() == 64, w.q[2788 & -27980], new Object[0]);
               break label80;
            } catch (Throwable var8) {
               PV.error(i.q[4091 & 13203] + this.PT.eP + w.q[821 & -14346] + this.PT.Zd + w.q[27997 & -28611], var8);
               this.PT.ah((String)null);
            } finally {
               var1.release();
               var2.release();
            }

            return;
         }

         if (this.PY == null) {
            this.PY = new tD(var3.getWidth(), var3.getHeight());
            this.Qa.fJ().q(this.PU, this.PY);
         }

         var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), this.PY.rK(), 0, var3.getWidth());
         this.PY.rL();
      }

   }

   public boolean y(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 <= 32) {
         if (var5 < 32 && var5 > 16 && this.kv()) {
            this.PX.aC(var1);
            this.PX.iL();
            return true;
         }

         if (var5 < 16 && var6 < 16 && this.PX.w(this, var1)) {
            this.PX.q(this, var1, kf.jy());
            return true;
         }

         if (var5 < 16 && var6 > 16 && this.PX.q(this, var1)) {
            this.PX.w(this, var1, kf.jy());
            return true;
         }
      }

      this.PX.aC(var1);
      if (hS.fe() - this.PZ < 250L) {
         this.PX.iL();
      }

      this.PZ = hS.fe();
      return false;
   }

   public void t(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   // $FF: synthetic method
   static jI w(kN var0) {
      return var0.PX;
   }

   public void q(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      if (!this.PT.Zc) {
         this.PT.Zc = true;
         this.PT.Ze = -2L;
         this.PT.Za = q.q[11848 & 4098];
         this.PT.Zb = q.q[16 & -25310];
         PR.submit(new kO(this));
      }

      boolean var9 = this.PT instanceof agK;
      if (var9) {
         pz.hT();
         this.Qa.fJ().o(agK.dvn);
         iT.q(var2 - 24, var3 + 6, 0.0F, 0.0F, 16, 16, 16.0F, 16.0F);
         pz.nB();
      }

      boolean var10 = this.PT.Zh > 47;
      boolean var11 = this.PT.Zh < 47;
      boolean var12 = var10 || var11;
      this.Qa.CB.q(this.PT.eP, var2 + 32 + 3, var3 + 1, 16777215);
      List var13 = this.Qa.CB.r(this.PT.Za, var4 - 32 - 2);

      for(int var14 = 0; var14 < Math.min(var13.size(), 2); ++var14) {
         this.Qa.CB.q((String)var13.get(var14), var2 + 32 + 3, var3 + 12 + this.Qa.CB.Gf * var14, 8421504);
      }

      String var24 = var12 ? OJ.bQb + this.PT.gameVersion : this.PT.Zb;
      int var15 = this.Qa.CB.K(var24);
      this.Qa.CB.q(var24, var2 + var4 - var15 - 15 - 2, var3 + 1, 8421504);
      byte var16 = 0;
      String var17 = null;
      int var18;
      String var19;
      if (var12) {
         var18 = 5;
         var19 = var10 ? i.q[-15457 & 3023] : i.q[912 & 19419];
         var17 = this.PT.Zf;
      } else if (this.PT.Zc && this.PT.Ze != -2L) {
         if (this.PT.Ze < 0L) {
            var18 = 5;
         } else if (this.PT.Ze < 150L) {
            var18 = 0;
         } else if (this.PT.Ze < 300L) {
            var18 = 1;
         } else if (this.PT.Ze < 600L) {
            var18 = 2;
         } else if (this.PT.Ze < 1000L) {
            var18 = 3;
         } else {
            var18 = 4;
         }

         if (this.PT.Ze < 0L) {
            var19 = i.q[921 & 3985];
         } else {
            var19 = this.PT.Ze + t.q[831 & 8219];
            var17 = this.PT.Zf;
         }
      } else {
         var16 = 1;
         var18 = (int)(hS.fe() / 100L + (long)var1 * 2L & 7L);
         if (var18 > 4) {
            var18 = 8 - var18;
         }

         var19 = i.q[4083 & 9106];
      }

      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      this.Qa.fJ().o(iT.Gs);
      iT.q(var2 + var4 - 15, var3, (float)(var16 * 10), (float)(176 + var18 * 8), 10, 8, 256.0F, 256.0F);
      if (this.PT.lJ() != null && !this.PT.lJ().equals(this.PW)) {
         this.PW = this.PT.lJ();
         this.kx();
         this.PX.iN().lO();
      }

      if (this.PY != null) {
         this.w(var2, var3, this.PU);
      } else {
         this.w(var2, var3, PQ);
      }

      int var20 = var6 - var2;
      int var21 = var7 - var3;
      if (var20 >= var4 - 15 && var20 <= var4 - 5 && var21 >= 0 && var21 <= 8) {
         this.PX.S(var19);
      } else if (var20 >= var4 - var15 - 15 - 2 && var20 <= var4 - 15 - 2 && var21 >= 0 && var21 <= 8) {
         this.PX.S(var17);
      }

      if (this.Qa.Br.aEb || var8) {
         this.Qa.fJ().o(PS);
         iT.q(var2, var3, var2 + 32, var3 + 32, -1601138544);
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         int var22 = var6 - var2;
         int var23 = var7 - var3;
         if (this.kv()) {
            if (var22 < 32 && var22 > 16) {
               iT.q(var2, var3, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
               iT.q(var2, var3, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
         }

         if (this.PX.w(this, var1)) {
            if (var22 < 16 && var23 < 16) {
               iT.q(var2, var3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
               iT.q(var2, var3, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
         }

         if (this.PX.q(this, var1)) {
            if (var22 < 16 && var23 > 16) {
               iT.q(var2, var3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
            } else {
               iT.q(var2, var3, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
            }
         }
      }

   }

   protected void w(int var1, int var2, PJ var3) {
      this.Qa.fJ().o(var3);
      pz.nX();
      iT.q(var1, var2, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
      pz.nz();
   }
}

import java.util.List;
import org.lwjgl.opengl.GL11;

public class uo extends ur {
   private final mp axr = new mp();
   private static double axs = 4096.0D;
   private static final PJ axt = new PJ(y.q[19078 & -27762]);

   public static void sJ() {
      hS var0 = MV.eV();
      double var1 = (double)MV.c(var0.Br.aEN, 1.0F, 120.0F);
      double var3 = Math.max(1.5D * (double)var0.BB / var1, 16.0D);
      axs = var3 * var3;
   }

   public void q(NR var1, double var2, double var4, double var6, float var8, int var9) {
      cv var10 = var1.LQ();
      pz.nE();
      float var11 = 0.6666667F;
      if (var10 == Ea.bjb) {
         pz.y((float)var2 + 0.5F, (float)var4 + 0.75F * var11, (float)var6 + 0.5F);
         float var12 = (float)(var1.dT() * 360) / 16.0F;
         pz.i(-var12, 0.0F, 1.0F, 0.0F);
         this.axr.XB.Xb = true;
      } else {
         int var19 = var1.dT();
         float var13 = 0.0F;
         if (var19 == 2) {
            var13 = 180.0F;
         }

         if (var19 == 4) {
            var13 = 90.0F;
         }

         if (var19 == 5) {
            var13 = -90.0F;
         }

         pz.y((float)var2 + 0.5F, (float)var4 + 0.75F * var11, (float)var6 + 0.5F);
         pz.i(-var13, 0.0F, 1.0F, 0.0F);
         pz.y(0.0F, -0.3125F, -0.4375F);
         this.axr.XB.Xb = false;
      }

      if (var9 >= 0) {
         this.o(axD[var9]);
         pz.bO(5890);
         pz.nE();
         pz.u(4.0F, 2.0F, 1.0F);
         pz.y(0.0625F, 0.0625F, 0.0625F);
         pz.bO(5888);
      } else {
         this.o(axt);
      }

      pz.od();
      pz.nE();
      pz.u(var11, -var11, -var11);
      this.axr.ll();
      pz.nF();
      if (w(var1)) {
         iS var20 = this.iv();
         float var21 = 0.015625F * var11;
         pz.y(0.0F, 0.5F * var11, 0.07F * var11);
         pz.u(var21, -var21, var21);
         GL11.glNormal3f(0.0F, 0.0F, -1.0F * var21);
         pz.O(false);
         int var14 = 0;
         if (MV.SM()) {
            var14 = Xh.ij(var14);
         }

         if (var9 < 0) {
            for(int var15 = 0; var15 < var1.bNJ.length; ++var15) {
               if (var1.bNJ[var15] != null) {
                  OX var16 = var1.bNJ[var15];
                  List var17 = kA.q(var16, 90, var20, false, true);
                  String var18 = var17 != null && var17.size() > 0 ? ((OX)var17.get(0)).Vy() : q.q[-3956 & 2];
                  if (var15 == var1.bNK) {
                     var18 = y.q[17060 & -32060] + var18 + y.q[661 & -26683];
                     var20.q(var18, -var20.K(var18) / 2, var15 * 10 - var1.bNJ.length * 5, var14);
                  } else {
                     var20.q(var18, -var20.K(var18) / 2, var15 * 10 - var1.bNJ.length * 5, var14);
                  }
               }
            }
         }
      }

      pz.O(true);
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      pz.nF();
      if (var9 >= 0) {
         pz.bO(5890);
         pz.nF();
         pz.bO(5888);
      }

   }

   private static boolean w(NR var0) {
      if (net.optifine.shaders.F.cOf) {
         return false;
      } else if (MV.eV().Cx instanceof lo) {
         return true;
      } else {
         if (!MV.bIn && var0.bNK < 0) {
            zk var1 = MV.eV().gj();
            double var2 = var0.x(var1.aNZ, var1.aNK, var1.aOt);
            if (var2 > axs) {
               return false;
            }
         }

         return true;
      }
   }
}

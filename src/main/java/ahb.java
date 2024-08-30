import java.util.ArrayList;
import java.util.List;

public class ahB {
   public List dyv = new ArrayList();
   public List dyw = new ArrayList();
   public int dyx = -30594 & 4254;
   public float dyy = 10.375F * 1.9277109F;
   private final float dyz = 1.9047619F * 2.625F;

   private double q(ahE var1, ahE var2, ahE var3) {
      return Math.atan2((double)(var3.bUb - var1.bUb), (double)(var3.bUa - var1.bUa)) - Math.atan2((double)(var2.bUb - var1.bUb), (double)(var2.bUa - var1.bUa));
   }

   public void cy(float var1) {
      this.dyy = var1;
      float var2 = 0.015972223F * 3.1304348F;
      ahE var3 = new ahE(0.0F, this.dyy * var2);
      ahE var4 = new ahE(0.0F, 0.0F);

      for(ahC var6 : this.dyw) {
         if (!var6.bDZ) {
            var4.e(var6.dyA);
            var6.dyA.q(var3);
            var6.dyB.e(var4);
         }
      }

      ahC var12 = (ahC)this.dyw.get(208 & 1035);

      for(ahC var7 : this.dyw) {
         if (var7 != var12 && var7.dyA.bUa - var12.dyA.bUa > 0.0F) {
            var7.dyA.bUa = var12.dyA.bUa - 0.08148148F * 1.2272727F;
         }
      }

      for(int var14 = this.dyw.size() - (19015 & 386); var14 >= (8197 & -26237); --var14) {
         double var17 = this.q(((ahC)this.dyw.get(var14)).dyA, ((ahC)this.dyw.get(var14 - (10517 & -31735))).dyA, ((ahC)this.dyw.get(var14 + (-28667 & 25139))).dyA);
         var17 = var17 * 355.23396D * 0.16129032258064516D;
         if (var17 > 271.0112359550562D * 1.328358208955224D) {
            var17 -= 2920.0D * 0.1232876712328767D;
         }

         if (var17 < 0.84375D * -426.6666666666667D) {
            var17 += 970.0D * 0.3711340206185567D;
         }

         double var9 = Math.abs(var17);
         float var10001 = 34.736843F * 5.181818F;
         this.getClass();
         if (var9 < (double)(var10001 - 2.2471912F * 2.225F)) {
            ahE var24 = ((ahC)this.dyw.get(var14)).dyA;
            ahE var10002 = ((ahC)this.dyw.get(var14 - (-27327 & 9))).dyA;
            float var10004 = 181.875F * 0.9896907F;
            this.getClass();
            ahE var11 = this.q(var24, var10002, var17, (double)(var10004 - 1.1931818F * 4.1904764F + 1.0F));
            ((ahC)this.dyw.get(var14 + (25811 & 4385))).dyA = var11;
         }

         var10001 = 1.051282F * 171.21951F;
         this.getClass();
         if (var9 > (double)(var10001 + 0.8888889F * 5.625F)) {
            ahE var26 = ((ahC)this.dyw.get(var14)).dyA;
            ahE var27 = ((ahC)this.dyw.get(var14 - (4113 & 2405))).dyA;
            float var28 = 203.07692F * 0.8863636F;
            this.getClass();
            ahE var23 = this.q(var26, var27, var17, (double)(var28 + 1.0F * 5.0F - 1.0F));
            ((ahC)this.dyw.get(var14 + (9 & 10631))).dyA = var23;
         }
      }

      for(int var15 = 2112 & 17152; var15 < this.dyx; ++var15) {
         for(int var19 = this.dyv.size() - (9777 & -32499); var19 >= 0; --var19) {
            ahD var8 = (ahD)this.dyv.get(var19);
            ahE var22 = var8.dyC.dyA.avY().w(var8.dyD.dyA).cB(2.0F);
            ahE var10 = var8.dyC.dyA.avY().q(var8.dyD.dyA).avZ();
            if (!var8.dyC.bDZ) {
               var8.dyC.dyA = var22.avY().w(var10.avY().cC(var8.dyE / 2.0F));
            }

            if (!var8.dyD.bDZ) {
               var8.dyD.dyA = var22.avY().q(var10.avY().cC(var8.dyE / 2.0F));
            }
         }
      }

      for(int var16 = 5440 & 165; var16 < this.dyv.size(); ++var16) {
         ahD var20 = (ahD)this.dyv.get(var16);
         ahE var21 = var20.dyC.dyA.avY().q(var20.dyD.dyA).avZ();
         if (!var20.dyD.bDZ) {
            var20.dyD.dyA = var20.dyC.dyA.avY().q(var21.cC(var20.dyE));
         }
      }

   }

   private ahE q(ahE var1, ahE var2, double var3, double var5) {
      double var7 = var5 / (0.47474747474747475D * 120.68689787234042D);
      float var9 = var2.bUa - var1.bUa;
      float var10 = var2.bUb - var1.bUb;
      if (var3 < 0.0D) {
         var7 *= 1.411764705882353D * -0.7083333333333333D;
      }

      double var11 = Math.cos(var7);
      double var13 = Math.sin(var7);
      return new ahE((float)((double)var9 * var11 - (double)var10 * var13 + (double)var1.bUa), (float)((double)var9 * var13 + (double)var10 * var11 + (double)var1.bUb));
   }
}

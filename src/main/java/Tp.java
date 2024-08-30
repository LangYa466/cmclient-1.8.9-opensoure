public class tp implements tt {
   private final tb atJ;

   public void w(zz var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      GX var9 = var1.zg();
      if (var9 != null) {
         pz.nE();
         if (this.atJ.ro().TL) {
            float var10 = 0.5F;
            pz.y(0.0F, 0.625F, 0.0F);
            pz.i(-20.0F, -1.0F, 0.0F, 0.0F);
            pz.u(var10, var10, var10);
         }

         hS var13 = hS.eV();
         if (var1 instanceof DD) {
            if (ao.ef.ej.af()) {
               if (((DD)var1).FH()) {
                  ((lL)this.atJ.ro()).B(0.0325F);
                  pz.u(1.05F, 1.05F, 1.05F);
                  if (M.cg.ce.af()) {
                     pz.t(-0.44999998807907104D - 0.12999999523162842D * var1.yb().auf(), 0.25D + 0.07D * var1.yb().auf(), -0.07D);
                  } else if (var1.hI()) {
                     pz.t(-0.58D, 0.32D, -0.07D);
                  } else {
                     pz.t(-0.45D, 0.25D, -0.07D);
                  }

                  pz.i(-24405.0F, 137290.0F, -2009900.0F, -2654900.0F);
               } else {
                  ((lL)this.atJ.ro()).B(0.0625F);
               }
            } else {
               ((lL)this.atJ.ro()).B(0.0625F);
            }

            if (!ao.ef.ek.af()) {
               pz.y(-0.0625F, 0.4375F, 0.0625F);
            } else if (!((DD)var1).FH() && ao.ef.ek.af()) {
               pz.y(-0.0855F, 0.4775F, 0.1585F);
               pz.i(-19.0F, 20.0F, 0.0F, -6.0F);
            } else if (((DD)var1).FH()) {
               pz.y(-0.0625F, 0.4375F, 0.0625F);
            }
         } else {
            ((lL)this.atJ.ro()).B(0.0625F);
            pz.y(-0.0625F, 0.4375F, 0.0625F);
         }

         if (var1 instanceof DD && ((DD)var1).bdG != null) {
            var9 = new GX(Et.bmu, 0);
         }

         Fm var11 = var9.do1();
         if (var11 instanceof FO && cv.q(var11).cC() == 2) {
            pz.y(0.0F, 0.1875F, -0.3125F);
            pz.i(20.0F, 1.0F, 0.0F, 0.0F);
            pz.i(45.0F, 0.0F, 1.0F, 0.0F);
            float var12 = 0.375F;
            pz.u(-var12, -var12, var12);
         }

         if (M.cg.ce.af()) {
            pz.t(0.0D, 0.203125D * var1.yb().auf(), 0.0D);
         } else if (var1.hI()) {
            pz.y(0.0F, 0.203125F, 0.0F);
         }

         var13.ff().q(var1, var9, qM.ang);
         pz.nF();
      }

   }

   public tp(tb var1) {
      this.atJ = var1;
   }

   public boolean rG() {
      return false;
   }
}

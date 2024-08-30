public class GK extends Fm {
   private final cv bsw;

   public GK(cv var1) {
      this.bsw = var1;
   }

   public boolean q(GX var1, DD var2, QI var3, NW var4, OK var5, float var6, float var7, float var8) {
      hI var9 = var3.g(var4);
      cv var10 = var9.ds();
      if (var10 == Ea.bhe && ((Integer)var9.w(gr.vQ)).intValue() < 1) {
         var5 = OK.bQC;
      } else if (!var10.u(var3, var4)) {
         var4 = var4.v(var5);
      }

      if (!var2.q(var4, var5, var1)) {
         return false;
      } else if (var1.bsH == 0) {
         return false;
      } else {
         if (var3.q(this.bsw, var4, false, var5, (zk)null, var1)) {
            hI var11 = this.bsw.q(var3, var4, var5, var6, var7, var8, 0, var2);
            if (var3.q(var4, var11, 3)) {
               var11 = var3.g(var4);
               if (var11.ds() == this.bsw) {
                  FO.q(var3, var2, var4, var1);
                  var11.ds().q(var3, var4, var11, var2, var1);
               }

               var3.q((double)((float)var4.aY() + 0.5F), (double)((float)var4.aX() + 0.5F), (double)((float)var4.KO() + 0.5F), this.bsw.nl.dc(), (this.bsw.nl.de() + 1.0F) / 2.0F, this.bsw.nl.df() * 0.8F);
               --var1.bsH;
               return true;
            }
         }

         return false;
      }
   }
}

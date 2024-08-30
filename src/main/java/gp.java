public class GP extends Fm {
   public GP() {
      this.bqQ = 16;
      this.r(yl.aLF);
   }

   public boolean q(GX var1, DD var2, QI var3, NW var4, OK var5, float var6, float var7, float var8) {
      if (var5 == OK.bQB) {
         return false;
      } else if (!var3.g(var4).ds().cB().ec()) {
         return false;
      } else {
         var4 = var4.v(var5);
         if (!var2.q(var4, var5, var1)) {
            return false;
         } else if (!Ea.bjb.e(var3, var4)) {
            return false;
         } else if (var3.bXF) {
            return true;
         } else {
            if (var5 == OK.bQC) {
               int var9 = Pq.D((double)((var2.aOn + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
               var3.q(var4, Ea.bjb.cx().q(gB.wp, Integer.valueOf(var9)), 3);
            } else {
               var3.q(var4, Ea.bkw.cx().q(hd.yt, var5), 3);
            }

            --var1.bsH;
            No var11 = var3.h(var4);
            if (var11 instanceof NR && !FO.q(var3, var2, var4, var1)) {
               var2.q((NR)var11);
            }

            return true;
         }
      }
   }
}

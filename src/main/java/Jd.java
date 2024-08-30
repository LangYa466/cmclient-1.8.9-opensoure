public class jD extends iU {
   private boolean Kt = false;

   public void r(hS var1, int var2, int var3) {
      if (this.hW) {
         var1.fJ().o(iU.Gu);
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var4 = var2 >= this.Gv && var3 >= this.hF && var2 < this.Gv + this.eo && var3 < this.hF + this.eC;
         jE var5;
         if (this.Kt) {
            if (!this.aM) {
               var5 = jE.KB;
            } else if (var4) {
               var5 = jE.Kw;
            } else {
               var5 = jE.Kz;
            }
         } else if (!this.aM) {
            var5 = jE.Ku;
         } else if (var4) {
            var5 = jE.Kx;
         } else {
            var5 = jE.Kv;
         }

         this.e(this.Gv, this.hF, var5.iG(), var5.iH(), this.eo, this.eC);
      }

   }

   public boolean iF() {
      return this.Kt;
   }

   public void A(boolean var1) {
      this.Kt = var1;
   }

   public jD(int var1, int var2, int var3) {
      super(var1, var2, var3, 20, 20, q.q[9220 & -29823]);
   }
}

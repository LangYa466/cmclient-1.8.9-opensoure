public class aaj extends aaf {
   private float iR = 1.0F;
   public boolean iS;
   private ZP cQT = null;

   public aaj(int var1, int var2, int var3, int var4, int var5, ZP var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.cQT = var6;
      this.iR = var6.alC();
      this.iX = aag.w(var6, this.eo);
   }

   public boolean alR() {
      return false;
   }

   public void alT() {
      this.iR = this.cQT.alC();
   }

   public void f(int var1, int var2) {
      this.iS = false;
   }

   protected void e(hS var1, int var2, int var3) {
      if (this.hW) {
         if (this.iS && !kf.jy()) {
            this.iR = (float)(var2 - (this.Gv + 4)) / (float)(this.eo - 8);
            this.iR = Pq.n(this.iR, 0.0F, 1.0F);
            this.cQT.bH(this.iR);
            this.iR = this.cQT.alC();
            this.iX = aag.w(this.cQT, this.eo);
         }

         var1.fJ().o(Gu);
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         this.e(this.Gv + (int)(this.iR * (float)(this.eo - 8)), this.hF, 0, 66, 4, 20);
         this.e(this.Gv + (int)(this.iR * (float)(this.eo - 8)) + 4, this.hF, 196, 66, 4, 20);
      }

   }

   protected int c(boolean var1) {
      return 0;
   }

   public boolean w(hS var1, int var2, int var3) {
      if (super.w(var1, var2, var3)) {
         this.iR = (float)(var2 - (this.Gv + 4)) / (float)(this.eo - 8);
         this.iR = Pq.n(this.iR, 0.0F, 1.0F);
         this.cQT.bH(this.iR);
         this.iX = aag.w(this.cQT, this.eo);
         this.iS = true;
         return true;
      } else {
         return false;
      }
   }
}

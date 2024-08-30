public class Fh extends Fe {
   private DD aSO;
   private int bpZ;

   public Fh(DD var1, EV var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.aSO = var1;
   }

   protected void r(GX var1, int var2) {
      this.bpZ += var2;
      this.L(var1);
   }

   protected void L(GX var1) {
      var1.q(this.aSO.vR, this.aSO, this.bpZ);
      if (!this.aSO.vR.bXF) {
         int var2 = this.bpZ;
         float var3 = Hd.Is().am(var1);
         if (var3 == 0.0F) {
            var2 = 0;
         } else if (var3 < 1.0F) {
            int var4 = Pq.bg((float)var2 * var3);
            if (var4 < Pq.bf((float)var2 * var3) && Math.random() < (double)((float)var2 * var3 - (float)var4)) {
               ++var4;
            }

            var2 = var4;
         }

         while(var2 > 0) {
            int var5 = BR.eu(var2);
            var2 -= var5;
            this.aSO.vR.p(new BR(this.aSO.vR, this.aSO.aNZ, this.aSO.aNK + 0.5D, this.aSO.aOt + 0.5D, var5));
         }
      }

      this.bpZ = 0;
      if (var1.do1() == Et.bmQ) {
         this.aSO.w(MX.bJv);
      }

      if (var1.do1() == Et.boa) {
         this.aSO.w(MX.bJA);
      }

   }

   public void q(DD var1, GX var2) {
      this.L(var2);
      super.q(var1, var2);
   }

   public boolean o(GX var1) {
      return false;
   }

   public GX bm(int var1) {
      if (this.kM()) {
         this.bpZ += Math.min(var1, this.kO().bsH);
      }

      return super.bm(var1);
   }
}

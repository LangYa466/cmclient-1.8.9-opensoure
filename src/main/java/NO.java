public class nO extends nV {
   private hn abs;
   private int abt;

   public int I(float var1) {
      return this.abs == hn.zS ? super.I(var1) : 257;
   }

   public float J(float var1) {
      return this.abs == hn.zS ? super.J(var1) : 1.0F;
   }

   protected nO(QI var1, double var2, double var4, double var6, hn var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.aOd = this.aOO = this.aOL = 0.0D;
      if (var8 == hn.zS) {
         this.abD = 0.0F;
         this.abN = 0.0F;
         this.abE = 1.0F;
      } else {
         this.abD = 1.0F;
         this.abN = 0.0F;
         this.abE = 0.0F;
      }

      this.bA(113);
      this.d(0.01F, 0.01F);
      this.abK = 0.06F;
      this.abs = var8;
      this.abt = 40;
      this.abC = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
      this.aOd = this.aOO = this.aOL = 0.0D;
   }

   public void hv() {
      this.aOf = this.aNZ;
      this.aNH = this.aNK;
      this.aNW = this.aOt;
      if (this.abs == hn.zS) {
         this.abD = 0.2F;
         this.abN = 0.3F;
         this.abE = 1.0F;
      } else {
         this.abD = 1.0F;
         this.abN = 16.0F / (float)(40 - this.abt + 16);
         this.abE = 4.0F / (float)(40 - this.abt + 8);
      }

      this.aOO -= (double)this.abK;
      if (this.abt-- > 0) {
         this.aOd *= 0.02D;
         this.aOO *= 0.02D;
         this.aOL *= 0.02D;
         this.bA(113);
      } else {
         this.bA(112);
      }

      this.h(this.aOd, this.aOO, this.aOL);
      this.aOd *= 0.9800000190734863D;
      this.aOO *= 0.9800000190734863D;
      this.aOL *= 0.9800000190734863D;
      if (this.abC-- <= 0) {
         this.yo();
      }

      if (this.aNG) {
         if (this.abs == hn.zS) {
            this.yo();
            this.vR.q(OP.bRp, this.aNZ, this.aNK, this.aOt, 0.0D, 0.0D, 0.0D);
         } else {
            this.bA(114);
         }

         this.aOd *= 0.699999988079071D;
         this.aOL *= 0.699999988079071D;
      }

      NW var1 = new NW(this);
      hI var2 = this.vR.g(var1);
      hn var3 = var2.ds().cB();
      if (var3.eo() || var3.ec()) {
         double var4 = 0.0D;
         if (var2.ds() instanceof ey) {
            var4 = (double)ey.Y(((Integer)var2.w(ey.rN)).intValue());
         }

         double var6 = (double)(Pq.D(this.aNK) + 1) - var4;
         if (this.aNK < var6) {
            this.yo();
         }
      }

   }
}

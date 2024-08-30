public class lK extends lJ {
   private mm TQ;
   private mm TR;
   private mm TS;
   private mm TT;
   private mm TU;
   private mm TV;

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.q(var2, var3, var4, var5, var6, var7, var1);
      this.TR.H(var7);
      this.TV.H(var7);
   }

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      if (((CU)var7).DP()) {
         float var8 = 57.295776F;
         this.TR.Xw = var5 / 57.295776F;
         this.TR.Xn = 3.1415927F - var4 / 57.295776F;
         this.TR.Xp = 3.1415927F;
         this.TR.e(0.0F, -2.0F, 0.0F);
         this.TT.e(-3.0F, 0.0F, 3.0F);
         this.TQ.e(3.0F, 0.0F, 3.0F);
         this.TV.Xw = 3.1415927F;
         this.TT.Xw = -0.15707964F;
         this.TT.Xn = -1.2566371F;
         this.TS.Xn = -1.7278761F;
         this.TQ.Xw = this.TT.Xw;
         this.TQ.Xn = -this.TT.Xn;
         this.TU.Xn = -this.TS.Xn;
      } else {
         float var9 = 57.295776F;
         this.TR.Xw = var5 / 57.295776F;
         this.TR.Xn = var4 / 57.295776F;
         this.TR.Xp = 0.0F;
         this.TR.e(0.0F, 0.0F, 0.0F);
         this.TT.e(0.0F, 0.0F, 0.0F);
         this.TQ.e(0.0F, 0.0F, 0.0F);
         this.TV.Xw = 0.7853982F + Pq.bi(var3 * 0.1F) * 0.15F;
         this.TV.Xn = 0.0F;
         this.TT.Xn = Pq.bi(var3 * 1.3F) * 3.1415927F * 0.25F;
         this.TQ.Xn = -this.TT.Xn;
         this.TS.Xn = this.TT.Xn * 0.5F;
         this.TU.Xn = -this.TT.Xn * 0.5F;
      }

   }

   public lK() {
      this.TP = 64;
      this.TN = 64;
      this.TR = new mm(this, 0, 0);
      this.TR.q(-3.0F, -3.0F, -3.0F, 6, 6, 6);
      mm var1 = new mm(this, 24, 0);
      var1.q(-4.0F, -6.0F, -2.0F, 3, 4, 1);
      this.TR.q(var1);
      mm var2 = new mm(this, 24, 0);
      var2.Xx = true;
      var2.q(1.0F, -6.0F, -2.0F, 3, 4, 1);
      this.TR.q(var2);
      this.TV = new mm(this, 0, 16);
      this.TV.q(-3.0F, 4.0F, -3.0F, 6, 12, 6);
      this.TV.C(0, 34).q(-5.0F, 16.0F, 0.0F, 10, 6, 1);
      this.TT = new mm(this, 42, 0);
      this.TT.q(-12.0F, 1.0F, 1.5F, 10, 16, 1);
      this.TS = new mm(this, 24, 16);
      this.TS.e(-12.0F, 1.0F, 1.5F);
      this.TS.q(-8.0F, 1.0F, 0.0F, 8, 12, 1);
      this.TQ = new mm(this, 42, 0);
      this.TQ.Xx = true;
      this.TQ.q(2.0F, 1.0F, 1.5F, 10, 16, 1);
      this.TU = new mm(this, 24, 16);
      this.TU.Xx = true;
      this.TU.e(12.0F, 1.0F, 1.5F);
      this.TU.q(0.0F, 1.0F, 0.0F, 8, 12, 1);
      this.TV.q(this.TT);
      this.TV.q(this.TQ);
      this.TT.q(this.TS);
      this.TQ.q(this.TU);
   }
}

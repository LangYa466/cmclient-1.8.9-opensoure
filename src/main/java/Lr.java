public class lR extends lJ {
   public mm UD;
   public mm UE;
   public mm UF;
   public mm UG;
   public mm UH;
   public mm UI;
   public mm UJ;
   public mm UK;

   public lR() {
      byte var1 = 16;
      this.UH = new mm(this, 0, 0);
      this.UH.w(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.UH.e(0.0F, (float)(-1 + var1), -4.0F);
      this.UF = new mm(this, 14, 0);
      this.UF.w(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.UF.e(0.0F, (float)(-1 + var1), -4.0F);
      this.UG = new mm(this, 14, 4);
      this.UG.w(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.UG.e(0.0F, (float)(-1 + var1), -4.0F);
      this.UD = new mm(this, 0, 9);
      this.UD.w(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.UD.e(0.0F, (float)var1, 0.0F);
      this.UK = new mm(this, 26, 0);
      this.UK.q(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.UK.e(-2.0F, (float)(3 + var1), 1.0F);
      this.UJ = new mm(this, 26, 0);
      this.UJ.q(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.UJ.e(1.0F, (float)(3 + var1), 1.0F);
      this.UE = new mm(this, 24, 13);
      this.UE.q(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.UE.e(-4.0F, (float)(-3 + var1), 0.0F);
      this.UI = new mm(this, 24, 13);
      this.UI.q(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.UI.e(4.0F, (float)(-3 + var1), 0.0F);
   }

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      this.UH.Xw = var5 / 57.295776F;
      this.UH.Xn = var4 / 57.295776F;
      this.UF.Xw = this.UH.Xw;
      this.UF.Xn = this.UH.Xn;
      this.UG.Xw = this.UH.Xw;
      this.UG.Xn = this.UH.Xn;
      this.UD.Xw = 1.5707964F;
      this.UK.Xw = Pq.bi(var1 * 0.6662F) * 1.4F * var2;
      this.UJ.Xw = Pq.bi(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.UE.Xp = var3;
      this.UI.Xp = -var3;
   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.q(var2, var3, var4, var5, var6, var7, var1);
      if (this.TL) {
         float var8 = 2.0F;
         pz.nE();
         pz.y(0.0F, 5.0F * var7, 2.0F * var7);
         this.UH.H(var7);
         this.UF.H(var7);
         this.UG.H(var7);
         pz.nF();
         pz.nE();
         pz.u(1.0F / var8, 1.0F / var8, 1.0F / var8);
         pz.y(0.0F, 24.0F * var7, 0.0F);
         this.UD.H(var7);
         this.UK.H(var7);
         this.UJ.H(var7);
         this.UE.H(var7);
         this.UI.H(var7);
         pz.nF();
      } else {
         this.UH.H(var7);
         this.UF.H(var7);
         this.UG.H(var7);
         this.UD.H(var7);
         this.UK.H(var7);
         this.UJ.H(var7);
         this.UE.H(var7);
         this.UI.H(var7);
      }

   }
}

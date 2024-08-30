public class lN extends lJ {
   public mm[] Uj = new mm[5];

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      for(int var8 = 0; var8 < 5; ++var8) {
         this.Uj[var8].H(var7);
      }

   }

   public lN() {
      this.Uj[0] = new mm(this, 0, 8);
      this.Uj[1] = new mm(this, 0, 0);
      this.Uj[2] = new mm(this, 0, 0);
      this.Uj[3] = new mm(this, 0, 0);
      this.Uj[4] = new mm(this, 0, 0);
      byte var1 = 24;
      byte var2 = 6;
      byte var3 = 20;
      byte var4 = 4;
      this.Uj[0].w((float)(-var1 / 2), (float)(-var3 / 2 + 2), -3.0F, var1, var3 - 4, 4, 0.0F);
      this.Uj[0].e(0.0F, (float)var4, 0.0F);
      this.Uj[1].w((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.Uj[1].e((float)(-var1 / 2 + 1), (float)var4, 0.0F);
      this.Uj[2].w((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.Uj[2].e((float)(var1 / 2 - 1), (float)var4, 0.0F);
      this.Uj[3].w((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.Uj[3].e(0.0F, (float)var4, (float)(-var3 / 2 + 1));
      this.Uj[4].w((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.Uj[4].e(0.0F, (float)var4, (float)(var3 / 2 - 1));
      this.Uj[0].Xw = 1.5707964F;
      this.Uj[1].Xn = 4.712389F;
      this.Uj[2].Xn = 1.5707964F;
      this.Uj[3].Xn = 3.1415927F;
   }
}

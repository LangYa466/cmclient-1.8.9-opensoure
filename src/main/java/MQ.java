public class mq extends lJ {
   private mm[] XC;
   private mm[] XD = new mm[7];
   private float[] XE = new float[7];
   private static final int[][] XF = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};
   private static final int[][] XG = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      for(int var8 = 0; var8 < this.XD.length; ++var8) {
         this.XD[var8].Xn = Pq.bi(var3 * 0.9F + (float)var8 * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (float)(1 + Math.abs(var8 - 2));
         this.XD[var8].WW = Pq.bk(var3 * 0.9F + (float)var8 * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * (float)Math.abs(var8 - 2);
      }

      this.XC[0].Xn = this.XD[2].Xn;
      this.XC[1].Xn = this.XD[4].Xn;
      this.XC[1].WW = this.XD[4].WW;
      this.XC[2].Xn = this.XD[1].Xn;
      this.XC[2].WW = this.XD[1].WW;
   }

   public mq() {
      float var1 = -3.5F;

      for(int var2 = 0; var2 < this.XD.length; ++var2) {
         this.XD[var2] = new mm(this, XF[var2][0], XF[var2][1]);
         this.XD[var2].q((float)XG[var2][0] * -0.5F, 0.0F, (float)XG[var2][2] * -0.5F, XG[var2][0], XG[var2][1], XG[var2][2]);
         this.XD[var2].e(0.0F, (float)(24 - XG[var2][1]), var1);
         this.XE[var2] = var1;
         if (var2 < this.XD.length - 1) {
            var1 += (float)(XG[var2][2] + XG[var2 + 1][2]) * 0.5F;
         }
      }

      this.XC = new mm[3];
      this.XC[0] = new mm(this, 20, 0);
      this.XC[0].q(-5.0F, 0.0F, (float)XG[2][2] * -0.5F, 10, 8, XG[2][2]);
      this.XC[0].e(0.0F, 16.0F, this.XE[2]);
      this.XC[1] = new mm(this, 20, 11);
      this.XC[1].q(-3.0F, 0.0F, (float)XG[4][2] * -0.5F, 6, 4, XG[4][2]);
      this.XC[1].e(0.0F, 20.0F, this.XE[4]);
      this.XC[2] = new mm(this, 20, 18);
      this.XC[2].q(-3.0F, 0.0F, (float)XG[4][2] * -0.5F, 6, 5, XG[1][2]);
      this.XC[2].e(0.0F, 19.0F, this.XE[1]);
   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.q(var2, var3, var4, var5, var6, var7, var1);

      for(int var8 = 0; var8 < this.XD.length; ++var8) {
         this.XD[var8].H(var7);
      }

      for(int var9 = 0; var9 < this.XC.length; ++var9) {
         this.XC[var9].H(var7);
      }

   }
}

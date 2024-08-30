public class lU extends lJ {
   private mm UQ;
   private mm UR;
   private mm US;
   private mm UT;
   private float UU;
   private mm UV;
   private mm UW;
   private mm UD;
   private mm UX;
   private mm UY;
   private mm UZ;
   private mm UH;
   private mm Va;

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      pz.nE();
      Bo var8 = (Bo)var1;
      float var9 = var8.aWI + (var8.aWR - var8.aWI) * this.UU;
      this.UQ.Xw = (float)(Math.sin((double)(var9 * 3.1415927F * 2.0F)) + 1.0D) * 0.2F;
      float var10 = (float)(Math.sin((double)(var9 * 3.1415927F * 2.0F - 1.0F)) + 1.0D);
      var10 = (var10 * var10 * 1.0F + var10 * 2.0F) * 0.05F;
      pz.y(0.0F, var10 - 2.0F, -3.0F);
      pz.i(var10 * 2.0F, 1.0F, 0.0F, 0.0F);
      float var11 = -30.0F;
      float var12 = 0.0F;
      float var13 = 1.5F;
      double[] var14 = var8.u(6, this.UU);
      float var15 = this.p(var8.u(5, this.UU)[0] - var8.u(10, this.UU)[0]);
      float var16 = this.p(var8.u(5, this.UU)[0] + (double)(var15 / 2.0F));
      var11 = var11 + 2.0F;
      float var17 = var9 * 3.1415927F * 2.0F;
      var11 = 20.0F;
      float var18 = -12.0F;

      for(int var19 = 0; var19 < 5; ++var19) {
         double[] var20 = var8.u(5 - var19, this.UU);
         float var21 = (float)Math.cos((double)((float)var19 * 0.45F + var17)) * 0.15F;
         this.UT.Xn = this.p(var20[0] - var14[0]) * 3.1415927F / 180.0F * var13;
         this.UT.Xw = var21 + (float)(var20[1] - var14[1]) * 3.1415927F / 180.0F * var13 * 5.0F;
         this.UT.Xp = -this.p(var20[0] - (double)var16) * 3.1415927F / 180.0F * var13;
         this.UT.Xr = var11;
         this.UT.Xj = var18;
         this.UT.WW = var12;
         var11 = (float)((double)var11 + Math.sin((double)this.UT.Xw) * 10.0D);
         var18 = (float)((double)var18 - Math.cos((double)this.UT.Xn) * Math.cos((double)this.UT.Xw) * 10.0D);
         var12 = (float)((double)var12 - Math.sin((double)this.UT.Xn) * Math.cos((double)this.UT.Xw) * 10.0D);
         this.UT.H(var7);
      }

      this.UH.Xr = var11;
      this.UH.Xj = var18;
      this.UH.WW = var12;
      double[] var30 = var8.u(0, this.UU);
      this.UH.Xn = this.p(var30[0] - var14[0]) * 3.1415927F / 180.0F * 1.0F;
      this.UH.Xp = -this.p(var30[0] - (double)var16) * 3.1415927F / 180.0F * 1.0F;
      this.UH.H(var7);
      pz.nE();
      pz.y(0.0F, 1.0F, 0.0F);
      pz.i(-var15 * var13 * 1.0F, 0.0F, 0.0F, 1.0F);
      pz.y(0.0F, -1.0F, 0.0F);
      this.UD.Xp = 0.0F;
      this.UD.H(var7);

      for(int var32 = 0; var32 < 2; ++var32) {
         pz.nL();
         float var34 = var9 * 3.1415927F * 2.0F;
         this.UZ.Xw = 0.125F - (float)Math.cos((double)var34) * 0.2F;
         this.UZ.Xn = 0.25F;
         this.UZ.Xp = (float)(Math.sin((double)var34) + 0.125D) * 0.8F;
         this.UY.Xp = -((float)(Math.sin((double)(var34 + 2.0F)) + 0.5D)) * 0.75F;
         this.UV.Xw = 1.0F + var10 * 0.1F;
         this.US.Xw = 0.5F + var10 * 0.1F;
         this.Va.Xw = 0.75F + var10 * 0.1F;
         this.UX.Xw = 1.3F + var10 * 0.1F;
         this.UR.Xw = -0.5F - var10 * 0.1F;
         this.UW.Xw = 0.75F + var10 * 0.1F;
         this.UZ.H(var7);
         this.UX.H(var7);
         this.UV.H(var7);
         pz.u(-1.0F, 1.0F, 1.0F);
         if (var32 == 0) {
            pz.bS(1028);
         }
      }

      pz.nF();
      pz.bS(1029);
      pz.nK();
      float var33 = -((float)Math.sin((double)(var9 * 3.1415927F * 2.0F))) * 0.0F;
      var17 = var9 * 3.1415927F * 2.0F;
      var11 = 10.0F;
      var18 = 60.0F;
      var12 = 0.0F;
      var14 = var8.u(11, this.UU);

      for(int var35 = 0; var35 < 12; ++var35) {
         var30 = var8.u(12 + var35, this.UU);
         var33 = (float)((double)var33 + Math.sin((double)((float)var35 * 0.45F + var17)) * 0.05000000074505806D);
         this.UT.Xn = (this.p(var30[0] - var14[0]) * var13 + 180.0F) * 3.1415927F / 180.0F;
         this.UT.Xw = var33 + (float)(var30[1] - var14[1]) * 3.1415927F / 180.0F * var13 * 5.0F;
         this.UT.Xp = this.p(var30[0] - (double)var16) * 3.1415927F / 180.0F * var13;
         this.UT.Xr = var11;
         this.UT.Xj = var18;
         this.UT.WW = var12;
         var11 = (float)((double)var11 + Math.sin((double)this.UT.Xw) * 10.0D);
         var18 = (float)((double)var18 - Math.cos((double)this.UT.Xn) * Math.cos((double)this.UT.Xw) * 10.0D);
         var12 = (float)((double)var12 - Math.sin((double)this.UT.Xn) * Math.cos((double)this.UT.Xw) * 10.0D);
         this.UT.H(var7);
      }

      pz.nF();
   }

   private float p(double var1) {
      while(var1 >= 180.0D) {
         var1 -= 360.0D;
      }

      while(var1 < -180.0D) {
         var1 += 360.0D;
      }

      return (float)var1;
   }

   public lU(float var1) {
      this.TP = 256;
      this.TN = 256;
      this.r(p.q[1398 & -31884], 0, 0);
      this.r(p.q[16757 & -24201], -56, 88);
      this.r(p.q[22903 & 510], -56, 144);
      this.r(p.q[-27137 & 375], 0, 0);
      this.r(p.q[16762 & 4472], 112, 0);
      this.r(p.q[19321 & 1401], 196, 0);
      this.r(p.q[-7298 & 4474], 112, 30);
      this.r(p.q[-13957 & 511], 112, 88);
      this.r(p.q[1404 & -31875], 176, 44);
      this.r(p.q[1535 & 4477], 176, 65);
      this.r(p.q[8575 & 18302], 112, 104);
      this.r(p.q[383 & -11905], 112, 136);
      this.r(p.q[9128 & 4499], 144, 104);
      this.r(p.q[4515 & -30839], 192, 104);
      this.r(p.q[390 & -7758], 226, 138);
      this.r(p.q[-27757 & 18831], 220, 53);
      this.r(p.q[-30251 & 12718], 0, 0);
      this.r(p.q[-31353 & 2965], 48, 0);
      this.r(p.q[-23658 & 16782], 112, 0);
      float var2 = -16.0F;
      this.UH = new mm(this, q.q[-16129 & 1151]);
      this.UH.q(p.q[12711 & 399], -6.0F, -1.0F, -8.0F + var2, 12, 5, 16);
      this.UH.q(p.q[-15960 & 3480], -8.0F, -8.0F, 6.0F + var2, 16, 16, 16);
      this.UH.Xx = true;
      this.UH.q(q.q[1657 & 2299], -5.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.UH.q(p.q[-28231 & 25487], -5.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.UH.Xx = false;
      this.UH.q(q.q[763 & 18557], 3.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.UH.q(p.q[-32375 & 8619], 3.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.UQ = new mm(this, p.q[2443 & -15990]);
      this.UQ.e(0.0F, 4.0F, 8.0F + var2);
      this.UQ.q(p.q[-31334 & 939], -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.UH.q(this.UQ);
      this.UT = new mm(this, p.q[-3189 & 1467]);
      this.UT.q(p.q[24973 & 2444], -5.0F, -5.0F, -5.0F, 10, 10, 10);
      this.UT.q(q.q[21115 & 8569], -1.0F, -9.0F, -3.0F, 2, 4, 6);
      this.UD = new mm(this, r.q[838 & -22842]);
      this.UD.e(0.0F, 4.0F, 8.0F);
      this.UD.q(r.q[29422 & 582], -12.0F, 0.0F, -16.0F, 24, 24, 64);
      this.UD.q(q.q[-32647 & 377], -1.0F, -6.0F, -10.0F, 2, 6, 12);
      this.UD.q(q.q[893 & 1273], -1.0F, -6.0F, 10.0F, 2, 6, 12);
      this.UD.q(q.q[17657 & 12409], -1.0F, -6.0F, 30.0F, 2, 6, 12);
      this.UZ = new mm(this, p.q[461 & 15245]);
      this.UZ.e(-12.0F, 5.0F, 2.0F);
      this.UZ.q(r.q[16471 & 23], -56.0F, -4.0F, -4.0F, 56, 8, 8);
      this.UZ.q(p.q[10670 & 399], -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.UY = new mm(this, p.q[29135 & 943]);
      this.UY.e(-56.0F, 0.0F, 0.0F);
      this.UY.q(r.q[16503 & 4511], -56.0F, -2.0F, -2.0F, 56, 4, 4);
      this.UY.q(p.q[5006 & 415], -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.UZ.q(this.UY);
      this.UX = new mm(this, p.q[28127 & -32336]);
      this.UX.e(-12.0F, 20.0F, 2.0F);
      this.UX.q(q.q[537 & -26087], -4.0F, -4.0F, -4.0F, 8, 24, 8);
      this.UR = new mm(this, p.q[25043 & 5009]);
      this.UR.e(0.0F, 20.0F, -1.0F);
      this.UR.q(q.q[5721 & -30147], -3.0F, -1.0F, -3.0F, 6, 24, 6);
      this.UX.q(this.UR);
      this.UW = new mm(this, p.q[-31846 & 8627]);
      this.UW.e(0.0F, 23.0F, 0.0F);
      this.UW.q(q.q[-31143 & 19129], -4.0F, 0.0F, -12.0F, 8, 4, 16);
      this.UR.q(this.UW);
      this.UV = new mm(this, p.q[-30829 & 22967]);
      this.UV.e(-16.0F, 16.0F, 42.0F);
      this.UV.q(q.q[-12739 & 8857], -8.0F, -4.0F, -8.0F, 16, 32, 16);
      this.US = new mm(this, p.q[4533 & -13346]);
      this.US.e(0.0F, 32.0F, -4.0F);
      this.US.q(q.q[4825 & 8985], -6.0F, -2.0F, 0.0F, 12, 32, 12);
      this.UV.q(this.US);
      this.Va = new mm(this, p.q[17333 & -32363]);
      this.Va.e(0.0F, 31.0F, 4.0F);
      this.Va.q(q.q[-29155 & 8731], -9.0F, 0.0F, -20.0F, 18, 6, 24);
      this.US.q(this.Va);
   }

   public void q(zz var1, float var2, float var3, float var4) {
      this.UU = var4;
   }
}

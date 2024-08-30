public class mv extends lJ {
   public mm XP;
   public mm XQ;
   public mm XR;
   public mm XS;
   public mm XT;
   public mm XU;
   public mm XV;
   public mm XW;
   public mm XX;
   public mm XY;
   public mm XZ;

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      this.XP.Xn = var4 / 57.295776F;
      this.XP.Xw = var5 / 57.295776F;
      float var8 = 0.7853982F;
      this.XU.Xp = -var8;
      this.XQ.Xp = var8;
      this.XW.Xp = -var8 * 0.74F;
      this.XT.Xp = var8 * 0.74F;
      this.XZ.Xp = -var8 * 0.74F;
      this.XS.Xp = var8 * 0.74F;
      this.XV.Xp = -var8;
      this.XX.Xp = var8;
      float var9 = -0.0F;
      float var10 = 0.3926991F;
      this.XU.Xn = var10 * 2.0F + var9;
      this.XQ.Xn = -var10 * 2.0F - var9;
      this.XW.Xn = var10 * 1.0F + var9;
      this.XT.Xn = -var10 * 1.0F - var9;
      this.XZ.Xn = -var10 * 1.0F + var9;
      this.XS.Xn = var10 * 1.0F - var9;
      this.XV.Xn = -var10 * 2.0F + var9;
      this.XX.Xn = var10 * 2.0F - var9;
      float var11 = -(Pq.bi(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
      float var12 = -(Pq.bi(var1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * var2;
      float var13 = -(Pq.bi(var1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * var2;
      float var14 = -(Pq.bi(var1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * var2;
      float var15 = Math.abs(Pq.bk(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
      float var16 = Math.abs(Pq.bk(var1 * 0.6662F + 3.1415927F) * 0.4F) * var2;
      float var17 = Math.abs(Pq.bk(var1 * 0.6662F + 1.5707964F) * 0.4F) * var2;
      float var18 = Math.abs(Pq.bk(var1 * 0.6662F + 4.712389F) * 0.4F) * var2;
      this.XU.Xn += var11;
      this.XQ.Xn += -var11;
      this.XW.Xn += var12;
      this.XT.Xn += -var12;
      this.XZ.Xn += var13;
      this.XS.Xn += -var13;
      this.XV.Xn += var14;
      this.XX.Xn += -var14;
      this.XU.Xp += var15;
      this.XQ.Xp += -var15;
      this.XW.Xp += var16;
      this.XT.Xp += -var16;
      this.XZ.Xp += var17;
      this.XS.Xp += -var17;
      this.XV.Xp += var18;
      this.XX.Xp += -var18;
   }

   public mv() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.XP = new mm(this, 32, 4);
      this.XP.w(-4.0F, -4.0F, -8.0F, 8, 8, 8, var1);
      this.XP.e(0.0F, (float)var2, -3.0F);
      this.XR = new mm(this, 0, 0);
      this.XR.w(-3.0F, -3.0F, -3.0F, 6, 6, 6, var1);
      this.XR.e(0.0F, (float)var2, 0.0F);
      this.XY = new mm(this, 0, 12);
      this.XY.w(-5.0F, -4.0F, -6.0F, 10, 8, 12, var1);
      this.XY.e(0.0F, (float)var2, 9.0F);
      this.XU = new mm(this, 18, 0);
      this.XU.w(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.XU.e(-4.0F, (float)var2, 2.0F);
      this.XQ = new mm(this, 18, 0);
      this.XQ.w(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.XQ.e(4.0F, (float)var2, 2.0F);
      this.XW = new mm(this, 18, 0);
      this.XW.w(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.XW.e(-4.0F, (float)var2, 1.0F);
      this.XT = new mm(this, 18, 0);
      this.XT.w(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.XT.e(4.0F, (float)var2, 1.0F);
      this.XZ = new mm(this, 18, 0);
      this.XZ.w(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.XZ.e(-4.0F, (float)var2, 0.0F);
      this.XS = new mm(this, 18, 0);
      this.XS.w(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.XS.e(4.0F, (float)var2, 0.0F);
      this.XV = new mm(this, 18, 0);
      this.XV.w(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.XV.e(-4.0F, (float)var2, -1.0F);
      this.XX = new mm(this, 18, 0);
      this.XX.w(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.XX.e(4.0F, (float)var2, -1.0F);
   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.q(var2, var3, var4, var5, var6, var7, var1);
      this.XP.H(var7);
      this.XR.H(var7);
      this.XY.H(var7);
      this.XU.H(var7);
      this.XQ.H(var7);
      this.XW.H(var7);
      this.XT.H(var7);
      this.XZ.H(var7);
      this.XS.H(var7);
      this.XV.H(var7);
      this.XX.H(var7);
   }
}

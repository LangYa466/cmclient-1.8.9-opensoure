public class lP {
   public final float Ur;
   public String Us;
   private mD[] Ut;
   public final float Uu;
   private mF[] Uv;
   public final float Uw;
   public final float Ux;
   public final float Uy;
   public final float Uz;

   public lP(mm var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10, boolean var11) {
      this.Ur = var4;
      this.Uw = var5;
      this.Ux = var6;
      this.Uy = var4 + (float)var7;
      this.Uu = var5 + (float)var8;
      this.Uz = var6 + (float)var9;
      this.Ut = new mD[8];
      this.Uv = new mF[6];
      float var12 = var4 + (float)var7;
      float var13 = var5 + (float)var8;
      float var14 = var6 + (float)var9;
      var4 = var4 - var10;
      var5 = var5 - var10;
      var6 = var6 - var10;
      var12 = var12 + var10;
      var13 = var13 + var10;
      var14 = var14 + var10;
      if (var11) {
         float var15 = var12;
         var12 = var4;
         var4 = var15;
      }

      mD var30 = new mD(var4, var5, var6, 0.0F, 0.0F);
      mD var16 = new mD(var12, var5, var6, 0.0F, 8.0F);
      mD var17 = new mD(var12, var13, var6, 8.0F, 8.0F);
      mD var18 = new mD(var4, var13, var6, 8.0F, 0.0F);
      mD var19 = new mD(var4, var5, var14, 0.0F, 0.0F);
      mD var20 = new mD(var12, var5, var14, 0.0F, 8.0F);
      mD var21 = new mD(var12, var13, var14, 8.0F, 8.0F);
      mD var22 = new mD(var4, var13, var14, 8.0F, 0.0F);
      this.Ut[0] = var30;
      this.Ut[1] = var16;
      this.Ut[2] = var17;
      this.Ut[3] = var18;
      this.Ut[4] = var19;
      this.Ut[5] = var20;
      this.Ut[6] = var21;
      this.Ut[7] = var22;
      this.Uv[0] = new mF(new mD[]{var20, var16, var17, var21}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var9, var3 + var9 + var8, var1.Xl, var1.Xd);
      this.Uv[1] = new mF(new mD[]{var30, var19, var22, var18}, var2, var3 + var9, var2 + var9, var3 + var9 + var8, var1.Xl, var1.Xd);
      this.Uv[2] = new mF(new mD[]{var20, var19, var30, var16}, var2 + var9, var3, var2 + var9 + var7, var3 + var9, var1.Xl, var1.Xd);
      this.Uv[3] = new mF(new mD[]{var17, var18, var22, var21}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var7, var3, var1.Xl, var1.Xd);
      this.Uv[4] = new mF(new mD[]{var16, var30, var18, var17}, var2 + var9, var3 + var9, var2 + var9 + var7, var3 + var9 + var8, var1.Xl, var1.Xd);
      this.Uv[5] = new mF(new mD[]{var19, var20, var21, var22}, var2 + var9 + var7 + var9, var3 + var9, var2 + var9 + var7 + var9 + var7, var3 + var9 + var8, var1.Xl, var1.Xd);
      if (var11) {
         for(int var23 = 0; var23 < this.Uv.length; ++var23) {
            this.Uv[var23].lm();
         }
      }

   }

   public lP ab(String var1) {
      this.Us = var1;
      return this;
   }

   private mF q(mD[] var1, int[] var2, boolean var3, float var4, float var5) {
      return var2 == null ? null : (var3 ? new mF(var1, var2[2], var2[3], var2[0], var2[1], var4, var5) : new mF(var1, var2[0], var2[1], var2[2], var2[3], var4, var5));
   }

   public lP(mm var1, int[][] var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, boolean var10) {
      this.Ur = var3;
      this.Uw = var4;
      this.Ux = var5;
      this.Uy = var3 + var6;
      this.Uu = var4 + var7;
      this.Uz = var5 + var8;
      this.Ut = new mD[8];
      this.Uv = new mF[6];
      float var11 = var3 + var6;
      float var12 = var4 + var7;
      float var13 = var5 + var8;
      var3 = var3 - var9;
      var4 = var4 - var9;
      var5 = var5 - var9;
      var11 = var11 + var9;
      var12 = var12 + var9;
      var13 = var13 + var9;
      if (var10) {
         float var14 = var11;
         var11 = var3;
         var3 = var14;
      }

      mD var32 = new mD(var3, var4, var5, 0.0F, 0.0F);
      mD var15 = new mD(var11, var4, var5, 0.0F, 8.0F);
      mD var16 = new mD(var11, var12, var5, 8.0F, 8.0F);
      mD var17 = new mD(var3, var12, var5, 8.0F, 0.0F);
      mD var18 = new mD(var3, var4, var13, 0.0F, 0.0F);
      mD var19 = new mD(var11, var4, var13, 0.0F, 8.0F);
      mD var20 = new mD(var11, var12, var13, 8.0F, 8.0F);
      mD var21 = new mD(var3, var12, var13, 8.0F, 0.0F);
      this.Ut[0] = var32;
      this.Ut[1] = var15;
      this.Ut[2] = var16;
      this.Ut[3] = var17;
      this.Ut[4] = var18;
      this.Ut[5] = var19;
      this.Ut[6] = var20;
      this.Ut[7] = var21;
      this.Uv[0] = this.q(new mD[]{var19, var15, var16, var20}, var2[4], false, var1.Xl, var1.Xd);
      this.Uv[1] = this.q(new mD[]{var32, var18, var21, var17}, var2[5], false, var1.Xl, var1.Xd);
      this.Uv[2] = this.q(new mD[]{var19, var18, var32, var15}, var2[1], true, var1.Xl, var1.Xd);
      this.Uv[3] = this.q(new mD[]{var16, var17, var21, var20}, var2[0], true, var1.Xl, var1.Xd);
      this.Uv[4] = this.q(new mD[]{var15, var32, var17, var16}, var2[2], false, var1.Xl, var1.Xd);
      this.Uv[5] = this.q(new mD[]{var18, var19, var20, var21}, var2[3], false, var1.Xl, var1.Xd);
      if (var10) {
         for(mF var25 : this.Uv) {
            var25.lm();
         }
      }

   }

   public lP(mm var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var1.Xx);
   }

   public void q(qq var1, float var2) {
      for(int var3 = 0; var3 < this.Uv.length; ++var3) {
         mF var4 = this.Uv[var3];
         if (var4 != null) {
            var4.w(var1, var2);
         }
      }

   }
}

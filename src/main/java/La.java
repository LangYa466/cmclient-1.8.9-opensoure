public class LA {
   private Wk bBz;
   private Ly bBA = new Ly();
   private LF[] bBB = new LF[32];

   public Lz q(Qx var1, zk var2, NW var3, float var4) {
      return this.q(var1, var2, (double)((float)var3.aY() + 0.5F), (double)((float)var3.aX() + 0.5F), (double)((float)var3.KO() + 0.5F), var4);
   }

   private Lz q(Qx var1, zk var2, double var3, double var5, double var7, float var9) {
      this.bBA.Nx();
      this.bBz.q(var1, var2);
      LF var10 = this.bBz.af(var2);
      LF var11 = this.bBz.e(var2, var3, var5, var7);
      Lz var12 = this.q(var2, var10, var11, var9);
      this.bBz.adr();
      return var12;
   }

   public LA(Wk var1) {
      this.bBz = var1;
   }

   private Lz q(LF var1, LF var2) {
      int var3 = 1;

      for(LF var4 = var2; var4.bBU != null; var4 = var4.bBU) {
         ++var3;
      }

      LF[] var7 = new LF[var3];
      LF var5 = var2;
      --var3;

      for(var7[var3] = var2; var5.bBU != null; var7[var3] = var5) {
         var5 = var5.bBU;
         --var3;
      }

      return new Lz(var7);
   }

   private Lz q(zk var1, LF var2, LF var3, float var4) {
      var2.bBN = 0.0F;
      var2.bBS = var2.e(var3);
      var2.bBP = var2.bBS;
      this.bBA.Nx();
      this.bBA.q(var2);
      LF var5 = var2;

      while(!this.bBA.Nz()) {
         LF var6 = this.bBA.Ny();
         if (var6.equals(var3)) {
            return this.q(var2, var3);
         }

         if (var6.e(var3) < var5.e(var3)) {
            var5 = var6;
         }

         var6.bBO = true;
         int var7 = this.bBz.q(this.bBB, var1, var6, var3, var4);

         for(int var8 = 0; var8 < var7; ++var8) {
            LF var9 = this.bBB[var8];
            float var10 = var6.bBN + var6.e(var9);
            if (var10 < var4 * 2.0F && (!var9.NT() || var10 < var9.bBN)) {
               var9.bBU = var6;
               var9.bBN = var10;
               var9.bBS = var9.e(var3);
               if (var9.NT()) {
                  this.bBA.q(var9, var9.bBN + var9.bBS);
               } else {
                  var9.bBP = var9.bBN + var9.bBS;
                  this.bBA.q(var9);
               }
            }
         }
      }

      if (var5 == var2) {
         return null;
      } else {
         return this.q(var2, var5);
      }
   }

   public Lz q(Qx var1, zk var2, zk var3, float var4) {
      return this.q(var1, var2, var3.aNZ, var3.xE().bNT, var3.aOt, var4);
   }
}

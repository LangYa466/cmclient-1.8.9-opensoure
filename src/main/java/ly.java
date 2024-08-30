public class Ly {
   private int axZ;
   private LF[] bBv = new LF[1024];

   private void fR(int var1) {
      LF var2 = this.bBv[var1];

      int var3;
      for(float var4 = var2.bBP; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >> 1;
         LF var5 = this.bBv[var3];
         if (var4 >= var5.bBP) {
            break;
         }

         this.bBv[var1] = var5;
         var5.apI = var1;
      }

      this.bBv[var1] = var2;
      var2.apI = var1;
   }

   public void Nx() {
      this.axZ = 0;
   }

   public LF q(LF var1) {
      if (var1.apI >= 0) {
         throw new IllegalStateException(o.q[1907 & -11273]);
      } else {
         if (this.axZ == this.bBv.length) {
            LF[] var2 = new LF[this.axZ << 1];
            System.arraycopy(this.bBv, 0, var2, 0, this.axZ);
            this.bBv = var2;
         }

         this.bBv[this.axZ] = var1;
         var1.apI = this.axZ;
         this.fR(this.axZ++);
         return var1;
      }
   }

   private void fS(int var1) {
      LF var2 = this.bBv[var1];
      float var3 = var2.bBP;

      while(true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if (var4 >= this.axZ) {
            break;
         }

         LF var6 = this.bBv[var4];
         float var7 = var6.bBP;
         LF var8;
         float var9;
         if (var5 >= this.axZ) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.bBv[var5];
            var9 = var8.bBP;
         }

         if (var7 < var9) {
            if (var7 >= var3) {
               break;
            }

            this.bBv[var1] = var6;
            var6.apI = var1;
            var1 = var4;
         } else {
            if (var9 >= var3) {
               break;
            }

            this.bBv[var1] = var8;
            var8.apI = var1;
            var1 = var5;
         }
      }

      this.bBv[var1] = var2;
      var2.apI = var1;
   }

   public LF Ny() {
      LF var1 = this.bBv[0];
      this.bBv[0] = this.bBv[--this.axZ];
      this.bBv[this.axZ] = null;
      if (this.axZ > 0) {
         this.fS(0);
      }

      var1.apI = -1;
      return var1;
   }

   public void q(LF var1, float var2) {
      float var3 = var1.bBP;
      var1.bBP = var2;
      if (var2 < var3) {
         this.fR(var1.apI);
      } else {
         this.fS(var1.apI);
      }

   }

   public boolean Nz() {
      return this.axZ == 0;
   }
}

public class aeJ {
   private float Lh = 0.0F;
   private float cwM = 0.0F;
   private long Lj = -1L & -1L;

   public float r() {
      return this.cwM;
   }

   private float kQ(int var1) {
      return aiz.e((float)var1, 1.0F, 32.0F * 0.3125F, 8.5416675E-4F * 1.1707317F, 0.07042254F * 0.14199999F);
   }

   public void pK() {
      this.Lh = 0.0F;
   }

   public void kR(int var1) {
      if (this.Lj == (-1L & -1L)) {
         this.Lj = System.currentTimeMillis();
      } else {
         long var2 = System.currentTimeMillis();
         long var4 = var2 - this.Lj;
         this.Lj = var2;
         if (this.Lh < 1.0F) {
            this.Lh += this.kQ(var1) * (float)var4;
         }

         this.Lh = (float)aiz.T((double)this.Lh, 0.0D, 1.0D);
         float var6 = this.Lh;
         float var7 = (float)(1.0D - (double)(--var6) * Math.pow((double)var6, 3.197802197802198D * 0.9381443298969072D));
         this.cwM = (float)aiz.T((double)var7, 0.0D, 1.0D);
      }
   }
}

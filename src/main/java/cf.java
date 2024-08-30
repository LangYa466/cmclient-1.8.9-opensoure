class CF extends Bc {
   private boolean baG;
   private CA baD;
   private int baH;
   private float baI;

   public CF(CA var1) {
      super(var1);
      this.baD = var1;
   }

   public void e(float var1, boolean var2) {
      this.baI = var1;
      this.baG = var2;
   }

   public void l(double var1) {
      this.aUF = var1;
      this.aVZ = true;
   }

   public void Be() {
      this.aVT.aOn = this.k(this.aVT.aOn, this.baI, 30.0F);
      this.aVT.aQu = this.aVT.aOn;
      this.aVT.aQB = this.aVT.aOn;
      if (!this.aVZ) {
         this.aVT.ay(0.0F);
      } else {
         this.aVZ = false;
         if (this.aVT.aNG) {
            this.aVT.az((float)(this.aUF * this.aVT.q(zR.aSd).Bs()));
            if (this.baH-- <= 0) {
               this.baH = this.baD.Du();
               if (this.baG) {
                  this.baH /= 3;
               }

               this.baD.yS().AV();
               if (this.baD.DD()) {
                  this.baD.q(this.baD.Dt(), this.baD.zw(), ((this.baD.zY().nextFloat() - this.baD.zY().nextFloat()) * 0.2F + 1.0F) * 0.8F);
               }
            } else {
               this.baD.aQD = this.baD.aPW = 0.0F;
               this.aVT.az(0.0F);
            }
         } else {
            this.aVT.az((float)(this.aUF * this.aVT.q(zR.aSd).Bs()));
         }
      }

   }
}

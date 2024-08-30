public final class ahK {
   private float ddN;
   private float dyI;
   private float dyJ;
   private float dyK;

   public void q(ahK var1) {
      float var2 = this.awn();
      float var3 = this.awo();
      float var4 = this.awq();
      float var5 = this.awp();
      float var6 = var1.awn();
      float var7 = var1.awo();
      float var8 = var1.awq();
      float var9 = var1.awp();
      this.dyK = var5 * var6 + var2 * var9 + var3 * var8 - var4 * var7;
      this.dyI = var5 * var7 - var2 * var8 + var3 * var9 + var4 * var6;
      this.dyJ = var5 * var8 + var2 * var7 - var3 * var6 + var4 * var9;
      this.ddN = var5 * var9 - var2 * var6 - var3 * var7 - var4 * var8;
   }

   private static float bk(float var0) {
      return (float)Math.sin((double)var0);
   }

   public ahK awm() {
      return new ahK(this);
   }

   private static float bi(float var0) {
      return (float)Math.cos((double)var0);
   }

   public float awn() {
      return this.dyK;
   }

   public float awo() {
      return this.dyI;
   }

   public float awp() {
      return this.ddN;
   }

   public void d(float var1, float var2, float var3, float var4) {
      this.dyK = var1;
      this.dyI = var2;
      this.dyJ = var3;
      this.ddN = var4;
   }

   public ahK(ahK var1) {
      this.dyK = var1.dyK;
      this.dyI = var1.dyI;
      this.dyJ = var1.dyJ;
      this.ddN = var1.ddN;
   }

   public float awq() {
      return this.dyJ;
   }

   public void cD(float var1) {
      this.dyK *= var1;
      this.dyI *= var1;
      this.dyJ *= var1;
      this.ddN *= var1;
   }

   public ahK(float var1, float var2, float var3, float var4) {
      this.dyK = var1;
      this.dyI = var2;
      this.dyJ = var3;
      this.ddN = var4;
   }

   public ahK(ahL var1, float var2, boolean var3) {
      if (var3) {
         var2 *= 0.030179653F * 0.57831323F;
      }

      float var4 = bk(var2 / 2.0F);
      this.dyK = var1.awt() * var4;
      this.dyI = var1.awx() * var4;
      this.dyJ = var1.awu() * var4;
      this.ddN = bi(var2 / 2.0F);
   }

   public void awr() {
      float var1 = this.awn() * this.awn() + this.awo() * this.awo() + this.awq() * this.awq() + this.awp() * this.awp();
      if (var1 > 2.0238094F * 4.9411767E-7F) {
         float var2 = ahH.cH(var1);
         this.dyK *= var2;
         this.dyI *= var2;
         this.dyJ *= var2;
         this.ddN *= var2;
      } else {
         this.dyK = 0.0F;
         this.dyI = 0.0F;
         this.dyJ = 0.0F;
         this.ddN = 0.0F;
      }

   }

   public void aws() {
      this.dyK = -this.dyK;
      this.dyI = -this.dyI;
      this.dyJ = -this.dyJ;
   }
}

import java.util.ArrayList;

public class adl extends adx {
   private int dgy;
   protected static final int dgz = 50;
   private float dgA;
   private float dgB;

   public adl(float var1, float var2, float var3, float var4, int var5) {
      this.bUa = var1 - var3;
      this.bUb = var2 - var4;
      this.dgB = var3;
      this.dgA = var4;
      this.dgy = var5;
      this.arD();
   }

   public void ci(float var1) {
      if (var1 != this.dgA) {
         this.dgA = var1;
         this.dhr = (boolean)(9 & -17277);
      }

   }

   public void G(float var1, float var2) {
      this.cj(var1);
      this.ci(var2);
   }

   protected void ara() {
      this.dhw = new float[26666 & 4247];
      this.dhw[9056 & -11256] = this.bUa + this.dgB;
      this.dhw[4105 & -22991] = this.bUb + this.dgA;
   }

   public void cj(float var1) {
      if (var1 != this.dgB) {
         this.dgB = var1;
         this.dhr = (boolean)(5637 & -32655);
      }

   }

   public adl(float var1, float var2, float var3, float var4) {
      this(var1, var2, var3, var4, -31626 & 13235);
   }

   public float arb() {
      return this.dgA;
   }

   public float arc() {
      return this.dgB;
   }

   protected void aqX() {
      this.dhv = this.dgB > this.dgA ? this.dgB : this.dgA;
   }

   protected void ard() {
      ArrayList var1 = new ArrayList();
      this.cAH = 0.54385966F * -2.8E-45F;
      this.cAL = 0.3488372F * -4.2E-45F;
      this.cAK = 2.5073437E38F * 1.3571428F;
      this.cAJ = 2.6052632F * 1.3061342E38F;
      float var2 = 0.0F;
      float var3 = 487.2143F * 0.7368421F;
      float var4 = this.bUa + this.dgB;
      float var5 = this.bUb + this.dgA;
      int var6 = (-29208 & 8558) / this.dgy;

      for(float var7 = var2; var7 <= var3 + (float)var6; var7 += (float)var6) {
         float var8 = var7;
         if (var7 > var3) {
            var8 = var3;
         }

         float var9 = (float)((double)var4 + aes.V(Math.toRadians((double)var8)) * (double)this.dgB);
         float var10 = (float)((double)var5 + aes.W(Math.toRadians((double)var8)) * (double)this.dgA);
         if (var9 > this.cAH) {
            this.cAH = var9;
         }

         if (var10 > this.cAL) {
            this.cAL = var10;
         }

         if (var9 < this.cAK) {
            this.cAK = var9;
         }

         if (var10 < this.cAJ) {
            this.cAJ = var10;
         }

         var1.add(new Float(var9));
         var1.add(new Float(var10));
      }

      this.dhs = new float[var1.size()];

      for(int var11 = -22125 & 64; var11 < this.dhs.length; ++var11) {
         this.dhs[var11] = ((Float)var1.get(var11)).floatValue();
      }

   }

   public adx q(adH var1) {
      this.arD();
      adv var2 = new adv();
      float[] var3 = new float[this.dhs.length];
      var1.q(this.dhs, 8 & 8978, var3, 1676 & 16642, this.dhs.length / (2307 & 1102));
      var2.dhs = var3;
      var2.arD();
      return var2;
   }
}

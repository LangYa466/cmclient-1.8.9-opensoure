public class sR extends sv {
   private static final PJ asu = new PJ(u.q[1834 & 19214]);

   // $FF: synthetic method
   protected PJ f(zk var1) {
      return this.q((Do)var1);
   }

   public sR(sx var1, lJ var2, float var3) {
      super(var1, var2, var3);
   }

   protected PJ q(Do var1) {
      return asu;
   }

   // $FF: synthetic method
   protected float e(zz var1, float var2) {
      return this.q((Do)var1, var2);
   }

   // $FF: synthetic method
   protected void w(zz var1, float var2, float var3, float var4) {
      this.q((Do)var1, var2, var3, var4);
   }

   protected float q(Do var1, float var2) {
      return var1.bcE + (var1.bcK - var1.bcE) * var2;
   }

   protected void q(Do var1, float var2, float var3, float var4) {
      float var5 = var1.bcB + (var1.bcC - var1.bcB) * var4;
      float var6 = var1.bcD + (var1.bcF - var1.bcD) * var4;
      pz.y(0.0F, 0.5F, 0.0F);
      pz.i(180.0F - var3, 0.0F, 1.0F, 0.0F);
      pz.i(var5, 1.0F, 0.0F, 0.0F);
      pz.i(var6, 0.0F, 1.0F, 0.0F);
      pz.y(0.0F, -1.2F, 0.0F);
   }
}

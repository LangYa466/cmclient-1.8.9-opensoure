public class ub extends rL {
   private static final PJ awx = new PJ(r.q[1003 & 9209]);
   private static final PJ awy = new PJ(r.q[-23574 & 22506]);
   private final ms awz = new ms();

   // $FF: synthetic method
   public void e(zk var1, double var2, double var4, double var6, float var8, float var9) {
      this.q((DV)var1, var2, var4, var6, var8, var9);
   }

   // $FF: synthetic method
   protected PJ f(zk var1) {
      return this.q((DV)var1);
   }

   public void q(DV var1, double var2, double var4, double var6, float var8, float var9) {
      pz.nE();
      pz.nK();
      float var10 = this.d(var1.aOF, var1.aOn, var9);
      float var11 = var1.aOr + (var1.aNN - var1.aOr) * var9;
      pz.y((float)var2, (float)var4, (float)var6);
      float var12 = 0.0625F;
      pz.od();
      pz.u(-1.0F, -1.0F, 1.0F);
      pz.hT();
      this.g(var1);
      this.awz.q(var1, 0.0F, 0.0F, 0.0F, var10, var11, var12);
      pz.nF();
      super.e(var1, var2, var4, var6, var8, var9);
   }

   public ub(sx var1) {
      super(var1);
   }

   private float d(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      return var1 + var3 * var4;
   }

   protected PJ q(DV var1) {
      return var1.GP() ? awx : awy;
   }
}

public class mb extends ms {
   private final mm Wb = new mm(this, 32, 0);

   public mb() {
      super(0, 0, 64, 64);
      this.Wb.w(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F);
      this.Wb.e(0.0F, 0.0F, 0.0F);
   }

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      super.q(var1, var2, var3, var4, var5, var6, var7);
      this.Wb.Xn = this.XH.Xn;
      this.Wb.Xw = this.XH.Xw;
   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.q(var1, var2, var3, var4, var5, var6, var7);
      this.Wb.H(var7);
   }
}

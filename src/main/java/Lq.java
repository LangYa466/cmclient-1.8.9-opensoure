public class lQ extends lJ {
   public mm UA;
   public mm UB = (new mm(this, 0, 0)).D(64, 64);
   public mm UC;

   public void ld() {
      this.UA.Xw = this.UB.Xw;
      this.UB.H(0.0625F);
      this.UA.H(0.0625F);
      this.UC.H(0.0625F);
   }

   public lQ() {
      this.UB.w(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
      this.UB.WW = 1.0F;
      this.UB.Xr = 7.0F;
      this.UB.Xj = 15.0F;
      this.UA = (new mm(this, 0, 0)).D(64, 64);
      this.UA.w(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
      this.UA.WW = 8.0F;
      this.UA.Xr = 7.0F;
      this.UA.Xj = 15.0F;
      this.UC = (new mm(this, 0, 19)).D(64, 64);
      this.UC.w(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
      this.UC.WW = 1.0F;
      this.UC.Xr = 6.0F;
      this.UC.Xj = 1.0F;
   }
}

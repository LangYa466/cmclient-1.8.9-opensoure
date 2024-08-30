public class Rd {
   public int bZj;
   // $FF: synthetic field
   final Rc bZk;
   public Rl[] bZl;
   public float[] bZm;
   public long bZn;
   public int Gv;

   public Rd(Rc var1, int var2, int var3) {
      this.bZk = var1;
      this.bZm = new float[256];
      this.bZl = new Rl[256];
      this.Gv = var2;
      this.bZj = var3;
      Rc.q(var1).q(this.bZm, var2 << 4, var3 << 4, 16, 16);
      Rc.q(var1).q(this.bZl, var2 << 4, var3 << 4, 16, 16, false);
   }

   public Rl aR(int var1, int var2) {
      return this.bZl[var1 & 15 | (var2 & 15) << 4];
   }
}

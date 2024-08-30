public class JM implements IF {
   private GX gv;
   private int bwJ;
   private int bxC;

   public void e(IG var1) {
      this.bwJ = var1.Jk();
      this.bxC = var1.readShort();
      this.gv = var1.Je();
   }

   public int Kz() {
      return this.bwJ;
   }

   public JM() {
   }

   public GX Gz() {
      return this.gv;
   }

   public void r(IG var1) {
      var1.fC(this.bwJ);
      var1.writeShort(this.bxC);
      var1.ao(this.gv);
   }

   public JM(int var1, int var2, GX var3) {
      this.bwJ = var1;
      this.bxC = var2;
      this.gv = var3 == null ? null : var3.HW();
   }

   public void q(Jb var1) {
      var1.q(this);
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jb)var1);
   }

   public int KA() {
      return this.bxC;
   }
}

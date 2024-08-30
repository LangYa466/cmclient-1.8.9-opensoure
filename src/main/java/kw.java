public class Kw implements IF {
   private NW byW;
   private cv Aq;
   private int byX;
   private int byf;

   public int LP() {
      return this.byX;
   }

   public cv LQ() {
      return this.Aq;
   }

   public Kw() {
   }

   public void e(IG var1) {
      this.byW = var1.Jf();
      this.byX = var1.readUnsignedByte();
      this.byf = var1.readUnsignedByte();
      this.Aq = cv.K(var1.Jk() & 4095);
   }

   public void q(Jb var1) {
      var1.q(this);
   }

   public int LR() {
      return this.byf;
   }

   public NW LO() {
      return this.byW;
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jb)var1);
   }

   public void r(IG var1) {
      var1.N(this.byW);
      var1.writeByte(this.byX);
      var1.writeByte(this.byf);
      var1.fC(cv.w(this.Aq) & 4095);
   }

   public Kw(NW var1, cv var2, int var3, int var4) {
      this.byW = var1;
      this.byX = var3;
      this.byf = var4;
      this.Aq = var2;
   }
}

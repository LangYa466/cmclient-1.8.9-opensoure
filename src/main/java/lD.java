public class Ld implements IF {
   private boolean bAC;
   private Qr aCE;

   public void e(IG var1) {
      this.aCE = Qr.hh(var1.readUnsignedByte());
   }

   public Ld(Qr var1, boolean var2) {
      this.aCE = var1;
      this.bAC = var2;
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jb)var1);
   }

   public Qr Kq() {
      return this.aCE;
   }

   public void q(Jb var1) {
      var1.q(this);
   }

   public Ld() {
   }

   public boolean Nj() {
      return this.bAC;
   }

   public void r(IG var1) {
      var1.writeByte(this.aCE.Zb());
   }
}

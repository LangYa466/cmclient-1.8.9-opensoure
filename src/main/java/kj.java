public class Kj implements IF {
   private int aNA;
   private byte byx;

   public void r(IG var1) {
      var1.writeInt(this.aNA);
      var1.writeByte(this.byx);
   }

   public void q(Jb var1) {
      var1.q(this);
   }

   public void e(IG var1) {
      this.aNA = var1.readInt();
      this.byx = var1.readByte();
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jb)var1);
   }

   public byte Lr() {
      return this.byx;
   }

   public zk a(QI var1) {
      return var1.bv(this.aNA);
   }

   public Kj(zk var1, byte var2) {
      this.aNA = var1.yi();
      this.byx = var2;
   }

   public Kj() {
   }
}

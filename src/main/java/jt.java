public class Jt implements IF {
   private int boD;

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jc)var1);
   }

   public void e(IG var1) {
      this.boD = var1.readByte();
   }

   public Jt(int var1) {
      this.boD = var1;
   }

   public Jt() {
   }

   public void q(Jc var1) {
      var1.q(this);
   }

   public void r(IG var1) {
      var1.writeByte(this.boD);
   }
}

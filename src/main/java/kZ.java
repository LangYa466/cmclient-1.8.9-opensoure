public class KZ implements IF {
   private String bAv;
   private int bAw;

   public void r(IG var1) {
      var1.writeByte(this.bAw);
      var1.bX(this.bAv);
   }

   public String Na() {
      return this.bAv;
   }

   public int Nb() {
      return this.bAw;
   }

   public void q(Jb var1) {
      var1.q(this);
   }

   public void e(IG var1) {
      this.bAw = var1.readByte();
      this.bAv = var1.fB(16);
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jb)var1);
   }

   public KZ() {
   }

   public KZ(int var1, LW var2) {
      this.bAw = var1;
      if (var2 == null) {
         this.bAv = q.q[2512 & 11];
      } else {
         this.bAv = var2.bY();
      }

   }
}

public class Jj extends Jh {
   public void r(IG var1) {
      var1.writeFloat(this.bwp);
      var1.writeFloat(this.DJ);
      super.r(var1);
   }

   public Jj() {
      this.bwr = true;
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      super.q((Jc)var1);
   }

   public void e(IG var1) {
      this.bwp = var1.readFloat();
      this.DJ = var1.readFloat();
      super.e(var1);
   }

   public Jj(float var1, float var2, boolean var3) {
      this.bwp = var1;
      this.DJ = var2;
      this.aNG = var3;
      this.bwr = true;
   }
}

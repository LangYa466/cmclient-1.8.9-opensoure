public class Jf implements IF {
   private PX bwj;
   private Jg bwk;
   private int aNA;

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jc)var1);
   }

   public void r(IG var1) {
      var1.fC(this.aNA);
      var1.w((Enum)this.bwk);
      if (this.bwk == Jg.bwn) {
         var1.writeFloat((float)this.bwj.bUV);
         var1.writeFloat((float)this.bwj.bUW);
         var1.writeFloat((float)this.bwj.bUX);
      }

   }

   public void q(Jc var1) {
      var1.q(this);
   }

   public Jf(zk var1, PX var2) {
      this(var1, Jg.bwn);
      this.bwj = var2;
   }

   public void e(IG var1) {
      this.aNA = var1.Jk();
      this.bwk = (Jg)var1.y(Jg.class);
      if (this.bwk == Jg.bwn) {
         this.bwj = new PX((double)var1.readFloat(), (double)var1.readFloat(), (double)var1.readFloat());
      }

   }

   public Jg JD() {
      return this.bwk;
   }

   public Jf() {
   }

   public zk o(QI var1) {
      return var1.bv(this.aNA);
   }

   public PX JE() {
      return this.bwj;
   }

   public Jf(zk var1, Jg var2) {
      this.aNA = var1.yi();
      this.bwk = var2;
   }
}

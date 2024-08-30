public class Jl implements IF {
   private OK rL;
   private NW nJ;
   private Jm bws;

   public void q(Jc var1) {
      var1.q(this);
   }

   public void r(IG var1) {
      var1.w((Enum)this.bws);
      var1.N(this.nJ);
      var1.writeByte(this.rL.tb());
   }

   public void e(IG var1) {
      this.bws = (Jm)var1.y(Jm.class);
      this.nJ = var1.Jf();
      this.rL = OK.gD(var1.readUnsignedByte());
   }

   public OK dz() {
      return this.rL;
   }

   public Jl() {
   }

   public NW dt() {
      return this.nJ;
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((Jc)var1);
   }

   public Jm JM() {
      return this.bws;
   }

   public Jl(Jm var1, NW var2, OK var3) {
      this.bws = var1;
      this.nJ = var2;
      this.rL = var3;
   }
}

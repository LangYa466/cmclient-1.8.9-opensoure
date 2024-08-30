public class agk {
   public float dsm;
   public float Xa = 1.0F;
   public float Xu = 1.0F;
   public float dst;
   public float bTZ;
   public float bUb;
   public float bUa;
   public float dso;
   public float WZ = 1.0F;
   public String duk;

   public agk(String var1) {
      this.duk = var1;
   }

   public agk avv() {
      agk var1 = new agk(this.duk);
      var1.bUa = this.bUa;
      var1.bUb = this.bUb;
      var1.bTZ = this.bTZ;
      var1.Xu = this.Xu;
      var1.WZ = this.WZ;
      var1.Xa = this.Xa;
      var1.dsm = this.dsm;
      var1.dso = this.dso;
      var1.dst = this.dst;
      return var1;
   }

   // $FF: synthetic method
   public Object clone() {
      return this.avv();
   }
}

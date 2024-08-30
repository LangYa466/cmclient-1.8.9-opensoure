public class IS implements IF {
   private HY bvX;
   private int bvY;
   private String bvZ;
   private int bwa;

   public HY Ju() {
      return this.bvX;
   }

   public IS(int var1, String var2, int var3, HY var4) {
      this.bwa = var1;
      this.bvZ = var2;
      this.bvY = var3;
      this.bvX = var4;
   }

   public void q(IR var1) {
      var1.q(this);
   }

   public void e(IG var1) {
      this.bwa = var1.Jk();
      this.bvZ = var1.fB(255);
      this.bvY = var1.readUnsignedShort();
      this.bvX = HY.fz(var1.Jk());
   }

   public void r(IG var1) {
      var1.fC(this.bwa);
      var1.bX(this.bvZ);
      var1.writeShort(this.bvY);
      var1.fC(this.bvX.B());
   }

   public IS() {
   }

   // $FF: synthetic method
   public void w(Ie var1) {
      this.q((IR)var1);
   }

   public int Jv() {
      return this.bwa;
   }
}

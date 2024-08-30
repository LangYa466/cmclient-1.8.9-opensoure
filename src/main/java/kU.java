public class Ku {
   // $FF: synthetic field
   final Kt byT;
   private final hI byU;
   private final short byV;

   public Ku(Kt var1, short var2, RQ var3) {
      this.byT = var1;
      this.byV = var2;
      this.byU = var3.g(this.eI());
   }

   public short LN() {
      return this.byV;
   }

   public NW eI() {
      return new NW(Kt.w(this.byT).I(this.byV >> 12 & 15, this.byV & 255, this.byV >> 8 & 15));
   }

   public hI dO() {
      return this.byU;
   }

   public Ku(Kt var1, short var2, hI var3) {
      this.byT = var1;
      this.byV = var2;
      this.byU = var3;
   }
}

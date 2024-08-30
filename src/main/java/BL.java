public class Bl extends Bg {
   private final double aWx;
   private final double aWy;
   private String jR;

   public Bl(Bi var1, String var2, double var3, double var5, double var7) {
      super(var1, var2, var3);
      this.aWx = var5;
      this.aWy = var7;
      if (var5 > var7) {
         throw new IllegalArgumentException(t.q[-15782 & 8990]);
      } else if (var3 < var5) {
         throw new IllegalArgumentException(t.q[23099 & -31973]);
      } else if (var3 > var7) {
         throw new IllegalArgumentException(t.q[17310 & 9756]);
      }
   }

   public Bl bl(String var1) {
      this.jR = var1;
      return this;
   }

   public String bp() {
      return this.jR;
   }

   public double g(double var1) {
      var1 = Pq.J(var1, this.aWx, this.aWy);
      return var1;
   }
}

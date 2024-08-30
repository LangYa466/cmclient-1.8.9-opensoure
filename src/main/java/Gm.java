public class GM extends Gp {
   private cv bsx;
   private cv bsy;

   public boolean q(GX var1, DD var2, QI var3, NW var4, OK var5, float var6, float var7, float var8) {
      if (var5 != OK.bQC) {
         return false;
      } else if (!var2.q(var4.v(var5), var5, var1)) {
         return false;
      } else if (var3.g(var4).ds() == this.bsx && var3.aj(var4.Vi())) {
         var3.r(var4.Vi(), this.bsy.cx());
         --var1.bsH;
         return true;
      } else {
         return false;
      }
   }

   public GM(int var1, float var2, cv var3, cv var4) {
      super(var1, var2, false);
      this.bsy = var3;
      this.bsx = var4;
   }
}

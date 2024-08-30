public class BK extends BF {
   public BH Ah() {
      return BH.aYo;
   }

   public boolean y(DD var1) {
      if (this.aND != null && this.aND instanceof DD && this.aND != var1) {
         return true;
      } else if (this.aND != null && this.aND != var1) {
         return false;
      } else {
         if (!this.vR.bXF) {
            var1.u(this);
         }

         return true;
      }
   }

   public void w(int var1, int var2, int var3, boolean var4) {
      if (var4) {
         if (this.aND != null) {
            this.aND.u((zk)null);
         }

         if (this.Cu() == 0) {
            this.eo(-this.Cz());
            this.en(10);
            this.aG(50.0F);
            this.xo();
         }
      }

   }

   public BK(QI var1) {
      super(var1);
   }

   public BK(QI var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }
}

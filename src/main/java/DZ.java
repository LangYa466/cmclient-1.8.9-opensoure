public abstract class Dz extends zx implements DC {
   public int zd() {
      return 120;
   }

   public boolean yy() {
      return true;
   }

   public Dz(QI var1) {
      super(var1);
   }

   public boolean yT() {
      return this.vR.q(this.xE(), this);
   }

   public boolean xO() {
      return false;
   }

   public void xe() {
      int var1 = this.xn();
      super.xe();
      if (this.xV() && !this.xg()) {
         --var1;
         this.dJ(var1);
         if (this.xn() == -20) {
            this.dJ(0);
            this.q(Oz.bPH, 2.0F);
         }
      } else {
         this.dJ(300);
      }

   }

   public boolean zL() {
      return true;
   }

   protected int p(DD var1) {
      return 1 + this.vR.bXs.nextInt(3);
   }

   protected boolean zo() {
      return true;
   }
}

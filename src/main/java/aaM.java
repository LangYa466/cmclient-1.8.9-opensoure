public class aam {
   private net.optifine.expr.d cRv;
   private aaF cRw;
   private String av;
   private aaB cRx;

   public void jx(int var1) {
      this.cRx.jx(var1);
   }

   public String toString() {
      return this.cRw.name().toLowerCase() + q.q[8559 & 346] + this.av;
   }

   public net.optifine.expr.d ama() {
      return this.cRv;
   }

   public aaF amb() {
      return this.cRw;
   }

   public aaB amc() {
      return this.cRx;
   }

   public aam(String var1, aaF var2, net.optifine.expr.d var3) {
      this.av = var1;
      this.cRw = var2;
      this.cRv = var3;
      this.cRx = var2.gK(var1);
   }

   public void pK() {
      this.cRx.pK();
   }

   public void aW() {
      if (this.cRx.aml()) {
         try {
            this.cRw.q(this.cRv, this.cRx);
         } catch (RuntimeException var2) {
            net.optifine.shaders.x.ft(i.q[-31938 & 25455] + this.cRx.bY());
            net.optifine.shaders.x.ft(var2.getClass().getName() + q.q[1924 & 10949] + var2.getMessage());
            this.cRx.amm();
            net.optifine.shaders.x.ft(i.q[3887 & 21359] + this.cRx.bY());
         }
      }

   }

   public String bY() {
      return this.av;
   }
}

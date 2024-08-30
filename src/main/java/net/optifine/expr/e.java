package net.optifine.expr;

public class e implements net.optifine.expr.g, net.optifine.expr.h {
   private float cwM;
   private boolean cwP;
   private final net.optifine.expr.h cwQ;

   public e(net.optifine.expr.h var1) {
      this.cwQ = var1;
   }

   public net.optifine.expr.y agh() {
      return net.optifine.expr.y.cwT;
   }

   public void pK() {
      this.cwP = false;
   }

   public String toString() {
      return .t.q[-21261 & 216] + this.cwQ + .w.q[605 & 19517];
   }

   public float agg() {
      if (!this.cwP) {
         this.cwM = this.cwQ.agg();
         this.cwP = true;
      }

      return this.cwM;
   }
}

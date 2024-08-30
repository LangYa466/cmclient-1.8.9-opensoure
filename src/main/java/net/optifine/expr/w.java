package net.optifine.expr;

public class w implements net.optifine.expr.g, net.optifine.expr.j {
   private final net.optifine.expr.j cwN;
   private float[] cwO;
   private boolean cwP;

   public String toString() {
      return .t.q[-32560 & 2288] + this.cwN + .w.q[1725 & -14305];
   }

   public void pK() {
      this.cwP = false;
   }

   public w(net.optifine.expr.j var1) {
      this.cwN = var1;
   }

   public net.optifine.expr.y agh() {
      return net.optifine.expr.y.cwT;
   }

   public float[] agi() {
      if (!this.cwP) {
         this.cwO = this.cwN.agi();
         this.cwP = true;
      }

      return this.cwO;
   }
}

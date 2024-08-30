import java.util.List;
import java.util.Random;

public class dm extends dk {
   private final boolean op;
   public static final hy oq = hy.w(q.q[423 & -26267], 0, 15);

   public hI J(int var1) {
      return this.cx().q(oq, Integer.valueOf(var1));
   }

   public dm(boolean var1) {
      super(hn.zJ);
      this.op = var1;
      this.q(this.nr.ez().q(oq, Integer.valueOf(0)));
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
      this.q(yl.aLN);
      this.h(0.2F);
      this.q(ng);
      this.l(o.q[18363 & 3025]);
   }

   public void v(QI var1, NW var2) {
      if (!var1.bXI.aad()) {
         hI var3 = var1.g(var2);
         int var4 = var1.w(Qs.bWm, var2) - var1.Zs();
         float var5 = var1.bw(1.0F);
         float var6 = var5 < 3.1415927F ? 0.0F : 6.2831855F;
         var5 = var5 + (var6 - var5) * 0.2F;
         var4 = Math.round((float)var4 * Pq.bi(var5));
         var4 = Pq.G(var4, 0, 15);
         if (this.op) {
            var4 = 15 - var4;
         }

         if (((Integer)var3.w(oq)).intValue() != var4) {
            var1.q(var2, var3.q(oq, Integer.valueOf(var4)), 3);
         }
      }

   }

   public void e(Qx var1, NW var2) {
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
   }

   protected hA cY() {
      return new hA(this, new ht[]{oq});
   }

   public void q(Fm var1, yl var2, List var3) {
      if (!this.op) {
         super.q(var1, var2, var3);
      }

   }

   public int e(hI var1) {
      return ((Integer)var1.w(oq)).intValue();
   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      if (var4.FJ()) {
         if (var1.bXF) {
            return true;
         } else {
            if (this.op) {
               var1.q(var2, Ea.bjT.cx().q(oq, var3.w(oq)), 4);
               Ea.bjT.v(var1, var2);
            } else {
               var1.q(var2, Ea.bhg.cx().q(oq, var3.w(oq)), 4);
               Ea.bhg.v(var1, var2);
            }

            return true;
         }
      } else {
         return super.q(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   public int cC() {
      return 3;
   }

   public boolean cr() {
      return false;
   }

   public Fm q(hI var1, Random var2, int var3) {
      return Fm.C(Ea.bjT);
   }

   public int w(Qx var1, NW var2, hI var3, OK var4) {
      return ((Integer)var3.w(oq)).intValue();
   }

   public boolean cw() {
      return false;
   }

   public No q(QI var1, int var2) {
      return new NC();
   }

   public boolean cJ() {
      return true;
   }

   public Fm i(QI var1, NW var2) {
      return Fm.C(Ea.bjT);
   }
}

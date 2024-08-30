import java.util.Random;

public class ir implements Pf {
   private final hS Do;
   private ik Dp;
   private int Dq = 100;
   private final Random Dr = new Random();

   public void gz() {
      if (this.Dp != null) {
         this.Do.fs().e(this.Dp);
         this.Dp = null;
         this.Dq = 0;
      }

   }

   public ir(hS var1) {
      this.Do = var1;
   }

   public void q(is var1) {
      this.Dp = iu.e(var1.gA());
      this.Do.fs().w(this.Dp);
      this.Dq = Integer.MAX_VALUE;
   }

   public void aW() {
      is var1 = this.Do.fq();
      if (this.Dp != null) {
         if (!var1.gA().equals(this.Dp.gq())) {
            this.Do.fs().e(this.Dp);
            this.Dq = Pq.q(this.Dr, 0, var1.gB() / 2);
         }

         if (!this.Do.fs().q(this.Dp)) {
            this.Dp = null;
            this.Dq = Math.min(Pq.q(this.Dr, var1.gB(), var1.gC()), this.Dq);
         }
      }

      if (this.Dp == null && this.Dq-- <= 0) {
         this.q(var1);
      }

   }
}

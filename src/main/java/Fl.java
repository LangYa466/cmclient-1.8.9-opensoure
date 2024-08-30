import java.util.Random;

public class fL extends cv {
   private final boolean uC;

   public Fm i(QI var1, NW var2) {
      return Fm.C(Ea.bgP);
   }

   public Fm q(hI var1, Random var2, int var3) {
      return Fm.C(Ea.bgP);
   }

   public void w(QI var1, NW var2, hI var3) {
      if (!var1.bXF) {
         if (this.uC && !var1.aA(var2)) {
            var1.q(var2, Ea.bgP.cx(), 2);
         } else if (!this.uC && var1.aA(var2)) {
            var1.q(var2, Ea.bkq.cx(), 2);
         }
      }

   }

   protected GX y(hI var1) {
      return new GX(Ea.bgP);
   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      if (!var1.bXF) {
         if (this.uC && !var1.aA(var2)) {
            var1.q(var2, this, 4);
         } else if (!this.uC && var1.aA(var2)) {
            var1.q(var2, Ea.bkq.cx(), 2);
         }
      }

   }

   public void e(QI var1, NW var2, hI var3, Random var4) {
      if (!var1.bXF && this.uC && !var1.aA(var2)) {
         var1.q(var2, Ea.bgP.cx(), 2);
      }

   }

   public fL(boolean var1) {
      super(hn.zW);
      this.uC = var1;
      if (var1) {
         this.f(1.0F);
      }

   }
}

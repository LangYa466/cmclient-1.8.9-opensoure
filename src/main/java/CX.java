import java.util.Random;

class Cx extends AV {
   private final Cw bat;
   private OK rL;
   private boolean bau;

   public void Az() {
      if (!this.bau) {
         super.Az();
      } else {
         QI var1 = this.bat.vR;
         NW var2 = (new NW(this.bat.aNZ, this.bat.aNK + 0.5D, this.bat.aOt)).v(this.rL);
         hI var3 = var1.g(var2);
         if (gc.v(var3)) {
            var1.q(var2, Ea.bkp.cx().q(gc.vs, ge.b(var3)), 3);
            this.bat.zf();
            this.bat.yo();
         }
      }

   }

   public boolean Av() {
      if (this.bat.zc() != null) {
         return false;
      } else if (!this.bat.yM().NE()) {
         return false;
      } else {
         Random var1 = this.bat.zY();
         if (var1.nextInt(10) == 0) {
            this.rL = OK.u(var1);
            NW var2 = (new NW(this.bat.aNZ, this.bat.aNK + 0.5D, this.bat.aOt)).v(this.rL);
            hI var3 = this.bat.vR.g(var2);
            if (gc.v(var3)) {
               this.bau = true;
               return true;
            }
         }

         this.bau = false;
         return super.Av();
      }
   }

   public boolean Ay() {
      return this.bau ? false : super.Ay();
   }

   public Cx(Cw var1) {
      super(var1, 1.0D, 10);
      this.bat = var1;
      this.dX(1);
   }
}

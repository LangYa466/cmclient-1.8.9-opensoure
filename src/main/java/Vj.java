import java.util.List;
import java.util.Random;

public class VJ extends VE {
   public void q(Ut var1, List var2, Random var3) {
      if (this.ckO != OK.bQD && this.ckO != OK.bQG) {
         this.e((VM)var1, var2, var3, 1, 1);
      } else {
         this.q((VM)var1, var2, var3, 1, 1);
      }

   }

   public boolean q(QI var1, Random var2, Ur var3) {
      if (this.q(var1, var3)) {
         return false;
      } else {
         this.q(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, Vx.adl());
         this.q(var1, var2, var3, this.cmy, 1, 1, 0);
         if (this.ckO != OK.bQD && this.ckO != OK.bQG) {
            this.q(var1, var3, 0, 1, 1, 0, 3, 3, Ea.bjN.cx(), Ea.bjN.cx(), false);
         } else {
            this.q(var1, var3, 4, 1, 1, 4, 3, 3, Ea.bjN.cx(), Ea.bjN.cx(), false);
         }

         return true;
      }
   }
}

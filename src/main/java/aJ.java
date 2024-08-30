import java.util.List;

public class Aj extends zW {
   private Dr aTE;
   private Co aTF;
   private int aTG;
   private boolean aTH;

   public void Aw() {
      this.aTF = null;
      this.aTE.yM().NG();
   }

   public Aj(Dr var1) {
      this.aTE = var1;
      this.dX(3);
   }

   public void Ax() {
      this.aTE.zl().w(this.aTF, 30.0F, 30.0F);
      if (this.aTF.Dp() == this.aTG) {
         this.aTE.yM().t(this.aTF, 0.5D);
         this.aTH = true;
      }

      if (this.aTH && this.aTE.B(this.aTF) < 4.0D) {
         this.aTF.aH(false);
         this.aTE.yM().NG();
      }

   }

   public void Az() {
      this.aTG = this.aTE.zY().nextInt(320);
      this.aTH = false;
      this.aTF.yM().NG();
   }

   public boolean Av() {
      if (this.aTE.yr() >= 0) {
         return false;
      } else if (!this.aTE.vR.ZH()) {
         return false;
      } else {
         List var1 = this.aTE.vR.q(Co.class, this.aTE.xE().C(6.0D, 2.0D, 6.0D));
         if (var1.isEmpty()) {
            return false;
         } else {
            for(Co var3 : var1) {
               if (var3.Dp() > 0) {
                  this.aTF = var3;
                  break;
               }
            }

            return this.aTF != null;
         }
      }
   }

   public boolean Ay() {
      return this.aTF.Dp() > 0;
   }
}

import java.util.Set;

class vC implements tE {
   // $FF: synthetic field
   final vA aBm;
   // $FF: synthetic field
   final Set aBn;

   public void q(tU var1) {
      for(PJ var3 : this.aBn) {
         tO var4 = var1.j(var3);
         vA.q(this.aBm).put(var3, var4);
      }

   }

   vC(vA var1, Set var2) {
      this.aBm = var1;
      this.aBn = var2;
   }
}

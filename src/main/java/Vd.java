public class vD implements uM {
   private final pc aBo;
   private vz aBp;
   private final tU aBq;
   private Pc aBr;

   public void q(uL var1) {
      vA var2 = new vA(var1, this.aBq, this.aBo);
      this.aBr = var2.uh();
      this.aBp = (vz)this.aBr.k(vA.aBd);
      this.aBo.mZ();
   }

   public tU uq() {
      return this.aBq;
   }

   public vD(tU var1) {
      this.aBq = var1;
      this.aBo = new pc(this);
   }

   public vz ur() {
      return this.aBp;
   }

   public vz q(vE var1) {
      if (var1 == null) {
         return this.aBp;
      } else {
         vz var2 = (vz)this.aBr.k(var1);
         return var2 == null ? this.aBp : var2;
      }
   }

   public pc nb() {
      return this.aBo;
   }
}

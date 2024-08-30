class NN extends Nm {
   // $FF: synthetic field
   final NM bNy;

   public void dZ(int var1) {
      this.bNy.vR.e(this.bNy.uc, Ea.bhs, var1, 0);
   }

   NN(NM var1) {
      this.bNy = var1;
   }

   public NW Bd() {
      return this.bNy.uc;
   }

   public void q(Nn var1) {
      super.q(var1);
      if (this.Bc() != null) {
         this.Bc().l(this.bNy.uc);
      }

   }

   public QI Bc() {
      return this.bNy.vR;
   }
}

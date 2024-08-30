class EL extends Fe {
   // $FF: synthetic field
   final EJ bpb;
   // $FF: synthetic field
   final CX bpc;

   EL(EJ var1, EV var2, int var3, int var4, int var5, CX var6) {
      super(var2, var3, var4, var5);
      this.bpb = var1;
      this.bpc = var6;
   }

   public boolean Hf() {
      return this.bpc.DW();
   }

   public boolean o(GX var1) {
      return super.o(var1) && this.bpc.DW() && CX.t(var1.do1());
   }
}

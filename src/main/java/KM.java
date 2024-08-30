class km extends kx {
   public int Ns;
   // $FF: synthetic field
   final kk Nt;

   protected void w(int var1, int var2, int var3, int var4, int var5, int var6) {
      kl var7 = (kl)kk.ip().get(var1);
      this.q(var2, var3, var7.Np);
      this.Nt.CB.q(var7.Nq, var2 + 32 + 10, var3 + 14, 16777215);
   }

   protected boolean x(int var1) {
      return var1 == this.Ns;
   }

   private void q(int var1, int var2, PJ var3) {
      int var4 = var1 + 5;
      this.Nt.w(var4 - 1, var4 + 32, var2 - 1, -2039584);
      this.Nt.w(var4 - 1, var4 + 32, var2 + 32, -6250336);
      this.Nt.q(var4 - 1, var2 - 1, var2 + 32, -2039584);
      this.Nt.q(var4 + 32, var2 - 1, var2 + 32, -6250336);
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      this.Ol.fJ().o(var3);
      boolean var5 = true;
      boolean var6 = true;
      qk var7 = qk.pm();
      qq var8 = var7.pl();
      var8.q(7, us.axW);
      var8.i((double)(var4 + 0), (double)(var2 + 32), 0.0D).e(0.0D, 1.0D).pJ();
      var8.i((double)(var4 + 32), (double)(var2 + 32), 0.0D).e(1.0D, 1.0D).pJ();
      var8.i((double)(var4 + 32), (double)(var2 + 0), 0.0D).e(1.0D, 0.0D).pJ();
      var8.i((double)(var4 + 0), (double)(var2 + 0), 0.0D).e(0.0D, 0.0D).pJ();
      var7.pn();
   }

   protected int bh() {
      return kk.ip().size();
   }

   protected void bg() {
   }

   public km(kk var1) {
      super(var1.G, var1.eo, var1.eC, 80, var1.eC - 32, 38);
      this.Nt = var1;
      this.Ns = -1;
   }

   protected void q(int var1, boolean var2, int var3, int var4) {
      this.Ns = var1;
      this.Nt.jI();
      kk.q(this.Nt).Y(((kl)kk.ip().get(kk.w(this.Nt).Ns)).Nr.toString());
   }
}

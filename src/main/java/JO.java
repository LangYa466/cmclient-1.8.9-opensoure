class jo extends kx {
   public int IT;
   // $FF: synthetic field
   final jm IU;

   private void k(int var1, int var2) {
      this.r(var1, var2, 0, 0);
   }

   protected void q(int var1, boolean var2, int var3, int var4) {
      this.IT = var1;
      this.IU.ir();
      jm.w(this.IU).Y(((jn)jm.ip().get(jm.q(this.IU).IT)).IR);
   }

   protected void w(int var1, int var2, int var3, int var4, int var5, int var6) {
      jn var7 = (jn)jm.ip().get(var1);
      this.q(var2, var3, var7.IQ, var7.IS);
      this.IU.CB.q(var7.IP, var2 + 18 + 5, var3 + 6, 16777215);
   }

   protected boolean x(int var1) {
      return var1 == this.IT;
   }

   private void q(int var1, int var2, Fm var3, int var4) {
      this.k(var1 + 1, var2 + 1);
      pz.od();
      qh.pk();
      this.IU.MB.w(new GX(var3, 1, var4), var1 + 2, var2 + 2);
      qh.pj();
      pz.nS();
   }

   protected void bg() {
   }

   public jo(jm var1) {
      super(var1.G, var1.eo, var1.eC, 80, var1.eC - 37, 24);
      this.IU = var1;
      this.IT = -1;
   }

   private void r(int var1, int var2, int var3, int var4) {
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      this.Ol.fJ().o(iT.Gq);
      float var5 = 0.0078125F;
      float var6 = 0.0078125F;
      boolean var7 = true;
      boolean var8 = true;
      qk var9 = qk.pm();
      qq var10 = var9.pl();
      var10.q(7, us.axW);
      var10.i((double)(var1 + 0), (double)(var2 + 18), (double)this.IU.Gr).e((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F)).pJ();
      var10.i((double)(var1 + 18), (double)(var2 + 18), (double)this.IU.Gr).e((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F)).pJ();
      var10.i((double)(var1 + 18), (double)(var2 + 0), (double)this.IU.Gr).e((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F)).pJ();
      var10.i((double)(var1 + 0), (double)(var2 + 0), (double)this.IU.Gr).e((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F)).pJ();
      var9.pn();
   }

   protected int bh() {
      return jm.ip().size();
   }
}

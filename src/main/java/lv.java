public class lV extends lJ {
   private mm Vb = new mm(this, q.q[496 & -32416]);
   private mm Vc;
   private mm Vd;

   public lV(float var1, boolean var2) {
      this.Vb.C(0, 0).q(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.Vd = new mm(this, u.q[9210 & 17406]);
      this.Vd.C(32, 0).q(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      if (var2) {
         this.Vc = new mm(this, r.q[-18439 & 19449]);
         this.Vc.C(0, 16).q(-6.0F, 0.0F, -6.0F, 12, 4, 12);
      }

   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      pz.nE();
      pz.u(2.0F, 2.0F, 2.0F);
      pz.y(0.0F, -0.5F, 0.0F);
      if (this.Vc != null) {
         this.Vc.H(var7);
      }

      pz.i(var3, 0.0F, 1.0F, 0.0F);
      pz.y(0.0F, 0.8F + var4, 0.0F);
      pz.i(60.0F, 0.7071F, 0.0F, 0.7071F);
      this.Vb.H(var7);
      float var8 = 0.875F;
      pz.u(var8, var8, var8);
      pz.i(60.0F, 0.7071F, 0.0F, 0.7071F);
      pz.i(var3, 0.0F, 1.0F, 0.0F);
      this.Vb.H(var7);
      pz.u(var8, var8, var8);
      pz.i(60.0F, 0.7071F, 0.0F, 0.7071F);
      pz.i(var3, 0.0F, 1.0F, 0.0F);
      this.Vd.H(var7);
      pz.nF();
   }
}

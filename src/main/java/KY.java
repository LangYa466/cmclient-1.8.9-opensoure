public class ky extends iT implements lu {
   private lx OF;
   private static final PJ OG = new PJ(t.q[10704 & 4805]);
   private final hS OH;
   public static final PJ OI = new PJ(t.q[22411 & -31865]);
   private long OJ;

   public void aV(int var1) {
      int var2;
      for(var2 = this.OF.kX() + var1; var2 >= 0 && var2 <= 8 && (this.OF.bp(var2) == lx.SS || !this.OF.bp(var2).kU()); var2 += var1) {
         ;
      }

      if (var2 >= 0 && var2 <= 8) {
         this.OF.bq(var2);
         this.OJ = hS.fe();
      }

   }

   public void q(lx var1) {
      this.OF = null;
      this.OJ = 0L;
   }

   public ky(hS var1) {
      this.OH = var1;
   }

   protected void q(kJ var1, float var2, int var3, float var4, lB var5) {
      pz.od();
      pz.nX();
      pz.s(770, 771, 1, 0);
      pz.u(1.0F, 1.0F, 1.0F, var2);
      this.OH.fJ().o(OG);
      this.q((float)(var3 - 91), var4, 0, 0, 182, 22);
      if (var5.lb() >= 0) {
         this.q((float)(var3 - 91 - 1 + var5.lb() * 20), var4 - 1.0F, 0, 22, 24, 22);
      }

      qh.pk();

      for(int var6 = 0; var6 < 9; ++var6) {
         this.q(var6, var1.kr() / 2 - 90 + var6 * 20 + 2, var4 + 3.0F, var2, var5.br(var6));
      }

      qh.pj();
      pz.nS();
      pz.nz();
   }

   public void aW(int var1) {
      this.OJ = hS.fe();
      if (this.OF != null) {
         this.OF.bq(var1);
      } else {
         this.OF = new lx(this);
      }

   }

   public void q(kJ var1) {
      int var2 = (int)(this.jX() * 255.0F);
      if (var2 > 3 && this.OF != null) {
         lt var3 = this.OF.kV();
         String var4 = var3 != lx.SS ? var3.kT().Vy() : this.OF.kZ().kS().Vy();
         if (var4 != null) {
            int var5 = (var1.kr() - this.OH.CB.K(var4)) / 2;
            int var6 = var1.kp() - 35;
            pz.nE();
            pz.nX();
            pz.s(770, 771, 1, 0);
            this.OH.CB.q(var4, (float)var5, (float)var6, 16777215 + (var2 << 24));
            pz.nz();
            pz.nF();
         }
      }

   }

   private float jX() {
      long var1 = this.OJ - hS.fe() + 5000L;
      return Pq.n((float)var1 / 2000.0F, 0.0F, 1.0F);
   }

   public void jY() {
      this.OJ = hS.fe();
      if (this.jZ()) {
         int var1 = this.OF.kX();
         if (var1 != -1) {
            this.OF.bq(var1);
         }
      } else {
         this.OF = new lx(this);
      }

   }

   public boolean jZ() {
      return this.OF != null;
   }

   public void q(kJ var1, float var2) {
      if (this.OF != null) {
         float var3 = this.jX();
         if (var3 <= 0.0F) {
            this.OF.kW();
         } else {
            int var4 = var1.kr() / 2;
            float var5 = this.Gr;
            this.Gr = -90.0F;
            float var6 = (float)var1.kp() - 22.0F * var3;
            lB var7 = this.OF.kY();
            this.q(var1, var3, var4, var6, var7);
            this.Gr = var5;
         }
      }

   }

   private void q(int var1, int var2, float var3, float var4, lt var5) {
      this.OH.fJ().o(OI);
      if (var5 != lx.SS) {
         int var6 = (int)(var4 * 255.0F);
         pz.nE();
         pz.y((float)var2, var3, 0.0F);
         float var7 = var5.kU() ? 1.0F : 0.25F;
         pz.u(var7, var7, var7, var4);
         var5.w(var7, var6);
         pz.nF();
         String var8 = String.valueOf(vL.dh(this.OH.Br.aDO[var1].bB()));
         if (var6 > 3 && var5.kU()) {
            this.OH.CB.q(var8, (float)(var2 + 19 - 2 - this.OH.CB.K(var8)), var3 + 6.0F + 3.0F, 16777215 + (var6 << 24));
         }
      }

   }
}

public class kQ extends iT {
   private int eC;
   private String Qh;
   private long Qi;
   private hS G;
   private int eo;
   private static final PJ Qj = new PJ(u.q[-32597 & 5773]);
   private String Qk;
   private MW Ql;
   private sj dP;
   private boolean Qm;

   public void kz() {
      if (this.Ql != null && this.Qi != 0L && hS.eV().CM != null) {
         double var1 = (double)(hS.fe() - this.Qi) / 3000.0D;
         if (!this.Qm) {
            if (var1 < 0.0D || var1 > 1.0D) {
               this.Qi = 0L;
               return;
            }
         } else if (var1 > 0.5D) {
            var1 = 0.5D;
         }

         this.kB();
         pz.nW();
         pz.O(false);
         double var3 = var1 * 2.0D;
         if (var3 > 1.0D) {
            var3 = 2.0D - var3;
         }

         var3 = var3 * 4.0D;
         var3 = 1.0D - var3;
         if (var3 < 0.0D) {
            var3 = 0.0D;
         }

         var3 = var3 * var3;
         var3 = var3 * var3;
         int var5 = this.eo - 160;
         int var6 = 0 - (int)(var3 * 36.0D);
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         pz.nP();
         this.G.fJ().o(Qj);
         pz.nx();
         this.e(var5, var6, 96, 202, 160, 32);
         if (this.Qm) {
            this.G.CB.q(this.Qk, var5 + 30, var6 + 7, 120, -1);
         } else {
            this.G.CB.q(this.Qh, var5 + 30, var6 + 7, -256);
            this.G.CB.q(this.Qk, var5 + 30, var6 + 18, -1);
         }

         qh.pk();
         pz.nx();
         pz.od();
         pz.nV();
         pz.oe();
         this.dP.e(this.Ql.bIO, var5 + 8, var6 + 8);
         pz.nx();
         pz.O(true);
         pz.ob();
      }

   }

   public void q(MW var1) {
      this.Qh = var1.Ts().Vv();
      this.Qk = var1.bp();
      this.Qi = hS.fe() + 2500L;
      this.Ql = var1;
      this.Qm = true;
   }

   public void kA() {
      this.Ql = null;
      this.Qi = 0L;
   }

   public kQ(hS var1) {
      this.G = var1;
      this.dP = var1.gi();
   }

   public void w(MW var1) {
      this.Qh = uI.q(o.q[6222 & 9594]);
      this.Qk = var1.Ts().Vv();
      this.Qi = hS.fe();
      this.Ql = var1;
      this.Qm = false;
   }

   private void kB() {
      pz.h(0, 0, this.G.Cr, this.G.BB);
      pz.bO(5889);
      pz.nU();
      pz.bO(5888);
      pz.nU();
      this.eo = this.G.Cr;
      this.eC = this.G.BB;
      kJ var1 = new kJ(this.G);
      this.eo = var1.kr();
      this.eC = var1.kp();
      pz.bY(256);
      pz.bO(5889);
      pz.nU();
      pz.q(0.0D, (double)this.eo, (double)this.eC, 0.0D, 1000.0D, 3000.0D);
      pz.bO(5888);
      pz.nU();
      pz.y(0.0F, 0.0F, -2000.0F);
   }
}

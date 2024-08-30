public class hR implements Pb {
   private final vQ Bc;
   private String Bd = q.q[19524 & -28543];
   private boolean Be;
   private final kJ Bf;
   private final hS Bg;
   private String F = q.q[394 & -32224];
   private long Bh = hS.fe();

   public void v(String var1) {
      if (!this.Bg.Ce) {
         if (!this.Be) {
            throw new Pw();
         }
      } else {
         this.Bh = 0L;
         this.F = var1;
         this.as(-1);
         this.Bh = 0L;
      }

   }

   public void b(String var1) {
      this.Be = true;
      this.n(var1);
   }

   public void eU() {
   }

   public void as(int var1) {
      if (!this.Bg.Ce) {
         if (!this.Be) {
            throw new Pw();
         }
      } else {
         long var2 = hS.fe();
         if (var2 - this.Bh >= 100L) {
            this.Bh = var2;
            kJ var4 = new kJ(this.Bg);
            int var5 = var4.kq();
            int var6 = var4.kr();
            int var7 = var4.kp();
            if (qa.ot()) {
               this.Bc.va();
            } else {
               pz.bY(256);
            }

            this.Bc.aa(false);
            pz.bO(5889);
            pz.nU();
            pz.q(0.0D, var4.ks(), var4.kt(), 0.0D, 100.0D, 300.0D);
            pz.bO(5888);
            pz.nU();
            pz.y(0.0F, 0.0F, -200.0F);
            if (!qa.ot()) {
               pz.bY(16640);
            }

            qk var8 = qk.pm();
            qq var9 = var8.pl();
            if (this.Bg.Bn.atS().bo.af()) {
               pz.nx();
               pz.og();
               this.Bg.fJ().o(x.M);
               pz.u(1.0F, 1.0F, 1.0F, 1.0F);
               iT.q(0, 0, 0.0F, 0.0F, 3840, 2160, var4.kr(), var4.kp(), 3840.0F, 2160.0F);
            } else {
               this.Bg.fJ().o(iT.Gp);
               float var10 = 32.0F;
               var9.q(7, us.axL);
               var9.i(0.0D, (double)var7, 0.0D).e(0.0D, (double)((float)var7 / var10)).v(64, 64, 64, 255).pJ();
               var9.i((double)var6, (double)var7, 0.0D).e((double)((float)var6 / var10), (double)((float)var7 / var10)).v(64, 64, 64, 255).pJ();
               var9.i((double)var6, 0.0D, 0.0D).e((double)((float)var6 / var10), 0.0D).v(64, 64, 64, 255).pJ();
               var9.i(0.0D, 0.0D, 0.0D).e(0.0D, 0.0D).v(64, 64, 64, 255).pJ();
               var8.pn();
            }

            if (var1 >= 0) {
               byte var15 = 100;
               byte var11 = 2;
               int var12 = var6 / 2 - var15 / 2;
               int var13 = var7 / 2 + 16;
               pz.nC();
               var9.q(7, us.axK);
               var9.i((double)var12, (double)var13, 0.0D).v(128, 128, 128, 255).pJ();
               var9.i((double)var12, (double)(var13 + var11), 0.0D).v(128, 128, 128, 255).pJ();
               var9.i((double)(var12 + var15), (double)(var13 + var11), 0.0D).v(128, 128, 128, 255).pJ();
               var9.i((double)(var12 + var15), (double)var13, 0.0D).v(128, 128, 128, 255).pJ();
               var9.i((double)var12, (double)var13, 0.0D).v(128, 255, 128, 255).pJ();
               var9.i((double)var12, (double)(var13 + var11), 0.0D).v(128, 255, 128, 255).pJ();
               var9.i((double)(var12 + var1), (double)(var13 + var11), 0.0D).v(128, 255, 128, 255).pJ();
               var9.i((double)(var12 + var1), (double)var13, 0.0D).v(128, 255, 128, 255).pJ();
               var8.pn();
               pz.nP();
            }

            pz.nX();
            pz.s(770, 771, 1, 0);
            this.Bg.CB.q(this.Bd, (float)((var6 - this.Bg.CB.K(this.Bd)) / 2), (float)(var7 / 2 - 4 - 16), 16777215);
            this.Bg.CB.q(this.F, (float)((var6 - this.Bg.CB.K(this.F)) / 2), (float)(var7 / 2 - 4 + 8), 16777215);
            this.Bc.uZ();
            if (qa.ot()) {
               this.Bc.ak(var6 * var5, var7 * var5);
            }

            this.Bg.fw();

            try {
               Thread.yield();
            } catch (Exception var14) {
               ;
            }
         }
      }

   }

   private void n(String var1) {
      this.Bd = var1;
      if (!this.Bg.Ce) {
         if (!this.Be) {
            throw new Pw();
         }
      } else {
         pz.bY(256);
         pz.bO(5889);
         pz.nU();
         if (qa.ot()) {
            int var2 = this.Bf.kq();
            pz.q(0.0D, (double)(this.Bf.kr() * var2), (double)(this.Bf.kp() * var2), 0.0D, 100.0D, 300.0D);
         } else {
            kJ var3 = new kJ(this.Bg);
            pz.q(0.0D, var3.ks(), var3.kt(), 0.0D, 100.0D, 300.0D);
         }

         pz.bO(5888);
         pz.nU();
         pz.y(0.0F, 0.0F, -200.0F);
      }

   }

   public void m(String var1) {
      this.Be = false;
      this.n(var1);
   }

   public hR(hS var1) {
      this.Bg = var1;
      this.Bf = new kJ(var1);
      this.Bc = new vQ(var1.Cr, var1.BB, false);
      this.Bc.dl(9728);
   }
}

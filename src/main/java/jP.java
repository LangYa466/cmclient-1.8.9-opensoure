public class jp extends kf implements kE {
   private int IV;
   private final boolean IW = false;

   public void p() {
      super.p();
      ++this.IV;
      if (this.IV == 20) {
         for(iU var2 : this.Mt) {
            var2.aM = true;
         }
      }

   }

   public void q(boolean var1, int var2) {
      if (var1) {
         this.G.Cg.lW();
         this.G.q((mP)null);
         this.G.r(new k());
      } else {
         this.G.CM.hE();
         this.G.r((kf)null);
      }

   }

   public void o() {
      this.IV = 0;
      this.Mt.clear();
      if (this.G.Cg.Zz().adv()) {
         if (this.G.fS()) {
            this.Mt.add(new iU(1, this.eo / 2 - 100, this.eC / 4 + 96, uI.q(i.q[29132 & -32282])));
         } else {
            this.Mt.add(new iU(1, this.eo / 2 - 100, this.eC / 4 + 96, uI.q(i.q[485 & 5069])));
         }
      } else {
         this.Mt.add(new iU(0, this.eo / 2 - 100, this.eC / 4 + 72, uI.q(i.q[7622 & 8694])));
         this.Mt.add(new iU(1, this.eo / 2 - 100, this.eC / 4 + 96, uI.q(i.q[-27193 & 17399])));
         if (this.G.fD() == null) {
            ((iU)this.Mt.get(1)).aM = false;
         }
      }

      for(iU var2 : this.Mt) {
         var2.aM = false;
      }

   }

   protected void q(char var1, int var2) {
   }

   public void q(int var1, int var2, float var3) {
      this.r(0, 0, this.eo, this.eC, 1615855616, -1602211792);
      pz.nE();
      pz.u(2.0F, 2.0F, 2.0F);
      boolean var4 = this.G.Cg.Zz().adv();
      String var5 = var4 ? uI.q(i.q[8649 & 20971]) : uI.q(i.q[-24118 & 5578]);
      this.w(this.CB, var5, this.eo / 2 / 2, 30, 16777215);
      pz.nF();
      if (var4) {
         this.w(this.CB, uI.q(i.q[5615 & -7717]), this.eo / 2, 144, 16777215);
      }

      this.w(this.CB, uI.q(i.q[460 & 31180]) + q.q[-27003 & 2716] + OJ.bQl + this.G.CM.FU(), this.eo / 2, 100, 16777215);
      super.q(var1, var2, var3);
   }

   protected void q(iU var1) {
      switch(var1.aq) {
      case 0:
         this.G.CM.hE();
         this.G.r((kf)null);
         break;
      case 1:
         if (this.G.Cg.Zz().adv()) {
            this.G.r(new k());
         } else {
            kD var2 = new kD(this, uI.q(i.q[510 & -32312]), q.q[-19696 & 1032], uI.q(i.q[16879 & -32313]), uI.q(i.q[-7706 & 6598]), 0);
            this.G.r(var2);
            var2.bg(20);
         }
      }

   }

   public boolean s() {
      return false;
   }
}

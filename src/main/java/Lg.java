public class lg extends li {
   private EV Rr;
   private static final PJ Rs = new PJ(p.q[196 & 23277]);
   private final DJ Rt;

   protected void j(int var1, int var2) {
      String var3 = this.Rr.dh().Vv();
      this.CB.q(var3, this.RQ / 2 - this.CB.K(var3) / 2, 6, 4210752);
      this.CB.q(this.Rt.dh().Vv(), 8, this.RF - 96 + 2, 4210752);
   }

   protected void w(float var1, int var2, int var3) {
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      this.G.fJ().o(Rs);
      int var4 = (this.eo - this.RQ) / 2;
      int var5 = (this.eC - this.RF) / 2;
      this.e(var4, var5, 0, 0, this.RQ, this.RF);
      int var6 = this.Rr.bE(0);
      if (var6 > 0) {
         int var7 = (int)(28.0F * (1.0F - (float)var6 / 400.0F));
         if (var7 > 0) {
            this.e(var4 + 97, var5 + 16, 176, 0, 9, var7);
         }

         int var8 = var6 / 2 % 7;
         switch(var8) {
         case 0:
            var7 = 29;
            break;
         case 1:
            var7 = 24;
            break;
         case 2:
            var7 = 20;
            break;
         case 3:
            var7 = 16;
            break;
         case 4:
            var7 = 11;
            break;
         case 5:
            var7 = 6;
            break;
         case 6:
            var7 = 0;
         }

         if (var7 > 0) {
            this.e(var4 + 65, var5 + 14 + 29 - var7, 185, 29 - var7, 12, var7);
         }
      }

   }

   public lg(DJ var1, EV var2) {
      super(new Ey(var1, var2));
      this.Rt = var1;
      this.Rr = var2;
   }
}

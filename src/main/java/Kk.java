public class kK extends kf {
   private static final vO[] PH = new vO[]{vO.aFU, vO.aFV, vO.aFW, vO.aFX, vO.aFY, vO.aGe, vO.aGg, vO.aGh, vO.aGf, vO.aGl};
   private final vL PI;
   private final kf PJ;
   private String PK;

   protected void q(iU var1) {
      if (var1.aM) {
         if (var1.aq < 100 && var1 instanceof jK) {
            this.PI.q(((jK)var1).iY(), 1);
            var1.iX = this.PI.w(vO.di(var1.aq));
         }

         if (var1.aq == 200) {
            this.G.Br.uG();
            this.G.r(this.PJ);
         }
      }

   }

   public kK(kf var1, vL var2) {
      this.PJ = var1;
      this.PI = var2;
   }

   public void o() {
      int var1 = 0;
      this.PK = uI.q(y.q[1786 & -32006]);

      for(vO var5 : PH) {
         if (var5.uK()) {
            this.Mt.add(new jL(var5.uM(), this.eo / 2 - 155 + var1 % 2 * 160, this.eC / 6 + 24 * (var1 >> 1), var5));
         } else {
            this.Mt.add(new jK(var5.uM(), this.eo / 2 - 155 + var1 % 2 * 160, this.eC / 6 + 24 * (var1 >> 1), var5, this.PI.w(var5)));
         }

         ++var1;
      }

      this.Mt.add(new iU(200, this.eo / 2 - 100, this.eC / 6 + 120, uI.q(q.q[9335 & -32651])));
   }

   public void q(int var1, int var2, float var3) {
      this.jA();
      this.w(this.CB, this.PK, this.eo / 2, 20, 16777215);
      super.q(var1, var2, var3);
   }
}

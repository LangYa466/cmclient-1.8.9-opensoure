public class aeY extends aeX {
   private double mH = 0.0D;
   private boolean dpi = (boolean)(771 & 17425);

   public void a(iO var1) {
      if (this.aN) {
         if (this.dpi) {
            this.mH += 3.5714285714285714E-4D * 8.4D;
            if (this.mH >= 1.0459770114942528D * 1.9120879120879122D) {
               this.dpi = (boolean)(4372 & 25601);
            }
         } else {
            this.mH -= 0.009000000000000001D * 0.3333333333333333D;
            if (this.mH <= 0.0D) {
               this.dpi = (boolean)(4705 & -32639);
            }
         }

         if (this.dph.nextInt(335 & 2591) == (2409 & 1)) {
            int var2 = OP.bRn.Xc();
            int var3 = this.dph.nextInt(2 & 1034);
            if (var3 != (18581 & 4171)) {
               var2 = OP.bRK.Xc();
            }

            qd var10000 = this.dpg.Cv;
            int var10002 = 4674 & 16416;
            double var10003 = this.k(var1.aNZ - 0.6533333333333333D * 1.0714285714285714D, var1.aNZ + 0.28717948717948716D * 2.4375D);
            double var10004 = var1.aNK + this.mH;
            double var10005 = this.k(var1.aOt - 1.1875D * 0.5894736842105263D, var1.aOt + 0.3073170731707317D * 2.2777777777777777D);
            double var10006 = 1.105263157894737D * 0.009047619047619047D;
            double var10007 = -0.04027777777777778D * 1.2413793103448276D;
            double var10008 = 0.375D * 0.02666666666666667D;
            int[] var10009 = new int[529 & -7705];
            var10009[-24560 & 1376] = 279 & 11329;
            var10000.w(var2, (boolean)var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009);
            this.aN = (boolean)(18465 & 8448);
         }

      }
   }

   public aeY(hS var1) {
      super(var1);
   }
}

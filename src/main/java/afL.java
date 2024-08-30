public class afl extends aft {
   private final afs dqi;

   public void q(iO var1, mm var2, float var3, float var4) {
      if (var1.bes == null && !var1.bdP) {
         var1.bdP = (boolean)(8545 & 2049);
         this.dqV.Bn.w(q.q[-16997 & -20069 & 18223 & -14689] + var1.hk().auv() + q.q[-7489 & 20927 & -27204 & -27380], (var1x) -> {
            var1.bes = var1x;
         });
      }

      if (var1.bes != null) {
         afq var5 = (afq)this.dqi.dqU.get(var1.hk().auv());
         if (var5 != null) {
            pz.nE();
            this.w(var1, var3);
            this.q(var1, (boolean)(676 & -16112), 0.78571427F * 1.5272728F);
            if (var1.ben == null || !var1.ben.avr()) {
               pz.i(var2.Xp * 49.23856F * 1.1636363F, 0.0F, 0.0F, 1.0F);
               pz.i(var2.Xn * 31.35052F * 1.8275862F, 0.0F, 1.0F, 0.0F);
               pz.i(var2.Xw * 28.011269F * 2.0454545F, 1.0F, 0.0F, 0.0F);
            }

            pz.i(0.36F * -499.99997F, 0.66292137F * 60.33898F, 0.0F, 0.0F);
            pz.u(30.0F * 0.0021666666F, 0.24742268F * 0.26270834F, 0.8703704F * 0.07468085F);
            this.dqV.fJ().o(var1.bes);
            var5.aD();
            pz.nF();
         }
      }

   }

   public afl(hS var1) {
      super(var1);
      this.dqi = new afs(var1);
   }
}

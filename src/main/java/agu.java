import java.util.function.Predicate;

public class agU extends kf {
   public agV dvZ;
   public kf duA;
   private String HL;
   public iU dwa;
   public kz dwb;

   public void q(int var1, int var2, float var3) {
      this.jA();
      this.dvZ.q(var1, var2, var3);
      this.w(this.CB, this.HL, this.eo / (20502 & 8258), -32471 & 3160, 1375731711 & -2063597569);
      super.q(var1, var2, var3);
   }

   protected void w(int var1, int var2, int var3) {
      this.dvZ.g(var1, var2, var3);
      super.w(var1, var2, var3);
   }

   protected void q(int var1, int var2, int var3) {
      this.dvZ.e(var1, var2, var3);
      super.q(var1, var2, var3);
   }

   public agU(kf var1) {
      this.duA = var1;
   }

   public void o() {
      this.HL = uI.q(o.q[14807 & 21975 & -27241 & 17823]);
      this.Mt.add(new iU(1552 & -30272, this.eo / (22306 & -30633) - (8603 & 155), this.eC - (93 & 1565), 4196 & 876, 17814 & 21, uI.q(o.q[1980 & 1976 & -24099 & -23080])));
      this.Mt.add(new iU(913 & 1035, this.eo / (802 & 3099) - (9402 & -16334), this.eC - (19133 & -20387), 239 & 8308, 12316 & 16727, uI.q(q.q[26743 & 18551 & 12661 & 10749])));
      this.Mt.add(new iU(12338 & 2946, this.eo / (-24558 & 66) + (-21441 & 16823), this.eC - (8605 & 17501), 16502 & -31891, 6966 & -32747, uI.q(w.q[-15625 & -32131 & 14323 & 16247])));
      this.dvZ = new agV(this, this.G);
   }

   protected void q(iU var1) {
      if (var1.aq == 0) {
         this.G.Bn.dmE.cm.add(new agT(-32640 & 15713, q.q[13642 & 74 & 17560 & -27500], -1 & -1, -1 & -1));
         this.G.r(this);
      } else if (var1.aq == (69 & -30575)) {
         this.G.Bn.dmE.cm.removeIf((var0) -> {
            return (boolean)(!var0.fL.trim().isEmpty() && var0.bwi != 0 && var0.aq != (-1 & -1) ? 4357 & 18528 : 17 & 27337);
         });
         this.G.r(this.duA);
      } else if (var1.aq == (1094 & 11147)) {
         this.G.Bn.dmE.cm.clear();
         this.G.r(this);
      }

   }

   protected void q(char var1, int var2) {
      if (var2 == (13605 & 129)) {
         this.G.Bn.dmE.cm.removeIf((var0) -> {
            return (boolean)(!var0.fL.trim().isEmpty() && var0.bwi != 0 && var0.aq != (-1 & -1) ? -32762 & 21512 : -27799 & 8199);
         });
         this.G.r(this.duA);
      } else {
         this.dvZ.q(var1, var2);
      }
   }

   public void aL() {
      super.aL();
      this.G.Bn.dmE.aa();
   }

   public void aJ() {
      this.dvZ.aJ();
      super.aJ();
   }
}

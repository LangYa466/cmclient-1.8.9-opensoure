import java.util.Random;

class BZ extends zW {
   private BW aZN;

   public void Ax() {
      Random var1 = this.aZN.zY();
      QI var2 = this.aZN.vR;
      int var3 = Pq.D(this.aZN.aNZ - 1.0D + var1.nextDouble() * 2.0D);
      int var4 = Pq.D(this.aZN.aNK + var1.nextDouble() * 2.0D);
      int var5 = Pq.D(this.aZN.aOt - 1.0D + var1.nextDouble() * 2.0D);
      NW var6 = new NW(var3, var4, var5);
      cv var7 = var2.g(var6).ds();
      cv var8 = var2.g(var6.Vj()).ds();
      if (this.q(var2, var6, this.aZN.Dc().ds(), var7, var8)) {
         var2.q(var6, this.aZN.Dc(), 3);
         this.aZN.E(Ea.bjN.cx());
      }

   }

   public BZ(BW var1) {
      this.aZN = var1;
   }

   private boolean q(QI var1, NW var2, cv var3, cv var4, cv var5) {
      return !var3.e(var1, var2) ? false : (var4.cB() != hn.zp ? false : (var5.cB() == hn.zp ? false : var5.cw()));
   }

   public boolean Av() {
      return !this.aZN.vR.vU().bL(w.q[-22639 & 7089]) ? false : (this.aZN.Dc().ds().cB() == hn.zp ? false : this.aZN.zY().nextInt(2000) == 0);
   }
}

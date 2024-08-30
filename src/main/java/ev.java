import java.util.Random;

public class eV extends cv {
   public eV() {
      this(hn.zU.em());
   }

   public Fm q(hI var1, Random var2, int var3) {
      return this == Ea.bhC ? Et.blH : (this == Ea.biK ? Et.bnC : (this == Ea.bjC ? Et.boc : (this == Ea.biI ? Et.bog : (this == Ea.bhn ? Et.bns : Fm.C(this)))));
   }

   public int u(hI var1) {
      return this == Ea.bjC ? Fk.bqu.Hl() : 0;
   }

   public int q(Random var1) {
      return this == Ea.bjC ? 4 + var1.nextInt(5) : 1;
   }

   public int q(int var1, Random var2) {
      if (var1 > 0 && Fm.C(this) != this.q((hI)this.cW().ex().iterator().next(), var2, var1)) {
         int var3 = var2.nextInt(var1 + 2) - 1;
         if (var3 < 0) {
            var3 = 0;
         }

         return this.q(var2) * (var3 + 1);
      } else {
         return this.q(var2);
      }
   }

   public eV(hm var1) {
      super(hn.zU, var1);
      this.q(yl.aLz);
   }

   public int w(QI var1, NW var2) {
      return 0;
   }

   public void q(QI var1, NW var2, hI var3, float var4, int var5) {
      super.q(var1, var2, var3, var4, var5);
      if (this.q(var3, var1.bXs, var5) != Fm.C(this)) {
         int var6 = 0;
         if (this == Ea.bhC) {
            var6 = Pq.q(var1.bXs, 0, 2);
         } else if (this == Ea.biK) {
            var6 = Pq.q(var1.bXs, 3, 7);
         } else if (this == Ea.biI) {
            var6 = Pq.q(var1.bXs, 3, 7);
         } else if (this == Ea.bjC) {
            var6 = Pq.q(var1.bXs, 2, 5);
         } else if (this == Ea.bhn) {
            var6 = Pq.q(var1.bXs, 2, 5);
         }

         this.q(var1, var2, var6);
      }

   }
}

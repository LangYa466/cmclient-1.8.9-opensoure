import java.util.function.Consumer;

public class U extends aW {
   private long cJ;
   private int cK = -1 & -1;
   private int cL;
   private long cM;
   private int cN;

   public void q(ags var1) {
      if (this.J()) {
         zk var2 = var1.avx().bTG;
         this.cK = var2.yi();
         this.cM = System.currentTimeMillis();
      }
   }

   public void q(agt var1) {
      Kj var2 = var1.avy();
      if (this.J() && var2.Lr() == (259 & -24046)) {
         zk var3 = var2.a(this.aK.Cg);
         if (var3 != null) {
            if (this.cK != (-1 & -1) && var3.yi() == this.cK) {
               this.cK = -1 & -1;
               if (System.currentTimeMillis() - this.cM > (-612412690680836112L & 612412688787072986L)) {
                  this.cM = -5422790451414298357L & 5422790450551981588L;
                  this.cN = 25137 & 196;
                  return;
               }

               if (this.cL == var3.yi()) {
                  this.cN += 9221 & 20491;
               } else {
                  this.cN = 16585 & 289;
               }

               this.cJ = System.currentTimeMillis();
               this.cL = var3.yi();
            } else if (var3.yi() == this.aK.CM.yi()) {
               this.cN = 1859 & 10244;
            }
         }

      }
   }

   public U() {
      super(y.q[-27866 & -15450 & -15362 & 4990], -32482 & 17967);
      this.aK.Bn.atM().e(ags.class, this::q);
      this.aK.Bn.atM().e(agt.class, this::q);
   }

   public Object ad() {
      if (System.currentTimeMillis() - this.cJ > (1761875954L & 76187601L)) {
         this.cN = 74 & 7685;
      }

      return this.cN;
   }

   public String e(String var1) {
      StringBuilder var2 = new StringBuilder();
      int var3 = this.hp.bk();
      int var4 = var3 != 0 ? 257 & -11097 : 13444 & 0;
      if (var4 != 0) {
         var2.append(hz[var3 - (4385 & 223)][-7150 & 4613]);
      }

      var2.append(var1).append(y.q[-6233 & 32751 & 2935 & 4983]);
      if (var4 != 0) {
         var2.append(hz[var3 - (2229 & 17929)][24705 & 4103]);
      }

      return var2.toString();
   }
}

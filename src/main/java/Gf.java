import com.google.common.collect.Sets;
import java.util.Set;

public class GF extends GZ {
   private static final Set bsr = Sets.newHashSet(new cv[]{Ea.bhA, Ea.bhC, Ea.bks, Ea.bhY, Ea.bkd, Ea.biK, Ea.bjF, Ea.bkm, Ea.biZ, Ea.bjZ, Ea.bhh, Ea.biW, Ea.bkB, Ea.bkC, Ea.bjC, Ea.bgZ, Ea.bjG, Ea.bhG, Ea.bjh, Ea.bgR, Ea.biT, Ea.bhT, Ea.bjU, Ea.biP, Ea.bin});

   public float q(GX var1, cv var2) {
      return var2.cB() != hn.zl && var2.cB() != hn.zL && var2.cB() != hn.zU ? super.q(var1, var2) : this.brh;
   }

   protected GF(FE var1) {
      super(2.0F, var1, bsr);
   }

   public boolean n(cv var1) {
      return var1 == Ea.bit ? this.bsS.HE() == 3 : (var1 != Ea.bkd && var1 != Ea.biK ? (var1 != Ea.biI && var1 != Ea.bid ? (var1 != Ea.biZ && var1 != Ea.bjZ ? (var1 != Ea.biW && var1 != Ea.bkB ? (var1 != Ea.bkC && var1 != Ea.bjC ? (var1 != Ea.biT && var1 != Ea.bgZ ? (var1.cB() == hn.zU ? true : (var1.cB() == hn.zl ? true : var1.cB() == hn.zL)) : this.bsS.HE() >= 2) : this.bsS.HE() >= 1) : this.bsS.HE() >= 1) : this.bsS.HE() >= 2) : this.bsS.HE() >= 2) : this.bsS.HE() >= 2);
   }
}

import com.google.common.collect.Lists;
import java.util.List;

public class Rc {
   private Pn bZf = new Pn();
   private long bZg;
   private List bZh = Lists.newArrayList();
   private final RL bZi;

   public void aaT() {
      long var1 = Md.Pv();
      long var3 = var1 - this.bZg;
      if (var3 > 7500L || var3 < 0L) {
         this.bZg = var1;

         for(int var5 = 0; var5 < this.bZh.size(); ++var5) {
            Rd var6 = (Rd)this.bZh.get(var5);
            long var7 = var1 - var6.bZn;
            if (var7 > 30000L || var7 < 0L) {
               this.bZh.remove(var5--);
               long var9 = (long)var6.Gv & 4294967295L | ((long)var6.bZj & 4294967295L) << 32;
               this.bZf.n(var9);
            }
         }
      }

   }

   public Rl[] aP(int var1, int var2) {
      return this.aQ(var1, var2).bZl;
   }

   // $FF: synthetic method
   static RL q(Rc var0) {
      return var0.bZi;
   }

   public Rd aQ(int var1, int var2) {
      var1 = var1 >> 4;
      var2 = var2 >> 4;
      long var3 = (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
      Rd var5 = (Rd)this.bZf.c(var3);
      if (var5 == null) {
         var5 = new Rd(this, var1, var2);
         this.bZf.q(var3, var5);
         this.bZh.add(var5);
      }

      var5.bZn = Md.Pv();
      return var5;
   }

   public Rc(RL var1) {
      this.bZi = var1;
   }

   public Rl q(int var1, int var2, Rl var3) {
      Rl var4 = this.aQ(var1, var2).aR(var1, var2);
      return var4 == null ? var3 : var4;
   }
}

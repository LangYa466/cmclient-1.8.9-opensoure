import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class Wf extends Wi {
   public int ckA;
   public Wd cmQ;
   public boolean cmR;
   public List cmS = Lists.newArrayList();
   public List cmT = Lists.newArrayList();
   public RL cmU;
   public List cmV;

   public RL ZB() {
      return this.cmU;
   }

   public Wf() {
   }

   public Wf(RL var1, int var2, Random var3, int var4, int var5, List var6, int var7) {
      super((Wf)null, 0, var3, var4, var5);
      this.cmU = var1;
      this.cmV = var6;
      this.ckA = var7;
      Rl var8 = var1.q(new NW(var4, 0, var5), Rl.cav);
      this.cmR = var8 == Rl.caC || var8 == Rl.caW;
      this.ce(this.cmR);
   }
}

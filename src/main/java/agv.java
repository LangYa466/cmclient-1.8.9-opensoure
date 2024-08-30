import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class agV extends jB {
   public jC[] dwc;
   public int Oz;

   protected int bh() {
      return this.dwc.length;
   }

   public jC aB(int var1) {
      return this.dwc[var1];
   }

   public agV(agU var1, hS var2) {
      super(var2, var1.eo, var1.eC, -24524 & 32, var1.eC - (-30671 & 1582), 30 & 27673);
      this.Oz = var1.eC - (31264 & 1075);
      int var3 = 24864 & 3204;
      ArrayList var4 = new ArrayList();

      for(agT var6 : this.Ol.Bn.dmE.cm) {
         ++var3;
         var6.aq = var3;
         var4.add(new agW(var1, var6, this.Ol));
      }

      this.dwc = (jC[])var4.toArray(new jC[8240 & -25856]);
   }

   protected int bj() {
      return super.bj() + (2079 & 16975) + (18467 & 1078);
   }

   public void q(char var1, int var2) {
      Stream.of(this.dwc).forEach((var2x) -> {
         ((agW)var2x).q(var1, var2);
      });
   }

   public int iC() {
      return super.iC() + (17120 & -28368) + (76 & 20580);
   }
}

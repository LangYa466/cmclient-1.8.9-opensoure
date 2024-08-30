import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class aM {
   public final List gI = Lists.newArrayList();
   private float gJ;
   private float gK;
   private int gL;

   public aM av() {
      this.gJ = (float)((int)(this.gI.stream().mapToDouble(aO::aC).sum() + (double)(this.gL * (this.gI.size() - (179 & -29375)))));
      return this;
   }

   public void t(float var1) {
      this.gJ = var1;
   }

   public aM q(aQ... var1) {
      double var2 = (double)((this.gK - (float)(this.gL * (var1.length - (1 & 6345)))) / (float)var1.length);
      double var4 = Stream.of(var1).mapToDouble(aQ::ax).max().orElse(0.0D);
      this.gI.add(new aO(var1, var2, var4));
      return this;
   }

   public int aw() {
      return this.gL;
   }

   public aM y(float var1) {
      this.gK = var1;
      return this;
   }

   public float ax() {
      return this.gJ;
   }

   public float ay() {
      return this.gK;
   }

   public aM o(int var1) {
      this.gL = var1;
      return this;
   }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class P extends E {
   public final List cm;
   private final File cn;

   public Optional q(Integer var1) {
      return this.cm.stream().filter((var0) -> {
         return (boolean)(var0.bwi != 0 ? 1 & 14987 : -23040 & 4098);
      }).filter((var1x) -> {
         return (boolean)(var1x.bwi == var1.intValue() ? 5697 & -24319 : 576 & 24713);
      }).findAny();
   }

   public void L() {
      this.aK.r(new agU(this.aK.Cx));
   }

   public void x() {
      try {
         if (this.cn.exists()) {
            BufferedReader var1 = new BufferedReader(new FileReader(this.cn));

            String var2;
            while((var2 = var1.readLine()) != null) {
               this.cm.add(agT.ih(var2));
            }

            var1.close();
         } else {
            this.cn.createNewFile();
         }
      } catch (Exception var3) {
         this.aK.Bn.atI().error(y.q[14281 & 11260 & -292 & 8173], var3);
      }

   }

   public void aa() {
      try {
         if (this.cn.exists()) {
            BufferedWriter var1 = new BufferedWriter(new FileWriter(this.cn));

            for(agT var3 : this.cm) {
               var1.write(var3.toString());
               var1.newLine();
            }

            var1.close();
         } else {
            this.aK.Bn.atI().warn(y.q[4811 & 6911 & 28621 & -4355]);
         }
      } catch (Exception var4) {
         this.aK.Bn.atI().error(y.q[6863 & -17429 & 25289 & 26317], var4);
      }

   }

   public P() {
      super(y.q[-21785 & 9183 & -30755 & -28699], 542 & -24562);
      new bI(this, y.q[-17417 & 14327 & 22231 & 11238]);
      this.cn = new File(x.aa, y.q[4815 & 5831 & 12271 & 31727]);
      this.cm = new LinkedList();
      this.x();
   }
}

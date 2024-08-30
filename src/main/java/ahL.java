import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class ahl {
   private final List dxz;
   private final List dxA;
   private final List dxB;
   private final String dxC;
   private final ahl dxD;

   private ahl(ahl var1) {
      this.dxC = e.q[-22582 & 971 & 5961 & -10420] + (var1 == null ? e.q[29561 & 22347 & 20463 & 14203] : var1.dxC);
      this.dxz = new ArrayList();
      this.dxB = new ArrayList();
      this.dxA = new ArrayList();
      this.dxD = var1;
   }

   public ahl avV() {
      return this.dxD;
   }

   public ahl(File var1, List var2) {
      this(var1, var2, (ahl)null);
   }

   public List MO() {
      return this.dxz;
   }

   public String bY() {
      return this.dxC;
   }

   public List avS() {
      return this.dxA;
   }

   private ahl(File var1, List var2, ahl var3) {
      this.dxC = var1.getName();
      this.dxz = new ArrayList();
      this.dxB = var2;
      this.dxA = new ArrayList();
      this.dxD = var3;
      this.dxA.add(new ahl(var3));
      File[] var4 = (File[])Objects.requireNonNull(var1.listFiles());
      File[] var5 = var4;
      int var6 = var4.length;

      for(int var7 = 132 & -19087; var7 < var6; ++var7) {
         File var8 = var5[var7];
         if (ahv.a(var8)) {
            Iterator var9 = this.dxB.iterator();

            while(true) {
               if (!var9.hasNext()) {
                  Optional var12 = ahv.s(var8);
                  List var10001 = this.dxz;
                  this.dxz.getClass();
                  var12.ifPresent(var10001::add);
                  break;
               }

               uX var10 = (uX)var9.next();
               if (var10.aO().equals(var8.getName())) {
                  Optional var11 = ahv.s(var8);
                  if (var11.isPresent() && ((uX)var11.get()).equals(var10)) {
                     break;
                  }
               }
            }
         } else if (ahv.d(var8)) {
            this.dxA.add(new ahl(var8, var2, this));
         }
      }

   }
}

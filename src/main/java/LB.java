import com.google.common.base.Objects;
import java.util.List;

public class lB {
   private final int SV;
   private final lv SW;
   private final List SX;

   public int lb() {
      return this.SV;
   }

   public lB(lv var1, List var2, int var3) {
      this.SW = var1;
      this.SX = var2;
      this.SV = var3;
   }

   public lt br(int var1) {
      return var1 >= 0 && var1 < this.SX.size() ? (lt)Objects.firstNonNull(this.SX.get(var1), lx.SS) : lx.SS;
   }
}

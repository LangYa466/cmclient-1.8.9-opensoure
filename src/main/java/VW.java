import java.util.Collections;
import java.util.List;

public class vw implements vn {
   private final boolean aAM;
   private final List aAN;
   private final boolean aAO;

   public boolean tX() {
      return this.aAM;
   }

   public List tY() {
      return Collections.unmodifiableList(this.aAN);
   }

   public boolean tZ() {
      return this.aAO;
   }

   public vw(boolean var1, boolean var2, List var3) {
      this.aAM = var1;
      this.aAO = var2;
      this.aAN = var3;
   }
}

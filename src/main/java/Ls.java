import java.util.Comparator;
import java.util.List;

public class LS {
   public static final Comparator bDT = new LT();
   private final LY bDU;
   private int bDV;
   private final String bDW;
   private final LW bDX;
   private boolean bDY;
   private boolean bDZ;

   public void fZ(int var1) {
      int var2 = this.bDV;
      this.bDV = var1;
      if (var2 != var1 || this.bDY) {
         this.bDY = false;
         this.Or().q(this);
      }

   }

   public void ga(int var1) {
      if (this.bDX.Ou().Oo()) {
         throw new IllegalStateException(o.q[251 & -23045]);
      } else {
         this.fZ(this.Ot() - var1);
      }
   }

   public void gb(int var1) {
      if (this.bDX.Ou().Oo()) {
         throw new IllegalStateException(o.q[26367 & -32517]);
      } else {
         this.fZ(this.Ot() + var1);
      }
   }

   public void l(List var1) {
      this.fZ(this.bDX.Ou().k(var1));
   }

   public boolean mN() {
      return this.bDZ;
   }

   public String MX() {
      return this.bDW;
   }

   public void Oq() {
      if (this.bDX.Ou().Oo()) {
         throw new IllegalStateException(o.q[11515 & -12037]);
      } else {
         this.gb(1);
      }
   }

   public LS(LY var1, LW var2, String var3) {
      this.bDU = var1;
      this.bDX = var2;
      this.bDW = var3;
      this.bDY = true;
   }

   public void bB(boolean var1) {
      this.bDZ = var1;
   }

   public LY Or() {
      return this.bDU;
   }

   public LW Os() {
      return this.bDX;
   }

   public int Ot() {
      return this.bDV;
   }
}

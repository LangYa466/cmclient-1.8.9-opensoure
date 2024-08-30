import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class lx {
   private static final lt SJ = new lz((ly)null);
   private static final lt SK = new lA(1, true);
   private final lu SL;
   private int SM = -1;
   private final List SN = Lists.newArrayList();
   private int SO;
   private lv SP = new ls();
   private static final lt SQ = new lA(1, false);
   private static final lt SR = new lA(-1, true);
   public static final lt SS = new ly();

   // $FF: synthetic method
   static int q(lx var0, int var1) {
      return var0.SO = var1;
   }

   public lt kV() {
      return this.bp(this.SM);
   }

   public void q(lv var1) {
      this.SN.add(this.kY());
      this.SP = var1;
      this.SM = -1;
      this.SO = 0;
   }

   public lx(lu var1) {
      this.SL = var1;
   }

   public lt bp(int var1) {
      int var2 = var1 + this.SO * 6;
      return this.SO > 0 && var1 == 0 ? SR : (var1 == 7 ? (var2 < this.SP.kR().size() ? SK : SQ) : (var1 == 8 ? SJ : (var2 >= 0 && var2 < this.SP.kR().size() ? (lt)Objects.firstNonNull(this.SP.kR().get(var2), SS) : SS)));
   }

   public void kW() {
      this.SL.q(this);
   }

   public void bq(int var1) {
      lt var2 = this.bp(var1);
      if (var2 != SS) {
         if (this.SM == var1 && var2.kU()) {
            var2.w(this);
         } else {
            this.SM = var1;
         }
      }

   }

   public int kX() {
      return this.SM;
   }

   public lB kY() {
      return new lB(this.SP, this.la(), this.SM);
   }

   public lv kZ() {
      return this.SP;
   }

   public List la() {
      ArrayList var1 = Lists.newArrayList();

      for(int var2 = 0; var2 <= 8; ++var2) {
         var1.add(this.bp(var2));
      }

      return var1;
   }
}

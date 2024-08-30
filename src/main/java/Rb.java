import java.util.Set;

public class rB {
   private long apM;
   private static final int apN = OK.values().length;

   private void r(int var1, boolean var2) {
      if (var2) {
         this.cE(var1);
      } else {
         this.cG(var1);
      }

   }

   private void cE(int var1) {
      this.apM |= (long)(1 << var1);
   }

   public boolean w(OK var1, OK var2) {
      return this.cF(var1.ordinal() + var2.ordinal() * apN);
   }

   public void q(Set var1) {
      for(OK var3 : var1) {
         for(OK var5 : var1) {
            this.q(var3, var5, true);
         }
      }

   }

   public void S(boolean var1) {
      if (var1) {
         this.apM = -1L;
      } else {
         this.apM = 0L;
      }

   }

   public void q(OK var1, OK var2, boolean var3) {
      this.r(var1.ordinal() + var2.ordinal() * apN, var3);
      this.r(var2.ordinal() + var1.ordinal() * apN, var3);
   }

   private boolean cF(int var1) {
      return (this.apM & (long)(1 << var1)) != 0L;
   }

   private void cG(int var1) {
      this.apM &= (long)(~(1 << var1));
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(' ');

      for(OK var5 : OK.values()) {
         var1.append(' ').append(var5.toString().toUpperCase().charAt(0));
      }

      var1.append('\n');

      for(OK var14 : OK.values()) {
         var1.append(var14.toString().toUpperCase().charAt(0));

         for(OK var9 : OK.values()) {
            if (var14 == var9) {
               var1.append(r.q[-23328 & 480]);
            } else {
               boolean var10 = this.w(var14, var9);
               var1.append(' ').append((char)(var10 ? 'Y' : 'n'));
            }
         }

         var1.append('\n');
      }

      return var1.toString();
   }
}

import org.apache.commons.lang3.StringUtils;

public class vE extends PJ {
   private final String aBs;

   protected vE(int var1, String... var2) {
      super(0, var2[0], var2[1]);
      this.aBs = StringUtils.isEmpty(var2[2]) ? q.q[646 & -32074] : var2[2].toLowerCase();
   }

   public String toString() {
      return super.toString() + '#' + this.aBs;
   }

   public vE(String var1, String var2) {
      this(0, aE(var1 + '#' + (var2 == null ? q.q[10887 & 902] : var2)));
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof vE && super.equals(var1)) {
         vE var2 = (vE)var1;
         return this.aBs.equals(var2.aBs);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return 31 * super.hashCode() + this.aBs.hashCode();
   }

   public vE(String var1) {
      this(0, aE(var1));
   }

   public String us() {
      return this.aBs;
   }

   protected static String[] aE(String var0) {
      String[] var1 = new String[]{null, var0, null};
      int var2 = var0.indexOf(35);
      String var3 = var0;
      if (var2 >= 0) {
         var1[2] = var0.substring(var2 + 1, var0.length());
         if (var2 > 1) {
            var3 = var0.substring(0, var2);
         }
      }

      System.arraycopy(PJ.dk(var3), 0, var1, 0, 2);
      return var1;
   }

   public vE(PJ var1, String var2) {
      this(var1.toString(), var2);
   }
}

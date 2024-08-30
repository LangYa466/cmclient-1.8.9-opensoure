import java.util.regex.Pattern;

public class abW implements abV {
   private final String dbp;
   private static final Pattern dbq = Pattern.compile(q.q[-30993 & 14079 & -5557 & 19019]);
   private static final Pattern dbr = Pattern.compile(q.q[-31234 & -29333 & 31742 & 3422]);

   public abV aoQ() {
      return new abW(this.aoP());
   }

   public boolean hg(String var1) {
      if (q.q[18051 & 23428 & 8444 & -6804].equals(this.dbp)) {
         return (boolean)(8321 & 3169);
      } else {
         String var2 = dbr.matcher(var1).replaceAll(q.q[14526 & 22800 & -30435 & -6771]);
         String[] var3 = dbq.split(var2);
         String[] var4 = var3;
         int var5 = var3.length;

         for(int var6 = -7903 & 194; var6 < var5; ++var6) {
            String var7 = var4[var6];
            if (this.dbp.equals(var7)) {
               return (boolean)(4097 & -24509);
            }
         }

         return (boolean)(-23342 & 18688);
      }
   }

   public abW(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dbp = var1;
      }
   }

   public String aoP() {
      return this.dbp;
   }

   public String toString() {
      return this.aoP();
   }

   public int hashCode() {
      return this.dbp.hashCode();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return (boolean)(-31741 & 10309);
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         abW var2 = (abW)var1;
         return this.dbp.equals(var2.dbp);
      } else {
         return (boolean)(4360 & -31743);
      }
   }
}

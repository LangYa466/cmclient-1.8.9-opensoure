package net.optifine.util;

public class u {
   private int cVq;
   private final Object[] cVr;

   private static boolean t(Object var0, Object var1) {
      return var0 == var1 || var0 != null && var1 != null && var0.equals(var1);
   }

   public u(Object[] var1) {
      this.cVq = 0;
      this.cVr = var1.clone();
   }

   public int hashCode() {
      if (this.cVq == 0) {
         this.cVq = 7;

         for(int var1 = 0; var1 < this.cVr.length; ++var1) {
            Object var2 = this.cVr[var1];
            if (var2 != null) {
               this.cVq = 31 * this.cVq + var2.hashCode();
            }
         }
      }

      return this.cVq;
   }

   private Object[] ams() {
      return this.cVr;
   }

   public u(Object var1, Object var2, Object var3) {
      this(new Object[]{var1, var2, var3});
   }

   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof net.optifine.util.u)) {
         return false;
      } else {
         net.optifine.util.u var2 = (net.optifine.util.u)var1;
         Object[] var3 = var2.ams();
         if (var3.length != this.cVr.length) {
            return false;
         } else {
            for(int var4 = 0; var4 < this.cVr.length; ++var4) {
               if (!t(this.cVr[var4], var3[var4])) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Object[] amt() {
      return this.cVr.clone();
   }

   public u(Object var1, Object var2) {
      this(new Object[]{var1, var2});
   }

   public String toString() {
      return .w.q[8629 & -11847] + .MV.w(this.cVr) + .q.q[11164 & -31844];
   }
}

package net.optifine.expr;

public enum n {
   cyu(.w.q[-27631 & 8209], .w.q[16766 & -31086]),
   cyv(.w.q[10260 & 92], .w.q[16501 & 5141]),
   cyw(.w.q[8247 & 18455], .w.q[568 & -29544]),
   cyx(.q.q[-21681 & 587]),
   cyy(.w.q[-15301 & 2587]),
   cyz(.w.q[19037 & 1053]);

   private final String cyA;
   private final String cyB;
   public static final net.optifine.expr.n[] cyC = values();

   private n(String var3) {
      this(var3, .q.q[610 & 5377]);
   }

   private n(String var3, String var4) {
      this.cyA = var3;
      this.cyB = var4;
   }

   public String agr() {
      return this.cyA;
   }

   public String ags() {
      return this.cyB;
   }

   public static net.optifine.expr.n u(char var0) {
      for(int var1 = 0; var1 < cyC.length; ++var1) {
         net.optifine.expr.n var2 = cyC[var1];
         if (var2.agr().indexOf(var0) >= 0) {
            return var2;
         }
      }

      return null;
   }

   public boolean i(char var1) {
      return this.cyB.indexOf(var1) >= 0;
   }
}

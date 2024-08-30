public enum ge implements Pd {
   private final String vu;
   vv(5, i.q[339 & -13453], i.q[348 & 340]),
   vw(4, i.q[848 & 5464], i.q[-30251 & 4465]);

   private final String vx;
   vy(2, i.q[2379 & 4555], r.q[267 & 1227]),
   vA(1, e.q[17253 & 869], i.q[329 & -32305]);

   private static final ge[] vB = new ge[values().length];
   vC(0, q.q[17311 & -32035]);

   private final int vD;
   vE(3, i.q[-7219 & 2383], i.q[878 & -29234]);

   public String toString() {
      return this.vu;
   }

   static {
      for(ge var3 : values()) {
         vB[var3.dm()] = var3;
      }

   }

   public String cM() {
      return this.vx;
   }

   private ge(int var3, String var4) {
      this(var3, var4, var4);
   }

   public int dm() {
      return this.vD;
   }

   public static ge b(hI var0) {
      for(ge var4 : values()) {
         if (var0 == var4.dP()) {
            return var4;
         }
      }

      return vC;
   }

   public static ge ai(int var0) {
      if (var0 < 0 || var0 >= vB.length) {
         var0 = 0;
      }

      return vB[var0];
   }

   public abstract hI dP();

   private ge(int var3, String var4, String var5) {
      this.vD = var3;
      this.vu = var4;
      this.vx = var5;
   }

   public String bY() {
      return this.vu;
   }
}

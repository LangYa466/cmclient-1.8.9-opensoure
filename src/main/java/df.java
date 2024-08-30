public enum DF {
   bev(0, i.q[1505 & 718]),
   bew(1, i.q[10434 & 20723]),
   bex(2, i.q[2284 & 16597]);

   private static final DF[] bey = new DF[values().length];
   private final int bez;
   private final String beA;

   private DF(int var3, String var4) {
      this.bez = var3;
      this.beA = var4;
   }

   public int Gc() {
      return this.bez;
   }

   public static DF eS(int var0) {
      return bey[var0 % bey.length];
   }

   public String Gd() {
      return this.beA;
   }

   static {
      for(DF var3 : values()) {
         bey[var3.bez] = var3;
      }

   }
}

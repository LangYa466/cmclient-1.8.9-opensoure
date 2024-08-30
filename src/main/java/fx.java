public enum fX implements Pd {
   vh(0, q.q[1983 & -9537], q.q[10049 & -26359]),
   vi(1, q.q[17088 & -32028], q.q[599 & -10409]),
   vj(2, q.q[21477 & -21823], y.q[560 & 4730]);

   private static final fX[] vk = new fX[values().length];
   private final int vl;
   private final String vm;
   private final String vn;

   private fX(int var3, String var4, String var5) {
      this.vl = var3;
      this.vm = var4;
      this.vn = var5;
   }

   public int dm() {
      return this.vl;
   }

   public String toString() {
      return this.vm;
   }

   public static fX ah(int var0) {
      if (var0 < 0 || var0 >= vk.length) {
         var0 = 0;
      }

      return vk[var0];
   }

   public String bY() {
      return this.vm;
   }

   public String cM() {
      return this.vn;
   }

   static {
      for(fX var3 : values()) {
         vk[var3.dm()] = var3;
      }

   }
}

public enum gG implements Pd {
   wu(0, hm.zh, q.q[3741 & -27937]),
   wv(1, hm.zb, q.q[12190 & 702]),
   ww(2, hm.zb, y.q[1633 & -15629], y.q[-32146 & 626]),
   wx(3, hm.yE, q.q[21152 & -23582]),
   wy(4, hm.yE, y.q[25189 & -29843], y.q[2670 & 8934]),
   wz(5, hm.zh, q.q[17130 & 12962]),
   wA(6, hm.zh, y.q[8811 & 633], y.q[17386 & -20882]);

   private static final gG[] wB = new gG[values().length];
   private final int wC;
   private final String wD;
   private final String wE;
   private final hm wF;

   private gG(int var3, hm var4, String var5) {
      this(var3, var4, var5, var5);
   }

   private gG(int var3, hm var4, String var5, String var6) {
      this.wC = var3;
      this.wD = var5;
      this.wE = var6;
      this.wF = var4;
   }

   public int dm() {
      return this.wC;
   }

   public hm dY() {
      return this.wF;
   }

   public String toString() {
      return this.wD;
   }

   public static gG al(int var0) {
      if (var0 < 0 || var0 >= wB.length) {
         var0 = 0;
      }

      return wB[var0];
   }

   public String bY() {
      return this.wD;
   }

   public String cM() {
      return this.wE;
   }

   static {
      for(gG var3 : values()) {
         wB[var3.dm()] = var3;
      }

   }
}

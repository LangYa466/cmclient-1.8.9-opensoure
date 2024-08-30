public enum dq implements Pd {
   ou(0, q.q[-6484 & 5047], q.q[20939 & 9473], hm.zb),
   ov(1, q.q[-11609 & 10157], y.q[-19643 & 2013], hm.zb),
   ow(2, q.q[2727 & -18762], hm.yQ);

   private static final dq[] ox = new dq[values().length];
   private final int oy;
   private final String oz;
   private final String oA;
   private final hm oB;

   private dq(int var3, String var4, hm var5) {
      this(var3, var4, var4, var5);
   }

   private dq(int var3, String var4, String var5, hm var6) {
      this.oy = var3;
      this.oz = var4;
      this.oA = var5;
      this.oB = var6;
   }

   public int dm() {
      return this.oy;
   }

   public String cM() {
      return this.oA;
   }

   public hm dn() {
      return this.oB;
   }

   public String toString() {
      return this.oz;
   }

   public static dq M(int var0) {
      if (var0 < 0 || var0 >= ox.length) {
         var0 = 0;
      }

      return ox[var0];
   }

   public String bY() {
      return this.oz;
   }

   static {
      for(dq var3 : values()) {
         ox[var3.dm()] = var3;
      }

   }
}

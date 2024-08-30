public class hm {
   public static final hm yy = new hm(19, 8375321);
   public static final hm yz = new hm(22, 10066329);
   public static final hm yA = new hm(13, 9402184);
   public static final hm yB = new hm(24, 8339378);
   public static final hm yC = new hm(0, 0);
   public static final hm yD = new hm(4, 16711680);
   public static final hm yE = new hm(14, 16776437);
   public final int yF;
   public static final hm yG = new hm(7, 31744);
   public static final hm yH = new hm(21, 5000268);
   public static final hm[] yI = new hm[64];
   public static final hm yJ = new hm(1, 8368696);
   public static final hm yK = new hm(26, 6704179);
   public static final hm yL = new hm(27, 6717235);
   public static final hm yM = new hm(35, 7340544);
   public static final hm yN = new hm(9, 10791096);
   public static final hm yO = new hm(30, 16445005);
   public static final hm yP = new hm(2, 16247203);
   public static final hm yQ = new hm(34, 8476209);
   public static final hm yR = new hm(28, 10040115);
   public static final hm yS = new hm(32, 4882687);
   public static final hm yT = new hm(20, 15892389);
   public static final hm yU = new hm(12, 4210943);
   public static final hm yV = new hm(16, 11685080);
   public static final hm yW = new hm(25, 3361970);
   public static final hm yX = new hm(33, 55610);
   public static final hm yY = new hm(17, 6724056);
   public static final hm yZ = new hm(8, 16777215);
   public static final hm za = new hm(29, 1644825);
   public static final hm zb = new hm(10, 9923917);
   public int zc;
   public static final hm zd = new hm(18, 15066419);
   public static final hm ze = new hm(5, 10526975);
   public static final hm zf = new hm(6, 10987431);
   public static final hm zg = new hm(15, 14188339);
   public static final hm zh = new hm(11, 7368816);
   public static final hm zi = new hm(3, 13092807);
   public static final hm zj = new hm(23, 5013401);
   public static final hm zk = new hm(31, 6085589);

   public int ar(int var1) {
      short var2 = 220;
      if (var1 == 3) {
         var2 = 135;
      }

      if (var1 == 2) {
         var2 = 255;
      }

      if (var1 == 1) {
         var2 = 220;
      }

      if (var1 == 0) {
         var2 = 180;
      }

      int var3 = (this.zc >> 16 & 255) * var2 / 255;
      int var4 = (this.zc >> 8 & 255) * var2 / 255;
      int var5 = (this.zc & 255) * var2 / 255;
      return -16777216 | var3 << 16 | var4 << 8 | var5;
   }

   private hm(int var1, int var2) {
      if (var1 >= 0 && var1 <= 63) {
         this.yF = var1;
         this.zc = var2;
         yI[var1] = this;
      } else {
         throw new IndexOutOfBoundsException(i.q[-18503 & 3005]);
      }
   }
}

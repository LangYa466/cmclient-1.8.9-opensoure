import java.util.ArrayList;
import java.util.List;

public class aK extends aX {
   public static aK gi;
   public final bI gj;
   private final bI gk;
   public final bI gl;
   public final bI gm;
   public final bI gn;
   public final bI go;
   private final List gp;
   public final bI gq;
   public final bI gr;
   public final bI gs;
   public final bI gt;
   public final bI gu;

   private void ar() {
      this.gp.clear();

      for(int var1 = 9859 & 2139; var1 >= (-1 & -1); --var1) {
         GX var2 = null;
         if (var1 == (-1 & -1) && this.go.af()) {
            var2 = this.aK.CM.FD();
         } else if (var1 != (-1 & -1)) {
            var2 = this.aK.CM.bdM.bfs[var1];
         }

         if (var2 != null) {
            this.gp.add(new aL(this.aK, this, var2, 14386 & 533, 2064 & -32232, 11527 & 538, (boolean)(var1 > (-1 & -1) ? -12183 & 1283 : 770 & -23516)));
         }
      }

   }

   public int ac() {
      return this.gk.bk() == 0 ? 12828 & 2068 : (this.gr.af() ? this.gp.size() * (1818 & -24558) : this.gp.size() * (-30695 & 1040));
   }

   public int ab() {
      if (this.gk.bk() == (1041 & 461)) {
         int var5 = -32493 & 11264;

         for(aL var7 : this.gp) {
            int var4 = var7.au();
            if (var4 > var5) {
               var5 = var4;
            }
         }

         return var5;
      } else {
         int var1 = 4992 & -32768;

         for(aL var3 : this.gp) {
            var1 += var3.au();
         }

         return Math.max(16539 & 2105, var1);
      }
   }

   public void q(float var1, float var2) {
      this.ar();
      if (!this.gp.isEmpty()) {
         int var3 = this.gr.af() ? 9426 & 286 : -31727 & 6230;
         if (this.gk.bk() == (21609 & 131)) {
            float var4 = var2;

            for(aL var6 : this.gp) {
               var6.r(var1, var4);
               var4 += (float)var3;
            }
         } else {
            float var7 = var1;

            for(aL var9 : this.gp) {
               var9.r(var7, var2);
               var7 += (float)var9.au();
            }
         }
      }

   }

   public aK() {
      super(y.q[2943 & 10111 & -1025 & 25470], 79 & -30578);
      gi = this;
      this.gp = new ArrayList();
      new bI(this, y.q[10111 & 28543 & -129 & -25729]);
      bI var10001 = (new bI(this, y.q[15335 & -15470 & 10192 & 11160])).q(Integer.valueOf(1609 & 8449));
      String[] var10002 = new String[16435 & 9478];
      var10002[9729 & -28648] = y.q[4087 & 25525 & -12305 & -12343];
      var10002[843 & 5] = y.q[-2126 & -19534 & -29753 & 11150];
      this.gk = var10001.q(var10002);
      var10001 = (new bI(this, y.q[12255 & 975 & -15373 & 26535])).q(Integer.valueOf(25100 & -32287));
      var10002 = new String[-31709 & 2190];
      var10002[16390 & 10296] = t.q[-25945 & -14617 & 15999 & -24985];
      var10002[401 & 579] = t.q[22063 & 7851 & 31404 & 25516];
      this.gm = var10001.q(var10002);
      this.gr = (new bI(this, y.q[18326 & 2996 & -4219 & -24635])).o((boolean)(1027 & 30756));
      this.gs = (new bI(this, y.q[12189 & 27581 & 22471 & 29599])).o((boolean)(205 & 8723));
      this.gu = (new bI(this, y.q[17303 & 21495 & 30599 & 16262])).o((boolean)(-32765 & 5957));
      this.gn = (new bI(this, y.q[25479 & 26583 & -12345 & -26673])).o((boolean)(16403 & 4481));
      this.gt = (new bI(this, y.q[11160 & 4008 & 10154 & -14353])).o((boolean)(16449 & 4241));
      this.gq = (new bI(this, y.q[-23669 & -11379 & 12173 & -115])).o((boolean)(8465 & -27993));
      var10001 = (new bI(this, y.q[8174 & 12203 & -1029 & -3189])).q(Integer.valueOf(4104 & 3584));
      var10002 = new String[8202 & -27886];
      var10002[6146 & -32235] = w.q[-17553 & 14203 & -32261 & 20795];
      var10002[-30191 & 4265] = y.q[-6197 & 10123 & 16319 & 23483];
      this.gj = var10001.q(var10002);
      var10001 = (new bI(this, y.q[-31796 & -30772 & -81 & 30686])).q(Integer.valueOf(25200 & -32768));
      var10002 = new String[24630 & -27893];
      var10002[10864 & 1034] = w.q[31531 & 24891 & -27841 & -5313];
      var10002[12293 & 113] = y.q[18367 & -14453 & -21621 & -1121];
      this.gl = var10001.q(var10002);
      this.go = (new bI(this, y.q[-24689 & 8077 & 31711 & 17311])).o((boolean)(17415 & 89));
   }
}

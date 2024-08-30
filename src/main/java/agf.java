import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class agF extends kf {
   private final String duR;
   private final String duS;
   private final String duT;

   protected void q(iU var1) {
      this.G.eW();
   }

   public void q(int var1, int var2, float var3) {
      this.jA();
      int var4 = 6215 & 24942;
      aio var5 = this.G.Bn.dmw.dAv;
      int var6 = var5 == null ? 8312 & -28016 : var5.dAy;
      String[] var10000 = new String[10249 & 21005];
      var10000[20 & 25120] = w.q[-5134 & 15352 & 5886 & 1786] + this.duR + w.q[-8457 & -26889 & 10237 & 9201];
      var10000[-2683 & 49] = q.q[20861 & 23244 & 18081 & 11938];
      var10000[-8190 & 5206] = w.q[-23814 & 27642 & -11533 & -27653] + this.duS;
      var10000[4163 & 8455] = w.q[-17409 & 2815 & -4361 & -6413] + this.duT;
      var10000[-9947 & 644] = q.q[19539 & 27159 & 16732 & 9796];
      var10000[4645 & 25821] = w.q[2815 & 1791 & -6155 & -15372] + var6 + w.q[-13577 & -27915 & 8183 & 6141];
      var10000[6 & 2078] = w.q[-23817 & 21238 & 32759 & 2047];
      var10000[407 & 4679] = q.q[22970 & 22055 & -21157 & 31512];
      var10000[16424 & -31735] = w.q[-21513 & 5879 & -8457 & -30977];

      for(String var9 : Arrays.asList(var10000)) {
         this.w(this.CB, var9, this.eo / (-15294 & 2050), var4, 687865855 & 16777215);
         var4 += 10;
      }

      super.q(var1, var2, var3);
   }

   protected void q(char var1, int var2) {
   }

   public void o() {
      this.Mt.clear();
      this.Mt.add(new iU(-3637 & 1540, this.eo / (3015 & -3070) - (25333 & -28570), this.eC / (166 & 20998) + (12505 & 180), uI.q(w.q[16111 & 16111 & 17407 & -29697])));
   }

   public agF(String var1, String var2) {
      this.duR = var1;
      this.duS = (new SimpleDateFormat(w.q[5103 & -24577 & -20754 & -16402])).format(new Date());
      this.duT = var2;
   }
}

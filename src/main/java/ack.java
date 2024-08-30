import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class acK {
   private int deK;
   private int dfI;
   private int dfd;
   private boolean dfJ;
   private int deZ;
   private int deN;
   private final List dfK;
   private int deO;
   private boolean dfL;
   private int deW;
   private int deX;
   private int deP;

   public acK(String var1) {
      this(aeu.fm(var1));
   }

   public acK(InputStream var1) {
      this.dfI = -28660 & 3101;
      this.dfJ = (boolean)(-24301 & 4160);
      this.dfL = (boolean)(13446 & 336);
      this.deK = 2640 & -31994;
      this.deO = 1581 & -30016;
      this.dfK = new ArrayList();

      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(var1));

         while(true) {
            String var3 = var2.readLine();
            if (var3 == null) {
               var2.close();
               return;
            }

            var3 = var3.trim();
            if (!var3.isEmpty()) {
               String[] var4 = var3.split(q.q[2591 & 4959 & -4458 & -12906], 4162 & 782);
               String var5 = var4[-27190 & 49].trim();
               String var6 = var4[4193 & -32101];
               if (var5.equals(u.q[-19569 & 13224 & 22521 & 26568])) {
                  this.dfI = Integer.parseInt(var6);
               } else if (var5.equals(u.q[905 & -24679 & -21509 & -8215])) {
                  this.dfJ = Boolean.parseBoolean(var6);
               } else if (var5.equals(u.q[29626 & 28555 & -18485 & 5067])) {
                  this.dfL = Boolean.parseBoolean(var6);
               } else if (var5.equals(u.q[-28741 & 15327 & 943 & -6209])) {
                  this.deN = Integer.parseInt(var6);
               } else if (var5.equals(u.q[15324 & 9132 & 32718 & 18412])) {
                  this.deW = Integer.parseInt(var6);
               } else if (var5.equals(u.q[13229 & 25583 & 3037 & 4015])) {
                  this.deZ = Integer.parseInt(var6);
               } else if (var5.equals(u.q[-25617 & -11362 & 10158 & 13198])) {
                  this.dfd = Integer.parseInt(var6);
               } else if (var5.equals(u.q[24495 & 19343 & 29583 & -28785])) {
                  this.deP = Integer.parseInt(var6);
               } else if (var5.equals(u.q[1976 & -31824 & -22598 & -7271])) {
                  this.deX = Integer.parseInt(var6);
               } else if (var5.equals(u.q[17343 & 28605 & 8089 & 23445])) {
                  this.deK = Integer.parseInt(var6);
               } else if (var5.equals(u.q[-14437 & -1029 & 3026 & 4055])) {
                  this.deO = Integer.parseInt(var6);
               } else if (var5.equals(u.q[-15461 & -1101 & 23447 & -17517])) {
                  try {
                     this.dfK.add(Class.forName(var6).newInstance());
                  } catch (Exception var12) {
                     throw new acA(u.q[-25708 & 18326 & -26660 & -9252] + var6, var12);
                  }
               } else if (var5.startsWith(u.q[15351 & 10133 & -28745 & 5047])) {
                  var5 = var5.substring(-28153 & 103);
                  acM var7 = (acM)this.dfK.get(this.dfK.size() - (-32623 & 1035));
                  List var8 = var7.aqE();

                  for(Object var10 : var8) {
                     acN var11 = (acN)var10;
                     if (var11.bY().equals(var5)) {
                        var11.hq(var6);
                        break;
                     }
                  }

                  var7.H(var8);
               }
            }
         }
      } catch (Exception var13) {
         throw new acA(u.q[918 & -19490 & -3177 & -5193], var13);
      }
   }

   public void cJ(boolean var1) {
      this.dfL = var1;
   }

   public int aqi() {
      return this.deW;
   }

   public void km(int var1) {
      this.dfI = var1;
   }

   public int aqq() {
      return this.deN;
   }

   public int aqr() {
      return this.deP;
   }

   public boolean aqB() {
      return this.dfL;
   }

   public int aqf() {
      return this.deZ;
   }

   public void kh(int var1) {
      this.deZ = var1;
   }

   public void kj(int var1) {
      this.dfd = var1;
   }

   public void kg(int var1) {
      this.deK = var1;
   }

   public int aqb() {
      return this.deX;
   }

   public int aqe() {
      return this.dfd;
   }

   public int aqc() {
      return this.deK;
   }

   public int aqd() {
      return this.deO;
   }

   public void p(File var1) {
      PrintStream var2 = new PrintStream(new FileOutputStream(var1));
      var2.println(u.q[29663 & -15393 & -22625 & 21399] + this.dfI);
      var2.println(u.q[12253 & 30622 & -25702 & -28742] + this.dfJ);
      var2.println(u.q[925 & 17311 & -7207 & 10237] + this.dfL);
      var2.println();
      var2.println(u.q[-23654 & 9114 & -21537 & -31842] + this.deN);
      var2.println(u.q[-15365 & -27649 & 12251 & 12219] + this.deW);
      var2.println(u.q[-22593 & 13246 & -26627 & 6108] + this.deZ);
      var2.println(u.q[19421 & -5153 & -31843 & -22625] + this.dfd);
      var2.println(u.q[-6177 & -31841 & 28670 & -5218] + this.deP);
      var2.println(u.q[3071 & -29729 & -21537 & -27713] + this.deX);
      var2.println();
      var2.println(u.q[2979 & -31811 & 31648 & 31665] + this.deK);
      var2.println(u.q[-16459 & 18341 & 31743 & -8261] + this.deO);
      var2.println();

      for(Object var4 : this.dfK) {
         acM var5 = (acM)var4;
         var2.println(u.q[-5130 & -29706 & 26594 & -78] + var5.getClass().getName());

         for(Object var7 : var5.aqE()) {
            acN var8 = (acN)var7;
            var2.println(u.q[-11369 & -9315 & 9205 & -20513] + var8.bY() + q.q[4758 & 16567 & -31370 & 30902] + var8.Iy());
         }

         var2.println();
      }

      var2.close();
   }

   public void kd(int var1) {
      this.deW = var1;
   }

   public acK() {
      this.dfI = 396 & 27244;
      this.dfJ = (boolean)(5312 & -30683);
      this.dfL = (boolean)(3726 & 4129);
      this.deK = 3617 & 4736;
      this.deO = -15725 & 8812;
      this.dfK = new ArrayList();
   }

   public void kl(int var1) {
      this.deN = var1;
   }

   public List aqt() {
      return this.dfK;
   }

   public void kf(int var1) {
      this.deX = var1;
   }

   public void ki(int var1) {
      this.deO = var1;
   }

   public void kk(int var1) {
      this.deP = var1;
   }

   public int aqC() {
      return this.dfI;
   }

   public boolean aqD() {
      return this.dfJ;
   }

   public void cK(boolean var1) {
      this.dfJ = var1;
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public enum OP {
   bRk(e.q[-28385 & 10519], 0, true),
   bRl(e.q[3357 & -32455], 1, true),
   bRm(e.q[11067 & 17691], 2, true),
   bRn(e.q[-32355 & 7007], 3, false),
   bRo(e.q[-24161 & 799], 4, false),
   bRp(e.q[29481 & 2465], 5, false),
   bRq(e.q[2491 & 355], 6, false),
   bRr(e.q[20773 & -29377], 7, false),
   bRs(e.q[8999 & -16073], 8, false),
   bRt(e.q[4409 & -13971], 9, false),
   bRu(e.q[16763 & -31953], 10, false),
   bRv(e.q[-22099 & 301], 11, false),
   bRw(e.q[303 & -14417], 12, false),
   bRx(e.q[-32463 & 27123], 13, false),
   bRy(e.q[9011 & 371], 14, false),
   bRz(e.q[-20041 & 3381], 15, false),
   bRA(e.q[-31945 & 375], 16, false),
   bRB(e.q[16765 & 11193], 17, false),
   bRC(e.q[11583 & 955], 18, false),
   bRD(e.q[319 & -13507], 19, false),
   bRE(e.q[895 & -11969], 20, false),
   bRF(e.q[355 & 17345], 21, false),
   bRG(e.q[459 & 1879], 22, false),
   bRH(w.q[18413 & 8941], 23, false),
   bRI(e.q[-32441 & 16742], 24, false),
   bRJ(e.q[20828 & 843], 25, false),
   bRK(e.q[-24114 & 2410], 26, false),
   bRL(e.q[3436 & 20815], 27, false),
   bRM(e.q[-22194 & 462], 28, false),
   bRN(e.q[-32392 & 12626], 29, false),
   bRO(e.q[-26798 & 25055], 30, false),
   bRP(e.q[-28330 & 1396], 31, false),
   bRQ(e.q[-32386 & 25942], 32, false),
   bRR(e.q[-23048 & 20828], 33, false),
   bRS(e.q[378 & 31194], 34, false),
   bRT(e.q[2396 & 1886], 35, false),
   bRU(e.q[-16033 & 10110], 36, false, 2),
   bRV(e.q[2400 & 16761], 37, false, 1),
   bRW(e.q[-19613 & 16738], 38, false, 1),
   bRX(e.q[887 & -7836], 39, false),
   bRY(e.q[22887 & 502], 40, false),
   bRZ(e.q[2924 & 16888], 41, true);

   private final String bSa;
   private final int bSb;
   private final boolean bSc;
   private final int bSd;
   private static final Map bSe = Maps.newHashMap();
   private static final String[] bSf;

   private OP(String var3, int var4, boolean var5, int var6) {
      this.bSa = var3;
      this.bSb = var4;
      this.bSc = var5;
      this.bSd = var6;
   }

   private OP(String var3, int var4, boolean var5) {
      this(var3, var4, var5, 0);
   }

   public static String[] Xa() {
      return bSf;
   }

   public String Xb() {
      return this.bSa;
   }

   public int Xc() {
      return this.bSb;
   }

   public int Xd() {
      return this.bSd;
   }

   public boolean Xe() {
      return this.bSc;
   }

   public boolean Xf() {
      return this.bSd > 0;
   }

   public static OP gF(int var0) {
      return (OP)bSe.get(Integer.valueOf(var0));
   }

   static {
      ArrayList var0 = Lists.newArrayList();

      for(OP var4 : values()) {
         bSe.put(Integer.valueOf(var4.Xc()), var4);
         if (!var4.Xb().endsWith(q.q[16959 & -27921])) {
            var0.add(var4.Xb());
         }
      }

      bSf = (String[])var0.toArray(new String[var0.size()]);
   }
}

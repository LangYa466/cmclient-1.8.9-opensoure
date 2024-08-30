import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class YS {
   public static final String cAi = "POST";
   public static final String cAj = "HTTP/1.0";
   private Map czt = new LinkedHashMap();
   private String cAk = null;
   private int cAl = 0;
   public static final String cAm = "HTTP/1.1";
   public static final String cAn = "GET";
   public static final String cAo = "HEAD";
   private byte[] cAp = null;
   private String czN = null;
   private String cAq = null;
   private String cAr = null;
   private int bvY = 0;
   private Proxy CC = Proxy.NO_PROXY;

   public YS(String var1, int var2, Proxy var3, String var4, String var5, String var6, Map var7, byte[] var8) {
      this.czN = var1;
      this.bvY = var2;
      this.CC = var3;
      this.cAr = var4;
      this.cAk = var5;
      this.cAq = var6;
      this.czt = var7;
      this.cAp = var8;
   }

   public int agI() {
      return this.cAl;
   }

   public String agJ() {
      return this.cAr;
   }

   public byte[] agK() {
      return this.cAp;
   }

   public String agL() {
      return this.cAq;
   }

   public Map agM() {
      return this.czt;
   }

   public String agN() {
      return this.cAk;
   }

   public int lG() {
      return this.bvY;
   }

   public Proxy gf() {
      return this.CC;
   }

   public void iE(int var1) {
      this.cAl = var1;
   }

   public String agA() {
      return this.czN;
   }
}

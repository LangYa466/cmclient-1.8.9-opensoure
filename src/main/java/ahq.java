import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ahQ {
   private int jr;
   private final String dze;
   private int hX;
   private ahS dyZ;
   private final ahR dzf;
   private String av;
   private int ia;
   private int bxW;
   private static final String[] dzg;
   private boolean aM;

   public String toString() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(dzg[2612 & 29121], this.av);
      var1.addProperty(dzg[28693 & 1153], this.dze);
      var1.addProperty(dzg[-30042 & 8202], Boolean.valueOf(this.aM));
      var1.addProperty(dzg[-15597 & 1187], Integer.valueOf(this.hX));
      var1.addProperty(dzg[6692 & 16662], Integer.valueOf(this.ia));
      var1.addProperty(dzg[-16059 & 2197], Integer.valueOf(this.bxW));
      var1.addProperty(dzg[12983 & 2062], Integer.valueOf(this.jr));
      var1.addProperty(dzg[-31737 & 775], this.dzf.name());
      var1.addProperty(dzg[22542 & 1240], this.dyZ.name());
      return var1.toString();
   }

   public ahS awB() {
      return this.dyZ;
   }

   public ahQ(String var1, String var2, boolean var3, int var4, int var5, int var6, int var7, ahR var8, ahS var9) {
      this.av = var1;
      this.dze = var2;
      this.aM = var3;
      this.hX = var4;
      this.ia = var5;
      this.bxW = var6;
      this.jr = var7;
      this.dzf = var8;
      this.dyZ = var9;
   }

   public void fH(int var1) {
      this.hX = var1;
   }

   public void bb(String var1) {
      this.av = var1;
   }

   public String awC() {
      return this.dze;
   }

   public int aY() {
      return this.hX;
   }

   public String bY() {
      return this.av;
   }

   public void w(boolean var1) {
      this.aM = var1;
   }

   public void fI(int var1) {
      this.ia = var1;
   }

   public void n(int var1) {
      this.jr = var1;
   }

   public void q(ahS var1) {
      this.dyZ = var1;
   }

   static {
      String[] var10000 = new String[9 & 6267];
      var10000[9232 & 16640] = q.q[15359 & 4599 & -9097 & -15233];
      var10000[-19199 & 19185] = w.q[-13201 & 28715 & -31961 & 25395];
      var10000[402 & 7235] = r.q[-21747 & 25353 & -11891 & -7796];
      var10000[1191 & -32445] = q.q[-19369 & 23255 & -12685 & -14213];
      var10000[20 & 2885] = q.q[-11401 & 24919 & 8439 & 24693];
      var10000[45 & 22421] = q.q[1375 & -27657 & -27521 & -20105];
      var10000[-32226 & 32007] = q.q[8095 & -28225 & -6657 & 25055];
      var10000[1983 & 16391] = w.q[-32449 & -15041 & 24255 & 31927];
      var10000[-4017 & 520] = q.q[-30216 & -20488 & 17407 & 18429];
      dzg = var10000;
   }

   public boolean J() {
      return this.aM;
   }

   public int bl() {
      return this.jr;
   }

   public int KO() {
      return this.bxW;
   }

   public void fG(int var1) {
      this.bxW = var1;
   }

   public int aX() {
      return this.ia;
   }

   public ahR awD() {
      return this.dzf;
   }

   public static ahQ ij(String var0) {
      JsonObject var1 = (JsonObject)(new Gson()).fromJson(var0, JsonObject.class);
      return new ahQ(var1.get(dzg[-32758 & 6144]).getAsString(), var1.get(dzg[20873 & 2641]).getAsString(), var1.get(dzg[82 & 2062]).getAsBoolean(), var1.get(dzg[1051 & -16221]).getAsInt(), var1.get(dzg[8468 & -29691]).getAsInt(), var1.get(dzg[22837 & 8333]).getAsInt(), var1.get(dzg[12302 & -15929]).getAsInt(), ahR.il(var1.get(dzg[-28665 & 24999]).getAsString()), ahS.in(var1.get(dzg[-32162 & 20488]).getAsString()));
   }
}

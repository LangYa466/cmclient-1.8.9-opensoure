import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class aib {
   private Integer emoteId;
   private static final Gson GSON = (new GsonBuilder()).registerTypeAdapter(aic.class, new aie()).registerTypeAdapter(aic.class, new aid()).create();
   private String clientVersion;
   private String[] playerNames;
   private String playerName;
   private String serverAddress;
   private String gameVersion;
   private final aic type;

   public aic awN() {
      return this.type;
   }

   public String[] awO() {
      return this.playerNames;
   }

   public aib iq(String var1) {
      this.playerName = var1;
      return this;
   }

   public aib(aic var1) {
      this.type = var1;
   }

   public aib lb(int var1) {
      this.emoteId = var1;
      return this;
   }

   public aib ir(String var1) {
      this.serverAddress = var1;
      return this;
   }

   public aib d(String[] var1) {
      this.playerNames = var1;
      return this;
   }

   public String toString() {
      return GSON.toJson(this);
   }

   public String MX() {
      return this.playerName;
   }

   public static aib is(String var0) {
      return (aib)GSON.fromJson(var0, aib.class);
   }

   public int awP() {
      return this.emoteId.intValue();
   }

   public String awQ() {
      return this.gameVersion;
   }

   public String awR() {
      return this.serverAddress;
   }

   public aib it(String var1) {
      this.clientVersion = var1;
      return this;
   }

   public aib iu(String var1) {
      this.gameVersion = var1;
      return this;
   }

   public String awS() {
      return this.clientVersion;
   }
}

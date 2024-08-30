import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class aif extends TimerTask {
   private static final String dzQ = "https://restapi.cmclient.pl:2087/profile/%s";
   private final aew dzR;

   public void run() {
      ahY var1 = this.dzR.dmM;
      if (!var1.awI().isEmpty()) {
         var1.q((new aib(aic.IS_ONLINE_LIST)).d((String[])var1.awI().toArray(new String[27136 & 5252])));
         var1.awI().clear();
      }

      if (!var1.awM().isEmpty()) {
         ahX var10000 = new ahX();
         String var10001 = y.q[-13839 & 27061 & 3369 & -2783];
         Object[] var10002 = new Object[13899 & 18433];
         var10002[262 & 12440] = String.join(q.q[21115 & 30299 & -14741 & -31125], var1.awM());
         CompletableFuture var2 = var10000.io(String.format(var10001, var10002));
         var2.thenAcceptAsync((var1x) -> {
            nb var2 = this.dzR.dma.fy();
            Collection var3 = var2.mi();

            for(JsonElement var6 : var1x.getAsJsonArray()) {
               JsonObject var7 = var6.getAsJsonObject();
               String var8 = var7.get(q.q[13055 & 9471 & -15753 & -15753]).getAsString();
               String var9 = var7.has(y.q[31723 & -20166 & -13910 & 16870]) ? var7.get(y.q[24426 & 23930 & -23237 & 21299]).getAsString() : null;
               JsonObject var10 = var7.has(y.q[21803 & 16699 & 29183 & 4963]) ? var7.getAsJsonObject(y.q[-3665 & 4387 & 28031 & -6805]) : null;

               for(ni var12 : var3) {
                  String var13 = this.dzR.hD(var12.mh().getName());
                  if (var13.equals(var8)) {
                     if (var9 != null) {
                        var12.aaG = aiw.iB(var9);
                     }

                     if (var10 != null) {
                        var12.aaE = new aeS(this.dzR, var10);
                     }
                  }
               }
            }

         });
         var1.awM().clear();
      }

   }

   public aif(aew var1) {
      this.dzR = var1;
   }
}

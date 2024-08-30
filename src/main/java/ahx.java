import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ahX {
   public static final ExecutorService dzz = Executors.newCachedThreadPool();

   public CompletableFuture io(String var1) {
      CompletableFuture var2 = new CompletableFuture();
      dzz.submit(() -> {
         try {
            URL var2x = new URL(var1);
            HttpURLConnection var3 = (HttpURLConnection)var2x.openConnection();
            var3.setConnectTimeout(26544 & 14097);
            var3.setReadTimeout(-22640 & 26426);

            try {
               BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.getInputStream()));
               Throwable var5 = null;

               try {
                  var2.complete(aiy.e(var4));
               } catch (Throwable var23) {
                  var5 = var23;
                  throw var23;
               } finally {
                  if (var4 != null) {
                     if (var5 != null) {
                        try {
                           var4.close();
                        } catch (Throwable var22) {
                           var5.addSuppressed(var22);
                        }
                     } else {
                        var4.close();
                     }
                  }

               }
            } finally {
               var3.disconnect();
            }
         } catch (Exception var26) {
            var2.completeExceptionally(var26);
         }

      });
      return var2;
   }
}

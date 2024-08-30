import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

public class aca extends abY {
   private final SSLParameters dbv;

   public aca(SSLContext var1, SSLParameters var2) {
      this(var1, Executors.newSingleThreadScheduledExecutor(), var2);
   }

   public ByteChannel q(SocketChannel var1, SelectionKey var2) {
      SSLEngine var3 = this.dbu.createSSLEngine();
      var3.setUseClientMode((boolean)(16897 & 1280));
      var3.setSSLParameters(this.dbv);
      return new aaQ(var1, var3, this.cYw, var2);
   }

   public aca(SSLContext var1, ExecutorService var2, SSLParameters var3) {
      super(var1, var2);
      if (var3 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dbv = var3;
      }
   }
}

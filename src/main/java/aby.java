import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class abY implements aaX {
   protected SSLContext dbu;
   protected ExecutorService cYw;

   // $FF: synthetic method
   public aaS q(aaT var1, abd var2) {
      return this.w(var1, var2);
   }

   public aaV w(aaT var1, List var2) {
      return new aaV(var1, var2);
   }

   public abY(SSLContext var1, ExecutorService var2) {
      if (var1 != null && var2 != null) {
         this.dbu = var1;
         this.cYw = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: synthetic method
   public aaS q(aaT var1, List var2) {
      return this.w(var1, var2);
   }

   public ByteChannel q(SocketChannel var1, SelectionKey var2) {
      SSLEngine var3 = this.dbu.createSSLEngine();
      ArrayList var4 = new ArrayList(Arrays.asList(var3.getEnabledCipherSuites()));
      var4.remove(t.q[9439 & 10463 & -31025 & -23857]);
      var3.setEnabledCipherSuites((String[])var4.toArray(new String[var4.size()]));
      var3.setUseClientMode((boolean)(8392 & 4150));
      return new aaQ(var1, var3, this.cYw, var2);
   }

   public abY(SSLContext var1) {
      this(var1, Executors.newSingleThreadScheduledExecutor());
   }

   public aaV w(aaT var1, abd var2) {
      return new aaV(var1, var2);
   }

   public void close() {
      this.cYw.shutdown();
   }
}

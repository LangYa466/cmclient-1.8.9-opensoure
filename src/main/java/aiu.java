import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class aiu {
   private final SocketAddress dAL;

   public long axd() {
      Socket var1 = new Socket();

      try {
         long var2 = System.currentTimeMillis();
         var1.connect(this.dAL, 2024 & 1004);
         var1.close();
         return System.currentTimeMillis() - var2;
      } catch (IOException var5) {
         if (!var1.isClosed()) {
            try {
               var1.close();
            } catch (IOException var4) {
               ;
            }
         }

         return -1L & -1L;
      }
   }

   public SocketAddress axe() {
      return this.dAL;
   }

   public aiu(String var1) {
      mK var2 = mK.af(var1);
      this.dAL = new InetSocketAddress(var2.lF(), var2.lG());
   }
}

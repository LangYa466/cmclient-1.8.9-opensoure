import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public class mX extends Thread {
   private final mW ZP;
   private final MulticastSocket ZQ;
   private final InetAddress ZR;

   public void run() {
      byte[] var1 = new byte[1024];

      while(!this.isInterrupted()) {
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);

         try {
            this.ZQ.receive(var2);
         } catch (SocketTimeoutException var5) {
            continue;
         } catch (IOException var6) {
            mU.lY().error(t.q[-9494 & 254], var6);
            break;
         }

         String var3 = new String(var2.getData(), var2.getOffset(), var2.getLength());
         mU.lY().debug(var2.getAddress() + q.q[17295 & 12932] + var3);
         this.ZP.q(var3, var2.getAddress());
      }

      try {
         this.ZQ.leaveGroup(this.ZR);
      } catch (IOException var4) {
         ;
      }

      this.ZQ.close();
   }

   public mX(mW var1) {
      super(t.q[2029 & 26856] + mU.lZ().incrementAndGet());
      this.ZP = var1;
      this.setDaemon(true);
      this.ZQ = new MulticastSocket(4445);
      this.ZR = InetAddress.getByName(t.q[4329 & 18669]);
      this.ZQ.setSoTimeout(5000);
      this.ZQ.joinGroup(this.ZR);
   }
}

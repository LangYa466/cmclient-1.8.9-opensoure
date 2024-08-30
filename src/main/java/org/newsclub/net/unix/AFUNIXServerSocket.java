package org.newsclub.net.unix;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

public class AFUNIXServerSocket extends ServerSocket {
   private AFUNIXSocketAddress dkV;
   private final AFUNIXSocketImpl dkW;

   protected AFUNIXServerSocket() {
      this.setReuseAddress((boolean)(4391 & 1025));
      this.dkW = new AFUNIXSocketImpl();
      NativeUnixSocket.initServerImpl(this, this.dkW);
      NativeUnixSocket.setCreatedServer(this);
   }

   public static AFUNIXServerSocket asT() {
      return new AFUNIXServerSocket();
   }

   public static AFUNIXServerSocket q(AFUNIXSocketAddress var0) {
      AFUNIXServerSocket var1 = asT();
      var1.bind(var0);
      return var1;
   }

   // $FF: synthetic method
   public Socket accept() {
      return this.asU();
   }

   public AFUNIXSocket asU() {
      if (this.isClosed()) {
         throw new SocketException(.y.q[27647 & 9055 & -14340 & 20349]);
      } else {
         AFUNIXSocket var1 = AFUNIXSocket.ate();
         this.dkW.accept(var1.dla);
         var1.dkX = this.dkV;
         NativeUnixSocket.setConnected(var1);
         return var1;
      }
   }

   public boolean isClosed() {
      return (boolean)(!super.isClosed() && (!this.isBound() || this.dkW.atq().valid()) ? 514 & 13320 : 26785 & 5);
   }

   public String toString() {
      return !this.isBound() ? .y.q[2911 & 19327 & -6305 & 30559] : .y.q[-31885 & -23703 & 27646 & 26622] + this.dkV.toString() + .q.q[6045 & 13244 & 18365 & -4195];
   }

   public void close() {
      if (!this.isClosed()) {
         super.close();
         this.dkW.close();
      }
   }

   public boolean isBound() {
      return (boolean)(this.dkV != null ? 10369 & -16333 : 656 & -32768);
   }

   public void bind(SocketAddress var1, int var2) {
      if (this.isClosed()) {
         throw new SocketException(.y.q[22492 & 25437 & -30882 & 20350]);
      } else if (this.isBound()) {
         throw new SocketException(.y.q[6143 & 18271 & -1187 & -9251]);
      } else if (!(var1 instanceof AFUNIXSocketAddress)) {
         throw new IOException(.y.q[-23554 & -29858 & 7167 & -4129] + AFUNIXSocketAddress.class.getName());
      } else {
         this.dkW.bind(var1, this.getReuseAddress() ? -1 & -1 : -29575 & 4612);
         this.dkV = (AFUNIXSocketAddress)var1;
         this.dkW.listen(var2);
      }
   }

   public static boolean asV() {
      return NativeUnixSocket.abR();
   }
}

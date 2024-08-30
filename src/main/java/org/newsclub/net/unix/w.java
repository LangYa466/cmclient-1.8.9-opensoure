package org.newsclub.net.unix;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Objects;
import javax.net.SocketFactory;

public abstract class w extends SocketFactory {
   public Socket createSocket(String var1, int var2) {
      if (!this.hy(var1)) {
         throw new UnknownHostException();
      } else if (var2 < 0) {
         throw new IllegalArgumentException(.p.q[-23873 & 30143 & -18817 & -25545]);
      } else {
         AFUNIXSocketAddress var3 = this.E(var1, var2);
         return AFUNIXSocket.w(var3);
      }
   }

   public Socket createSocket() {
      return AFUNIXSocket.q(this);
   }

   protected boolean hy(String var1) {
      return (boolean)(var1 != null ? 4105 & 17027 : 22529 & 266);
   }

   protected boolean q(InetAddress var1) {
      return (boolean)(var1 != null && this.hy(var1.getHostName()) ? 6211 & -16375 : 13580 & 2624);
   }

   public Socket createSocket(InetAddress var1, int var2) {
      if (!this.q(var1)) {
         throw new UnknownHostException();
      } else {
         String var3 = var1.getHostName();
         if (!this.hy(var3)) {
            throw new UnknownHostException();
         } else {
            return this.createSocket(var3, var2);
         }
      }
   }

   public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) {
      if (!this.q(var1)) {
         throw new UnknownHostException();
      } else {
         Objects.requireNonNull(var3, .p.q[13755 & 17977 & -9857 & -1925]);
         if (var4 < 0) {
            throw new IllegalArgumentException(.p.q[5566 & 13752 & -31495 & 2105]);
         } else {
            return this.createSocket(var1, var2);
         }
      }
   }

   protected abstract AFUNIXSocketAddress E(String var1, int var2);

   public Socket createSocket(String var1, int var2, InetAddress var3, int var4) {
      if (!this.hy(var1)) {
         throw new UnknownHostException();
      } else if (var4 < 0) {
         throw new IllegalArgumentException(.p.q[9467 & 28411 & 16572 & 32632]);
      } else {
         return this.createSocket(var1, var2);
      }
   }
}

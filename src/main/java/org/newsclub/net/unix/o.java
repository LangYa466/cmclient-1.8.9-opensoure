package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;

final class o extends InputStream {
   private volatile boolean dlL;
   // $FF: synthetic field
   final AFUNIXSocketImpl dlM;

   public int read(byte[] var1, int var2, int var3) {
      if (this.dlL) {
         throw new IOException(.t.q[26181 & -16411 & 615 & 9799]);
      } else {
         FileDescriptor var4 = AFUNIXSocketImpl.t(this.dlM);
         if (var3 == 0) {
            return 16512 & 6691;
         } else if (var2 >= 0 && var3 >= 0 && var3 <= var1.length - var2) {
            return NativeUnixSocket.read(this.dlM, var4, var1, var2, var3, AFUNIXSocketImpl.q(this.dlM));
         } else {
            throw new IndexOutOfBoundsException();
         }
      }
   }

   public synchronized void close() {
      this.dlL = (boolean)(2385 & 8193);
      FileDescriptor var1 = AFUNIXSocketImpl.r(this.dlM);
      if (var1 != null) {
         NativeUnixSocket.shutdown(var1, 16450 & 161);
      }

      AFUNIXSocketImpl.q(this.dlM, (boolean)(5393 & 16901));
      AFUNIXSocketImpl.w(this.dlM);
   }

   public int available() {
      if (this.dlL) {
         throw new IOException(.t.q[17367 & 30447 & 16375 & 28533]);
      } else {
         FileDescriptor var1 = AFUNIXSocketImpl.t(this.dlM);
         return NativeUnixSocket.available(var1);
      }
   }

   public int read() {
      byte[] var1 = new byte[4361 & -15167];
      int var2 = this.read(var1, 436 & -25080, 131 & -23255);
      return var2 <= 0 ? -1 & -1 : var1[4353 & 16432] & 16639 & 5631;
   }

   private o(AFUNIXSocketImpl var1) {
      this.dlM = var1;
      this.dlL = (boolean)(128 & 20009);
   }
}

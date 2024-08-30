package org.newsclub.net.unix;

import java.net.SocketException;

final class a extends AFUNIXSocketImpl {
   public void setOption(int var1, Object var2) {
      try {
         super.setOption(var1, var2);
      } catch (SocketException var4) {
         if (var1 != (1125 & -30583)) {
            throw var4;
         }
      }
   }

   public Object getOption(int var1) {
      try {
         return super.getOption(var1);
      } catch (SocketException var3) {
         switch(var1) {
         case 1:
         case 8:
            return Boolean.valueOf((boolean)(-7417 & 2152));
         default:
            throw var3;
         }
      }
   }
}

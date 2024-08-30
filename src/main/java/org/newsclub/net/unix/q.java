package org.newsclub.net.unix;

public enum q {
   dle(16392 & 8256),
   dlf(1891 & -30567),
   dlg(1042 & -14302),
   dlh(6163 & -24541);

   private final int dli;

   private q(int var3) {
      this.dli = (7233 & 8449) << var3;
   }

   int atg() {
      return this.dli;
   }

   static {
      org.newsclub.net.unix.q[] var10000 = new org.newsclub.net.unix.q[998 & -30708];
      var10000[66 & -16343] = dle;
      var10000[-29983 & 5121] = dlf;
      var10000[198 & 4642] = dlg;
      var10000[5183 & -30525] = dlh;
   }
}

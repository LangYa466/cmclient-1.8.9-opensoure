import com.google.common.util.concurrent.FutureCallback;

class nd implements FutureCallback {
   // $FF: synthetic field
   final nb aap;
   // $FF: synthetic field
   final String aaq;

   nd(nb var1, String var2) {
      this.aap = var1;
      this.aaq = var2;
   }

   public void onFailure(Throwable var1) {
      nb.w(this.aap).t(new JG(this.aaq, JH.bxu));
   }

   public void onSuccess(Object var1) {
      nb.w(this.aap).t(new JG(this.aaq, JH.bxs));
   }
}

import com.google.common.util.concurrent.FutureCallback;

class nc implements FutureCallback {
   // $FF: synthetic field
   final nb aan;
   // $FF: synthetic field
   final String aao;

   nc(nb var1, String var2) {
      this.aan = var1;
      this.aao = var2;
   }

   public void onFailure(Throwable var1) {
      nb.w(this.aan).t(new JG(this.aao, JH.bxu));
   }

   public void onSuccess(Object var1) {
      nb.w(this.aan).t(new JG(this.aao, JH.bxs));
   }
}

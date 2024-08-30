import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;

class acW implements Runnable {
   // $FF: synthetic field
   final JComponent dfY;
   // $FF: synthetic field
   final acV dfZ;

   public void run() {
      Object var1 = this.dfY;
      if (var1 instanceof JSpinner) {
         var1 = ((DefaultEditor)((JSpinner)this.dfY).getEditor()).getTextField();
      }

      ((JComponent)var1).requestFocusInWindow();
   }

   acW(acV var1, JComponent var2) {
      this.dfZ = var1;
      this.dfY = var2;
   }
}

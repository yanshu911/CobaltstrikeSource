package org.apache.fop.render.rtf.rtflib.rtfdoc;

import java.io.IOException;
import java.io.Writer;

public class RtfPageBreak extends RtfElement {
   RtfPageBreak(IRtfPageBreakContainer parent, Writer w) throws IOException {
      super((RtfContainer)parent, w);
   }

   protected void writeRtfContent() throws IOException {
      this.writeControlWord("page");
   }

   public boolean isEmpty() {
      return false;
   }
}

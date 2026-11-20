package org.rusherhack.client.api.render;
import org.rusherhack.*;

public interface IScissorable {
   void beginScissor();

   void endScissor();

   void popScissorBox();

   void scissorBox(double var1, double var3, double var5, double var7);
}

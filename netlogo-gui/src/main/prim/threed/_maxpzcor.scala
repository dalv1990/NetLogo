// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.threed

import org.nlogo.agent.World3D
import org.nlogo.nvm.{ Context, Reporter }

class _maxpzcor extends Reporter {

  override def report(context: Context) =
    Double.box(world.asInstanceOf[World3D].maxPzcor)
}

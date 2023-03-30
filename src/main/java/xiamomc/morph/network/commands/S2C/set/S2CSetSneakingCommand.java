package xiamomc.morph.network.commands.S2C.set;

import xiamomc.morph.network.BasicServerHandler;
import xiamomc.morph.network.commands.S2C.S2CCommandNames;

public class S2CSetSneakingCommand extends AbstractS2CSetCommand<Boolean>
{
    public S2CSetSneakingCommand(boolean val)
    {
        super(val);
    }
    @Override
    public String getBaseName()
    {
        return S2CCommandNames.SetSneaking;
    }

    @Override
    public void onCommand(BasicServerHandler<?> handler)
    {
        handler.onSetSneakingCommand(this);
    }

    @Override
    public String buildCommand()
    {
        return super.buildCommand() + " " + this.getArgumentAt(0, false);
    }
}

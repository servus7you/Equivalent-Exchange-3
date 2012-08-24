package ee3.client.core;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import ee3.client.core.handlers.KeyBindingHandler;
import ee3.client.core.handlers.SoundHandler;
import ee3.client.lib.KeyBindings;
import ee3.common.core.CommonProxy;

/**
* ClientProxy
* 
* Client specific functionality that cannot be put into CommonProxy
* 
* @author pahimar
* @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
*
*/
public class ClientProxy extends CommonProxy {

	@Override
	public void registerKeyBindingHandler() {
		KeyBindingRegistry.registerKeyBinding(new KeyBindingHandler());
	}
	
	@Override
	public void setKeyBinding(String name, int value) {
		KeyBindings.addKeyBinding(name, value);
		KeyBindings.addIsRepeating(false);
	}
	
	@Override
	public void registerSoundHandler() {
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
	
}
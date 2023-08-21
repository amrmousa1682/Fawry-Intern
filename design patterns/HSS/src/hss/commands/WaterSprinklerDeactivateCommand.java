package hss.commands;

import hss.devices.WaterSprinkler;

public class WaterSprinklerDeactivateCommand implements Command {
	@Override
	public void execute() {
		WaterSprinkler.deactivate();
	}
}

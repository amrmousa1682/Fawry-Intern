package hss.commands;

import hss.devices.Alarm;

public class AlarmDeactivateCommand implements Command {
	@Override
	public void execute() {
		Alarm.deactivate();
	}
}

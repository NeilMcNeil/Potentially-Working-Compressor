package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.PneumaticsControlModule;


import edu.wpi.first.wpilibj.PneumaticsModuleType;
/**
 *
 */
public class PneumaticsSubsystem extends SubsystemBase {

	private final Compressor compressor;

	public PneumaticsSubsystem() {

		// Make a new compressor based on the module
		this.compressor = new Compressor(PneumaticsModuleType.CTREPCM);
		// this.compressor = new Compressor(PneumaticsModuleType.REVPH);

		this.compressor.enableDigital();

	}

	// public void disableCompressor() {
	// 	if (compressor != null) {
	// 		compressor.setClosedLoopControl(false);
	// 	}
	// }

	public void enableCompressor() {
		this.compressor.enableDigital();
	}

	// Periodically update the dashboard and any PIDs or sensors
	@Override
	public void periodic() {

		if (compressor == null) {
			SmartDashboard.putBoolean("Compressor", compressor.isEnabled());
			// SmartDashboard.putBoolean("Compressor Enabled", compressor.enableDigital());
		} else {
			SmartDashboard.putBoolean("Compressor", false);
			SmartDashboard.putBoolean("Compressor Enabled", false);
		}
	}

}
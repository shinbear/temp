package temp;

import org.eclipse.jface.wizard.Wizard;

public class Second extends Wizard {

	public Second() {
		setWindowTitle("New Wizard");
	}

	@Override
	public void addPages() {
	}

	@Override
	public boolean performFinish() {
		return false;
	}

}

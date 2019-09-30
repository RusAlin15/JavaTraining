package actions;

import app.ApplicationSession;

public class ViewSuppliersAction extends MenuItem {

	public ViewSuppliersAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		System.out.println(ApplicationSession.getInstance().getDatabase().getSuppliers().toString());
	}

}

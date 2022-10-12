package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager _dataManager;

	public CustomerManager(BaseDatabaseManager dataManager) {
		this._dataManager = dataManager;
	}

	public void getCustomers() {
		_dataManager.getData();
	}
}

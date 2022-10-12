package interfaces;

public class CustomerManager {
	ICustomerDal _customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this._customerDal = customerDal;
	}

	public void add() {
		_customerDal.add();
	}
}

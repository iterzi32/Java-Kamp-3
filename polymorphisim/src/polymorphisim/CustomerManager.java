package polymorphisim;

public class CustomerManager {
	private BaseLogger _baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this._baseLogger = baseLogger;
	}

	public void add() {
		_baseLogger.log("Log Mesajı");
	}
}

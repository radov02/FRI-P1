public enum PodaniStatus {

	OK(0, "OK"), FAIL(1, "Fail");
	
	private final int code;
	private final String value;

	private PodaniStatus(int code, String value) {
		this.code = code;
		this.value = value;
	}
	
	public int getCode() {
		return code;
	}	
	
	public String getValue() {
		return value;
	}
}
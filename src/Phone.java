//定义一个手机类，实现gps接口
class Phone implements GPS{
	public Phone() {
		super();
	}
	public String showCoordinate() {
		String location = "193,485";
		return location;
	}
}

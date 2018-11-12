
public interface Fly {
	
	void takeOff();
	
	static int ascend(int meters) {
		return meters;
	}
	
	static int descend(int meters) {
		return meters;
	}
	
	void land();
	
	default void glide() {}
			

}

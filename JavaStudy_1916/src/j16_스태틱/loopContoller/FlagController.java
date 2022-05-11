package j16_스태틱.loopContoller;

public class FlagController {
	public static boolean flag = true;
	
	public static void changeFlag() {
		if(Main.flag == true) {
			Main.flag = false;
		}else {
			Main.flag = true;
		}
	}
}

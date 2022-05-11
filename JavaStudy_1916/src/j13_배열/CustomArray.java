package j13_배열;

public class CustomArray {
	private String[] strArray;
	
	public CustomArray() {
		strArray = new String[0];
	}
	
	private void strArraySizeUp() {
		String[] tempStrArray = new String[strArray.length + 1];
		for(int i = 0; i < strArray.length; i++) {
			tempStrArray[i] = strArray[i];
		}
		strArray = tempStrArray;
	}
	
	public void add(String str) {
		strArraySizeUp();
		strArray[strArray.length - 1] = str;
	}

	public String[] getStrArray() {
		return strArray;
	}
	
	
	
}

package j15_인터페이스.File;

public class FileLibraryA implements FileInputOutput {

	private String imgPath;
	
	@Override
	public void input(String imgPath) {
		System.out.println("복잡한 로직으로 실행중인 file-input");
		System.out.println(imgPath + "이미지를 저장합니다.");
		this.imgPath = imgPath;
	}

	@Override
	public String output() {
		System.out.println("복잡한 로직으로 실행중인 file-output");
		return imgPath;
	}

}

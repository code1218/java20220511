package j15_인터페이스.File;

import java.util.UUID;

public class FileLibraryB implements FileInputOutput, MadeFileName {

	private String imgPath;

	private void printInputInfo(String imgPath) {
		System.out.println("간소화 된 로직으로 실행중인 file-input");
		System.out.println(imgPath + "이미지를 저장합니다.");
	}
	
	@Override
	public void input(String imgPath) {
		printInputInfo(imgPath);
		this.imgPath = imgPath;
	}

	@Override
	public String output() {
		System.out.println("간소화 된 로직으로 실행중인 file-output");
		return imgPath;
	}

	@Override
	public String makeTempName(String originFileName) {
		String tempFileName = null;
		tempFileName = UUID.randomUUID().toString().replaceAll("-", "") + "_" + originFileName;
		return tempFileName;
	}

}









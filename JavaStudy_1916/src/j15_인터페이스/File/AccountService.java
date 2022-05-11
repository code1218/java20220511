package j15_인터페이스.File;

public class AccountService {
	public static void main(String[] args) {
		FileInputOutput fileInputOutput = new FileLibraryA();
		MadeFileName madeFileName = null;
		
		String path = "/images/";
		String imgName = null;
		String tempImgName = null;
		
		//((FileLibraryB)fileInputOutput).printInputInfo(img);
		
		System.out.println("프로필 설정");
		System.out.println("프로필 사진을 선택합니다.");
		imgName = "증명사진.png";
		try {
			tempImgName = madeFileName.makeTempName(imgName);
		} catch (Exception e) {
			tempImgName = imgName;
			//e.printStackTrace();
		}
		System.out.println(path + tempImgName);
		System.out.println("파일을 업로드 합니다.");
		fileInputOutput.input(path + tempImgName);
		System.out.println("파일 업로드가 완료되었습니다.");
		System.out.println("================================================");
		System.out.println("파일을 확인하기 위해 다운로드 합니다.");
		System.out.println(fileInputOutput.output());
		System.out.println("다운로드 완료");
		
		
		
	}
}

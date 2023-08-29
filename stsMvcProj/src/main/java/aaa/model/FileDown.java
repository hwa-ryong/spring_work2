package aaa.model;

import java.io.File;
import java.io.FileOutputStream;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class FileDown {
	
	void fileSave2(BoardDTO bd) {
		
		
		if(bd.getMmff().isEmpty()) {
			
			
			return;
		}
		
		String path = "C:\\green_project\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";
		
		int dot = bd.getMmff().getOriginalFilename().lastIndexOf(".");
		String fDomain = bd.getMmff().getOriginalFilename().substring(0, dot);
		String ext = bd.getMmff().getOriginalFilename().substring(dot);
		
		//이미지인지 확인
		if(!Pattern.matches("[.](bmp|jpg|gif|png|jpeg)", ext.toLowerCase())) {
			
			return;
		}
		
		bd.setUpfile(fDomain+ext); 
		File ff = new File(path+"\\"+bd.getUpfile());
		int cnt = 1;
		while(ff.exists()) {
			 
			bd.setUpfile(fDomain+"_"+cnt+ext);
			ff = new File(path+"\\"+bd.getUpfile());
			cnt++;
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			
			fos.write(bd.getMmff().getBytes());
			
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

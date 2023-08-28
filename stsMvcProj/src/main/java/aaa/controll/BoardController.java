package aaa.controll;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.BoardDTO;
import aaa.model.PageData;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource
	BoardMapper mapper;
	
	@RequestMapping("list")
	String list(Model mm) {
		
		List<BoardDTO>data = mapper.list();
		System.out.println(data);
		mm.addAttribute("mainData", data);
		
		return "board/list";
	}
	
	@RequestMapping("detail/{id}")
	String detail(Model mm, @PathVariable int id) {
		
		mapper.addCount(id);
		
		
		mm.addAttribute("dto", mapper.detail(id));
		return "board/detail";
	}
	
	@GetMapping("insert")
	String insert(BoardDTO dto) {
		
		return "board/insertForm";
	}
	
	@PostMapping("insert")
	String insertReg(BoardDTO dto, PageData pd, @RequestParam("mmff") MultipartFile mmff) {
		
		fileSave2(mmff);
		mapper.insseerr(dto);
		pd.setMsg("작성되었습니다.");
		pd.setGoUrl("list");
		System.out.println(dto);
		
		return "board/alert";
	}
	
	@GetMapping("delete/{id}")
	String delete(@PathVariable int id) {
		
		return "board/deleteForm";
	}
	
	@PostMapping("delete/{id}")
	String deleteReg(BoardDTO dto, PageData pd) {
		
	
		pd.setMsg("삭제실패");
		pd.setGoUrl("/board/delete/"+dto.getId());
		
		int cnt = mapper.delettt(dto);
		System.out.println("deleteReg:"+cnt);
		if(cnt>0) {
			pd.setMsg("삭제되었습니다.");
			pd.setGoUrl("/board/list");
		}
		
		return "board/alert";
	}
	
	@GetMapping("modify/{id}")
	String modify(Model mm, @PathVariable int id) {
		
		mm.addAttribute("dto", mapper.detail(id));
		
		return "board/modifyForm";
	}
	
	@PostMapping("modify/{id}")
	String modifyReg(BoardDTO dto, PageData pd) {
		
	
		pd.setMsg("수정실패");
		pd.setGoUrl("/board/modify/"+dto.getId());
		
		int cnt = mapper.modifffy(dto);
		System.out.println("modifyReg:"+cnt);
		if(cnt>0) {
			pd.setMsg("수정되었습니다.");
			pd.setGoUrl("/board/detail/"+dto.getId());
		}
		
		return "board/alert";
	}
	
	void fileSave2(MultipartFile mmff) {
		
		String path = "C:\\green_project\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";
		if(!mmff.isEmpty()){	//1.파일 확인하기
			
		
			File ff = new File(path+"\\"+mmff.getOriginalFilename());
			
			String fn =ff.getName();	
			String ftype =fn.substring(fn.lastIndexOf(".")+1);
			String fname = fn.replace('.'+ftype,"");
			int i =0;
			
			
			if (ftype.equals("png") || ftype.equals("jpg")) { //2.파일 확장자

			while(ff.exists()) {	//3.같은이름의파일 중복될때 제목에 1더하기
				i++;
				ff= new File(path+"\\"+fname+i+"."+ftype);
			}
			System.out.println(ff);
				try {
					FileOutputStream fos = new FileOutputStream(ff);
					
					fos.write(mmff.getBytes());
					
					fos.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("올바른 확장자가 아닙니다.");
			}
		} else {
			System.out.println("올릴 파일이 없어요");
		}
	}
}

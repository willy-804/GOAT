package org.goat.controller;

import org.goat.model.BoardVO;
import org.goat.model.MemberVO;
import org.goat.model.RepleVO;
import org.goat.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManagerController {

	@Autowired
	ManagerService ms;

    // 멤버  목록 리스트 설계
	@RequestMapping(value = "/manager/manager", method = RequestMethod.GET)
	public void manager(Model model, Model total) {
		model.addAttribute("list", ms.memberlist());
	   
		// 멤버 리스트에서 전체 회원수 조회	
		total.addAttribute("total", ms.totalmem());
	}

	// 멤버 리스트에서 아이디 검색


	// 멤버 상세 페이지 설계
	@RequestMapping(value = "/manager/memDetail", method = RequestMethod.GET)
	public String memDetail(MemberVO member, Model model) {
		model.addAttribute("detail", ms.memdetail(member));
		return "/manager/memDetail";
	}

	// 멤버 삭제 설계
	@RequestMapping(value = "/manager/remove", method = RequestMethod.GET)
	public String remove(MemberVO remove) {
		ms.remove(remove);
		// manager/manager.jsp 에서 삭제된 결과를 확인하기 위한 화면이동
		return "redirect:/manager/manager";
	}

	// 작성 글 리스트
	@RequestMapping(value = "/manager/managerWriteList", method = RequestMethod.GET)
	public void managerWriteList(BoardVO write, Model model) {
		model.addAttribute("WList", ms.WriteList(write));
	}

	// 글 삭제
	@RequestMapping(value = "/manager/writeremove", method = RequestMethod.GET)
	public String bremove(BoardVO bremove) {
		ms.bremove(bremove);
		// manager/manager.jsp 에서 삭제된 결과를 확인하기 위한 화면이동
		return "redirect:/manager/manager";
	}

	// 댓글 리스트
	@RequestMapping(value = "/manager/managerRepleList", method = RequestMethod.GET)
	public void managerRepleList(RepleVO write, Model model) {
		model.addAttribute("RList", ms.RepleList(write));
	}

	/*
	 * 글 수정 설계
	 * 
	 * @RequestMapping(value = "/manager/modify", method = RequestMethod.POST)
	 * public void modify(BoardVO boadrd) { bs.modify(board) boarddetail.jsp에서 수정된
	 * 결과를 확인하기 위한 화면이동
	 * 
	 * }
	 */

}
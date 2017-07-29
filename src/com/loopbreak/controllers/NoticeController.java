package com.loopbreak.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loopbreak.entities.Notice;
import com.loopbreak.models.NoticeHome;

@Controller
public class NoticeController {

	@RequestMapping(value = "notices", method = RequestMethod.GET)
	public String pageNotice(Model model) {

		NoticeHome noticeHome = new NoticeHome();
		List<Notice> notices = noticeHome.getAllNotices();
		model.addAttribute("notice_data",notices);
		return "notices";
	}

	@RequestMapping(value = "notice_add", method = RequestMethod.GET)
	public String pageNoticeAdd() {
		return "notice_add";
	}

	@RequestMapping(value = "notice_add", method = RequestMethod.POST)
	public String postNotice(Model model, HttpServletRequest request) {
		String title = request.getParameter("notice_title");
		String description = request.getParameter("notice_description");
		NoticeHome noticeHome = new NoticeHome();
		Notice notice = new Notice(title, description, 1);
		noticeHome.persist(notice);
		model.addAttribute("msg", "Notice has been addedd successfully");
		return "notice_add";
	}
}

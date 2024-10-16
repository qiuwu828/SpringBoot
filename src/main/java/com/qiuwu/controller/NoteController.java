package com.qiuwu.controller;


import com.qiuwu.dto.NoteDto;
import com.qiuwu.entity.Note;
import com.qiuwu.entity.User;
import com.qiuwu.service.NoteService;
import com.qiuwu.until.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
@Controller
@RequestMapping("/note")
public class NoteController {
    @Autowired
    NoteService noteService;

    @GetMapping("/list")
    public String noteList(Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute(Constans.SESSION_USER);
        List<NoteDto> list = noteService.getNoteDtoList(user.getUserId());
        model.addAttribute("noteList", list);
        return "noteList";
    }
}

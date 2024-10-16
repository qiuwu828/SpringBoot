package com.qiuwu.controller;

import com.qiuwu.entity.User;
import com.qiuwu.service.NoteService;
import com.qiuwu.until.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author 丘戊
 * @package com.qiuwu.controller
 * @title
 * @date 27/5/2022 下午 4:37
 */
@Controller
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private NoteService noteService;

    @GetMapping({"", "/"})
    public String index() {
        return "report";
    }

    /**
     * 通过月份查询对应的云记数量
     *
     * @param request
     */
    @ResponseBody
    @RequestMapping("/month")
    public Map<String, Object> queryNoteCountByMonth(HttpServletRequest request) {

        User user = (User) request.getSession().getAttribute(Constans.SESSION_USER);
        //获取userId
        Integer userId = user.getUserId();
        //获取报表map数据
        Map<String, Object> map = noteService.queryNoteCountByMonth(userId);
        return map;
    }

    /**
     * 通过类型查询对应的云日记数量
     *
     * @param request
     * @return
     */
    @ResponseBody
    @GetMapping("/typeName")
    public Map<String, Object> queryNoteCountByType(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute(Constans.SESSION_USER);
        //获取userId
        Integer userId = user.getUserId();
        //获取报表map数据
        Map<String, Object> map = noteService.findNoteListByType(userId);
        return map;
    }
}

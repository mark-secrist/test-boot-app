package online.dev2cloud.bootdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @GetMapping("/report1")
    public String doReport1() {
        return "Hello from report 1";
    }
}

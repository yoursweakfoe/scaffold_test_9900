package unsw.comp9900.demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import unsw.comp9900.demo.order.feignservice.StockFeignService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    StockFeignService stockFeignService;

    @Value("${author}")
    String author;

    @RequestMapping("/add")
    public String add(){
        System.out.println("added");
//        String msg = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        String msg = stockFeignService.reduce();
//        String msg2 = restTemplate.getForObject("http://python/stops", String.class);
//        return "added " + msg +" "+msg2;
        return "added " +author +" "+ msg;
    }
}

package unsw.comp9900.demo.order.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="stock-service",path="/stock")
public interface StockFeignService {
    @RequestMapping
    public String reduce();
}

package ynu.edu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ynu.edu.entity.CommonResult;
import ynu.edu.entity.User;

@FeignClient("provider-server")
public interface ServiceProviderService {
    @GetMapping("/user/getUserById/{userId}")
    CommonResult<User> getUserById(@PathVariable("userId") Integer userId);

}
//echo "# Demo4" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/diqiurende/Demo4.git
//        git push -u origin main
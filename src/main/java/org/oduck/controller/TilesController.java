package org.oduck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class TilesController {
	@GetMapping("/")
    public String base() {
        return "base";
    }
    
	@GetMapping("/product")
    public String product() {
        return "5duck/product.tiles";
    }
	
	@GetMapping("/about")
    public String about() {
        return "5duck/about.tiles";
    }
	
	@GetMapping("/productDetail")
    public String product_detail() {
        return "5duck/productDetail.tiles";
    }
	
	@GetMapping("/contact")
    public String contact() {
        return "5duck/contact.tiles";
    }
	
	@GetMapping("/cart")
    public String cart() {
        return "5duck/cart.tiles";
    }

	@GetMapping("/boardlist")
    public String boardlist() {
        return "5duck/boardlist.tiles";
    }
	@GetMapping("/boardDetail")
    public String boardDetail() {
        return "5duck/boardDetail.tiles";
    }
	
	
}
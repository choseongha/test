package edu.spring.ex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.spring.ex01.domain.ProductVO;

@Controller
public class SampleVOController {
	private static final Logger logger =
			LoggerFactory.getLogger(SampleVOController.class);
	
	@GetMapping("/product1")
	public String product1(Model model, String name, int price) {
		logger.info("product1() ȣ��");
		ProductVO vo = new ProductVO(name,price);
		model.addAttribute("vo",vo);
		
		return "product-result";
	}// end product1()
	

	@GetMapping("/product2")
	public String product2(Model model, ProductVO vo) {
		logger.info("product2() ȣ��");
		model.addAttribute("vo",vo);
		
		return "product-result";
	}// end product2()
	
} // end SampleControllers

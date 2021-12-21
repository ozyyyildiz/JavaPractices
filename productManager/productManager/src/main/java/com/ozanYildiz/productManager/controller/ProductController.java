package com.ozanYildiz.productManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ozanYildiz.productManager.model.Category;
import com.ozanYildiz.productManager.model.Product;
import com.ozanYildiz.productManager.service.CategoryService;
import com.ozanYildiz.productManager.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/list")
	public String listProducts(Model model) {
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		return "list-products";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Product product = new Product();
		List<Category> categories = categoryService.findAll();
		model.addAttribute("product", product);
		model.addAttribute("categories", categories);
		return "product-form";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("product") Product product) {
		productService.saveProduct(product);
		return "redirect:/product/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("productId")int id, Model model) {
		Product product = productService.findById(id);
		List<Category> categories = categoryService.findAll();
		model.addAttribute("product", product);
		model.addAttribute("categories", categories);
		return "product-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("productId")int id) {
		productService.deleteProduct(id);
		return "redirect:/product/list";
	}
	
	
	
}

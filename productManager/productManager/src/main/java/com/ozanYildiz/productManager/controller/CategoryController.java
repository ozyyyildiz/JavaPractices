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
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/list")
	public String listCategories(Model model) {
		List<Category> categories = categoryService.findAll();
		model.addAttribute("categories", categories);
		return "list-categories";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Category category = new Category();
		model.addAttribute("category", category);
		return "category-form";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("category") Category category) {
		categoryService.saveCategory(category);
		return "redirect:/category/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("categoryId")int id, Model model) {
		Category category = categoryService.getCategory(id);
		model.addAttribute("category", category);
		return "category-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("categoryId")int id) {
		categoryService.deleteCategory(id);
		return "redirect:/category/list";
	}
	@GetMapping("/products")
	public String findByCategory(@RequestParam("categoryId")int id, Model model) {
		List<Product> products = productService.findByCategory(id);
		model.addAttribute("products",products);
		return "list-products";
	}

}

package ent.sahoo.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ent.sahoo.shoppingbackend.dao.CatagoryDAO;
import ent.sahoo.shoppingbackend.dto.Catagory;

@Controller
public class PageController {

	@Autowired
	private CatagoryDAO catagoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		// Passing the list of catagories

		mv.addObject("catagories", catagoryDAO.list());

		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/**
	 * Methods to load all the products based on category
	 */

	@RequestMapping(value = { "/show/all/products" })
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		// Passing the list of catagories

		mv.addObject("catagories", catagoryDAO.list());

		mv.addObject("userClickAllProduts", true);
		return mv;
	}

	@RequestMapping(value = { "/show/catagory/{id}/products" })
	public ModelAndView showCatagoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");

		// catagoryDAO to fetch single catagory
		Catagory catagory = null;
		catagory = catagoryDAO.get(id);

		mv.addObject("title", catagory.getName());
		// Passing the list of catagories

		mv.addObject("catagories", catagoryDAO.list());

		// Passing the single  catagory object

		mv.addObject("catagory", catagory);
		
		mv.addObject("userClickCatagoryProduts", true);
		return mv;
	}
	// @RequestMapping(value = {"/test"})
	// public ModelAndView test(@RequestParam(value="greeting", required =
	// false)String greeting )
	// {
	// if (greeting==null)
	// {
	// greeting="Hello there";
	// }
	// ModelAndView mv = new ModelAndView("page");
	// mv.addObject("greeting", greeting);
	// return mv;
	// }
	//

	// @RequestMapping(value = "/test/{greeting}")
	// public ModelAndView test(@PathVariable("greeting")String greeting )
	// {
	// if (greeting==null)
	// {
	// greeting="Hello there";
	// }
	// ModelAndView mv = new ModelAndView("page");
	// mv.addObject("greeting", greeting);
	// return mv;
	// }
}

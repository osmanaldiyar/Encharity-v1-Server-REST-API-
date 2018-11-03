package com.encharity.encharity_backend.controller;

import com.encharity.encharity_backend.exception.ResourceNotFoundException;
import com.encharity.encharity_backend.model.Archive;
import com.encharity.encharity_backend.model.Blog;
import com.encharity.encharity_backend.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogRepository blogRepository;

    @GetMapping("/")
    public List<Blog> getAllBlog(){
        return blogRepository.findAll();
    }

    @GetMapping("/{id}")
    public Blog getArchive(@PathVariable(value = "id") int blogId){
        return blogRepository.findById(blogId)
                .orElseThrow(() -> new ResourceNotFoundException("Blog","id",blogId));
    }

    @PostMapping("/addBlogItem")
    public Blog addBlogItem(@Valid @RequestBody Blog blog){
        return blogRepository.save(blog);
    }


}
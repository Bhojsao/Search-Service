package com.bhoj.springboot.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.bhoj.springboot.domain.Book;

/**
 * @author Bhoj Sao
 *
 */
public interface BookRepository extends ElasticsearchRepository<Book, String> {

	Page<Book> findByAuthor(String author, Pageable pageable);

	List<Book> findByTitle(String title);
}

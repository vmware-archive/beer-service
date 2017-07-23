package com.example.beerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

@RestController
public class BeerInitializer {

	private static final Faker faker = new Faker();

	private BeerRepository repo;
	public BeerInitializer(BeerRepository repo) {
		this.repo = repo;
	}

	@GetMapping("/init")
	public String init(@RequestParam(name = "count", defaultValue = "10") int count) {
		System.out.println("Initializing with " + count + " beer(s).");
		for (int i = 0; i < count; i++) {
			Beer beer = new Beer(faker.beer().name(), faker.beer().style(), faker.beer().hop(), faker.beer().malt(), faker.beer().yeast());
			repo.save(beer);
		}
		return "Initialized " + count + " beer(s).";
	}
}

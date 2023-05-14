package com.firstproject.springbootfirstproject;

import com.firstproject.springbootfirstproject.dao.UserRepository;
import com.firstproject.springbootfirstproject.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class SpringbootfirstprojectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootfirstprojectApplication.class, args);

//		ApplicationContext context = SpringApplication.run(SpringbootfirstprojectApplication.class, args);
//		UserRepository userRepository = context.getBean(UserRepository.class);

		//for custom query using param
//		List<User> userByName = userRepository.getUserByName("Nivesh");
//		userByName.forEach(un -> System.out.println(un));
//		List<User> userByNameAndCity = userRepository.getUserByNameAndCity("Nivesh", "Jabalpur");
//		userByNameAndCity.forEach(un -> System.out.println(un));

		//for native custom queries
//		userRepository.getUsers().forEach(u -> System.out.println(u));

		//for custom query
//		List<User> allUser = userRepository.getAllUser();
//		allUser.forEach(u -> System.out.println(u));
		//find by name
//		List<User> users = userRepository.findByName("Mehul");
//		users.forEach(user -> System.out.println(user));

		//find by name and city
//		List<User> users = userRepository.findByNameAndCity("Mehul", "Delhi");
//		users.forEach(user -> System.out.println(user));

		//Deleting the user element
//		userRepository.deleteById(52);
//		System.out.println("deleted");

//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user -> System.out.println(user));
//
//		userRepository.deleteAll(allusers);

		//for updating the user
//		Optional<User> optional = userRepository.findById(53);
//		User user = optional.get();
//		user.setName("Aakash Soni");
//		User result = userRepository.save(user);
//		System.out.println(result);

		//get all user data
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user);
//			}
//		});
//		itr.forEach(user -> {
//			System.out.println(user);
//		});

		//to get the data
		//user findById(x)-> this will return optional containing data

//		User user = new User();
//		user.setName("Nivesh");
//		user.setCity("Jabalpur");
//		user.setStatus("I am Developer");
//		User user1 = userRepository.save(user);
//		System.out.println(user1);

//		User user1 = new User();
//		user1.setName("Mehul");
//		user1.setCity("Delhi");
//		user1.setStatus("Java programmer");
//
//		User user2 = new User();
//		user2.setName("Aakash");
//		user2.setCity("Bangalore");
//		user2.setStatus("Python programmer");
//
//		//for saving multiple objects
//		List<User> users = List.of(user1, user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(user -> {
//			System.out.println(user);
//		});

//		saving single user
//		User resultUser = userRepository.save(user2);
//		System.out.println("saved user " + resultUser);
//		System.out.println("done");
	}

}

package indeedcoder.cartservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	@Value("${server.port}")
	private String port;

	@GetMapping("")
	public ResponseEntity<String> getHome(){
		return ResponseEntity.ok("This is cart service.");
	}

	@GetMapping("/port")
	public ResponseEntity<String> getPort(){
		return ResponseEntity.ok("Cart service is running on port:" + port);
	}

	@GetMapping("/health")
	public ResponseEntity<String> getHealth(){
		return ResponseEntity.ok("Cart service is in good health.");
	}

	@GetMapping("/actuator/info")
	public ResponseEntity<String> getActuatorInfo(){
		return ResponseEntity.ok("Cart service actuator info.");
	}
}

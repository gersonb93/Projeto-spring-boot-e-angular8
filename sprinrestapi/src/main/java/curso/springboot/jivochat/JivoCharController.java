package curso.springboot.jivochat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/jivochat")
public class JivoCharController {
	
	
	@ResponseBody
	@PostMapping(value="/chatoff")
	public ResponseEntity<String> capturaLeadChatOffLine(@RequestBody JsonJivoChatMensagemOff cliente) {
		System.out.println("Cliente jivo chat : " + cliente);
		return new ResponseEntity<String>("result", HttpStatus.OK);
	}

}

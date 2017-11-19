package com.nara.test.demo.res;

import com.nara.test.demo.domain.User;
import com.nara.test.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by linhtran on 04/11/17.
 */

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/")
   public ResponseEntity<Iterable<User>> findAll(){
        return  new ResponseEntity<Iterable<User>>(this.userRepository.findAll(), HttpStatus.OK);
    }


}

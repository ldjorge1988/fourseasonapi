package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JwtUserDetailsService implements UserDetailsService {

   /* @Autowired
    private IRedUserRepository iredUserRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        RedUser user = iredUserRepository.findByUsername(username).block();
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    public Mono<RedUser> save(RedUser redUser) {
        redUser.setPassword(bcryptEncoder.encode(redUser.getPassword()));
        return iredUserRepository.save(redUser);
    }*/
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}